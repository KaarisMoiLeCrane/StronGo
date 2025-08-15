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
import com.kmlc.strongo.ui.component.card.VerticalCard
import com.kmlc.strongo.ui.component.progress.CircularProgress
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView

@Composable
fun QuickActionsSection(
    recoveryPercent: Int = 100,
    onUpcomingWorkouts: () -> Unit = {},
    onWorkoutRecovery: () -> Unit = {},
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(space = 16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        VerticalCard(
            modifier = Modifier.weight(weight = 1f),
            subtitle = "Upcoming Workouts",
            description = "View your next workouts",
            onClick = onUpcomingWorkouts
        ) {
            IconView(
                icon = IconClass.Vector(imageVector = Icons.Default.DateRange),
                description = "Upcoming Workouts"
            )
        }

        VerticalCard(
            modifier = Modifier.weight(weight = 1f),
            space = 16.dp,
            subtitle = "Workout Recovery",
            description = "Track your recovery progress",
            onClick = onWorkoutRecovery
        ) {
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
        }
    }
}