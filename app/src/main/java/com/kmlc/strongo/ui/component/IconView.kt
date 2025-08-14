package com.kmlc.strongo.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun IconView(
    modifier: Modifier = Modifier.size(36.dp),
    icon: IconClass,
    description: String,
    tint: Color = MaterialTheme.colorScheme.onTertiary
) {
    when (icon) {
        is IconClass.Vector -> Image(
            imageVector = icon.imageVector,
            contentDescription = description,
            colorFilter = ColorFilter.tint(tint, blendMode = BlendMode.SrcIn),
            modifier = modifier,
            contentScale = ContentScale.Fit
        )
        is IconClass.PainterIcon -> Image(
            painter = icon.painter,
            contentDescription = description,
            modifier = modifier,
            contentScale = ContentScale.Fit
        )
    }
}