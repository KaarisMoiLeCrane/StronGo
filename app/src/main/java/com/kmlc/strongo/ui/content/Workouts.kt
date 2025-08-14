package com.kmlc.strongo.ui.content

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.res.painterResource
import com.kmlc.strongo.ui.content.WorkoutsSection.MuscleMenuItem
import com.kmlc.strongo.ui.content.WorkoutsSection.WorkoutMuscleSection
import com.kmlc.strongo.R
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.muscle.male.*
import com.kmlc.strongo.ui.component.icons.muscle.female.*

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
                label = "Chest",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_1),
                layer = StronGoIcons.Muscle.Male.Chest1,
                count = 0,
                total = 44
            ),
            MuscleMenuItem(
                label = "Back",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_6),
                layer = StronGoIcons.Muscle.Male.Back6,
                count = 0,
                total = 54
            ),
            MuscleMenuItem(
                label = "Shoulders",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_1),
                layer = StronGoIcons.Muscle.Male.Shoulders1,
                count = 0,
                total = 52
            ),
            MuscleMenuItem(
                label = "Biceps",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_2),
                layer = StronGoIcons.Muscle.Male.Biceps2,
                count = 0,
                total = 35
            ),
            MuscleMenuItem(
                label = "Triceps",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_5),
                layer = StronGoIcons.Muscle.Male.Triceps5,
                count = 0,
                total = 30
            ),
            MuscleMenuItem(
                label = "Quads",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_3),
                layer = StronGoIcons.Muscle.Male.Quads3,
                count = 0,
                total = 78
            ),
            MuscleMenuItem(
                label = "Hamstrings",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_7),
                layer = StronGoIcons.Muscle.Male.Hamstrings7,
                count = 0,
                total = 19
            ),
            MuscleMenuItem(
                label = "Glutes",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_7),
                layer = StronGoIcons.Muscle.Male.Glutes7,
                count = 0,
                total = 20
            ),
            MuscleMenuItem(
                label = "Abs",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_2),
                layer = StronGoIcons.Muscle.Male.Abs2,
                count = 0,
                total = 50
            ),
            MuscleMenuItem(
                label = "Lower Back",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_6),
                layer = StronGoIcons.Muscle.Male.LowerBack6,
                count = 0,
                total = 4
            ),
            MuscleMenuItem(
                label = "Calves",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_8),
                layer = StronGoIcons.Muscle.Male.Calves8,
                count = 0,
                total = 11
            ),
            MuscleMenuItem(
                label = "Abductors",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_3),
                layer = StronGoIcons.Muscle.Male.Abductors3,
                count = 0,
                total = 5
            ),
            MuscleMenuItem(
                label = "Adductors",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_3),
                layer = StronGoIcons.Muscle.Male.Adductors3,
                count = 0,
                total = 52
            ),
            MuscleMenuItem(
                label = "Forearms",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_2),
                layer = StronGoIcons.Muscle.Male.Forearms2,
                count = 0,
                total = 4
            ),
            MuscleMenuItem(
                label = "Trapezius",
                icon = painterResource(id = R.drawable.muscle_male_anatomy_5),
                layer = StronGoIcons.Muscle.Male.Trapezius5,
                count = 0,
                total = 13
            )
        )
    return listOf(
        MuscleMenuItem(
            label = "Chest",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_1),
            layer = StronGoIcons.Muscle.Female.Chest1,
            count = 0,
            total = 44
        ),
        MuscleMenuItem(
            label = "Back",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_6),
            layer = StronGoIcons.Muscle.Female.Back6,
            count = 0,
            total = 54
        ),
        MuscleMenuItem(
            label = "Shoulders",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_1),
            layer = StronGoIcons.Muscle.Female.Shoulders1,
            count = 0,
            total = 52
        ),
        MuscleMenuItem(
            label = "Biceps",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_2),
            layer = StronGoIcons.Muscle.Female.Biceps2,
            count = 0,
            total = 35
        ),
        MuscleMenuItem(
            label = "Triceps",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_5),
            layer = StronGoIcons.Muscle.Female.Triceps5,
            count = 0,
            total = 30
        ),
        MuscleMenuItem(
            label = "Quads",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_3),
            layer = StronGoIcons.Muscle.Female.Quads3,
            count = 0,
            total = 78
        ),
        MuscleMenuItem(
            label = "Hamstrings",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_7),
            layer = StronGoIcons.Muscle.Female.Hamstrings7,
            count = 0,
            total = 19
        ),
        MuscleMenuItem(
            label = "Glutes",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_7),
            layer = StronGoIcons.Muscle.Female.Glutes7,
            count = 0,
            total = 20
        ),
        MuscleMenuItem(
            label = "Abs",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_2),
            layer = StronGoIcons.Muscle.Female.Abs2,
            count = 0,
            total = 50
        ),
        MuscleMenuItem(
            label = "Lower Back",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_6),
            layer = StronGoIcons.Muscle.Female.LowerBack6,
            count = 0,
            total = 4
        ),
        MuscleMenuItem(
            label = "Calves",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_8),
            layer = StronGoIcons.Muscle.Female.Calves8,
            count = 0,
            total = 11
        ),
        MuscleMenuItem(
            label = "Abductors",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_3),
            layer = StronGoIcons.Muscle.Female.Abductors3,
            count = 0,
            total = 5
        ),
        MuscleMenuItem(
            label = "Adductors",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_3),
            layer = StronGoIcons.Muscle.Female.Adductors3,
            count = 0,
            total = 52
        ),
        MuscleMenuItem(
            label = "Forearms",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_2),
            layer = StronGoIcons.Muscle.Female.Forearms2,
            count = 0,
            total = 4
        ),
        MuscleMenuItem(
            label = "Trapezius",
            icon = painterResource(id = R.drawable.muscle_female_anatomy_5),
            layer = StronGoIcons.Muscle.Female.Trapezius5,
            count = 0,
            total = 13
        )
    )
}