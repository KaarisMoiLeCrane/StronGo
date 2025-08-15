package com.kmlc.strongo.ui.component.score

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.ui.graphics.vector.ImageVector

data class MuscleScore(
    val label: String,
    val value: Int,
    val isUp: Boolean,
    val icon: ImageVector = if (isUp) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown
)