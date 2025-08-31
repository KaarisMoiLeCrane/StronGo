package com.kmlc.strongo.ui.component.muscle

data class Exercise(
    val nameStr: String? = null,
    val nameRes: Int? = null,

    val iconRes: Int? = null,
    val iconUrl: String? = null,

    val instructionRes: Int? = null,
    val tipsRes: Int? = null,
    val dangerRes: Int? = null,
    val spottingRes: Int? = null,
    val tempoRes: Int? = null,
    val instructionStr: String? = null,
    val tipsStr: String? = null,
    val dangerStr: String? = null,
    val spottingStr: String? = null,
    val tempoStr: String? = null,
    val tempoPattern: List<Int> = emptyList(),

    val equipmentRes: List<List<Int>> = emptyList(),
    val equipmentStr: List<List<String>> = emptyList(),

    val videoDemoUrl: String? = null,
    val videoExplanationUrl: String? = null,

    val trainedMuscleGroupRes: List<Int> = emptyList(),
    val primaryMusclesRes: List<Int> = emptyList(),
    val secondaryMusclesRes: List<Int> = emptyList(),
    val tertiaryMusclesRes: List<Int> = emptyList(),
    val trainedMuscleGroupStr: List<String> = emptyList(),
    val primaryMusclesStr: List<String> = emptyList(),
    val secondaryMusclesStr: List<String> = emptyList(),
    val tertiaryMusclesStr: List<String> = emptyList(),

    val difficultyRes: Int? = null,
    val difficultyStr: String? = null,

    val postureRes: Int? = null,
    val gripRes: Int? = null,
    val postureStr: String? = null,
    val gripStr: String? = null,

    val singleOrDoubleArm: Boolean,
    val singleOrDoubleLeg: Boolean,
    val alternatingArm: Boolean = false,
    val alternatingLeg: Boolean = false,

    val forceTypeRes: Int? = null,
    val forceTypeStr: String? = null,
    val mechanicsRes: Int? = null,
    val mechanicsStr: String? = null,
    val lateralityRes: Int? = null,
    val lateralityStr: String? = null,

    val bodyRegionRes: Int? = null,
    val movementPatternsRes: List<Int> = emptyList(),
    val planeOfMotionRes: List<Int> = emptyList(),
    val bodyRegionStr: String? = null,
    val movementPatternsStr: List<String> = emptyList(),
    val planeOfMotionStr: List<String> = emptyList(),

    val endingPositionRes: Int? = null,
    val endingPositionStr: Int? = null,

    val footElevationRes: Int? = null,
    val classificationRes: Int? = null,
    val combinationExercisesRes: Int? = null,
    val footElevationStr: String? = null,
    val classificationStr: String? = null,
    val combinationExercisesStr: String? = null,

    val exerciseVariationRes: List<String> = emptyList(),
    val exerciseVariationStr: List<String> = emptyList()
)