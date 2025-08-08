package com.kmlc.strongo.navigation

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.kmlc.strongo.ui.content.HideSystemBars
import com.kmlc.strongo.ui.content.HomeContent
import com.kmlc.strongo.ui.content.ProfileContent
import com.kmlc.strongo.ui.content.ScheduleContent
import com.kmlc.strongo.ui.content.WorkoutsContent

enum class Screen {
    Home, Schedule, Workouts, Profile, Settings
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
        HomeContent()
        BottomNavigationBar(
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
        )
    }
}

@Composable
fun ScheduleScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        ScheduleContent()
        BottomNavigationBar(
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
        )
    }
}

@Composable
fun WorkoutsScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        WorkoutsContent()
        BottomNavigationBar(
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
        )
    }
}

@Composable
fun ProfileScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        ProfileContent()
        BottomNavigationBar(
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
        )
    }
}