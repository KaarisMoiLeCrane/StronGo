package com.kmlc.strongo.data.local.WorkoutSession

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WorkoutSessionDao {
    @Query("SELECT * FROM workout_session ORDER BY date DESC")
    suspend fun getAll(): List<WorkoutSessionEntity>

    @Query("SELECT * FROM workout_session WHERE id = :id LIMIT 1")
    suspend fun getById(id: Int): WorkoutSessionEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(session: WorkoutSessionEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(sessions: List<WorkoutSessionEntity>)

    @Query("DELETE FROM workout_session WHERE id = :id")
    suspend fun deleteById(id: Int)

    @Query("DELETE FROM workout_session")
    suspend fun deleteAll()
}
