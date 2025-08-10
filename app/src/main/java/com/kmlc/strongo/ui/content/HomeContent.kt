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
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import kotlin.math.cos
import kotlin.math.sin

sealed class HomeIcon {
    data class Vector(val imageVector: ImageVector) : HomeIcon()
    data class PainterIcon(val painter: Painter) : HomeIcon()
}

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
        HomeScreenExtension()
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
            modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState())
                .widthIn(min = 400.dp)
        ) {
            HomeScreenCard(
                icon = HomeIcon.PainterIcon(painterResource(R.drawable.auto_awesome)),
                title = "Custom",
                subtitle = "Create a freestyle session",
                onClick = onCustomSession,
                colorScheme = colorScheme,
                modifier = Modifier.weight(1f)
            )
            HomeScreenCard(
                icon = HomeIcon.PainterIcon(painterResource(R.drawable.bookmarks)),
                title = "Favorites",
                subtitle = "Pick from your saved workouts",
                onClick = onFavorites,
                colorScheme = colorScheme,
                modifier = Modifier.weight(1f)
            )
            HomeScreenCard(
                icon = HomeIcon.Vector(Icons.Default.PlayArrow),
                title = "Empty",
                subtitle = "Full control over your workout",
                onClick = onEmptySession,
                colorScheme = colorScheme,
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(Modifier.height(24.dp))

        Text(
            text = "Strength Score",
            color = colorScheme.onBackground,
            style = MaterialTheme.typography.titleMedium
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = colorScheme.tertiary)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(colorScheme.primary, shape = polygonShape(6))
                        .padding(6.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(R.drawable.fitness_center),
                        contentDescription = "Strength Score",
                        tint = colorScheme.tertiary,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(Modifier.width(16.dp))
                if (strengthScore == null) {
                    Text(
                        text = "You need to complete a few workouts before you can see your score.",
                        color = colorScheme.onTertiary,
                        style = MaterialTheme.typography.bodyMedium
                    )
                } else {
                    Column {
                        Text(
                            text = "Your Strength Score",
                            color = colorScheme.onTertiary,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            text = "$strengthScore",
                            color = colorScheme.primary,
                            style = MaterialTheme.typography.titleLarge
                        )
                    }
                }
            }
        }

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
                TrendsCard(
                    icon = HomeIcon.Vector(Icons.Default.Check), color = Color(0xFF6C8FF7),
                    label = "Workouts", value = trends.workouts, colorScheme = colorScheme
                )
                TrendsCard(
                    icon = HomeIcon.PainterIcon(painterResource(R.drawable.local_fire_department)), color = Color(0xFF33CFCF),
                    label = "Volume", value = trends.volume, colorScheme = colorScheme
                )
            }
            Spacer(Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                TrendsCard(
                    icon = HomeIcon.PainterIcon(painterResource(R.drawable.local_fire_department)), color = Color(0xFFFF8BC1),
                    label = "Calories", value = trends.calories, colorScheme = colorScheme
                )
                TrendsCard(
                    icon = HomeIcon.PainterIcon(painterResource(R.drawable.line_style)), color = Color(0xFFB48CFF),
                    label = "Sets", value = trends.sets, colorScheme = colorScheme
                )
            }
        }
        Spacer(Modifier.height(24.dp))
}

@Composable
fun HomeScreenCard(
    icon: HomeIcon,
    title: String,
    subtitle: String,
    onClick: () -> Unit = {},
    colorScheme: ColorScheme,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .height(160.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = colorScheme.tertiary),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .weight(1f)
        ) {
            when (icon) {
                is HomeIcon.Vector -> Icon(
                    imageVector = icon.imageVector,
                    contentDescription = title,
                    tint = colorScheme.onTertiary,
                    modifier = Modifier.size(36.dp)
                )
                is HomeIcon.PainterIcon -> Icon(
                    painter = icon.painter,
                    contentDescription = title,
                    tint = colorScheme.onTertiary,
                    modifier = Modifier.size(36.dp)
                )
            }
            Spacer(Modifier.height(28.dp))
            Text(title, color = colorScheme.onTertiary, style = MaterialTheme.typography.titleSmall)
            Text(subtitle, color = colorScheme.onSurface, style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Composable
fun TrendsCard(
    icon: HomeIcon,
    color: Color,
    label: String,
    value: String,
    onClick: () -> Unit = {},
    colorScheme: ColorScheme
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = colorScheme.tertiary),
        modifier = Modifier.clickable { onClick() }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp).weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(color, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                when (icon) {
                    is HomeIcon.Vector -> Icon(
                        imageVector = icon.imageVector,
                        contentDescription = label,
                        tint = Color.White,
                        modifier = Modifier.size(20.dp)
                    )
                    is HomeIcon.PainterIcon -> Icon(
                        painter = icon.painter,
                        contentDescription = label,
                        tint = Color.White,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
            Spacer(Modifier.width(12.dp))
            Column {
                Text(
                    text = value,
                    color = colorScheme.onTertiary,
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = label,
                    color = colorScheme.onSurface,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

// Pour la forme hexagone (PolygonShape) :
fun polygonShape(sides: Int) = GenericShape { size, _ ->
    val radius = size.minDimension / 2
    val centerX = size.width / 2
    val centerY = size.height / 2
    for (i in 0 until sides) {
        val angle = Math.toRadians(360.0 * i / sides - 90)
        val x = centerX + radius * cos(angle).toFloat()
        val y = centerY + radius * sin(angle).toFloat()
        if (i == 0) moveTo(x, y) else lineTo(x, y)
    }
    close()
}

// Data model pour trends
data class TrendsData(
    val workouts: String = "4",
    val volume: String = "20 kg",
    val calories: String = "1500",
    val sets: String = "12"
)