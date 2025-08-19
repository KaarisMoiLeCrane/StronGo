package com.kmlc.strongo.di

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.kmlc.strongo.data.domain.TreatExercisesUseCase
import com.kmlc.strongo.data.local.Exercise.ExerciseRepository
import com.kmlc.strongo.data.local.StrongoDatabase
import com.kmlc.strongo.data.viewmodel.ExerciseViewModel

@Composable
fun provideExerciseViewModel(): ExerciseViewModel {
    val context = LocalContext.current
    val db = remember { StrongoDatabase.getInstance(context) }
    val exerciseDao = remember { db.exerciseDao() }
    val exerciseRepo = remember { ExerciseRepository(exerciseDao) }
    val treatExercisesUseCase = remember { TreatExercisesUseCase() }

    return provideViewModel {
        ExerciseViewModel.Factory(
            repository = exerciseRepo,
            treatExercisesUseCase = treatExercisesUseCase
        )
    }
}