package com.kmlc.strongo.ui

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kmlc.strongo.R
import com.kmlc.strongo.data.domain.TreatUserProfile
import com.kmlc.strongo.data.viewmodel.UserProfileViewModel
import com.kmlc.strongo.di.provideUserProfileViewModel
import com.kmlc.strongo.navigation.Screen
import com.kmlc.strongo.ui.component.button.ActionButton
import com.kmlc.strongo.ui.component.card.HorizontalCard
import com.kmlc.strongo.ui.component.icons.StronGoIcons
import com.kmlc.strongo.ui.component.icons.filled.AutoAwesome
import com.kmlc.strongo.ui.component.icons.filled.BarChart
import com.kmlc.strongo.ui.component.icons.filled.BatteryFull
import com.kmlc.strongo.ui.component.icons.filled.FitnessCenter
import com.kmlc.strongo.ui.component.icons.outlined.Power
import com.kmlc.strongo.ui.component.view.IconClass
import com.kmlc.strongo.ui.component.view.IconView

enum class FitnessLevel(val labelRes: Int, val color: Color) {
    BEGINNER(R.string.beginner, Color(0xFF2BFF88)),
    INTERMEDIATE(R.string.intermediate, Color(0xFF00ADEF)),
    ADVANCED(R.string.advanced, Color(0xFFFF7F00))
}

@Composable
fun FitnessLevel.label(): String = stringResource(id = labelRes)

enum class Goal(val labelRes: Int, val color: Color) {
    STRENGTH(R.string.gain_strength, Color(0xFFFF2B2B)),
    MUSCLE(R.string.gain_muscle, Color(0xFFB48CFF)),
    FITNESS(R.string.be_in_shape, Color(0xFF00ADEF)),
    WEIGHT_LOSS(R.string.lose_weight, Color(0xFFFFD700))
}

@Composable
fun Goal.label(): String = stringResource(id = labelRes)

@Composable
fun OnBoardingContent(
    onFinish: () -> Unit,
    navController: NavController
) {
    val userProfileViewModel: UserProfileViewModel = provideUserProfileViewModel()
    val profile = userProfileViewModel.profile.collectAsState().value
    val treatUserProfile = remember { TreatUserProfile() }

    LaunchedEffect(key1 = profile) {
        if (treatUserProfile.isProfileComplete(profile)) {
            navController.navigate(Screen.Home.name) {
                popUpTo(Screen.Home.name) { inclusive = true }
            }
        }
    }

    var name by remember { mutableStateOf(profile?.name ?: "") }
    var age by remember { mutableStateOf(profile?.age?.toString() ?: "") }
    var gender by remember { mutableIntStateOf(profile?.gender ?: 0) }
    var weight by remember { mutableStateOf(profile?.weight?.toString() ?: "") }
    var size by remember { mutableStateOf(profile?.size?.toString() ?: "") }
    var selectedLevel by remember {
        mutableStateOf(
            FitnessLevel.entries.find { it.labelRes == profile?.level }
        )
    }
    var selectedGoal by remember {
        mutableStateOf(
            Goal.entries.find { it.labelRes == profile?.goal }
        )
    }
    var index by remember { mutableIntStateOf(0) }

    val genderList = listOf(
        R.string.male,
        R.string.female,
        R.string.other
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        when (index) {
            0 -> {
                // Nom
                Text(stringResource(id = R.string.whats_your_name), fontWeight = FontWeight.Bold, fontSize = 22.sp)
                Spacer(Modifier.height(20.dp))
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it.take(32) },
                    label = { Text(stringResource(id = R.string.name)) },
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = MaterialTheme.colorScheme.primary,
                        unfocusedIndicatorColor = MaterialTheme.colorScheme.outline
                    )
                )
                Spacer(Modifier.height(24.dp))
                ActionButton(
                    icon = StronGoIcons.Outlined.Power,
                    label = stringResource(id = R.string.next),
                    buttonColor = MaterialTheme.colorScheme.primary,
                    iconColor = MaterialTheme.colorScheme.onPrimary,
                    onClick = { if (name.isNotBlank()) index++ }
                )
            }

            1 -> {
                // Âge
                Text(stringResource(R.string.how_old_are_you), fontWeight = FontWeight.Bold, fontSize = 22.sp)
                Spacer(Modifier.height(20.dp))
                OutlinedTextField(
                    value = age,
                    onValueChange = { if (it.all { c -> c.isDigit() } && (it.length <= 3)) age = it },
                    label = { Text(stringResource(id = R.string.age)) },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(Modifier.height(24.dp))
                ActionButton(
                    icon = StronGoIcons.Outlined.Power,
                    label = stringResource(id = R.string.next),
                    buttonColor = MaterialTheme.colorScheme.primary,
                    iconColor = MaterialTheme.colorScheme.onPrimary,
                    onClick = { if (age.isNotBlank() && age.toIntOrNull() != null && age.toInt() in 15..120) index++ }
                )
            }

            2 -> {
                // Genre
                Text(stringResource(R.string.whats_your_gender), fontWeight = FontWeight.Bold, fontSize = 22.sp)
                Spacer(Modifier.height(20.dp))
                Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                    genderList.forEach { g ->
                        val selected = gender == g
                        Box(
                            modifier = Modifier
                                .padding(horizontal = 8.dp)
                                .clip(RoundedCornerShape(16.dp))
                                .clickable { gender = g }
                                .background(
                                    if (selected) MaterialTheme.colorScheme.primary.copy(alpha = 0.18f) else Color.Transparent,
                                    RoundedCornerShape(16.dp)
                                )
                                .border(
                                    1.dp,
                                    if (selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outline,
                                    RoundedCornerShape(16.dp)
                                )
                                .padding(horizontal = 16.dp, vertical = 10.dp)
                        ) {
                            Text(
                                text = stringResource(g),
                                color = if (selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                }
                Spacer(Modifier.height(24.dp))
                ActionButton(
                    icon = StronGoIcons.Outlined.Power,
                    label = stringResource(id = R.string.next),
                    buttonColor = MaterialTheme.colorScheme.primary,
                    iconColor = MaterialTheme.colorScheme.onPrimary,
                    onClick = { if (genderList.contains(gender)) index++ }
                )
            }

            3 -> {
                // Poids
                Text(stringResource(R.string.whats_your_weight, "kg"), fontWeight = FontWeight.Bold, fontSize = 22.sp)
                Spacer(Modifier.height(20.dp))
                OutlinedTextField(
                    value = weight,
                    onValueChange = {
                        if (it.replace(",", ".").all { c -> c.isDigit() || c == '.' } && it.length <= 5)
                            weight = it.replace(",", ".")
                    },
                    label = {
                        Text(
                            stringResource(
                                id = R.string._unit,
                                stringResource(id = R.string.weight),
                                "kg"
                            )
                        )
                    },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(Modifier.height(24.dp))
                ActionButton(
                    icon = StronGoIcons.Outlined.Power,
                    label = stringResource(id = R.string.next),
                    buttonColor = MaterialTheme.colorScheme.primary,
                    iconColor = MaterialTheme.colorScheme.onPrimary,
                    onClick = {
                        val kg = weight.toFloatOrNull()
                        if (kg != null && kg in 25f..400f) index++
                    }
                )
            }

            4 -> {
                Text(
                    stringResource(R.string.whats_your_size_unit, "cm"),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Spacer(Modifier.height(20.dp))
                OutlinedTextField(
                    value = size,
                    onValueChange = {
                        if (it.replace(",", ".").all { c -> c.isDigit() || c == '.' } && it.length <= 5)
                            size = it.replace(",", ".")
                    },
                    label = {
                        Text(
                            stringResource(
                                id = R.string._unit,
                                stringResource(id = R.string.size),
                                "cm"
                            )
                        )
                    },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(Modifier.height(24.dp))
                ActionButton(
                    icon = StronGoIcons.Outlined.Power,
                    label = stringResource(id = R.string.next),
                    buttonColor = MaterialTheme.colorScheme.primary,
                    iconColor = MaterialTheme.colorScheme.onPrimary,
                    onClick = {
                        val cm = size.toFloatOrNull()
                        if (cm != null && cm in 100f..250f) index++
                    }
                )
            }

            5 -> {
                // Niveau
                Text(stringResource(id = R.string.choose_your_level), fontWeight = FontWeight.Bold, fontSize = 22.sp)
                Spacer(Modifier.height(16.dp))
                FitnessLevel.entries.forEach { level ->
                    val isSelected = selectedLevel == level
                    val scale by animateFloatAsState(
                        targetValue = if (isSelected) 1.05f else 1f,
                        label = "CardScale"
                    )
                    val shadow by animateDpAsState(
                        targetValue = if (isSelected) 18.dp else 2.dp,
                        label = "CardShadow"
                    )
                    val border = if (isSelected) level.color else Color.Transparent
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .graphicsLayer(
                                scaleX = scale,
                                scaleY = scale
                            )
                            .padding(vertical = 6.dp)
                    ) {
                        HorizontalCard(
                            modifier = Modifier
                                .fillMaxWidth()
                                .shadow(shadow, RoundedCornerShape(18.dp))
                                .border(2.dp, border, RoundedCornerShape(18.dp)),
                            title = level.label(),
                            subtitle = when (level) {
                                FitnessLevel.BEGINNER -> stringResource(id = R.string.i_begin_or_resume)
                                FitnessLevel.INTERMEDIATE -> stringResource(id = R.string.i_train_regularly)
                                FitnessLevel.ADVANCED -> stringResource(id = R.string.expert_athlete_or_coach)
                            },
                            onClick = { selectedLevel = level }
                        ) {
                            IconView(
                                modifier = Modifier.size(36.dp),
                                icon = when (level) {
                                    FitnessLevel.BEGINNER -> IconClass.Vector(StronGoIcons.Filled.AutoAwesome)
                                    FitnessLevel.INTERMEDIATE -> IconClass.Vector(StronGoIcons.Filled.BarChart)
                                    FitnessLevel.ADVANCED -> IconClass.Vector(StronGoIcons.Filled.FitnessCenter)
                                },
                                tint = level.color
                            )
                        }
                    }
                }
                Spacer(Modifier.height(24.dp))
                ActionButton(
                    icon = StronGoIcons.Filled.BarChart,
                    label = stringResource(id = R.string.next),
                    buttonColor = MaterialTheme.colorScheme.primary,
                    iconColor = MaterialTheme.colorScheme.onPrimary,
                    onClick = { if (selectedLevel != null) index++ }
                )
            }

            6 -> {
                Text(stringResource(R.string.whats_your_goal), fontWeight = FontWeight.Bold, fontSize = 22.sp)
                Spacer(Modifier.height(16.dp))
                Goal.entries.forEach { goal ->
                    val isSelected = selectedGoal == goal
                    val scale by animateFloatAsState(
                        targetValue = if (isSelected) 1.05f else 1f,
                        label = "CardScale"
                    )
                    val shadow by animateDpAsState(
                        targetValue = if (isSelected) 18.dp else 2.dp,
                        label = "CardShadow"
                    )
                    val border = if (isSelected) goal.color else Color.Transparent
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .graphicsLayer(
                                scaleX = scale,
                                scaleY = scale
                            )
                            .padding(vertical = 6.dp)
                    ) {
                        HorizontalCard(
                            modifier = Modifier
                                .fillMaxWidth()
                                .shadow(shadow, RoundedCornerShape(18.dp))
                                .border(2.dp, border, RoundedCornerShape(18.dp)),
                            title = goal.label(),
                            subtitle = when (goal) {
                                Goal.STRENGTH -> stringResource(id = R.string.become_stronger)
                                Goal.MUSCLE -> stringResource(id = R.string.build_muscle_mass)
                                Goal.FITNESS -> stringResource(id = R.string.be_in_better_shape)
                                Goal.WEIGHT_LOSS -> stringResource(id = R.string.lose_weight_healthily)
                            },
                            onClick = { selectedGoal = goal }
                        ) {
                            IconView(
                                icon = when (goal) {
                                    Goal.STRENGTH -> IconClass.Vector(StronGoIcons.Filled.FitnessCenter)
                                    Goal.MUSCLE -> IconClass.Vector(StronGoIcons.Filled.BarChart)
                                    Goal.FITNESS -> IconClass.Vector(StronGoIcons.Filled.AutoAwesome)
                                    Goal.WEIGHT_LOSS -> IconClass.Vector(StronGoIcons.Filled.BatteryFull)
                                },
                                modifier = Modifier.size(36.dp),
                                tint = goal.color
                            )
                        }
                    }
                }
                Spacer(Modifier.height(24.dp))
                ActionButton(
                    icon = StronGoIcons.Filled.AutoAwesome,
                    label = stringResource(id = R.string.finish),
                    buttonColor = MaterialTheme.colorScheme.primary,
                    iconColor = MaterialTheme.colorScheme.onPrimary,
                    onClick = {
                        val kg = weight.toFloatOrNull()
                        val cm = size.toFloatOrNull()
                        val ageInt = age.toIntOrNull()
                        if (
                            name.isNotBlank() && ageInt != null && gender != 0 &&
                            kg != null && kg in 25f..400f &&
                            cm != null && cm in 100f..250f &&
                            selectedLevel != null && selectedGoal != null
                        ) {
                            userProfileViewModel.saveProfile(
                                name = name,
                                age = ageInt,
                                gender = gender,
                                weight = kg,
                                size = cm,
                                level = selectedLevel!!.labelRes,
                                goal = selectedGoal!!.labelRes
                            )
                            onFinish()
                        }
                    }
                )
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        // Pagination
        Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
            repeat(7) { idx ->
                val color =
                    if (idx == index) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(
                        alpha = 0.3f
                    )
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .size(10.dp)
                        .background(color, shape = RoundedCornerShape(5.dp))
                )
            }
        }
    }
}