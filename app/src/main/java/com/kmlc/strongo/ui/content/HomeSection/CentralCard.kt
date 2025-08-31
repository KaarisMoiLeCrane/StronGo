package com.kmlc.strongo.ui.content.HomeSection

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.button.ActionButton

@Composable
fun CentralCardSection(
    nextWorkoutLabel: String = "NEXT WORKOUT - PUSH",
    workoutTitle: String = "Chest, Shoulders, Triceps, Abdo, T'es mort tu vas voir",
    workoutDetails: String = "59 mins • 7 exercises",
    workoutImages: List<Int> = listOf(
        R.drawable.exercise_barbell_bench_press,
        R.drawable.muscle_machine_press,
        R.drawable.exercise_cable_fly,
        R.drawable.exercise_dumbbell_press,
        R.drawable.exercise_crunch
    ),
    cardColor: Color = MaterialTheme.colorScheme.tertiary,
    cardBorderColor: Color = MaterialTheme.colorScheme.primary,
    topLabelColor: Color = MaterialTheme.colorScheme.onPrimary,
    topLabelBackgroundColor: Color = MaterialTheme.colorScheme.primary,
    titleColor: Color = MaterialTheme.colorScheme.onTertiary,
    workoutDetailsColor: Color = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.7f),
    onClick: () -> Unit = {},
    onSkip: () -> Unit = {},
    onRegenerate: () -> Unit = {},
    onDuration: () -> Unit = {},
    onShare: () -> Unit = {},
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        shape = RoundedCornerShape(size = 16.dp),
        colors = CardDefaults.cardColors(containerColor = cardColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        border = BorderStroke(width = 0.1.dp, color = cardBorderColor),
        onClick = onClick
    ) {
        Column {
            Column {
                // Top label
                Box(
                    modifier = Modifier
                        .background(
                            color = topLabelBackgroundColor,
                            shape = RoundedCornerShape(topStart = 8.dp, bottomEnd = 8.dp)
                        )
                        .align(Alignment.Companion.Start)
                        .padding(horizontal = 8.dp, vertical = 8.dp)
                ) {
                    Text(
                        text = nextWorkoutLabel,
                        color = topLabelColor,
                        style = MaterialTheme.typography.labelLarge,
                    )
                }
            }
            Column(
                modifier = Modifier.padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
            ) {
                Spacer(Modifier.height(height = 12.dp))
                Text(
                    text = workoutTitle,
                    color = titleColor,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Companion.Bold
                )
                Spacer(Modifier.height(height = 4.dp))
                Text(
                    text = workoutDetails,
                    color = workoutDetailsColor,
                    style = MaterialTheme.typography.bodySmall,
                )
                Spacer(Modifier.height(height = 12.dp))
                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp)
                ) {
                    items(count = workoutImages.size) { index ->
                        Image(
                            painter = painterResource(id = workoutImages[index]),
                            contentDescription = null,
                            modifier = Modifier
                                .size(size = 64.dp)
                                .clip(shape = RoundedCornerShape(size = 16.dp)),
                            contentScale = ContentScale.Companion.Crop
                        )
                    }
                }
                Spacer(Modifier.height(height = 16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    ActionButton(
                        icon = Icons.AutoMirrored.Filled.ArrowForward,
                        label = "Skip",
                        onClick = onSkip
                    )
                    ActionButton(
                        icon = Icons.Default.Refresh,
                        label = "Regenerate",
                        onClick = onRegenerate
                    )
                    ActionButton(
                        icon = Icons.Default.AccountCircle,
                        label = "Duration",
                        onClick = onDuration
                    )
                    ActionButton(icon = Icons.Default.Email, label = "Share", onClick = onShare)
                }
            }
        }
    }
}