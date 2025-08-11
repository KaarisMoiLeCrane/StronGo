package com.kmlc.strongo.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.content.IconClass
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun IconView(
    modifier: Modifier = Modifier.size(36.dp),
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

@Composable
fun VerticalCard(
    modifier: Modifier = Modifier,
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
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxSize()
                .clickable(
                    onClick = onClick
                )
                .padding(16.dp)
                .weight(1f)
        ) {
            composableElement()

            Spacer(Modifier.height(28.dp))

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
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .clickable { onClick() }
                .padding(16.dp)
        ) {
            composableElement()

            Spacer(Modifier.width(12.dp))
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

// Pour la forme hexagone (PolygonShape) :
fun polygonShape(sides: Int) = GenericShape { size, _ ->
    val radius = size.minDimension / 2
    val centerX = size.width / 2
    val centerY = size.height / 2
    for (i in 0 until sides) {
        val angle = Math.toRadians(360.0 * i / sides - 90)
        val x = centerX + radius * cos(angle).toFloat()
        val y = centerY + radius * sin(angle).toFloat()
        if (i == 0) moveTo(x, y) else lineTo(x, y)
    }
    close()
}