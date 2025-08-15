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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.filled.BatteryFull
import com.kmlc.strongo.ui.component.icons.outlined.AccessTime
import com.kmlc.strongo.ui.component.icons.outlined.Power
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun CustomStatusBar() {
    val context = LocalContext.current

    var currentTime by remember { mutableStateOf(value = "") }
    var batteryLevel by remember { mutableIntStateOf(value = 0) }
    var isCharging by remember { mutableStateOf(false) }

    // Updates hour each second
    LaunchedEffect(key1 = Unit) {
        while (true) {
            currentTime = SimpleDateFormat(/* pattern = */ "HH:mm", /* locale = */
                Locale.getDefault()
            ).format(Date())
            delay(timeMillis = 1000)
        }
    }

    // Listen to battery and time changes
    // and update the state accordingly
    DisposableEffect(key1 = Unit) {
        val batteryFilter = IntentFilter(/* action = */ Intent.ACTION_BATTERY_CHANGED)
        val timeFilter = IntentFilter().apply {
            this.addAction(/* action = */ Intent.ACTION_TIME_CHANGED)
            this.addAction(/* action = */ Intent.ACTION_TIME_TICK)
            this.addAction(/* action = */ Intent.ACTION_TIMEZONE_CHANGED)
        }

        val receiver = object : BroadcastReceiver() {
            override fun onReceive(ctx: Context?, intent: Intent?) {
                intent?.let {
                    if (it.action == Intent.ACTION_BATTERY_CHANGED) {
                        val status =
                            it.getIntExtra(/* name = */ BatteryManager.EXTRA_STATUS, /* defaultValue = */
                                -1
                            )
                        isCharging =
                            status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL
                        batteryLevel =
                            it.getIntExtra(/* name = */ BatteryManager.EXTRA_LEVEL, /* defaultValue = */
                                -1
                            )
                    }
                    if (it.action == Intent.ACTION_TIME_CHANGED ||
                        it.action == Intent.ACTION_TIME_TICK ||
                        it.action == Intent.ACTION_TIMEZONE_CHANGED
                    ) {
                        currentTime = SimpleDateFormat(/* pattern = */ "HH:mm", /* locale = */
                            Locale.getDefault()
                        ).format(Date())
                    }
                }
            }
        }

        context.registerReceiver(/* p0 = */ receiver, /* p1 = */ batteryFilter)
        context.registerReceiver(/* p0 = */ receiver, /* p1 = */ timeFilter)

        // Initialisation
        val batteryIntent = context.registerReceiver(/* p0 = */ null, /* p1 = */ batteryFilter)
        batteryIntent?.let {
            val status =
                it.getIntExtra(/* name = */ BatteryManager.EXTRA_STATUS, /* defaultValue = */
                    -1
                )
            isCharging =
                status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL
            batteryLevel =
                it.getIntExtra(/* name = */ BatteryManager.EXTRA_LEVEL, /* defaultValue = */
                    -1
                )
        }

        onDispose {
            context.unregisterReceiver(/* p0 = */ receiver)
        }
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(height = 40.dp)
            .background(Color(color = 0xFF18181C))
            .padding(top = 8.dp, start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Companion.CenterVertically
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Companion.CenterVertically
        ) {
            Text(
                text = currentTime,
                color = Color.Companion.White,
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.padding(horizontal = 4.dp))

            IconView(
                icon = IconClass.Vector(imageVector = StronGoIcons.Outlined.AccessTime),
                description = "Hour",
                tint = Color.Companion.White
            )
        }

        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Companion.CenterVertically
        ) {
            Text(
                text = "$batteryLevel%",
                color = Color.Companion.White,
                style = MaterialTheme.typography.bodyMedium
            )

            val chargingPainter = if (isCharging) {
                IconClass.Vector(imageVector = StronGoIcons.Outlined.Power)
            } else {
                IconClass.Vector(imageVector = StronGoIcons.Filled.BatteryFull)
            }

            Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            IconView(
                icon = chargingPainter,
                description = if (isCharging) stringResource(id = R.string.wired) else stringResource(
                    id = R.string.on_battery
                ),
                tint = Color.Companion.White
            )
        }
    }
}