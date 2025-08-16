package com.kmlc.strongo.data.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kmlc.strongo.data.local.entity.ExerciceEntity
import com.kmlc.strongo.data.local.repository.ExerciceRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ExerciceViewModel(private val repository: ExerciceRepository) : ViewModel() {
    private val _exercices = MutableStateFlow<List<ExerciceEntity>>(emptyList())
    val exercices: StateFlow<List<ExerciceEntity>> = _exercices

    fun loadExercices() {
        viewModelScope.launch {
            _exercices.value = repository.getAll()
        }
    }

    fun addExercice(exercice: ExerciceEntity) {
        viewModelScope.launch {
            repository.insert(exercice)
            loadExercices()
        }
    }
}