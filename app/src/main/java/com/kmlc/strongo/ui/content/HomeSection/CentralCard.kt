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
        R.drawable.muscle_bench_press,
        R.drawable.muscle_machine_press,
        R.drawable.muscle_cable_fly,
        R.drawable.muscle_dumbbell_press,
        R.drawable.muscle_crunch
    ),
    onSkip: () -> Unit = {},
    onRegenerate: () -> Unit = {},
    onDuration: () -> Unit = {},
    onShare: () -> Unit = {},
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.tertiary),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        border = BorderStroke(0.1.dp, MaterialTheme.colorScheme.primary)
    ) {
        Column {
            Column {
                // Top label
                Box(
                    modifier = Modifier
                        .background(
                            MaterialTheme.colorScheme.primary,
                            RoundedCornerShape(topStart = 8.dp, bottomEnd = 8.dp)
                        )
                        .align(Alignment.Companion.Start)
                        .padding(horizontal = 8.dp, vertical = 8.dp)
                ) {
                    Text(
                        text = nextWorkoutLabel,
                        color = MaterialTheme.colorScheme.onPrimary,
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
                Spacer(Modifier.height(12.dp))
                Text(
                    text = workoutTitle,
                    color = MaterialTheme.colorScheme.onTertiary,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Companion.Bold
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = workoutDetails,
                    color = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.7f),
                    style = MaterialTheme.typography.bodySmall,
                )
                Spacer(Modifier.height(12.dp))
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(workoutImages.size) { index ->
                        Image(
                            painter = painterResource(id = workoutImages[index]),
                            contentDescription = null,
                            modifier = Modifier
                                .size(64.dp)
                                .clip(androidx.compose.foundation.shape.RoundedCornerShape(16.dp)),
                            contentScale = ContentScale.Companion.Crop
                        )
                    }
                }
                Spacer(Modifier.height(16.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
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