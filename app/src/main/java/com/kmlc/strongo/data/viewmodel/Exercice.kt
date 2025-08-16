package com.kmlc.strongo.data.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.kmlc.strongo.data.domain.TreatExercicesUseCase
import com.kmlc.strongo.data.local.Exercice.ExerciceEntity
import com.kmlc.strongo.data.local.Exercice.ExerciceRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ExerciceViewModel(
    private val repository: ExerciceRepository,
    private val treatExercicesUseCase: TreatExercicesUseCase
) : ViewModel() {
    private val _exercices = MutableStateFlow<List<ExerciceEntity>>(emptyList())
    val exercices: StateFlow<List<ExerciceEntity>> = _exercices

    init {
        loadExercices()
    }

    fun loadExercices() {
        viewModelScope.launch {
            val rawList = repository.getAll()
            _exercices.value = treatExercicesUseCase.execute(rawList)
        }
    }

    fun addExercice(exercice: ExerciceEntity) {
        viewModelScope.launch {
            repository.insert(exercice)
            loadExercices()
        }
    }

    fun deleteAllExercices() {
        viewModelScope.launch {
            repository.deleteAll()
            loadExercices()
        }
    }

    @Suppress("UNCHECKED_CAST")
    class Factory(
        private val repository: ExerciceRepository,
        private val treatExercicesUseCase: TreatExercicesUseCase
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ExerciceViewModel::class.java)) {
                return ExerciceViewModel(repository, treatExercicesUseCase) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}