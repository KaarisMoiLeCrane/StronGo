package com.kmlc.strongo.ui.component.score

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView

/**
 * Displays a breakdown of muscle scores with icons and values.
 * Each muscle score is represented by an icon, label, and value.
 * The icon color indicates whether the score is up or down.
 * @param muscleScores List of [MuscleScore] objects to display.
 * Each [MuscleScore] contains an icon, label, value, and a boolean indicating if the score is up.
 * Example usage:
 * ```
 * MuscleScoreBreakdown(
 *     muscleScores = listOf(
 *         MuscleScore(
 *             icon = Icons.Default.ArrowUpward,
 *             label = "Biceps",
 *             value = 75,
 *             isUp = true
 *         ),
 *         MuscleScore(
 *             icon = Icons.Default.ArrowDownward,
 *             label = "Triceps",
 *             value = 50,
 *             isUp = false
 *         )
 *     )
 * )
 * ```
 */
@Composable
fun MuscleScoreBreakdown(muscleScores: List<MuscleScore>) {
    Column {
        muscleScores.forEach { muscle ->
            MuscleScoreItem(muscle)
        }
    }
}

@Composable
fun MuscleScoreItem(
    muscle: MuscleScore,
    upColor: Color = MaterialTheme.colorScheme.secondary,
    downColor: Color = MaterialTheme.colorScheme.error,
    labelColor: Color = MaterialTheme.colorScheme.onSurface
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 6.dp)
    ) {
        IconView(
            icon = IconClass.Vector(imageVector = muscle.icon),
            tint = if (muscle.isUp) upColor else downColor,
            modifier = Modifier.size(size = 20.dp)
        )
        Spacer(Modifier.width(width = 10.dp))
        Text(
            text = muscle.label,
            color = labelColor,
            fontSize = 15.sp,
            modifier = Modifier.weight(weight = 1f)
        )
        Text(
            text = muscle.value.toString(),
            color = if (muscle.isUp) upColor else downColor,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )
    }
}