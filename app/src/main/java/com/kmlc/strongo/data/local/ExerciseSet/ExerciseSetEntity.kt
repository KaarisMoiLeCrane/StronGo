package com.kmlc.strongo.data.local.ExerciseSet

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.kmlc.strongo.data.local.Exercise.ExerciseEntity
import com.kmlc.strongo.data.local.WorkoutSession.WorkoutSessionEntity

@Entity(
    tableName = "exercise_set",
    foreignKeys = [
        ForeignKey(
            entity = WorkoutSessionEntity::class,
            parentColumns = ["id"],
            childColumns = ["sessionId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = ExerciseEntity::class,
            parentColumns = ["id"],
            childColumns = ["exerciseId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index("sessionId"), Index("exerciseId")]
)
data class ExerciseSetEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val sessionId: Int,
    val exerciseId: Int,
    val setNumber: Int,
    val reps: Int,
    val weight: Float?,
    val restTime: Int? = null
)
