package com.kmlc.strongo.navigation

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.kmlc.strongo.ui.content.HomeContent
import com.kmlc.strongo.ui.content.ProfileContent
import com.kmlc.strongo.ui.content.ScheduleContent
import com.kmlc.strongo.ui.content.WorkoutsContent
import androidx.compose.material3.Scaffold

enum class Screen {
    Home, Schedule, Workouts, Profile
}

@Composable
fun StronGoNavGraph(startDestination: Screen = Screen.Home) {
    HideSystemBars()
    val navController = rememberNavController()
    NavHost(navController, startDestination = startDestination.name) {
        composable(Screen.Home.name) { HomeScreen(navController, 0) }
        composable(Screen.Schedule.name) { ScheduleScreen(navController, 1) }
        composable(Screen.Workouts.name) { WorkoutsScreen(navController, 2) }
        composable(Screen.Profile.name) { ProfileScreen(navController, 3) }
    }
}

@Composable
fun HomeScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = { CustomStatusBar() },
            bottomBar = { BottomNavigationBar(
                selectedIndex,
                onItemSelected = { index ->
                    val screen = when (index) {
                        0 -> Screen.Home
                        1 -> Screen.Schedule
                        2 -> Screen.Workouts
                        3 -> Screen.Profile
                        else -> Screen.Home
                    }
                    navController.navigate(screen.name) {
                        popUpTo(Screen.Home.name) { inclusive = false }
                        launchSingleTop = true
                    }
                },
                modifier = Modifier.align(Alignment.BottomCenter)
            ) }
        ) { innerPadding ->
            HomeContent(
                innerPadding = innerPadding
            )
        }
    }
}

@Composable
fun ScheduleScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = { CustomStatusBar() },
            bottomBar = { BottomNavigationBar(
                selectedIndex,
                onItemSelected = { index ->
                    val screen = when (index) {
                        0 -> Screen.Home
                        1 -> Screen.Schedule
                        2 -> Screen.Workouts
                        3 -> Screen.Profile
                        else -> Screen.Home
                    }
                    navController.navigate(screen.name) {
                        popUpTo(Screen.Schedule.name) { inclusive = false }
                        launchSingleTop = true
                    }
                },
                modifier = Modifier.align(Alignment.BottomCenter)
            ) }
        ) { innerPadding ->
            ScheduleContent(
                innerPadding = innerPadding
            )
        }
    }
}

@Composable
fun WorkoutsScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = { CustomStatusBar() },
            bottomBar = { BottomNavigationBar(
                selectedIndex,
                onItemSelected = { index ->
                    val screen = when (index) {
                        0 -> Screen.Home
                        1 -> Screen.Schedule
                        2 -> Screen.Workouts
                        3 -> Screen.Profile
                        else -> Screen.Home
                    }
                    navController.navigate(screen.name) {
                        popUpTo(Screen.Workouts.name) { inclusive = false }
                        launchSingleTop = true
                    }
                },
                modifier = Modifier.align(Alignment.BottomCenter)
            ) }
        ) { innerPadding ->
            WorkoutsContent(
                innerPadding = innerPadding
            )
        }
    }
}

@Composable
fun ProfileScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = { CustomStatusBar() },
            bottomBar = { BottomNavigationBar(
                selectedIndex,
                onItemSelected = { index ->
                    val screen = when (index) {
                        0 -> Screen.Home
                        1 -> Screen.Schedule
                        2 -> Screen.Workouts
                        3 -> Screen.Profile
                        else -> Screen.Home
                    }
                    navController.navigate(screen.name) {
                        popUpTo(Screen.Profile.name) { inclusive = false }
                        launchSingleTop = true
                    }
                },
                modifier = Modifier.align(Alignment.BottomCenter)
            ) }
        ) { innerPadding ->
            ProfileContent(
                innerPadding = innerPadding
            )
        }
    }
}