package com.kmlc.strongo.ui.component.card

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView

/**
 * A composable function that displays a muscle card with an optional image, layer, label, and count.
 *
 * @param modifier Modifier to be applied to the card.
 * @param image Optional icon class for the main image.
 * @param layer Optional vector image for the layer.
 * @param label Optional label text for the card.
 * @param count Optional count of items related to the muscle.
 * @param total Optional total number of items related to the muscle.
 * @param cardColor Color of the card background.
 * @param imageColor Color of the main image icon.
 * @param layerColor Color of the layer icon.
 * @param labelColor Color of the label text.
 * @param countColor Color of the count text.
 * @param onClick Callback function to be invoked when the card is clicked.
 */
@Composable
fun MuscleCard(
    modifier: Modifier = Modifier,
    image: IconClass? = null,
    layer: ImageVector? = null,
    label: String? = null,
    count: Int? = null,
    total: Int? = null,
    cardColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    imageColor: Color = MaterialTheme.colorScheme.onSurface,
    layerColor: Color = MaterialTheme.colorScheme.primary,
    labelColor: Color = MaterialTheme.colorScheme.onSurface,
    countColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
    onClick: () -> Unit = {}
) {
    Card(
        modifier = modifier
            .height(height = 80.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(size = 18.dp),
        colors = CardDefaults.cardColors(containerColor = cardColor)
    ) {
        Row(
            modifier = Modifier.padding(all = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.size(size = 48.dp),
                contentAlignment = Alignment.Center
            ) {
                if (image != null && label != null) {
                    IconView(
                        modifier = Modifier
                            .fillMaxSize()
                            .alpha(alpha = 0.5f),
                        icon = image,
                        description = label,
                        tint = imageColor
                    )
                }

                if (layer != null) {
                    IconView(
                        modifier = Modifier.fillMaxSize(),
                        icon = IconClass.Vector(imageVector = layer),
                        description = "Layer",
                        tint = layerColor
                    )
                }
            }
            Spacer(Modifier.width(width = 12.dp))
            Column {
                if (label != null) {
                    Text(
                        text = label,
                        color = labelColor,
                        fontSize = 15.sp,
                        style = MaterialTheme.typography.titleMedium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                val countTotalText = if (count != null && total != null) {
                    "$count/$total"
                } else count?.toString()
                    ?: total?.toString()

                if (countTotalText != null)
                    Text(
                        text = countTotalText,
                        color = countColor,
                        fontSize = 15.sp
                    )
            }
        }
    }
}
