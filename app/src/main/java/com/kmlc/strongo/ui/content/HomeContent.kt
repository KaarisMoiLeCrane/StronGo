package com.kmlc.strongo.ui.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.BorderStroke

@Composable
fun HomeContent(
    innerPadding: PaddingValues,
    nextWorkoutLabel: String = "NEXT WORKOUT - PUSH",
    workoutTitle: String = "Chest, Shoulders, Triceps, Abdo, T'es mort tu vas voir",
    workoutDetails: String = "59 mins • 7 exercises",
    workoutImages: List<Int> = listOf(
        R.drawable.bench_press,
        R.drawable.machine_press,
        R.drawable.cable_fly,
        R.drawable.dumbbell_press,
        R.drawable.crunch
    ),
    onSkip: () -> Unit = {},
    onRegenerate: () -> Unit = {},
    onDuration: () -> Unit = {},
    onShare: () -> Unit = {},
    recoveryPercent: Int = 100,
    onUpcomingWorkouts: () -> Unit = {},
    onWorkoutRecovery: () -> Unit = {},
) {
    val colorScheme = MaterialTheme.colorScheme

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(colorScheme.background)
            .padding(innerPadding)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Card: Next Workout
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = colorScheme.tertiary),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            border = BorderStroke(0.1.dp, colorScheme.primary.copy())
        ) {
            Column {
                Column {
                    // Top label
                    Box(
                        modifier = Modifier
                            .background(
                                colorScheme.primary,
                                RoundedCornerShape(topStart = 8.dp, bottomEnd = 8.dp)
                            )
                            .align(Alignment.Start)
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                    ) {
                        Text(
                            text = nextWorkoutLabel,
                            color = colorScheme.onPrimary,
                            style = MaterialTheme.typography.labelLarge,
                        )
                    }
                }
                Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
                    Spacer(Modifier.height(12.dp))
                    Text(
                        text = workoutTitle,
                        color = colorScheme.onTertiary,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        text = workoutDetails,
                        color = colorScheme.onTertiary.copy(alpha = 0.7f),
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
                                    .clip(RoundedCornerShape(16.dp)),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                    Spacer(Modifier.height(16.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        HomeScreenAction(icon = Icons.AutoMirrored.Filled.ArrowForward, label = "Skip", onClick = onSkip)
                        HomeScreenAction(icon = Icons.Default.Refresh, label = "Regenerate", onClick = onRegenerate)
                        HomeScreenAction(icon = Icons.Default.AccountCircle, label = "Duration", onClick = onDuration)
                        HomeScreenAction(icon = Icons.Default.Email, label = "Share", onClick = onShare)
                    }
                }
            }
        }

        // Quick actions (Upcoming Workouts + Recovery)
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            // Upcoming Workouts
            Card(
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = colorScheme.tertiary)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable { onUpcomingWorkouts() },
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ) {
                    Icon(
                        imageVector = Icons.Default.DateRange,
                        contentDescription = null,
                        tint = colorScheme.onTertiary.copy(alpha = 0.7f),
                        modifier = Modifier.size(32.dp)
                    )
                    Spacer(Modifier.height(28.dp))
                    Text(
                        "Upcoming Workouts",
                        color = colorScheme.onTertiary,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }

            // Workout Recovery
            Card(
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = colorScheme.tertiary)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .clickable { onWorkoutRecovery() },
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        CircularProgressIndicator(
                            progress = { recoveryPercent / 100f },
                            modifier = Modifier.size(48.dp),
                            color = colorScheme.secondary,
                            strokeWidth = 2.dp
                        )
                        Box(
                            modifier = Modifier
                                .size(42.5.dp)
                                .border(
                                    width = 0.5.dp,
                                    color = colorScheme.onSurface.copy(alpha = 0.5f),
                                    shape = CircleShape
                                )
                        )
                        Text(
                            "$recoveryPercent",
                            color = colorScheme.onTertiary,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.height(28.dp))
                    Text(
                        "Workout Recovery",
                        color = colorScheme.onTertiary,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}

@Composable
fun HomeScreenAction(icon: ImageVector, label: String, onClick: () -> Unit) {
    val colorScheme = MaterialTheme.colorScheme
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        IconButton(
            onClick = onClick,
            modifier = Modifier
                .size(56.dp)
                .background(colorScheme.surface, shape = CircleShape)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = colorScheme.onSurface.copy(alpha = 0.7f),
                modifier = Modifier.size(32.dp)
            )
        }
        Text(label, color = colorScheme.onSurface, style = MaterialTheme.typography.labelMedium)
    }
}