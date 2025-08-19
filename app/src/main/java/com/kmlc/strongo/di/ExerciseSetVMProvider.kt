package com.kmlc.strongo.di

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.kmlc.strongo.data.domain.TreatExerciseSetsUseCase
import com.kmlc.strongo.data.local.ExerciseSet.ExerciseSetRepository
import com.kmlc.strongo.data.local.StrongoDatabase
import com.kmlc.strongo.data.viewmodel.ExerciseSetViewModel

@Composable
fun provideExerciseSetViewModel(): ExerciseSetViewModel {
    val context = LocalContext.current
    val db = remember { StrongoDatabase.getInstance(context) }
    val setDao = remember { db.exerciseSetDao() }
    val setRepo = remember { ExerciseSetRepository(setDao) }
    val treatSetsUseCase = remember { TreatExerciseSetsUseCase() }

    return provideViewModel {
        ExerciseSetViewModel.Factory(
            repository = setRepo,
            useCase = treatSetsUseCase
        )
    }
}
