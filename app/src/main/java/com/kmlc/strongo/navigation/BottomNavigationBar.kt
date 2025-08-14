package com.kmlc.strongo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.IconClass
import com.kmlc.strongo.ui.component.IconView
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.filled.WorkoutPerson

@Composable
fun BottomNavigationBar(
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        Pair("Home", IconClass.Vector(Icons.Default.Home)),
        Pair("Schedule", IconClass.Vector(Icons.Default.DateRange)),
        Pair("Workouts", IconClass.Vector(StronGoIcons.Filled.WorkoutPerson)),
        Pair("Profile", IconClass.Vector(Icons.Default.Person))
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
                    IconView(
                        icon = item.second,
                        description = item.first,
                        tint = if (index == selectedIndex) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }
}