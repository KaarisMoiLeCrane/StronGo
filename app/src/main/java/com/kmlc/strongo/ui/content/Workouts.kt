package com.kmlc.strongo.ui.content

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.muscle.female.*
import com.kmlc.strongo.ui.component.icons.muscle.male.*
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.content.WorkoutsSection.MuscleMenuItem
import com.kmlc.strongo.ui.content.WorkoutsSection.WorkoutMuscleSection

@Composable
fun WorkoutsContent(
    navController: NavController
) {
    WorkoutMuscleSection(
        navController = navController,
        muscles = getMuscleMenuList()
    )
}

@Composable
fun getMuscleMenuList(male: Boolean = true): List<MuscleMenuItem> {
    if (male)
        return listOf(
            MuscleMenuItem(
                label = stringResource(R.string.chest),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_1)),
                layer = StronGoIcons.Muscle.Male.Chest1,
                count = 0,
                total = 44
            ),
            MuscleMenuItem(
                label = stringResource(R.string.back),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_6)),
                layer = StronGoIcons.Muscle.Male.Back6,
                count = 0,
                total = 54
            ),
            MuscleMenuItem(
                label = stringResource(R.string.shoulders),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_1)),
                layer = StronGoIcons.Muscle.Male.Shoulders1,
                count = 0,
                total = 52
            ),
            MuscleMenuItem(
                label = stringResource(R.string.biceps),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_2)),
                layer = StronGoIcons.Muscle.Male.Biceps2,
                count = 0,
                total = 35
            ),
            MuscleMenuItem(
                label = stringResource(R.string.triceps),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_5)),
                layer = StronGoIcons.Muscle.Male.Triceps5,
                count = 0,
                total = 30
            ),
            MuscleMenuItem(
                label = stringResource(R.string.quads),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_3)),
                layer = StronGoIcons.Muscle.Male.Quads3,
                count = 0,
                total = 78
            ),
            MuscleMenuItem(
                label = stringResource(R.string.hamstrings),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_7)),
                layer = StronGoIcons.Muscle.Male.Hamstrings7,
                count = 0,
                total = 19
            ),
            MuscleMenuItem(
                label = stringResource(R.string.glutes),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_7)),
                layer = StronGoIcons.Muscle.Male.Glutes7,
                count = 0,
                total = 20
            ),
            MuscleMenuItem(
                label = stringResource(R.string.abs),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_2)),
                layer = StronGoIcons.Muscle.Male.Abs2,
                count = 0,
                total = 50
            ),
            MuscleMenuItem(
                label = stringResource(R.string.lower_back),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_6)),
                layer = StronGoIcons.Muscle.Male.LowerBack6,
                count = 0,
                total = 4
            ),
            MuscleMenuItem(
                label = stringResource(R.string.calves),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_8)),
                layer = StronGoIcons.Muscle.Male.Calves8,
                count = 0,
                total = 11
            ),
            MuscleMenuItem(
                label = stringResource(R.string.abductors),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_3)),
                layer = StronGoIcons.Muscle.Male.Abductors3,
                count = 0,
                total = 5
            ),
            MuscleMenuItem(
                label = stringResource(R.string.adductors),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_3)),
                layer = StronGoIcons.Muscle.Male.Adductors3,
                count = 0,
                total = 52
            ),
            MuscleMenuItem(
                label = stringResource(R.string.forearms),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_2)),
                layer = StronGoIcons.Muscle.Male.Forearms2,
                count = 0,
                total = 4
            ),
            MuscleMenuItem(
                label = stringResource(R.string.trapezius),
                icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_male_anatomy_5)),
                layer = StronGoIcons.Muscle.Male.Trapezius5,
                count = 0,
                total = 13
            )
        )
    return listOf(
        MuscleMenuItem(
            label = stringResource(R.string.chest),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_1)),
            layer = StronGoIcons.Muscle.Female.Chest1,
            count = 0,
            total = 44
        ),
        MuscleMenuItem(
            label = stringResource(R.string.back),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_6)),
            layer = StronGoIcons.Muscle.Female.Back6,
            count = 0,
            total = 54
        ),
        MuscleMenuItem(
            label = stringResource(R.string.shoulders),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_1)),
            layer = StronGoIcons.Muscle.Female.Shoulders1,
            count = 0,
            total = 52
        ),
        MuscleMenuItem(
            label = stringResource(R.string.biceps),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_2)),
            layer = StronGoIcons.Muscle.Female.Biceps2,
            count = 0,
            total = 35
        ),
        MuscleMenuItem(
            label = stringResource(R.string.triceps),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_5)),
            layer = StronGoIcons.Muscle.Female.Triceps5,
            count = 0,
            total = 30
        ),
        MuscleMenuItem(
            label = stringResource(R.string.quads),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_3)),
            layer = StronGoIcons.Muscle.Female.Quads3,
            count = 0,
            total = 78
        ),
        MuscleMenuItem(
            label = stringResource(R.string.hamstrings),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_7)),
            layer = StronGoIcons.Muscle.Female.Hamstrings7,
            count = 0,
            total = 19
        ),
        MuscleMenuItem(
            label = stringResource(R.string.glutes),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_7)),
            layer = StronGoIcons.Muscle.Female.Glutes7,
            count = 0,
            total = 20
        ),
        MuscleMenuItem(
            label = stringResource(R.string.abs),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_2)),
            layer = StronGoIcons.Muscle.Female.Abs2,
            count = 0,
            total = 50
        ),
        MuscleMenuItem(
            label = stringResource(R.string.lower_back),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_6)),
            layer = StronGoIcons.Muscle.Female.LowerBack6,
            count = 0,
            total = 4
        ),
        MuscleMenuItem(
            label = stringResource(R.string.calves),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_8)),
            layer = StronGoIcons.Muscle.Female.Calves8,
            count = 0,
            total = 11
        ),
        MuscleMenuItem(
            label = stringResource(R.string.abductors),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_3)),
            layer = StronGoIcons.Muscle.Female.Abductors3,
            count = 0,
            total = 5
        ),
        MuscleMenuItem(
            label = stringResource(R.string.adductors),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_3)),
            layer = StronGoIcons.Muscle.Female.Adductors3,
            count = 0,
            total = 52
        ),
        MuscleMenuItem(
            label = stringResource(R.string.forearms),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_2)),
            layer = StronGoIcons.Muscle.Female.Forearms2,
            count = 0,
            total = 4
        ),
        MuscleMenuItem(
            label = stringResource(R.string.trapezius),
            icon = IconClass.PainterIcon(painterResource(id = R.drawable.muscle_female_anatomy_5)),
            layer = StronGoIcons.Muscle.Female.Trapezius5,
            count = 0,
            total = 13
        )
    )
}