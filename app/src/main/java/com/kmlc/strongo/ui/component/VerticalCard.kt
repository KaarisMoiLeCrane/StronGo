package com.kmlc.strongo.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VerticalCard(
    modifier: Modifier = Modifier.Companion,
    composableElement: @Composable () -> Unit,
    title: String = "",
    subtitle: String = "",
    description: String = "",
    onClick: () -> Unit = {},
    colorScheme: ColorScheme,
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(16.dp),
        modifier = modifier
            .height(160.dp),
        colors = CardDefaults.cardColors(containerColor = colorScheme.tertiary)
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Companion.Start,
            modifier = Modifier.Companion
                .fillMaxSize()
                .clickable(
                    onClick = onClick
                )
                .padding(16.dp)
                .weight(1f)
        ) {
            composableElement()

            Spacer(Modifier.Companion.height(28.dp))

            if (!title.isEmpty()) {
                Text(
                    text = title,
                    color = colorScheme.onTertiary,
                    style = MaterialTheme.typography.titleSmall
                )
            }
            if (!subtitle.isEmpty()) {
                Text(
                    text = subtitle,
                    color = colorScheme.onTertiary,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            if (!description.isEmpty()) {
                Text(
                    text = description,
                    color = colorScheme.onSurface,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}