package com.kmlc.strongo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
        Pair("Home", Icons.Default.Home),
        Pair("Schedule", Icons.Default.DateRange),
        Pair("Workouts", R.drawable.ic_workouts),
        Pair("Profile", Icons.Default.Person)
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
                IconButton(onClick = { onItemSelected(index) }) {
                    when (val icon = item.second) {
                        is ImageVector -> Icon(
                            imageVector = icon,
                            contentDescription = item.first,
                            tint = if (index == selectedIndex) Color(0xFFEBFF00) else Color(0xFF7C7C82),
                            modifier = Modifier.size(22.dp)
                        )
                        is Int -> Icon(
                            painter = painterResource(id = icon),
                            contentDescription = item.first,
                            tint = if (index == selectedIndex) Color(0xFFEBFF00) else Color(0xFF7C7C82),
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }
            }
        }
    }
}