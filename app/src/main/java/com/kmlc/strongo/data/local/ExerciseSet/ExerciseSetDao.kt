package com.kmlc.strongo.data.local.ExerciseSet

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ExerciseSetDao {
    @Query("SELECT * FROM exercise_set WHERE sessionId = :sessionId ORDER BY setNumber ASC")
    suspend fun getBySession(sessionId: Int): List<ExerciseSetEntity>

    @Query("SELECT * FROM exercise_set WHERE exerciseId = :exerciseId ORDER BY sessionId, setNumber")
    suspend fun getHistoryByExercise(exerciseId: Int): List<ExerciseSetEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(set: ExerciseSetEntity): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(sets: List<ExerciseSetEntity>)

    @Query("DELETE FROM exercise_set WHERE id = :id")
    suspend fun deleteById(id: Int)

    @Query("DELETE FROM exercise_set WHERE sessionId = :sessionId")
    suspend fun deleteBySession(sessionId: Int)

    @Query("DELETE FROM exercise_set")
    suspend fun deleteAll()
}
