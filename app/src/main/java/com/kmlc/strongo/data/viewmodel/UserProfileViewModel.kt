package com.kmlc.strongo.data.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.kmlc.strongo.data.domain.TreatUserProfile
import com.kmlc.strongo.data.local.UserProfile.UserProfileEntity
import com.kmlc.strongo.data.local.UserProfile.UserProfileRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UserProfileViewModel(
    private val repository: UserProfileRepository,
    private val treatUserProfile: TreatUserProfile
) : ViewModel() {
    private val _loading = MutableStateFlow(true)
    val loading: StateFlow<Boolean> = _loading

    private val _profile = MutableStateFlow<UserProfileEntity?>(null)
    val profile: StateFlow<UserProfileEntity?> = _profile

    init {
        loadProfile()
    }

    fun loadProfile() {
        viewModelScope.launch {
            _loading.value = true
            val rawList = repository.getProfile()
            _profile.value = treatUserProfile.execute(rawList)
            _loading.value = false
        }
    }

    fun saveProfile(
        name: String,
        age: Int,
        gender: Int,
        weight: Float,
        size: Float,
        goal: Int,
        level: Int
    ) {
        viewModelScope.launch {
            repository.deleteAll()
            repository.insert(
                profile = UserProfileEntity(
                    name = name, age = age, gender = gender,
                    weight = weight, size = size, goal = goal, level = level
                )
            )
            loadProfile()
        }
    }

    fun deleteProfile() {
        viewModelScope.launch {
            repository.deleteAll()
            loadProfile()
        }
    }

    class Factory(
        private val repository: UserProfileRepository,
        private val treatUserProfile: TreatUserProfile
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(UserProfileViewModel::class.java)) {
                return UserProfileViewModel(repository, treatUserProfile) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}