package com.kmlc.strongo.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun HorizontalCard(
    modifier: Modifier = Modifier,
    composableElement: @Composable () -> Unit,
    description: String = "",
    subtitle: String = "",
    title: String = "",
    onClick: () -> Unit = {},
    colorScheme: ColorScheme
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = colorScheme.tertiary)
    ) {
        Row(
            verticalAlignment = Alignment.Companion.CenterVertically,
            modifier = Modifier.Companion
                .fillMaxSize()
                .clickable { onClick() }
                .padding(16.dp)
        ) {
            composableElement()

            Spacer(Modifier.Companion.width(12.dp))
            Column {
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
}