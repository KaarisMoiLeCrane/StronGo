package com.kmlc.strongo.data.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.kmlc.strongo.data.domain.TreatExercisesUseCase
import com.kmlc.strongo.data.local.Exercise.ExerciseEntity
import com.kmlc.strongo.data.local.Exercise.ExerciseRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ExerciseViewModel(
    private val repository: ExerciseRepository,
    private val treatExercisesUseCase: TreatExercisesUseCase
) : ViewModel() {
    private val _exercises = MutableStateFlow<List<ExerciseEntity>>(emptyList())
    private val _exerciseByID = MutableStateFlow<ExerciseEntity?>(null)
    val exercise: StateFlow<List<ExerciseEntity>> = _exercises
    val exerciseByID: StateFlow<ExerciseEntity?> = _exerciseByID

    init {
        loadExercises()
    }

    fun loadExercises() {
        viewModelScope.launch {
            val rawList = repository.getAll()
            _exercises.value = treatExercisesUseCase.execute(rawList)
        }
    }

    fun addExercise(exercise: ExerciseEntity) {
        viewModelScope.launch {
            repository.insert(exercise)
            loadExercises()
        }
    }

    fun deleteAllExercises() {
        viewModelScope.launch {
            repository.deleteAll()
            loadExercises()
        }
    }

    fun deleteExercise(id: Int) {
        viewModelScope.launch {
            repository.deleteById(id)
            loadExercises()
        }
    }

    fun loadExerciseById(id: Int) {
        viewModelScope.launch {
            val rawExerciseID = repository.getById(id)
            _exerciseByID.value = rawExerciseID
        }
    }

    fun addExercises(exercises: List<ExerciseEntity>) {
        viewModelScope.launch {
            repository.insertAll(exercises)
            loadExercises()
        }
    }

    @Suppress("UNCHECKED_CAST")
    class Factory(
        private val repository: ExerciseRepository,
        private val treatExercisesUseCase: TreatExercisesUseCase
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ExerciseViewModel::class.java)) {
                return ExerciseViewModel(repository, treatExercisesUseCase) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}