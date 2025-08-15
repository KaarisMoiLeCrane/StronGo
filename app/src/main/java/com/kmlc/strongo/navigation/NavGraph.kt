package com.kmlc.strongo.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kmlc.strongo.ui.content.HomeContent
import com.kmlc.strongo.ui.content.HomeSection.StrengthScoreSection.StrengthScoreDetailsContent
import com.kmlc.strongo.ui.content.ProfileContent
import com.kmlc.strongo.ui.content.ScheduleContent
import com.kmlc.strongo.ui.content.WorkoutsContent

enum class Screen {
    Home, Schedule, Workouts, Profile, StrengthScoreDetails
}

@Composable
fun StronGoNavGraph(startDestination: Screen = Screen.Home) {
    HideSystemBars()

    val navController = rememberNavController()

    NavHost(navController, startDestination = startDestination.name) {
        this.composable(route = Screen.Home.name) {
            HomeScreen(navController = navController, selectedIndex = 0)
        }
        this.composable(route = Screen.Schedule.name) {
            ScheduleScreen(
                navController = navController,
                selectedIndex = 1
            )
        }
        this.composable(route = Screen.Workouts.name) {
            WorkoutsScreen(
                navController = navController,
                selectedIndex = 2
            )
        }
        this.composable(route = Screen.Profile.name) {
            ProfileScreen(navController = navController, selectedIndex = 3)
        }
        this.composable(route = Screen.StrengthScoreDetails.name) {
            StrengthScoreDetailsScreen(
                navController = navController,
                selectedIndex = 0
            )
        }
    }
}

@Composable
fun HomeScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CustomStatusBar()
            },
            bottomBar = {
                BottomNavigationBar(
                    modifier = Modifier.align(Alignment.BottomCenter),
                    selectedIndex = selectedIndex,
                    onItemSelected = { index ->
                        val screen = when (index) {
                            0 -> Screen.Home
                            1 -> Screen.Schedule
                            2 -> Screen.Workouts
                            3 -> Screen.Profile
                            else -> Screen.Home
                        }
                        navController.navigate(route = screen.name) {
                            popUpTo(route = Screen.Home.name) {
                                inclusive = false
                            }
                            launchSingleTop = true
                        }
                    }
                )
            }
        ) { innerPadding ->
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    top = innerPadding.calculateTopPadding() + 16.dp,
                    bottom = innerPadding.calculateBottomPadding() + 16.dp
                ),
                verticalArrangement = Arrangement.spacedBy(space = 16.dp)
            ) {
                item {
                    HomeContent(navController = navController)
                }
            }
        }
    }
}

@Composable
fun ScheduleScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CustomStatusBar()
            },
            bottomBar = {
                BottomNavigationBar(
                    modifier = Modifier.align(Alignment.BottomCenter),
                    selectedIndex = selectedIndex,
                    onItemSelected = { index ->
                        val screen = when (index) {
                            0 -> Screen.Home
                            1 -> Screen.Schedule
                            2 -> Screen.Workouts
                            3 -> Screen.Profile
                            else -> Screen.Home
                        }
                        navController.navigate(route = screen.name) {
                            popUpTo(route = Screen.Schedule.name) {
                                inclusive = false
                            }
                            launchSingleTop = true
                        }
                    },

                    )
            }
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
            topBar = {
                CustomStatusBar()
            },
            bottomBar = {
                BottomNavigationBar(
                    modifier = Modifier.align(Alignment.BottomCenter),
                    selectedIndex = selectedIndex,
                    onItemSelected = { index ->
                        val screen = when (index) {
                            0 -> Screen.Home
                            1 -> Screen.Schedule
                            2 -> Screen.Workouts
                            3 -> Screen.Profile
                            else -> Screen.Home
                        }
                        navController.navigate(route = screen.name) {
                            popUpTo(route = Screen.Workouts.name) {
                                inclusive = false
                            }
                            launchSingleTop = true
                        }
                    }
                )
            }
        ) { innerPadding ->
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    top = innerPadding.calculateTopPadding() + 16.dp,
                    bottom = innerPadding.calculateBottomPadding() + 16.dp
                ),
                verticalArrangement = Arrangement.spacedBy(space = 16.dp)
            ) {
                item {
                    WorkoutsContent(navController = navController)
                }
            }
        }
    }
}

@Composable
fun ProfileScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CustomStatusBar()
            },
            bottomBar = {
                BottomNavigationBar(
                    modifier = Modifier.align(Alignment.BottomCenter),
                    selectedIndex = selectedIndex,
                    onItemSelected = { index ->
                        val screen = when (index) {
                            0 -> Screen.Home
                            1 -> Screen.Schedule
                            2 -> Screen.Workouts
                            3 -> Screen.Profile
                            else -> Screen.Home
                        }
                        navController.navigate(route = screen.name) {
                            popUpTo(route = Screen.Profile.name) {
                                inclusive = false
                            }
                            launchSingleTop = true
                        }
                    }
                )
            }
        ) { innerPadding ->
            ProfileContent(
                innerPadding = innerPadding
            )
        }
    }
}

@Composable
fun StrengthScoreDetailsScreen(navController: NavController, selectedIndex: Int) {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                CustomStatusBar()
            },
            bottomBar = {
                BottomNavigationBar(
                    modifier = Modifier.align(Alignment.BottomCenter),
                    selectedIndex = selectedIndex,
                    onItemSelected = { index ->
                        val screen = when (index) {
                            0 -> Screen.Home
                            1 -> Screen.Schedule
                            2 -> Screen.Workouts
                            3 -> Screen.Profile
                            else -> Screen.Home
                        }
                        navController.navigate(route = screen.name) {
                            popUpTo(route = Screen.Home.name) {
                                inclusive = false
                            }
                            launchSingleTop = true
                        }
                    }
                )
            }
        ) { innerPadding ->
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    top = innerPadding.calculateTopPadding() + 16.dp,
                    bottom = innerPadding.calculateBottomPadding() + 16.dp
                ),
                verticalArrangement = Arrangement.spacedBy(space = 16.dp)
            ) {
                item {
                    StrengthScoreDetailsContent()
                }
            }
        }
    }
}