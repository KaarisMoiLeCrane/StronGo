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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.IconClass
import com.kmlc.strongo.ui.component.IconView
import com.kmlc.strongo.ui.component.VerticalCard

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
                            icon = IconClass.PainterIcon(painterResource(R.drawable.ic_auto_awesome)),
                            description = "Custom"
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
                            icon = IconClass.PainterIcon(painterResource(R.drawable.ic_bookmarks)),
                            description = "Favorites"
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
                            description = "Empty"
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