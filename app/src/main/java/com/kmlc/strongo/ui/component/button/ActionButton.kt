package com.kmlc.strongo.ui.component.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView

/**
 * ActionButton is a reusable component that displays an icon and a label.
 * It is designed to be used in various parts of the application where an action button is needed.
 *
 * @param icon The icon to be displayed on the button.
 * @param label The text label for the button.
 * @param buttonColor The background color of the button. Defaults to the surface color of the Material theme.
 * @param iconColor The color of the icon. Defaults to a semi-transparent onSurface color from the Material theme.
 * @param labelColor The color of the label text. Defaults to the onSurface color of the Material theme.
 * @param onClick The callback function to be invoked when the button is clicked.
 */
@Composable
fun ActionButton(
    icon: ImageVector,
    label: String = "",
    buttonColor: Color = MaterialTheme.colorScheme.surface,
    iconColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
    labelColor: Color = MaterialTheme.colorScheme.onSurface,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.Companion.CenterHorizontally
    ) {
        IconButton(
            onClick = onClick,
            modifier = Modifier
                .size(size = 56.dp)
                .background(color = buttonColor, shape = CircleShape)
        ) {
            IconView(
                modifier = Modifier.size(size = 32.dp),
                icon = IconClass.Vector(imageVector = icon),
                description = label,
                tint = iconColor
            )
        }

        if (label.isEmpty()) return@Column

        Text(
            text = label,
            color = labelColor,
            style = MaterialTheme.typography.labelMedium
        )
    }
}