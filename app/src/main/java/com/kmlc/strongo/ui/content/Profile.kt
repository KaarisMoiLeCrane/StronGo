package com.kmlc.strongo.ui.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kmlc.strongo.data.domain.TreatExercicesUseCase
import com.kmlc.strongo.data.local.Exercice.ExerciceRepository
import com.kmlc.strongo.data.local.StrongoDatabase
import com.kmlc.strongo.data.viewmodel.ExerciceViewModel

@Composable
fun ProfileContent(innerPadding: PaddingValues) {
    val context = LocalContext.current
    // Instantiate DAO and Repository just once
    val exerciceDao = remember { StrongoDatabase.getInstance(context).exerciceDao() }
    val repository = remember { ExerciceRepository(exerciceDao) }
    val treatExercicesUseCase = remember { TreatExercicesUseCase() }
    // Provide the repository to the ViewModel
    val viewModel: ExerciceViewModel = viewModel(factory = ExerciceViewModel.Factory(repository, treatExercicesUseCase))

    val exercices by viewModel.exercices.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(color = 0xFF18181C))
            .padding(paddingValues = innerPadding)
            .padding(all = 16.dp)
            .verticalScroll(state = rememberScrollState())
    ) {
        Button(
            onClick = {
                viewModel.deleteAllExercices()
            }
        ) {
            Text(
                text = "Profile",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )
        }
    }
}