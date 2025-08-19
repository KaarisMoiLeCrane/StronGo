package com.kmlc.strongo.data.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.kmlc.strongo.data.domain.TreatWorkoutSessionsUseCase
import com.kmlc.strongo.data.local.WorkoutSession.WorkoutSessionEntity
import com.kmlc.strongo.data.local.WorkoutSession.WorkoutSessionRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class WorkoutSessionViewModel(
    private val repository: WorkoutSessionRepository,
    private val useCase: TreatWorkoutSessionsUseCase
) : ViewModel() {

    private val _sessions = MutableStateFlow<List<WorkoutSessionEntity>>(emptyList())
    val sessions: StateFlow<List<WorkoutSessionEntity>> = _sessions

    init {
        loadSessions()
    }

    fun loadSessions() {
        viewModelScope.launch {
            val raw = repository.getAll()
            _sessions.value = useCase.execute(raw)
        }
    }

    fun addSession(session: WorkoutSessionEntity) {
        viewModelScope.launch {
            repository.insert(session)
            loadSessions()
        }
    }

    fun deleteSession(id: Int) {
        viewModelScope.launch {
            repository.deleteById(id)
            loadSessions()
        }
    }

    fun deleteAll() {
        viewModelScope.launch {
            repository.deleteAll()
            loadSessions()
        }
    }

    @Suppress("UNCHECKED_CAST")
    class Factory(
        private val repository: WorkoutSessionRepository,
        private val useCase: TreatWorkoutSessionsUseCase
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(WorkoutSessionViewModel::class.java)) {
                return WorkoutSessionViewModel(repository, useCase) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}
