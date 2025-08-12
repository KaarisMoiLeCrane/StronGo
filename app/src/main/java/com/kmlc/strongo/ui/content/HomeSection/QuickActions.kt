package com.kmlc.strongo.ui.content.HomeSection

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kmlc.strongo.ui.component.CircularProgress
import com.kmlc.strongo.ui.component.IconClass
import com.kmlc.strongo.ui.component.IconView
import com.kmlc.strongo.ui.component.VerticalCard

@Composable
fun QuickActionsSection(
    recoveryPercent: Int = 100,
    onUpcomingWorkouts: () -> Unit = {},
    onWorkoutRecovery: () -> Unit = {},
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.Companion.fillMaxWidth()
    ) {
        VerticalCard(
            modifier = Modifier.Companion.weight(1f),
            composableElement = {
                IconView(
                    icon = IconClass.Vector(Icons.Default.DateRange),
                    description = "Upcoming Workouts"
                )
            },
            subtitle = "Upcoming Workouts",
            description = "View your next workouts",
            onClick = onUpcomingWorkouts,
            colorScheme = MaterialTheme.colorScheme
        )

        VerticalCard(
            modifier = Modifier.Companion.weight(1f),
            composableElement = {
                CircularProgress(
                    actualValue = recoveryPercent,
                    maxValue = 100,
                    size = 56.dp,
                    fontSize = 16.sp,
                    strokeWidth = 2.dp,
                    color = MaterialTheme.colorScheme.secondary,
                    label = "",
                    showGlow = true
                )
                /*
                Box(contentAlignment = Alignment.Companion.Center) {
                    CircularProgressIndicator(
                        progress = { recoveryPercent / 100f },
                        modifier = Modifier.Companion.size(48.dp),
                        color = MaterialTheme.colorScheme.secondary,
                        strokeWidth = 2.dp
                    )
                    Box(
                        modifier = Modifier.Companion
                            .size(42.5.dp)
                            .border(
                                width = 0.5.dp,
                                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                                shape = CircleShape
                            )
                    )
                    Text(
                        "$recoveryPercent",
                        color = MaterialTheme.colorScheme.onTertiary,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Companion.Bold
                    )
                }*/
            },
            space = 16.dp,
            subtitle = "Workout Recovery",
            description = "Track your recovery progress",
            onClick = onWorkoutRecovery,
            colorScheme = MaterialTheme.colorScheme
        )
    }
}