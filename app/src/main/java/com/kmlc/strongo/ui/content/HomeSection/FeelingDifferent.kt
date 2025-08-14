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
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.IconClass
import com.kmlc.strongo.ui.component.IconView
import com.kmlc.strongo.ui.component.VerticalCard
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.filled.AutoAwesome
import com.kmlc.strongo.ui.component.icons.outlined.Bookmarks

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
        modifier = Modifier.Companion.padding(vertical = 12.dp)
    )

    LazyRow(
        modifier = Modifier.Companion.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 5.dp)
    ) {
        items(3) { i ->
            when (i) {
                0 -> VerticalCard(
                    modifier = Modifier.Companion.width(130.dp),
                    composableElement = {
                        IconView(
                            icon = IconClass.Vector(StronGoIcons.Filled.AutoAwesome),
                            description = "Custom",
                            tint = colorScheme.onTertiary
                        )
                    },
                    title = "Custom",
                    description = "Create a freestyle session",
                    onClick = onCustomSession,
                    colorScheme = MaterialTheme.colorScheme
                )

                1 -> VerticalCard(
                    modifier = Modifier.Companion.width(130.dp),
                    composableElement = {
                        IconView(
                            icon = IconClass.Vector(StronGoIcons.Outlined.Bookmarks),
                            description = "Favorites",
                            tint = colorScheme.onTertiary
                        )
                    },
                    title = "Favorites",
                    description = "Pick from your saved workouts",
                    onClick = onFavorites,
                    colorScheme = MaterialTheme.colorScheme
                )

                2 -> VerticalCard(
                    modifier = Modifier.Companion.width(130.dp),
                    composableElement = {
                        IconView(
                            icon = IconClass.Vector(Icons.Default.PlayArrow),
                            description = "Empty",
                            tint = colorScheme.onTertiary
                        )
                    },
                    title = "Empty",
                    description = "Full control over your workout",
                    onClick = onEmptySession,
                    colorScheme = MaterialTheme.colorScheme
                )
            }
        }
    }
}