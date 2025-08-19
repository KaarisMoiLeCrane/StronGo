package com.kmlc.strongo.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.flow.StateFlow

/**
 * A generic loader composable that handles loading states and displays content based on the data flow.
 * It shows a loading screen while data is being fetched, displays the loaded data when available,
 * and shows an empty state when no data is available.
 *
 * @param flow The StateFlow containing the data to be displayed.
 * @param loading The StateFlow indicating whether data is currently being loaded.
 * @param onLoaded A composable function that defines how to display the loaded data.
 * @param onEmpty A composable function that defines how to display when no data is available.
 */
@Composable
fun <T> GenericLoader(
    flow: StateFlow<T?>,
    loading: StateFlow<Boolean>,
    onLoaded: @Composable (T) -> Unit,
    onEmpty: @Composable () -> Unit
) {
    val data by flow.collectAsState()
    val isLoading by loading.collectAsState()

    when {
        isLoading -> LoadingScreen()
        data != null -> onLoaded(data!!)
        else -> onEmpty()
    }
}

@Composable
fun LoadingScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        androidx.compose.material3.CircularProgressIndicator()
    }
}