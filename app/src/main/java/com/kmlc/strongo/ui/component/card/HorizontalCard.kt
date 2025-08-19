package com.kmlc.strongo.ui.component.card

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A horizontal card component that displays a title, subtitle, and description.
 *
 * @param modifier Modifier to be applied to the card.
 * @param title The title text to display.
 * @param subtitle The subtitle text to display.
 * @param description The description text to display.
 * @param cardColor The background color of the card.
 * @param titleColor The color of the title text.
 * @param subtitleColor The color of the subtitle text.
 * @param descriptionColor The color of the description text.
 * @param onClick Callback function to be invoked when the card is clicked.
 * @param content Composable content to be displayed inside the card.
 */
@Composable
fun HorizontalCard(
    modifier: Modifier = Modifier,
    title: String = "",
    subtitle: String = "",
    description: String = "",
    cardElevation: Dp = 2.dp,
    cardColor: Color = MaterialTheme.colorScheme.tertiary,
    titleColor: Color = MaterialTheme.colorScheme.onTertiary,
    subtitleColor: Color = MaterialTheme.colorScheme.onTertiary,
    descriptionColor: Color = MaterialTheme.colorScheme.onSurface,
    onClick: () -> Unit = {},
    content: @Composable () -> Unit
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = cardElevation),
        modifier = modifier,
        shape = RoundedCornerShape(size = 16.dp),
        colors = CardDefaults.cardColors(containerColor = cardColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .clickable { onClick() }
                .padding(all = 16.dp),
            verticalAlignment = Alignment.Companion.CenterVertically
        ) {
            content()

            Spacer(Modifier.width(width = 12.dp))
            Column {
                if (!title.isEmpty()) {
                    Text(
                        text = title,
                        color = titleColor,
                        style = MaterialTheme.typography.titleSmall
                    )
                }
                if (!subtitle.isEmpty()) {
                    Text(
                        text = subtitle,
                        color = subtitleColor,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                if (!description.isEmpty()) {
                    Text(
                        text = description,
                        color = descriptionColor,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}