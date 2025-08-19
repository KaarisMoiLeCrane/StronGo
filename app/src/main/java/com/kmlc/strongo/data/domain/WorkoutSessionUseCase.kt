package com.kmlc.strongo.data.domain

import com.kmlc.strongo.data.local.WorkoutSession.WorkoutSessionEntity

class TreatWorkoutSessionsUseCase {
    fun execute(rawList: List<WorkoutSessionEntity>): List<WorkoutSessionEntity> {
        return rawList.sortedByDescending { it.date }.take(30)
    }
}
