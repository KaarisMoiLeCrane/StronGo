package com.kmlc.strongo.ui.component

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun CircularProgress(
    actualValue: Int,
    maxValue: Int,
    size: Dp = 100.dp,
    fontSize: TextUnit = 26.sp,
    strokeWidth: Dp = 7.dp,
    color: Color,
    label: String,
    showGlow: Boolean = false
) {
    val colorScheme = MaterialTheme.colorScheme
    var animatedScore by remember { mutableFloatStateOf(0f) }
    LaunchedEffect(actualValue) {
        animatedScore = actualValue / maxValue.toFloat()
    }
    val animProgress by animateFloatAsState(
        targetValue = animatedScore,
        animationSpec = tween(durationMillis = 900, easing = FastOutSlowInEasing)
    )

    val finalLabel = when {
        label.length > 11 -> label.take(10) + "…" // Option 2
        else -> label
    }
    Box(
        modifier = Modifier
            .size(size)
            .background(
                color = if (showGlow) color.copy(alpha = 0.25f) else Color.Transparent,
                shape = RoundedCornerShape(size / 2f)
            ),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            progress = { animProgress },
            modifier = Modifier.size(size - 8.dp),
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
                    color = colorScheme.onTertiary,
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