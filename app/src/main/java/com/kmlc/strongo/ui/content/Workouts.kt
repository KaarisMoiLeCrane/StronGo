package com.kmlc.strongo.ui.content

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.kmlc.strongo.data.sample.muscle.MuscleGroupData
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.content.WorkoutsSection.MuscleMenuItem
import com.kmlc.strongo.ui.content.WorkoutsSection.WorkoutMuscleSection

@Composable
fun WorkoutsContent(
    navController: NavController,
    female: Boolean = true
) {
    WorkoutMuscleSection(
        navController = navController,
        muscles = getMuscleMenuList(female)
    )
}

@Composable
fun getMuscleMenuList(female: Boolean = true): List<MuscleMenuItem> {
    return MuscleGroupData.muscleGroups.map { muscle ->
        MuscleMenuItem(
            label = stringResource(id = muscle.id),
            icon = IconClass.PainterIcon(
                painter = painterResource(id = if (female) muscle.iconPainterFemaleId else muscle.iconPainterMaleId)
            ),
            layer = if (female) muscle.layerVectorFemale else muscle.layerVectorMale,
            count = 0,
            total = muscle.totalExercises
        )
    }
}