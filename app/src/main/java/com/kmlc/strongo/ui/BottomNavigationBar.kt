package com.kmlc.strongo.ui

import androidx.compose.runtime.Composable
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import com.kmlc.strongo.R

@Composable
fun BottomNavigationBar(
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        Pair("Home", R.drawable.ic_home),
        Pair("Schedule", R.drawable.ic_schedule),
        Pair("Workouts", R.drawable.ic_workouts),
        Pair("Profile", R.drawable.ic_profile)
    )
    Surface(
        tonalElevation = 8.dp,
        color = Color(0xFF18181C),
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .height(52.dp)
                .fillMaxWidth()
                .background(Color(0xFF18181C)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items.forEachIndexed { index, item ->
                IconButton(
                    onClick = { onItemSelected(index) }
                ) {
                    Icon(
                        painter = painterResource(id = item.second),
                        contentDescription = item.first,
                        tint = if (index == selectedIndex) Color(0xFFEBFF00) else Color(0xFF7C7C82),
                        modifier = Modifier.size(22.dp)
                    )
                }
            }
        }
    }
}