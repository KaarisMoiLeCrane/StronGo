package com.kmlc.strongo.ui.component

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun IconView(
    modifier: Modifier = Modifier.Companion.size(36.dp),
    icon: IconClass,
    description: String,
    tint: Color = MaterialTheme.colorScheme.onTertiary
) {
    when (icon) {
        is IconClass.Vector -> Icon(
            imageVector = icon.imageVector,
            contentDescription = description,
            tint = tint,
            modifier = modifier
        )
        is IconClass.PainterIcon -> Icon(
            painter = icon.painter,
            contentDescription = description,
            tint = tint,
            modifier = modifier
        )
    }
}