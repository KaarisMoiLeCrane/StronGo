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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import com.kmlc.strongo.ui.HorizontalCard
import com.kmlc.strongo.ui.IconView
import com.kmlc.strongo.ui.VerticalCard
import com.kmlc.strongo.ui.polygonShape

sealed class IconClass {
    data class Vector(val imageVector: ImageVector) : IconClass()
    data class PainterIcon(val painter: Painter) : IconClass()
}

@Composable
fun HomeContent(
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
        VerticalCard(
            modifier = Modifier.weight(1f),
            composableElement = {
                IconView(
                    icon = IconClass.Vector(Icons.Default.DateRange),
                    description = "Upcoming Workouts"
                )
            },
            subtitle = "Upcoming Workouts",
            description = "View your next workouts",
            onClick = onUpcomingWorkouts,
            colorScheme = colorScheme
        )

        VerticalCard(
            modifier = Modifier.weight(1f),
            composableElement = {
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
            },
            subtitle = "Workout Recovery",
            description = "Track your recovery progress",
            onClick = onWorkoutRecovery,
            colorScheme = colorScheme
        )
    }
    HomeScreenExtension()
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

@Composable
fun HomeScreenExtension(
    onCustomSession: () -> Unit = {},
    onFavorites: () -> Unit = {},
    onEmptySession: () -> Unit = {},
    strengthScore: Int? = null,
    onTrendsPeriodChange: (String) -> Unit = {},
    trendsPeriod: String = "Past 7 days",
    trends: TrendsData = TrendsData()
) {
    val colorScheme = MaterialTheme.colorScheme
    Text(
        text = "Feeling like something different?",
        color = colorScheme.onBackground,
        style = MaterialTheme.typography.titleMedium,
        modifier = Modifier.padding(vertical = 12.dp)
    )
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
            .widthIn(min = 400.dp)
            .padding(horizontal = 1.dp)
    ) {
        VerticalCard(
            modifier = Modifier.weight(1f),
            composableElement = {
                IconView(
                    icon = IconClass.PainterIcon(painterResource(R.drawable.auto_awesome)),
                    description = "Custom"
                )
            },
            title = "Custom",
            description = "Create a freestyle session",
            onClick = onCustomSession,
            colorScheme = colorScheme
        )

        VerticalCard(
            modifier = Modifier.weight(1f),
            composableElement = {
                IconView(
                    icon = IconClass.PainterIcon(painterResource(R.drawable.bookmarks)),
                    description = "Favorites"
                )
            },
            title = "Favorites",
            description = "Pick from your saved workouts",
            onClick = onFavorites,
            colorScheme = colorScheme
        )

        VerticalCard(
            modifier = Modifier.weight(1f),
            composableElement = {
                IconView(
                    icon = IconClass.Vector(Icons.Default.PlayArrow),
                    description = "Empty"
                )
            },
            title = "Empty",
            description = "Full control over your workout",
            onClick = onEmptySession,
            colorScheme = colorScheme
        )
    }
    Spacer(Modifier.height(24.dp))

    val strengthScoreSubTitle = if (strengthScore == null) {
        "You need to complete a few workouts before you can see your score."
    } else {
        "Your Strength Score"
    }

    val strengthScoreTitle = if (strengthScore != null) {
        "$strengthScore"
    } else {
        ""
    }

    Text(
        text = "Strength Score",
        color = colorScheme.onBackground,
        style = MaterialTheme.typography.titleMedium
    )

    HorizontalCard(
        modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp),
        composableElement = {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(colorScheme.primary, shape = polygonShape(6))
                    .padding(6.dp),
                contentAlignment = Alignment.Center
            ) {
                IconView(
                    icon = IconClass.PainterIcon(painterResource(R.drawable.fitness_center)),
                    description = "Strength Score",
                    tint = colorScheme.tertiary,
                    modifier = Modifier.size(24.dp)
                )
            }

        },
        subtitle = strengthScoreSubTitle,
        title = strengthScoreTitle,
        colorScheme = colorScheme
    )

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Trends",
            color = colorScheme.onBackground,
            style = MaterialTheme.typography.titleMedium
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { onTrendsPeriodChange("Past 7 days") }
        ) {
            Text(
                text = trendsPeriod,
                color = colorScheme.onBackground,
                style = MaterialTheme.typography.bodyMedium
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "Change period",
                tint = colorScheme.onBackground
            )
        }
    }
    Spacer(Modifier.height(12.dp))
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            HorizontalCard(
                modifier = Modifier.weight(1f),
                composableElement = {
                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .background(Color(0xFF6C8FF7), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        IconView(
                            modifier = Modifier.size(20.dp),
                            icon = IconClass.Vector(Icons.Default.Check),
                            description = "Custom",
                            tint = Color.White
                        )
                    }
                },
                description = "Workouts",
                subtitle = trends.workouts,
                colorScheme = colorScheme
            )
            HorizontalCard(
                modifier = Modifier.weight(1f),
                composableElement = {
                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .background(Color(0xFF33CFCF), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        IconView(
                            modifier = Modifier.size(20.dp),
                            icon = IconClass.PainterIcon(painterResource(R.drawable.local_fire_department)),
                            description = "Volume",
                            tint = Color.White
                        )
                    }
                },
                description = "Volume",
                subtitle = trends.volume,
                colorScheme = colorScheme
            )
        }
        Spacer(Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            HorizontalCard(
                modifier = Modifier.weight(1f),
                composableElement = {
                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .background(Color(0xFFFF8BC1), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        IconView(
                            modifier = Modifier.size(20.dp),
                            icon = IconClass.PainterIcon(painterResource(R.drawable.local_fire_department)),
                            description = "Calories",
                            tint = Color.White
                        )
                    }
                },
                description = "Calories",
                subtitle = trends.calories,
                colorScheme = colorScheme
            )
            HorizontalCard(
                modifier = Modifier.weight(1f),
                composableElement = {
                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .background(Color(0xFFB48CFF), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        IconView(
                            modifier = Modifier.size(20.dp),
                            icon = IconClass.PainterIcon(painterResource(R.drawable.line_style)),
                            description = "Sets",
                            tint = Color.White
                        )
                    }
                },
                description = "Sets",
                subtitle = trends.sets,
                colorScheme = colorScheme
            )
        }
    }
    Spacer(Modifier.height(24.dp))
}

// Data model pour trends
data class TrendsData(
    val workouts: String = "4",
    val volume: String = "20 kg",
    val calories: String = "1500",
    val sets: String = "12"
)