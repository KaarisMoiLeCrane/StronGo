package com.kmlc.strongo.ui.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kmlc.strongo.R
import com.kmlc.strongo.data.viewmodel.ExerciseSetViewModel
import com.kmlc.strongo.data.viewmodel.ExerciseViewModel
import com.kmlc.strongo.data.viewmodel.UserProfileViewModel
import com.kmlc.strongo.data.viewmodel.WorkoutSessionViewModel
import com.kmlc.strongo.di.provideExerciseSetViewModel
import com.kmlc.strongo.di.provideExerciseViewModel
import com.kmlc.strongo.di.provideUserProfileViewModel
import com.kmlc.strongo.di.provideWorkoutSessionViewModel
import com.kmlc.strongo.navigation.Screen

@Composable
fun ProfileContent(navController: NavController) {
    val userProfileViewModel: UserProfileViewModel = provideUserProfileViewModel()

    // For "Delete all data" button
    val exerciseViewModel: ExerciseViewModel = provideExerciseViewModel()
    val exerciseSetViewModel: ExerciseSetViewModel = provideExerciseSetViewModel()
    val workoutSessionViewModel: WorkoutSessionViewModel = provideWorkoutSessionViewModel()

    val profile by userProfileViewModel.profile.collectAsState()

    profile?.let { user ->
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Avatar (just initials in a circle for demo)
                Box(
                    modifier = Modifier
                        .size(68.dp)
                        .background(MaterialTheme.colorScheme.primary, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = user.name.take(2).uppercase(),
                        style = MaterialTheme.typography.headlineLarge,
                        color = MaterialTheme.colorScheme.onPrimary,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(Modifier.height(16.dp))

                Text(
                    text = stringResource(id = R.string.profile_name_years_old, user.name, user.age),
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.Bold
                )

                Spacer(Modifier.height(4.dp))
                Text(
                    text = stringResource(id = user.gender),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.primary
                )

                Spacer(Modifier.height(16.dp))
                // Physical stats with icons (optional: add icons if you have them)
                ProfileStatRow(label = stringResource(id = R.string.weight), value = "${user.weight} kg")
                ProfileStatRow(label = stringResource(id = R.string.size), value = "${user.size} cm")
                ProfileStatRow(label = stringResource(id = R.string.level), value = stringResource(id = user.level))
                ProfileStatRow(label = stringResource(id = R.string.goal), value = stringResource(id = user.goal))
            }
        }
    } ?: run {
        Text(
            text = stringResource(id = R.string.no_profile_found),
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.bodyLarge
        )
    }

    Spacer(Modifier.height(36.dp))

    Button(
        onClick = {
            exerciseViewModel.deleteAllExercises()
            userProfileViewModel.deleteProfile()
            exerciseSetViewModel.deleteAllSets()
            workoutSessionViewModel.deleteAll()
            navController.navigate(route = Screen.OnBoarding.name) {
                popUpTo(route = Screen.OnBoarding.name) {
                    inclusive = true
                }
                launchSingleTop = true
            }
        },
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
    ) {
        Text(text = stringResource(id = R.string.delete_all_your_datas), color = MaterialTheme.colorScheme.onError)
    }
}

@Composable
private fun ProfileStatRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "$label :",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.secondary,
            fontWeight = FontWeight.SemiBold
        )
    }
}