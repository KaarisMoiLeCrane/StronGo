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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
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
    onEmptySession: () -> Unit = {},
    textColor: Color = MaterialTheme.colorScheme.onBackground,
    iconColor: Color = MaterialTheme.colorScheme.onTertiary
) {
    Text(
        text = stringResource(id = R.string.feeling_like_something_different),
        color = textColor,
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
                    title = stringResource(id = R.string.custom),
                    description = stringResource(id = R.string.create_a_freestyle_session),
                    onClick = onCustomSession
                ) {
                    IconView(
                        icon = IconClass.Vector(imageVector = StronGoIcons.Filled.AutoAwesome),
                        description = stringResource(id = R.string.custom),
                        tint = iconColor
                    )
                }

                1 -> VerticalCard(
                    modifier = Modifier.width(width = 130.dp),
                    title = stringResource(id = R.string.favorites),
                    description = stringResource(id = R.string.pick_from_your_saved_workouts),
                    onClick = onFavorites
                ) {
                    IconView(
                        icon = IconClass.Vector(imageVector = StronGoIcons.Outlined.Bookmarks),
                        description = stringResource(id = R.string.favorites),
                        tint = iconColor
                    )
                }

                2 -> VerticalCard(
                    modifier = Modifier.width(width = 130.dp),
                    title = stringResource(id = R.string.empty),
                    description = stringResource(id = R.string.full_control_over_your_workout),
                    onClick = onEmptySession
                ) {
                    IconView(
                        icon = IconClass.Vector(imageVector = Icons.Default.PlayArrow),
                        description = stringResource(id = R.string.empty),
                        tint = iconColor
                    )
                }
            }
        }
    }
}