package com.kmlc.strongo.ui.content

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.kmlc.strongo.R

@Composable
fun ScheduleContent() {
    Text(
        text = stringResource(R.string.schedule),
        style = MaterialTheme.typography.headlineMedium,
        color = Color.Black
    )
}