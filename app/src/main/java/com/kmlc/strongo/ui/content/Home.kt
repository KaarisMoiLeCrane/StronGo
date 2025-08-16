package com.kmlc.strongo.ui.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kmlc.strongo.R
import com.kmlc.strongo.data.local.StrongoDatabase
import com.kmlc.strongo.data.local.entity.ExerciceEntity
import com.kmlc.strongo.data.local.repository.ExerciceRepository
import com.kmlc.strongo.ui.content.HomeSection.CentralCardSection
import com.kmlc.strongo.ui.content.HomeSection.FeelingDifferentSection
import com.kmlc.strongo.ui.content.HomeSection.QuickActionsSection
import com.kmlc.strongo.ui.content.HomeSection.StrengthScoreSection
import com.kmlc.strongo.ui.content.HomeSection.TrendsSection
import kotlinx.coroutines.launch

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
    val exerciceDao = remember(key1 = context) { StrongoDatabase.getInstance(context).exerciceDao() }
    val repository = remember { ExerciceRepository(exerciceDao) }
    val exercices = remember { mutableStateListOf<ExerciceEntity>() }
    val scope = rememberCoroutineScope()

    // Charger les exercices au démarrage
    LaunchedEffect(Unit) {
        exercices.clear()
        exercices.addAll(repository.getAll())
    }

    Column {
        Button(onClick = {
            scope.launch {
                repository.insert(ExerciceEntity(nom = "Pompes", repetitions = 10))
                exercices.clear()
                exercices.addAll(repository.getAll())
            }
        }) {
            Text("Ajouter un exercice")
        }
        LazyColumn(modifier = Modifier.height(500.dp)) {
            items(exercices) { exercice ->
                Text(exercice.nom)
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
