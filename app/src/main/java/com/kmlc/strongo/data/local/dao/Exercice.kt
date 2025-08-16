package com.kmlc.strongo.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.kmlc.strongo.data.local.entity.ExerciceEntity

@Dao
interface ExerciceDao {
    @Query("SELECT * FROM ExerciceEntity")
    suspend fun getAll(): List<ExerciceEntity>

    @Insert
    suspend fun insert(exercice: ExerciceEntity)
}