package com.kmlc.strongo.data.local.Exercice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ExerciceDao {
    @Query(value = "SELECT * FROM ExerciceEntity")
    suspend fun getAll(): List<ExerciceEntity>

    @Insert
    suspend fun insert(exercice: ExerciceEntity)

    @Query(value = "DELETE FROM ExerciceEntity")
    suspend fun deleteAll()
}