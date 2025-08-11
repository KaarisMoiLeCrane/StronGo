package com.kmlc.strongo.ui.component

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.ui.draw.clip

@Composable
fun StrengthScoreCard(
    modifier: Modifier = Modifier,
    score: Int,
    maxScore: Int = 350,
    level: StrengthLevel,
    muscleScores: List<MuscleScore>,
    ratio: Float? = null, // Ajout du ratio force/poids
    showTrend: Boolean = true, // Ajout trend
    onInfoClick: () -> Unit = {}, // Click sur info
    onClick: () -> Unit = {}
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .shadow(4.dp, RoundedCornerShape(18.dp))
            .background(Color(0xFF181D29), RoundedCornerShape(18.dp)),
        color = Color(0xFF181D29),
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
                    color = Color.White,
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
                        tint = Color.White.copy(alpha = 0.80f),
                        modifier = Modifier.size(22.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                StrengthScoreCircle(
                    score = score,
                    maxScore = maxScore,
                    color = level.color,
                    label = level.label,
                    showGlow = true // Ajout effet glow
                )
                Spacer(modifier = Modifier.width(20.dp))
                Column {
                    Text("Niveau", color = Color.White.copy(alpha = 0.7f), fontSize = 14.sp)
                    Text(level.label, color = level.color, fontSize = 22.sp, fontWeight = FontWeight.SemiBold)
                    Spacer(Modifier.height(10.dp))
                    // Animation sur la barre
                    val animProgress by animateFloatAsState(score / maxScore.toFloat())
                    LinearProgressIndicator(
                    progress = { animProgress },
                    modifier = Modifier.height(8.dp)
                        .width(120.dp)
                        .clip(RoundedCornerShape(4.dp)),
                    color = level.color,
                    trackColor = Color(0xFF343A52),
                    strokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
                    )
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Text("$score", color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Medium)
                        Text("$maxScore", color = Color.White.copy(alpha = 0.5f), fontSize = 12.sp)
                    }
                    // Affichage du ratio si présent
                    if (ratio != null) {
                        Spacer(Modifier.height(6.dp))
                        Text(
                            text = "Ratio force/poids: ${String.format("%.2f", ratio)}x",
                            color = Color.White.copy(alpha = 0.7f),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                    // Affichage de la tendance
                    if (showTrend) {
                        Spacer(Modifier.height(2.dp))
                        Text(
                            text = "↗ Tendance hebdo",
                            color = Color(0xFF2BFF88),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Details",
                    tint = Color.White.copy(alpha = 0.6f),
                    modifier = Modifier.size(34.dp)
                )
            }
            Spacer(modifier = Modifier.height(22.dp))
            MuscleScoreBreakdown(muscleScores)
        }
    }
}

@Composable
fun StrengthScoreCircle(
    score: Int,
    maxScore: Int,
    color: Color,
    label: String,
    showGlow: Boolean = false
) {
    // Animation sur le score
    val animProgress by animateFloatAsState(score / maxScore.toFloat())
    Box(
        modifier = Modifier
            .size(88.dp)
            .background(
                if (showGlow) color.copy(alpha=0.25f) else Color(0xFF222941),
                shape = RoundedCornerShape(44.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
        progress = { animProgress },
        modifier = Modifier.size(76.dp),
        color = color,
        strokeWidth = 7.dp,
        trackColor = ProgressIndicatorDefaults.circularTrackColor,
        strokeCap = ProgressIndicatorDefaults.CircularDeterminateStrokeCap,
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "$score",
                color = Color.White,
                fontSize = 26.sp,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = label,
                color = color,
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

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
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(vertical = 6.dp) // Espacement plus grand
    ) {
        Icon(
            imageVector = muscle.icon,
            contentDescription = null,
            tint = if (muscle.isUp) Color(0xFF2BFF88) else Color(0xFFFF2B2B),
            modifier = Modifier.size(20.dp)
        )
        Spacer(Modifier.width(10.dp))
        Text(
            muscle.label,
            color = Color.White,
            fontSize = 15.sp,
            modifier = Modifier.weight(1f)
        )
        Text(
            muscle.value.toString(),
            color = if (muscle.isUp) Color(0xFF2BFF88) else Color(0xFFFF2B2B),
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )
    }
}

// Le reste ne change pas (enum, data class)
enum class StrengthLevel(val label: String, val color: Color, val min: Int, val max: Int) {
    Beginner("Débutant", Color(0xFF2BFF88), 0, 49),
    Novice("Novice", Color(0xFFFF7F00), 50, 99),
    Intermediate("Expérimenté", Color(0xFF00ADEF), 100, 149),
    Pro("Pro", Color(0xFFB48CFF), 150, 199),
    Athlete("Athlète", Color(0xFFFF2B2B), 200, 249),
    Elite("Élite", Color(0xFF444444), 250, 299),
    Olympic("Olympique", Color(0xFFFFD700), 300, Int.MAX_VALUE);

    companion object {
        fun fromScore(score: Int): StrengthLevel {
            return StrengthLevel.entries.find { score in it.min..it.max } ?: Beginner
        }
    }
}

data class MuscleScore(
    val label: String,
    val value: Int,
    val isUp: Boolean,
    val icon: ImageVector = if (isUp) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown
)

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