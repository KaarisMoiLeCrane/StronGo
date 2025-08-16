package com.kmlc.strongo.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExerciceEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nom: String,
    val repetitions: Int
)