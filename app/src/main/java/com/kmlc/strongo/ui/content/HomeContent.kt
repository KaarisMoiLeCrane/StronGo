package com.kmlc.strongo.ui.content

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
    ), // List of drawable resource ids
    onSkip: () -> Unit = {},
    onRegenerate: () -> Unit = {},
    onDuration: () -> Unit = {},
    onShare: () -> Unit = {},
    recoveryPercent: Int = 100,
    onUpcomingWorkouts: () -> Unit = {},
    onWorkoutRecovery: () -> Unit = {},
) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF18181C))
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
            colors = CardDefaults.cardColors(containerColor = Color(0xFF23233B)),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            border = BorderStroke(0.1.dp, Color(0xAAEBFF00))
        ) {
            Column {
                Column {
                    // Top label
                    Box(
                        modifier = Modifier
                            .background(
                                Color(0xFFEBFF00),
                                RoundedCornerShape(topStart = 8.dp, bottomEnd = 8.dp)
                            )
                            .align(Alignment.Start)
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                    ) {
                        Text(
                            text = nextWorkoutLabel,
                            color = Color(0xFF23233B),
                            style = MaterialTheme.typography.labelLarge,
                        )
                    }
                }
                Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
                    Spacer(Modifier.height(12.dp))
                    // Ajoute le padding ici si besoin
                    Text(
                        text = workoutTitle,
                        color = Color.White,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.height(4.dp))
                    // Details
                    Text(
                        text = workoutDetails,
                        color = Color(0xFFB7B7C8),
                        style = MaterialTheme.typography.bodySmall,
                    )
                    Spacer(Modifier.height(12.dp))
                    // Images
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
                    // Action buttons
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
                colors = CardDefaults.cardColors(containerColor = Color(0xFF23233B))
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
                        tint = Color(0xFFB7B7C8),
                        modifier = Modifier.size(32.dp)
                    )
                    Spacer(Modifier.height(28.dp))
                    Text(
                        "Upcoming Workouts",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }

            // Workout Recovery
            Card(
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF23233B))
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
                            color = Color(0xFF2FBB6E),
                            strokeWidth = 2.dp
                        )
                        Box(
                            modifier = Modifier
                                .size(42.5.dp)
                                .border(
                                    width = 0.5.dp,
                                    color = Color(0xBFB7B7C8),
                                    shape = CircleShape
                                )
                        )
                        Text(
                            "$recoveryPercent",
                            color = Color.White,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.height(28.dp))
                    Text(
                        "Workout Recovery",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyMedium
                    )

                }
            }
        }
    }
}

@Composable
fun HomeScreenAction(icon: ImageVector, label: String, onClick: () -> Unit) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        IconButton(
            onClick = onClick,
            modifier = Modifier
                .size(56.dp)
                .background(Color(0xFF23233B), shape = CircleShape)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = Color(0xFFB7B7C8),
                modifier = Modifier.size(32.dp)
            )
        }
        Text(label, color = Color.White, style = MaterialTheme.typography.labelMedium)
    }
}