package com.kmlc.strongo.ui.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MuscleScoreBreakdown(muscleScores: List<MuscleScore>) {
    Column {
        muscleScores.forEach { muscle ->
            MuscleScoreItem(muscle)
        }
    }
}

@Composable
fun MuscleScoreItem(muscle: MuscleScore) {
    val colorScheme = MaterialTheme.colorScheme
    val upColor = colorScheme.secondary
    val downColor = colorScheme.error
    val labelColor = colorScheme.onSurface

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 6.dp)
    ) {
        Icon(
            imageVector = muscle.icon,
            contentDescription = null,
            tint = if (muscle.isUp) upColor else downColor,
            modifier = Modifier.size(20.dp)
        )
        Spacer(Modifier.width(10.dp))
        Text(
            muscle.label,
            color = labelColor,
            fontSize = 15.sp,
            modifier = Modifier.weight(1f)
        )
        Text(
            muscle.value.toString(),
            color = if (muscle.isUp) upColor else downColor,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )
    }
}