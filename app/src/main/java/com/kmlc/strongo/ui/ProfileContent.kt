package com.kmlc.strongo.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ProfileContent() {
    Box(modifier = Modifier.Companion.fillMaxSize()) {
        Text(
            text = "Profile",
            modifier = Modifier.Companion.align(Alignment.Companion.Center),
            style = MaterialTheme.typography.headlineMedium
        )
    }
}