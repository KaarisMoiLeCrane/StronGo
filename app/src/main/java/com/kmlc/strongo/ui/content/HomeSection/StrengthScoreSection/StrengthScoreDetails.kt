package com.kmlc.strongo.ui.content.HomeSection.StrengthScoreSection

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.card.InformationalCard
import com.kmlc.strongo.ui.component.progress.GraphData
import com.kmlc.strongo.ui.component.score.MuscleScore
import com.kmlc.strongo.ui.component.score.MuscleScoreBreakdown
import com.kmlc.strongo.ui.component.score.StrengthLevel

@Composable
fun StrengthScoreDetailsContent(
    score: Int = 121,
    maxScore: Int = 350,
    muscleScores: List<MuscleScore> = listOf(
        MuscleScore(label = "Total Score", value = 6, isUp = true),
        MuscleScore(label = "Chest", value = 12, isUp = true),
        MuscleScore(label = "Back", value = 1, isUp = false),
        MuscleScore(label = "Shoulders", value = 29, isUp = true),
        MuscleScore(label = "Hamstrings", value = 6, isUp = true)
    ),
    strengthWeightRatio: Float? = 1.5f,
    showTrend: Boolean = true,
    cardColor: Color = MaterialTheme.colorScheme.surface,
    titleColor: Color = MaterialTheme.colorScheme.onSurface,
    scoreColor: Color = MaterialTheme.colorScheme.onSurface,
    maxScoreColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
    trackColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    infoColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.80f),
    ratioColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f),
    trendColor: Color = MaterialTheme.colorScheme.secondary,
    levelColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
) {
    var showInfoDialog by remember { mutableStateOf(value = false) }

    InformationalCard(
        modifier = Modifier.padding(all = 16.dp),
        cardColor = cardColor,
        headerContent = {
            Text(
                text = stringResource(id = R.string.strength_score),
                style = MaterialTheme.typography.titleLarge,
                color = titleColor,
                fontWeight = FontWeight.Bold
            )
        },
        showInfoButton = true,
        infoIcon = Icons.Default.Info,
        infoDescription = stringResource(id = R.string.info),
        infoColor = infoColor,
        onInfoClick = { showInfoDialog = true },
        onClick = { }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            GraphData(
                score = score,
                maxScore = maxScore,
                level = StrengthLevel.fromScore(score = score),
                scoreColor = scoreColor,
                maxScoreColor = maxScoreColor,
                trackColor = trackColor,
                levelColor = levelColor
            ) {
                if (showTrend) {
                    Spacer(Modifier.height(height = 2.dp))
                    Text(
                        text = "↗" + stringResource(id = R.string.weekly_trend),
                        color = trendColor,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
        if (strengthWeightRatio != null) {
            Spacer(Modifier.height(6.dp))
            Text(
                text = stringResource(
                    id = R.string.strength_weight_ratio_value,
                    stringResource(id = R.string.strength_weight_ratio),
                    strengthWeightRatio
                ),
                color = ratioColor,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        MuscleScoreBreakdown(muscleScores)
    }

    StrengthScoreInfoDialog(
        visible = showInfoDialog,
        onClose = { showInfoDialog = false }
    )
}

@Composable
fun StrengthScoreInfoDialog(
    visible: Boolean = false,
    onClose: () -> Unit
) {
    if (visible) {
        AlertDialog(
            onDismissRequest = onClose,
            confirmButton = {
                Button(onClick = onClose) {
                    Text(text = stringResource(id = R.string.ok))
                }
            },
            title = {
                Text(text = stringResource(id = R.string.how_it_works))
            },
            text = {
                Text(
                    text = stringResource(id = R.string.strength_score_info_card)
                )
            },
            shape = MaterialTheme.shapes.medium
        )
    }
}