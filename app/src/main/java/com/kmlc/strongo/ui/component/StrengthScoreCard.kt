package com.kmlc.strongo.ui.component

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Info
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StrengthScoreCard(
    modifier: Modifier = Modifier,
    score: Int,
    maxScore: Int = 350,
    level: StrengthLevel,
    muscleScores: List<MuscleScore>,
    ratio: Float? = null,
    showTrend: Boolean = true,
    onInfoClick: () -> Unit = {},
    onClick: () -> Unit = {}
) {
    val colorScheme = MaterialTheme.colorScheme
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .shadow(4.dp, RoundedCornerShape(18.dp))
            .background(colorScheme.surface, RoundedCornerShape(18.dp)),
        color = colorScheme.surface,
        shape = RoundedCornerShape(18.dp),
        onClick = onClick
    ) {
        Column(modifier = Modifier.padding(22.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Score de Force",
                    style = MaterialTheme.typography.titleLarge,
                    color = colorScheme.onSurface,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.weight(1f))
                IconButton(
                    onClick = onInfoClick,
                    modifier = Modifier.size(26.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "Info",
                        tint = colorScheme.onSurface.copy(alpha = 0.80f),
                        modifier = Modifier.size(22.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                CircularProgress(
                    actualValue = score,
                    maxValue = maxScore,
                    color = level.color,
                    label = level.label,
                    showGlow = true
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text("Niveau", color = colorScheme.onSurface.copy(alpha = 0.7f), fontSize = 14.sp)
                    Text(level.label, color = level.color, fontSize = 22.sp, fontWeight = FontWeight.SemiBold)
                    Spacer(Modifier.height(10.dp))
                    var animatedScore by remember { mutableStateOf(0f) }
                    LaunchedEffect(score) {
                        animatedScore = score / maxScore.toFloat()
                    }
                    val animProgress by animateFloatAsState(
                        targetValue = animatedScore,
                        animationSpec = tween(durationMillis = 900, easing = FastOutSlowInEasing)
                    )
                    LinearProgressIndicator(
                        progress = { animProgress },
                        modifier = Modifier
                            .height(8.dp)
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(4.dp)),
                        color = level.color,
                        trackColor = colorScheme.surfaceVariant,
                        strokeCap = ProgressIndicatorDefaults.LinearStrokeCap
                    )
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text("$score", color = colorScheme.onSurface, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                        Text("$maxScore", color = colorScheme.onSurface.copy(alpha = 0.5f), fontSize = 12.sp)
                    }
                    if (ratio != null) {
                        Spacer(Modifier.height(6.dp))
                        Text(
                            text = "Ratio force/poids: ${String.format("%.2f", ratio)}x",
                            color = colorScheme.onSurface.copy(alpha = 0.7f),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                    if (showTrend) {
                        Spacer(Modifier.height(2.dp))
                        Text(
                            text = "↗ Tendance hebdo",
                            color = colorScheme.secondary,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Details",
                    tint = colorScheme.onSurface.copy(alpha = 0.6f),
                    modifier = Modifier.size(34.dp)
                )
            }
            Spacer(modifier = Modifier.height(22.dp))
            MuscleScoreBreakdown(muscleScores)
        }
    }
}

@Composable
fun StrengthScoreInfoDialog(
    visible: Boolean,
    onClose: () -> Unit
) {
    if (visible) {
        AlertDialog(
            onDismissRequest = onClose,
            confirmButton = {
                Button(onClick = onClose) {
                    Text("OK")
                }
            },
            title = {
                Text("Comment ça marche ?")
            },
            text = {
                Text(
                    "Votre Score de Force est calculé à partir de :\n" +
                            "• Votre 1RM (meilleure perf 3 derniers mois)\n" +
                            "• Exercices haltères/barres, séparés par groupe musculaire\n" +
                            "• Sexe, âge et poids corporel (standards ajustés)\n\n" +
                            "Le score reflète votre force absolue ET relative, et évolue selon vos progrès et vos changements physiques.\n\n" +
                            "Cliquez sur chaque groupe musculaire pour voir les exercices qui le composent."
                )
            },
            shape = MaterialTheme.shapes.medium
        )
    }
}