package com.kmlc.strongo.navigation

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import com.kmlc.strongo.R

enum class Screen {
    Home, Workouts, Schedule, Profile, Settings
}

@Composable
fun StronGoNavGraph(startDestination: Screen = Screen.Home) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = startDestination.name) {
        composable(Screen.Home.name) { HomeScreen() }
        composable(Screen.Workouts.name) { /* EntrainementScreen() */ }
        composable(Screen.Schedule.name) { /* HistoriqueScreen() */ }
        composable(Screen.Profile.name) { /* ProfilScreen() */ }
        composable(Screen.Settings.name) { /* ParametresScreen() */ }
    }
}

@Composable
fun HomeScreen(
    onNavigate: (String) -> Unit = {}
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
    ) {
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { onNavigate("Home") },
                modifier = Modifier.size(width = 72.dp, height = 46.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_home),
                        contentDescription = "Home",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { onNavigate("Schedule")},
                modifier = Modifier.size(width = 72.dp, height = 46.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_schedule),
                        contentDescription = "Schedule",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { onNavigate("Workouts") },
                modifier = Modifier.size(width = 72.dp, height = 46.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_workouts),
                        contentDescription = "Workouts",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { onNavigate("Profile") },
                modifier = Modifier.size(width = 72.dp, height = 46.dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_profile),
                        contentDescription = "Profile",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}
