package com.kmlc.strongo.data.domain

import com.kmlc.strongo.data.local.ExerciseSet.ExerciseSetEntity

class TreatExerciseSetsUseCase {
    fun execute(rawList: List<ExerciseSetEntity>): List<ExerciseSetEntity> {
        // Exemple : enlever les séries vides ou trier par setNumber
        return rawList.filter { it.reps > 0 }
            .sortedBy { it.setNumber }
    }
}
