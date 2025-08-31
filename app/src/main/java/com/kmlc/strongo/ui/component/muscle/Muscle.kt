package com.kmlc.strongo.ui.component.muscle

import androidx.compose.ui.graphics.vector.ImageVector

data class Muscle(
    val id: Int,
    val iconPainterMaleId: Int,
    val iconPainterFemaleId: Int,
    val layerVectorMale: ImageVector?,
    val layerVectorFemale: ImageVector?,
    val muscleGroup: Int,
    val totalExercises: Int = 0
)