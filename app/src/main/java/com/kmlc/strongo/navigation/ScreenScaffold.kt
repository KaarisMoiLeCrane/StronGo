package com.kmlc.strongo.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


/**
 * CustomScreenScaffold is a composable function that provides a scaffold layout
 * with a top bar, bottom bar, and a content area.
 * It allows customization of the top bar and bottom bar content, and handles navigation
 * between different screens based on the selected index.
 *
 * @param navController The NavController for handling navigation.
 * @param selectedIndex The index of the currently selected item in the bottom navigation bar.
 * @param showTopBar Whether to show the top bar (default is true).
 * @param showBottomBar Whether to show the bottom bar (default is true).
 * @param screenName The name of the on-boarding screen (default is "Screen.Home").
 * @param modifier Modifier for the scaffold.
 * @param topBarContent Composable function for the top bar content (default is CustomStatusBar).
 * @param bottomBarContent Composable function for the bottom bar content (default is BottomNavigationBar).
 * @param content Composable function for the main content of the screen.
 */
@Composable
fun CustomScreenScaffold(
    modifier: Modifier = Modifier,
    navController: NavController,
    selectedIndex: Int = 0,
    showTopBar: Boolean = true,
    showBottomBar: Boolean = true,
    screenName: String = Screen.Home.name,
    topBarContent: @Composable (() -> Unit)? = { CustomStatusBar() },
    bottomBarContent: @Composable (() -> Unit)? = {
        BottomNavigationBar(
            modifier = Modifier,
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
                    popUpTo(route = screenName) { inclusive = false }
                    launchSingleTop = true
                }
            }
        )
    },
    content: @Composable () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = {
                if (showTopBar) {
                    topBarContent?.invoke()
                }
            },
            bottomBar = {
                if (showBottomBar) {
                    bottomBarContent?.invoke()
                }
            }
        ) { innerPadding ->
            LazyColumn(
                modifier = modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    top = innerPadding.calculateTopPadding() + 16.dp,
                    bottom = innerPadding.calculateBottomPadding() + 16.dp
                ),
                verticalArrangement = Arrangement.spacedBy(space = 16.dp)
            ) {
                item {
                    content()
                }
            }
        }
    }
}