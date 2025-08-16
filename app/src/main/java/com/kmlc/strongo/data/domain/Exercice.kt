package com.kmlc.strongo.data.domain

import com.kmlc.strongo.data.local.Exercice.ExerciceEntity

class TreatExercicesUseCase {
    fun execute(rawList: List<ExerciceEntity>): List<ExerciceEntity> {
        // Example: filter, map, sort, etc.
        return rawList
            .filter { it.repetitions > 0 }
            .map { ExerciceEntity(nom = it.nom.uppercase(), repetitions = it.repetitions) }
    }
}