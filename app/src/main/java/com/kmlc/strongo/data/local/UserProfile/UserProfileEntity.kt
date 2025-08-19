package com.kmlc.strongo.data.local.UserProfile

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserProfileEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val age: Int,
    val gender: String,
    val weight: Float,
    val size: Float,
    val goal: Int,
    val level: Int,
)