package com.kmlc.strongo.ui.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.kmlc.strongo.R
import com.kmlc.strongo.data.domain.TreatExercicesUseCase
import com.kmlc.strongo.data.local.Exercice.ExerciceEntity
import com.kmlc.strongo.data.local.Exercice.ExerciceRepository
import com.kmlc.strongo.data.local.StrongoDatabase
import com.kmlc.strongo.data.viewmodel.ExerciceViewModel
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
    trendsPeriod: String = stringResource(id = R.string.past_7_days),
    trends: TrendsData = TrendsData()
) {
    val context = LocalContext.current
    // Instantiate DAO and Repository just once
    val exerciceDao = remember { StrongoDatabase.getInstance(context).exerciceDao() }
    val repository = remember { ExerciceRepository(exerciceDao) }
    val treatExercicesUseCase = remember { TreatExercicesUseCase() }
    // Provide the repository to the ViewModel
    val viewModel: ExerciceViewModel = viewModel(factory = ExerciceViewModel.Factory(repository, treatExercicesUseCase))

    val exercices by viewModel.exercices.collectAsState()

    Column {
        Button(
            onClick = {
                viewModel.addExercice(ExerciceEntity(nom = "Pompes", repetitions = 10))
            }
        ) {
            Text("Ajouter un exercice")
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(modifier = Modifier.height(500.dp)) {
            items(exercices) { exercice ->
                Text(text = exercice.nom)
            }
        }
    }

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

    Spacer(Modifier.height(height = 24.dp))

    StrengthScoreSection(
        strengthScore = strengthScore,
        onClick = { navController.navigate(route = "StrengthScoreDetails") }
    )

    TrendsSection(
        trends = trends,
        onTrendsPeriodChange = onTrendsPeriodChange,
        trendsPeriod = trendsPeriod
    )

    Spacer(Modifier.height(height = 24.dp))
}

// Data model pour trends
data class TrendsData(
    val workouts: String = "4",
    val volume: String = "20 kg",
    val calories: String = "1500",
    val sets: String = "12"
)
