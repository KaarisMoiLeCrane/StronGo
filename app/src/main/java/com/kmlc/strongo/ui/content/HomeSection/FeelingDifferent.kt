package com.kmlc.strongo.ui.content.HomeSection

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.card.VerticalCard
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.filled.AutoAwesome
import com.kmlc.strongo.ui.component.icons.outlined.Bookmarks
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView

@Composable
fun FeelingDifferentSection(
    onCustomSession: () -> Unit = {},
    onFavorites: () -> Unit = {},
    onEmptySession: () -> Unit = {}
) {
    Text(
        text = "Feeling like something different?",
        color = MaterialTheme.colorScheme.onBackground,
        style = MaterialTheme.typography.titleMedium,
        modifier = Modifier.padding(vertical = 12.dp)
    )

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(space = 16.dp),
        contentPadding = PaddingValues(horizontal = 5.dp)
    ) {
        items(count = 3) { i ->
            when (i) {
                0 -> VerticalCard(
                    modifier = Modifier.width(width = 130.dp),
                    title = "Custom",
                    description = "Create a freestyle session",
                    onClick = onCustomSession
                ) {
                    IconView(
                        icon = IconClass.Vector(imageVector = StronGoIcons.Filled.AutoAwesome),
                        description = "Custom",
                        tint = MaterialTheme.colorScheme.onTertiary
                    )
                }

                1 -> VerticalCard(
                    modifier = Modifier.width(width = 130.dp),
                    title = "Favorites",
                    description = "Pick from your saved workouts",
                    onClick = onFavorites
                ) {
                    IconView(
                        icon = IconClass.Vector(imageVector = StronGoIcons.Outlined.Bookmarks),
                        description = "Favorites",
                        tint = MaterialTheme.colorScheme.onTertiary
                    )
                }

                2 -> VerticalCard(
                    modifier = Modifier.width(width = 130.dp),
                    title = "Empty",
                    description = "Full control over your workout",
                    onClick = onEmptySession
                ) {
                    IconView(
                        icon = IconClass.Vector(imageVector = Icons.Default.PlayArrow),
                        description = "Empty",
                        tint = MaterialTheme.colorScheme.onTertiary
                    )
                }
            }
        }
    }
}