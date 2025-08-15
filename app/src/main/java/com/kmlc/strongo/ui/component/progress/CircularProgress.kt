package com.kmlc.strongo.ui.component.progress

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * A composable function that displays a circular progress indicator with a label.
 *
 * @param actualValue The current value to display in the progress indicator.
 * @param maxValue The maximum value for the progress indicator.
 * @param size The size of the circular progress indicator.
 * @param fontSize The font size for the text inside the progress indicator.
 * @param strokeWidth The width of the stroke for the circular progress indicator.
 * @param color The color of the circular progress indicator.
 * @param actualValueColor The color of the text displaying the actual value.
 * @param label The label to display below the progress value.
 * @param showGlow Whether to show a glow effect around the progress indicator.
 */
@Composable
fun CircularProgress(
    actualValue: Int = 50,
    maxValue: Int = 100,
    size: Dp = 100.dp,
    fontSize: TextUnit = 26.sp,
    strokeWidth: Dp = 7.dp,
    color: Color = MaterialTheme.colorScheme.secondary,
    actualValueColor: Color = MaterialTheme.colorScheme.onTertiary,
    label: String = "",
    showGlow: Boolean = false
) {
    var animatedScore by remember { mutableFloatStateOf(value = 0f) }
    LaunchedEffect(key1 = actualValue) {
        animatedScore = actualValue / maxValue.toFloat()
    }
    val animProgress by animateFloatAsState(
        targetValue = animatedScore,
        animationSpec = tween(durationMillis = 900, easing = FastOutSlowInEasing)
    )

    val finalLabel = when {
        label.length > 11 -> label.take(n = 10) + "…"
        else -> label
    }

    Box(
        modifier = Modifier
            .size(size)
            .background(
                color = if (showGlow) color.copy(alpha = 0.25f) else Color.Transparent,
                shape = RoundedCornerShape(size = size / 2f)
            ),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            progress = { animProgress },
            modifier = Modifier.size(size = size - 8.dp),
            color = color,
            strokeWidth = strokeWidth,
            trackColor = ProgressIndicatorDefaults.circularIndeterminateTrackColor,
            strokeCap = ProgressIndicatorDefaults.CircularDeterminateStrokeCap
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            if (actualValue != 0) {
                Text(
                    text = "$actualValue",
                    color = actualValueColor,
                    fontSize = fontSize,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            if (finalLabel.isNotEmpty()) {
                Text(
                    text = finalLabel,
                    color = color,
                    fontSize = if (label.length > 10) 10.sp else 13.sp,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}