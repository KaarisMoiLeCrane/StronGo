package com.kmlc.strongo.ui.content.HomeSection

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kmlc.strongo.R
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
            subtitle = stringResource(id = R.string.upcoming_workouts),
            description = stringResource(id = R.string.view_your_next_workouts),
            onClick = onUpcomingWorkouts
        ) {
            IconView(
                icon = IconClass.Vector(imageVector = Icons.Default.DateRange),
                description = stringResource(id = R.string.upcoming_workouts)
            )
        }

        VerticalCard(
            modifier = Modifier.weight(weight = 1f),
            space = 16.dp,
            subtitle = stringResource(id = R.string.workout_recovery),
            description = stringResource(id = R.string.track_your_recovery_progress),
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