package com.kmlc.strongo.ui.component.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A static grid layout (no scroll) for any item type.
 *
 * @param items The list of items to display.
 * @param columns Number of columns in the grid.
 * @param modifier Modifier for the grid container.
 * @param horizontalSpacing Space between items horizontally.
 * @param verticalSpacing Space between rows.
 * @param content Lambda to display each item.
 */
@Composable
fun <T> StaticGrid(
    items: List<T>,
    columns: Int,
    modifier: Modifier = Modifier,
    horizontalSpacing: Dp = 0.dp,
    verticalSpacing: Dp = 0.dp,
    content: @Composable (item: T) -> Unit
) {
    Column(modifier = modifier) {
        items.chunked(size = columns).forEach { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(space = horizontalSpacing)
            ) {
                rowItems.forEach { item ->
                    Box(modifier = Modifier.weight(weight = 1f)) {
                        content(item)
                    }
                }
                if (rowItems.size < columns) {
                    repeat(times = columns - rowItems.size) {
                        Spacer(Modifier.weight(weight = 1f))
                    }
                }
            }
            if (verticalSpacing > 0.dp) {
                Spacer(Modifier.height(height = verticalSpacing))
            }
        }
    }
}