package com.kmlc.strongo.data.local.Exercise

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise")
data class ExerciseEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val feeling: String? = null,
    val category: String? = null
)
