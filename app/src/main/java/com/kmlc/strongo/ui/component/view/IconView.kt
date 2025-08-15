package com.kmlc.strongo.ui.component.view

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

/**
 * IconView is a composable function that displays an icon based on the provided IconClass.
 * It supports both vector icons and painter icons, allowing for flexible icon rendering.
 *
 * @param modifier Modifier to customize the size and appearance of the icon.
 * @param icon The icon to be displayed, which can be a vector image or a painter icon.
 * @param description Optional content description for accessibility purposes.
 * @param tint Color to apply to the icon, defaulting to the onTertiary color from the MaterialTheme.
 */
@Composable
fun IconView(
    modifier: Modifier = Modifier.size(36.dp),
    icon: IconClass,
    description: String = "",
    tint: Color = MaterialTheme.colorScheme.onTertiary
) {
    when (icon) {
        is IconClass.Vector -> Image(
            imageVector = icon.imageVector,
            contentDescription = description,
            colorFilter = ColorFilter.tint(color = tint, blendMode = BlendMode.SrcIn),
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