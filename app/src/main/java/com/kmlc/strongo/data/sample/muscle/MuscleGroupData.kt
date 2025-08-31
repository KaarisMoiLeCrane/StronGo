package com.kmlc.strongo.data.sample.muscle

import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.muscle.female.Abductors3
import com.kmlc.strongo.ui.component.icons.muscle.female.Adductors3
import com.kmlc.strongo.ui.component.icons.muscle.female.Back6
import com.kmlc.strongo.ui.component.icons.muscle.female.Biceps2
import com.kmlc.strongo.ui.component.icons.muscle.female.Calves8
import com.kmlc.strongo.ui.component.icons.muscle.female.Chest1
import com.kmlc.strongo.ui.component.icons.muscle.female.Forearms2
import com.kmlc.strongo.ui.component.icons.muscle.female.Glutes7
import com.kmlc.strongo.ui.component.icons.muscle.female.Hamstrings7
import com.kmlc.strongo.ui.component.icons.muscle.female.HipFlexorsIliopsoas2
import com.kmlc.strongo.ui.component.icons.muscle.female.LowerBack6
import com.kmlc.strongo.ui.component.icons.muscle.female.Quads3
import com.kmlc.strongo.ui.component.icons.muscle.female.RectusAbdominis2
import com.kmlc.strongo.ui.component.icons.muscle.female.Shins4
import com.kmlc.strongo.ui.component.icons.muscle.female.Shoulders1
import com.kmlc.strongo.ui.component.icons.muscle.female.Trapezius5
import com.kmlc.strongo.ui.component.icons.muscle.female.Triceps5
import com.kmlc.strongo.ui.component.icons.muscle.male.Abductors3
import com.kmlc.strongo.ui.component.icons.muscle.male.Adductors3
import com.kmlc.strongo.ui.component.icons.muscle.male.Back6
import com.kmlc.strongo.ui.component.icons.muscle.male.Biceps2
import com.kmlc.strongo.ui.component.icons.muscle.male.Calves8
import com.kmlc.strongo.ui.component.icons.muscle.male.Chest1
import com.kmlc.strongo.ui.component.icons.muscle.male.Forearms2
import com.kmlc.strongo.ui.component.icons.muscle.male.Glutes7
import com.kmlc.strongo.ui.component.icons.muscle.male.Hamstrings7
import com.kmlc.strongo.ui.component.icons.muscle.male.HipFlexorsIliopsoas2
import com.kmlc.strongo.ui.component.icons.muscle.male.LowerBack6
import com.kmlc.strongo.ui.component.icons.muscle.male.Quads3
import com.kmlc.strongo.ui.component.icons.muscle.male.RectusAbdominis2
import com.kmlc.strongo.ui.component.icons.muscle.male.Shins4
import com.kmlc.strongo.ui.component.icons.muscle.male.Shoulders1
import com.kmlc.strongo.ui.component.icons.muscle.male.Trapezius5
import com.kmlc.strongo.ui.component.icons.muscle.male.Triceps5
import com.kmlc.strongo.ui.component.muscle.MuscleGroup

object MuscleGroupData {
    val muscleGroups = listOf(
        MuscleGroup(
            id = R.string.chest,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_1,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_1,
            layerVectorMale = StronGoIcons.Muscle.Male.Chest1,
            layerVectorFemale = StronGoIcons.Muscle.Female.Chest1,
            bodyRegion = R.string.upper_body,
            totalExercises = 44
        ),
        MuscleGroup(
            id = R.string.back,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_6,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_6,
            layerVectorMale = StronGoIcons.Muscle.Male.Back6,
            layerVectorFemale = StronGoIcons.Muscle.Female.Back6,
            bodyRegion = R.string.upper_body,
            totalExercises = 54
        ),
        MuscleGroup(
            id = R.string.shoulders,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_1,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_1,
            layerVectorMale = StronGoIcons.Muscle.Male.Shoulders1,
            layerVectorFemale = StronGoIcons.Muscle.Female.Shoulders1,
            bodyRegion = R.string.upper_body,
            totalExercises = 52
        ),
        MuscleGroup(
            id = R.string.biceps,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_2,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_2,
            layerVectorMale = StronGoIcons.Muscle.Male.Biceps2,
            layerVectorFemale = StronGoIcons.Muscle.Female.Biceps2,
            bodyRegion = R.string.upper_body,
            totalExercises = 35
        ),
        MuscleGroup(
            id = R.string.triceps,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_5,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_5,
            layerVectorMale = StronGoIcons.Muscle.Male.Triceps5,
            layerVectorFemale = StronGoIcons.Muscle.Female.Triceps5,
            bodyRegion = R.string.upper_body,
            totalExercises = 30
        ),
        MuscleGroup(
            id = R.string.quads,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_3,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_3,
            layerVectorMale = StronGoIcons.Muscle.Male.Quads3,
            layerVectorFemale = StronGoIcons.Muscle.Female.Quads3,
            bodyRegion = R.string.lower_body,
            totalExercises = 78
        ),
        MuscleGroup(
            id = R.string.hamstrings,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_7,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_7,
            layerVectorMale = StronGoIcons.Muscle.Male.Hamstrings7,
            layerVectorFemale = StronGoIcons.Muscle.Female.Hamstrings7,
            bodyRegion = R.string.lower_body,
            totalExercises = 19
        ),
        MuscleGroup(
            id = R.string.glutes,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_7,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_7,
            layerVectorMale = StronGoIcons.Muscle.Male.Glutes7,
            layerVectorFemale = StronGoIcons.Muscle.Female.Glutes7,
            bodyRegion = R.string.lower_body,
            totalExercises = 20
        ),
        MuscleGroup(
            id = R.string.abs,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_2,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_2,
            layerVectorMale = StronGoIcons.Muscle.Male.RectusAbdominis2,
            layerVectorFemale = StronGoIcons.Muscle.Female.RectusAbdominis2,
            bodyRegion = R.string.core,
            totalExercises = 50
        ),
        MuscleGroup(
            id = R.string.lower_back,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_6,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_6,
            layerVectorMale = StronGoIcons.Muscle.Male.LowerBack6,
            layerVectorFemale = StronGoIcons.Muscle.Female.LowerBack6,
            bodyRegion = R.string.core,
            totalExercises = 4
        ),
        MuscleGroup(
            id = R.string.calves,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_8,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_8,
            layerVectorMale = StronGoIcons.Muscle.Male.Calves8,
            layerVectorFemale = StronGoIcons.Muscle.Female.Calves8,
            bodyRegion = R.string.lower_body,
            totalExercises = 11
        ),
        MuscleGroup(
            id = R.string.abductors,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_3,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_3,
            layerVectorMale = StronGoIcons.Muscle.Male.Abductors3,
            layerVectorFemale = StronGoIcons.Muscle.Female.Abductors3,
            bodyRegion = R.string.lower_body,
            totalExercises = 5
        ),
        MuscleGroup(
            id = R.string.adductors,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_3,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_3,
            layerVectorMale = StronGoIcons.Muscle.Male.Adductors3,
            layerVectorFemale = StronGoIcons.Muscle.Female.Adductors3,
            bodyRegion = R.string.lower_body,
            totalExercises = 52
        ),
        MuscleGroup(
            id = R.string.forearms,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_2,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_2,
            layerVectorMale = StronGoIcons.Muscle.Male.Forearms2,
            layerVectorFemale = StronGoIcons.Muscle.Female.Forearms2,
            bodyRegion = R.string.upper_body,
            totalExercises = 4
        ),
        MuscleGroup(
            id = R.string.trapezius,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_5,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_5,
            layerVectorMale = StronGoIcons.Muscle.Male.Trapezius5,
            layerVectorFemale = StronGoIcons.Muscle.Female.Trapezius5,
            bodyRegion = R.string.upper_body,
            totalExercises = 13
        ),
        MuscleGroup(
            id = R.string.hip_flexors,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_2,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_2,
            layerVectorMale = StronGoIcons.Muscle.Male.HipFlexorsIliopsoas2,
            layerVectorFemale = StronGoIcons.Muscle.Female.HipFlexorsIliopsoas2,
            bodyRegion = R.string.lower_body,
            totalExercises = 0
        ),
        MuscleGroup(
            id = R.string.shins,
            iconPainterMaleId = R.drawable.muscle_male_anatomy_4,
            iconPainterFemaleId = R.drawable.muscle_female_anatomy_4,
            layerVectorMale = StronGoIcons.Muscle.Male.Shins4,
            layerVectorFemale = StronGoIcons.Muscle.Female.Shins4,
            bodyRegion = R.string.lower_body,
            totalExercises = 0
        )
    )
}