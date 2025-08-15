package com.kmlc.strongo.ui.component.card

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A composable function that displays a vertical card with a title, subtitle, description, and additional content.
 *
 * @param modifier Modifier to be applied to the card.
 * @param space The space between the content and the title, subtitle, and description.
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
fun VerticalCard(
    modifier: Modifier = Modifier,
    space: Dp = 28.dp,
    title: String = "",
    subtitle: String = "",
    description: String = "",
    cardColor: Color = MaterialTheme.colorScheme.tertiary,
    titleColor: Color = MaterialTheme.colorScheme.onTertiary,
    subtitleColor: Color = MaterialTheme.colorScheme.onTertiary,
    descriptionColor: Color = MaterialTheme.colorScheme.onSurface,
    onClick: () -> Unit = {},
    content: @Composable () -> Unit = {}
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(16.dp),
        modifier = modifier
            .height(height = 160.dp),
        colors = CardDefaults.cardColors(containerColor = cardColor)
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Companion.Start,
            modifier = Modifier
                .fillMaxSize()
                .clickable(
                    onClick = onClick
                )
                .padding(all = 16.dp)
                .weight(weight = 1f)
        ) {
            content()

            Spacer(Modifier.height(height = space))

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