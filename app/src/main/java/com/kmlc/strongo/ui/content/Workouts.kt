package com.kmlc.strongo.ui.content

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kmlc.strongo.data.local.ExerciseLoader.loadExercisesFromJson
import com.kmlc.strongo.data.sample.muscle.MuscleGroupData
import com.kmlc.strongo.ui.component.muscle.Exercise
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.content.WorkoutsSection.MuscleMenuItem
import com.kmlc.strongo.ui.content.WorkoutsSection.WorkoutMuscleSection

@Composable
fun WorkoutsContent(
    navController: NavController,
    female: Boolean = true,
    exercisesJson: String
) {
    val exercises by remember(exercisesJson) { mutableStateOf(loadExercisesFromJson(exercisesJson)) }
    var selectedMuscleGroup by remember { mutableStateOf<MuscleMenuItem?>(null) }

    Column(modifier = Modifier.fillMaxSize()) {
        WorkoutMuscleSection(
            navController = navController,
            muscles = getMuscleMenuList(female),
            onMuscleClick = { muscle ->
                selectedMuscleGroup = muscle
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        // La partie scrollable DOIT avoir un poids (weight) ou fillMaxHeight
        AnimatedVisibility(
            visible = selectedMuscleGroup != null,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            selectedMuscleGroup?.let { muscle ->
                val filteredExercises = exercises.filter { ex ->
                    ex.trainedMuscleGroupRes.contains(muscle.id)
                }
                // ==> Ajoute Modifier.weight(1f)
                ExercisesList(filteredExercises, modifier = Modifier.weight(1f))
            }
        }
    }
}

@Composable
fun ExercisesList(exercises: List<Exercise>, modifier: Modifier = Modifier) {
    if (exercises.isEmpty()) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .padding(32.dp)
        ) {
            Text(
                text = "Aucun exercice trouvé pour ce groupe musculaire.",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    } else {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
        ) {
            exercises.forEach { exercise ->
                ExerciseCard(exercise = exercise)
                Spacer(modifier = Modifier.height(12.dp))
            }
        }
    }
}

@Composable
fun getMuscleMenuList(female: Boolean = true): List<MuscleMenuItem> {
    return MuscleGroupData.muscleGroups.map { muscle ->
        MuscleMenuItem(
            id = muscle.id,
            label = stringResource(id = muscle.id),
            icon = IconClass.PainterIcon(
                painter = painterResource(id = if (female) muscle.iconPainterFemaleId else muscle.iconPainterMaleId)
            ),
            layer = if (female) muscle.layerVectorFemale else muscle.layerVectorMale,
            count = 0,
            total = muscle.totalExercises
        )
    }
}

@Composable
fun ExerciseCard(exercise: Exercise) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            if (exercise.nameRes == null) {
                Text(
                    text = "Exercice sans nom",
                    style = MaterialTheme.typography.titleMedium
                )
                return@Column
            }
            Text(
                text = stringResource(exercise.nameRes),
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}
