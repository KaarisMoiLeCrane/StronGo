package com.kmlc.strongo.data.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.kmlc.strongo.data.domain.TreatExerciseSetsUseCase
import com.kmlc.strongo.data.local.ExerciseSet.ExerciseSetEntity
import com.kmlc.strongo.data.local.ExerciseSet.ExerciseSetRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ExerciseSetViewModel(
    private val repository: ExerciseSetRepository,
    private val useCase: TreatExerciseSetsUseCase
) : ViewModel() {

    private val _sets = MutableStateFlow<List<ExerciseSetEntity>>(emptyList())
    val sets: StateFlow<List<ExerciseSetEntity>> = _sets

    fun loadSetsForSession(sessionId: Int) {
        viewModelScope.launch {
            val raw = repository.getBySession(sessionId)
            _sets.value = useCase.execute(raw)
        }
    }

    fun loadHistoryForExercise(exerciseId: Int) {
        viewModelScope.launch {
            val raw = repository.getHistoryByExercise(exerciseId)
            _sets.value = useCase.execute(raw)
        }
    }

    fun addSet(set: ExerciseSetEntity) {
        viewModelScope.launch {
            repository.insert(set)
            loadSetsForSession(set.sessionId)
        }
    }

    fun deleteSet(id: Int, sessionId: Int) {
        viewModelScope.launch {
            repository.deleteById(id)
            loadSetsForSession(sessionId)
        }
    }

    fun deleteSetsBySession(sessionId: Int) {
        viewModelScope.launch {
            repository.deleteBySession(sessionId)
            loadSetsForSession(sessionId)
        }
    }

    fun deleteAllSets() {
        viewModelScope.launch {
            repository.deleteAll()
            _sets.value = emptyList()
        }
    }

    fun addAllSets(sets: List<ExerciseSetEntity>) {
        viewModelScope.launch {
            repository.insertAll(sets)
            if (sets.isNotEmpty()) {
                loadSetsForSession(sets.first().sessionId)
            }
        }
    }

    @Suppress("UNCHECKED_CAST")
    class Factory(
        private val repository: ExerciseSetRepository,
        private val useCase: TreatExerciseSetsUseCase
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ExerciseSetViewModel::class.java)) {
                return ExerciseSetViewModel(repository, useCase) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}
