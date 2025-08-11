package com.kmlc.strongo.ui.content

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.R
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.kmlc.strongo.ui.content.HomeSection.CentralCardSection
import com.kmlc.strongo.ui.content.HomeSection.FeelingDifferentSection
import com.kmlc.strongo.ui.content.HomeSection.QuickActionsSection
import com.kmlc.strongo.ui.content.HomeSection.StrengthScoreSection
import com.kmlc.strongo.ui.content.HomeSection.TrendsSection


@Composable
fun HomeContent(
    navController: NavController,
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
    recoveryPercent: Int = 100,
    onUpcomingWorkouts: () -> Unit = {},
    onWorkoutRecovery: () -> Unit = {},
    onCustomSession: () -> Unit = {},
    onFavorites: () -> Unit = {},
    onEmptySession: () -> Unit = {},
    strengthScore: Int? = null,
    onTrendsPeriodChange: (String) -> Unit = {},
    trendsPeriod: String = "Past 7 days",
    trends: TrendsData = TrendsData(),
) {
    CentralCardSection(
        nextWorkoutLabel = nextWorkoutLabel,
        workoutTitle = workoutTitle,
        workoutDetails = workoutDetails,
        workoutImages = workoutImages,
        onSkip = onSkip,
        onRegenerate = onRegenerate,
        onDuration = onDuration,
        onShare = onShare
    )

    QuickActionsSection(
        recoveryPercent = recoveryPercent,
        onUpcomingWorkouts = onUpcomingWorkouts,
        onWorkoutRecovery = onWorkoutRecovery
    )

    FeelingDifferentSection(
        onCustomSession = onCustomSession,
        onFavorites = onFavorites,
        onEmptySession = onEmptySession
    )

    Spacer(Modifier.height(24.dp))

    StrengthScoreSection(
        strengthScore = strengthScore,
        onClick = { navController.navigate("StrengthScoreDetails") }
    )

    TrendsSection(
        trends = trends,
        onTrendsPeriodChange = onTrendsPeriodChange,
        trendsPeriod = trendsPeriod
    )

    Spacer(Modifier.height(24.dp))
}

// Data model pour trends
data class TrendsData(
    val workouts: String = "4",
    val volume: String = "20 kg",
    val calories: String = "1500",
    val sets: String = "12"
)