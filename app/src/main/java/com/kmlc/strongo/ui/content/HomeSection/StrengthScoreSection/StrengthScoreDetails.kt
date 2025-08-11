package com.kmlc.strongo.ui.content.HomeSection.StrengthScoreSection

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.StrengthScoreCard
import com.kmlc.strongo.ui.component.*


@Composable
fun StrengthScoreDetailsContent() {
    var showInfoDialog by remember { mutableStateOf(false) }

    StrengthScoreCard(
        score = 161,
        maxScore = 200,
        level = StrengthLevel.fromScore(161),
        muscleScores = listOf(
            MuscleScore("Total Score", 6, true),
            MuscleScore("Chest", 12, true),
            MuscleScore("Back", 1, false),
            MuscleScore("Shoulders", 29, true),
            MuscleScore("Hamstrings", 6, true)
        ),
        modifier = Modifier.padding(16.dp),
        onClick = { /* Navigation vers l'écran détail */ },
        onInfoClick = { showInfoDialog = true }
    )

    StrengthScoreInfoDialog(
        visible = showInfoDialog,
        onClose = { showInfoDialog = false }
    )
}