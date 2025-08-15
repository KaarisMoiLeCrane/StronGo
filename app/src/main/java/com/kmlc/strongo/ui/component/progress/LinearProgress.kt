package com.kmlc.strongo.ui.component.progress

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun LinearProgress(
    actualValue: Int = 50,
    maxValue: Int = 100,
    strokeWidth: Dp = 8.dp,
    roundedCornerShapeSize: Dp = 4.dp,
    showGlow: Boolean = false,
    color: Color = MaterialTheme.colorScheme.secondary,
    trackColor: Color = MaterialTheme.colorScheme.surfaceVariant
) {
    var animatedScore by remember { mutableFloatStateOf(value = 0f) }
    LaunchedEffect(key1 = actualValue) {
        animatedScore = actualValue / maxValue.toFloat()
    }
    val animProgress by animateFloatAsState(
        targetValue = animatedScore,
        animationSpec = tween(durationMillis = 900, easing = FastOutSlowInEasing)
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = if (showGlow) color.copy(alpha = 0.25f) else Color.Transparent,
                shape = RoundedCornerShape(size = roundedCornerShapeSize)
            )
            .padding(all = 1.dp),
        contentAlignment = Alignment.Center
    ) {
        LinearProgressIndicator(
            progress = { animProgress },
            modifier = Modifier
                .height(height = strokeWidth)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(size = roundedCornerShapeSize)),
            color = color,
            trackColor = trackColor,
            strokeCap = ProgressIndicatorDefaults.LinearStrokeCap
        )
    }
}