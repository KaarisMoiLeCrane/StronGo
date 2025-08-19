package com.kmlc.strongo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kmlc.strongo.data.viewmodel.UserProfileViewModel
import com.kmlc.strongo.di.provideUserProfileViewModel
import com.kmlc.strongo.ui.OnBoardingContent
import com.kmlc.strongo.ui.content.HomeContent
import com.kmlc.strongo.ui.content.HomeSection.StrengthScoreSection.StrengthScoreDetailsContent
import com.kmlc.strongo.ui.content.ProfileContent
import com.kmlc.strongo.ui.content.ScheduleContent
import com.kmlc.strongo.ui.content.WorkoutsContent

enum class Screen {
    Home, Schedule, Workouts, Profile, StrengthScoreDetails, OnBoarding
}

@Composable
fun StronGoNavGraph(startDestination: Screen = Screen.OnBoarding) {
    HideSystemBars()

    val navController = rememberNavController()

    NavHost(navController, startDestination = startDestination.name) {
        this.composable(route = Screen.OnBoarding.name) {
            val userProfileViewModel: UserProfileViewModel = provideUserProfileViewModel()

            GenericLoader(
                flow = userProfileViewModel.profile,
                loading = userProfileViewModel.loading,
                onLoaded = { profile ->
                    HomeScreen(navController = navController, selectedIndex = 0)
                },
                onEmpty = {
                    OnBoardingScreen(navController = navController)
                }
            )
        }
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
    CustomScreenScaffold(
        navController = navController,
        selectedIndex = selectedIndex,
        showTopBar = true,
        showBottomBar = true,
        screenName = Screen.Home.name
    ) {
        HomeContent(
            navController = navController
        )
    }
}

@Composable
fun ScheduleScreen(navController: NavController, selectedIndex: Int) {
    CustomScreenScaffold(
        navController = navController,
        selectedIndex = selectedIndex,
        showTopBar = true,
        showBottomBar = true,
        screenName = Screen.Schedule.name
    ) {
        ScheduleContent()
    }
}

@Composable
fun WorkoutsScreen(navController: NavController, selectedIndex: Int) {
    CustomScreenScaffold(
        navController = navController,
        selectedIndex = selectedIndex,
        showTopBar = true,
        showBottomBar = true,
        screenName = Screen.Workouts.name
    ) {
        WorkoutsContent(navController = navController)
    }
}

@Composable
fun ProfileScreen(navController: NavController, selectedIndex: Int) {
    CustomScreenScaffold(
        navController = navController,
        selectedIndex = selectedIndex,
        showTopBar = true,
        showBottomBar = true,
        screenName = Screen.Profile.name
    ) {
        ProfileContent(navController = navController)
    }
}

@Composable
fun StrengthScoreDetailsScreen(navController: NavController, selectedIndex: Int) {
    CustomScreenScaffold(
        navController = navController,
        selectedIndex = selectedIndex,
        showTopBar = true,
        showBottomBar = true,
        screenName = Screen.StrengthScoreDetails.name
    ) {
        StrengthScoreDetailsContent()
    }
}

@Composable
fun OnBoardingScreen(navController: NavController) {
    CustomScreenScaffold(
        navController = navController,
        showTopBar = true,
        showBottomBar = false
    ) {
        OnBoardingContent(onFinish = {
            navController.navigate(route = Screen.Home.name) {
                popUpTo(route = Screen.OnBoarding.name) {
                    inclusive = true
                }
                launchSingleTop = true
            }
        }, navController)
    }
}