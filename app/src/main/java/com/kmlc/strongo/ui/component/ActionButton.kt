package com.kmlc.strongo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun ActionButton(icon: ImageVector, label: String, onClick: () -> Unit) {
    Column(horizontalAlignment = Alignment.Companion.CenterHorizontally) {
        IconButton(
            onClick = onClick,
            modifier = Modifier.Companion
                .size(56.dp)
                .background(MaterialTheme.colorScheme.surface, shape = CircleShape)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
                modifier = Modifier.Companion.size(32.dp)
            )
        }
        Text(
            label,
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.labelMedium
        )
    }
}