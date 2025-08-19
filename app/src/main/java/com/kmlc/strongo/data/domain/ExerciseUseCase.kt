package com.kmlc.strongo.data.domain

import com.kmlc.strongo.data.local.Exercise.ExerciseEntity

class TreatExercisesUseCase {
    fun execute(rawList: List<ExerciseEntity>): List<ExerciseEntity> {
        return rawList
        /*.filter { it.sets > 0 }
        .map { ExerciseEntity(name = it.name.uppercase(), sets = it.sets) }*/
    }
}