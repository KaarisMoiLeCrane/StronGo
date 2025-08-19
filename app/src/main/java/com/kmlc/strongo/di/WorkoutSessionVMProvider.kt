package com.kmlc.strongo.di

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.kmlc.strongo.data.domain.TreatWorkoutSessionsUseCase
import com.kmlc.strongo.data.local.StrongoDatabase
import com.kmlc.strongo.data.local.WorkoutSession.WorkoutSessionRepository
import com.kmlc.strongo.data.viewmodel.WorkoutSessionViewModel

@Composable
fun provideWorkoutSessionViewModel(): WorkoutSessionViewModel {
    val context = LocalContext.current
    val db = remember { StrongoDatabase.getInstance(context) }
    val sessionDao = remember { db.WorkoutSessionDao() }
    val sessionRepo = remember { WorkoutSessionRepository(sessionDao) }
    val treatSessionsUseCase = remember { TreatWorkoutSessionsUseCase() }

    return provideViewModel {
        WorkoutSessionViewModel.Factory(
            repository = sessionRepo,
            useCase = treatSessionsUseCase
        )
    }
}
