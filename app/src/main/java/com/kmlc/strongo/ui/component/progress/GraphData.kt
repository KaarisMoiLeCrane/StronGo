package com.kmlc.strongo.ui.component.progress

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.score.StrengthLevel

/**
 * GraphData composable displays a circular progress indicator for the current score,
 * a linear progress bar for the score relative to the maximum score,
 * and additional information about the user's strength level.
 * It includes a label for the level, the current score, and the maximum score.
 *
 * @param score The current score of the user.
 * @param maxScore The maximum possible score.
 * @param level The strength level derived from the score.
 * @param scoreColor The color of the current score text.
 * @param maxScoreColor The color of the maximum score text.
 * @param trackColor The color of the track for the linear progress bar.
 * @param levelColor The color of the strength level text.
 * @param content Additional composable content to be displayed below the progress indicators.
 *
 */
@Composable
fun GraphData(
    score: Int = 121,
    maxScore: Int = 350,
    level: StrengthLevel = StrengthLevel.fromScore(score = 121),
    scoreColor: Color = MaterialTheme.colorScheme.onSurface,
    maxScoreColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
    trackColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    levelColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
    content: @Composable () -> Unit = { }
) {
    CircularProgress(
        actualValue = score,
        maxValue = maxScore,
        color = level.color,
        label = level.label,
        showGlow = true
    )
    Spacer(modifier = Modifier.width(width = 20.dp))

    Column {
        Text(
            text = stringResource(id = R.string.level),
            color = levelColor,
            fontSize = 14.sp
        )
        Text(text = level.label, color = level.color, fontSize = 22.sp, fontWeight = FontWeight.SemiBold)

        Spacer(modifier = Modifier.height(height = 10.dp))

        LinearProgress(
            actualValue = score,
            maxValue = maxScore,
            strokeWidth = 8.dp,
            roundedCornerShapeSize = 4.dp,
            showGlow = true,
            color = level.color,
            trackColor = trackColor
        )

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "$score",
                color = scoreColor,
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = "$maxScore",
                color = maxScoreColor,
                fontSize = 12.sp
            )
        }

        content()
    }
}
