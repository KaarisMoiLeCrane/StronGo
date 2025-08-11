package com.kmlc.strongo.navigation

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun CustomStatusBar() {
    val context = LocalContext.current

    var currentTime by remember { mutableStateOf("") }
    var batteryLevel by remember { mutableStateOf(0) }
    var isCharging by remember { mutableStateOf(false) }

    // Met à jour l'heure chaque seconde
    LaunchedEffect(Unit) {
        while (true) {
            currentTime = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date())
            delay(1000)
        }
    }

    // Écoute les changements de batterie et d'heure système
    DisposableEffect(Unit) {
        val batteryFilter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        val timeFilter = IntentFilter().apply {
            addAction(Intent.ACTION_TIME_CHANGED)
            addAction(Intent.ACTION_TIME_TICK)
            addAction(Intent.ACTION_TIMEZONE_CHANGED)
        }

        val receiver = object : BroadcastReceiver() {
            override fun onReceive(ctx: Context?, intent: Intent?) {
                intent?.let {
                    if (it.action == Intent.ACTION_BATTERY_CHANGED) {
                        val status = it.getIntExtra(BatteryManager.EXTRA_STATUS, -1)
                        isCharging =
                            status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL
                        batteryLevel = it.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
                    }
                    if (it.action == Intent.ACTION_TIME_CHANGED ||
                        it.action == Intent.ACTION_TIME_TICK ||
                        it.action == Intent.ACTION_TIMEZONE_CHANGED
                    ) {
                        currentTime = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date())
                    }
                }
            }
        }

        context.registerReceiver(receiver, batteryFilter)
        context.registerReceiver(receiver, timeFilter)

        // Initialisation
        val batteryIntent = context.registerReceiver(null, batteryFilter)
        batteryIntent?.let {
            val status = it.getIntExtra(BatteryManager.EXTRA_STATUS, -1)
            isCharging =
                status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL
            batteryLevel = it.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
        }

        onDispose {
            context.unregisterReceiver(receiver)
        }
    }

    Row(
        modifier = Modifier.Companion
            .fillMaxWidth()
            .height(40.dp)
            .background(Color(0xFF18181C))
            .padding(top = 8.dp, start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Companion.CenterVertically
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Companion.CenterVertically
        ) {
            Text(
                currentTime,
                color = Color.Companion.White,
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.Companion.padding(horizontal = 4.dp))
            Icon(
                painter = painterResource(id = R.drawable.ic_access_time),
                contentDescription = "Heure",
                tint = Color.Companion.White
            )
        }

        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Companion.CenterVertically
        ) {
            Text(
                "$batteryLevel%",
                color = Color.Companion.White,
                style = MaterialTheme.typography.bodyMedium
            )
            val chargingPainter = if (isCharging) {
                painterResource(id = R.drawable.ic_power)
            } else {
                painterResource(id = R.drawable.ic_battery_full)
            }
            Spacer(modifier = Modifier.Companion.padding(horizontal = 4.dp))
            Icon(
                painter = chargingPainter,
                contentDescription = if (isCharging) "Branché" else "Sur batterie",
                tint = Color.Companion.White
            )
        }
    }
}