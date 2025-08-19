package com.kmlc.strongo.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kmlc.strongo.data.local.Exercise.ExerciseDao
import com.kmlc.strongo.data.local.Exercise.ExerciseEntity
import com.kmlc.strongo.data.local.ExerciseSet.ExerciseSetDao
import com.kmlc.strongo.data.local.ExerciseSet.ExerciseSetEntity
import com.kmlc.strongo.data.local.UserProfile.UserProfileDao
import com.kmlc.strongo.data.local.UserProfile.UserProfileEntity
import com.kmlc.strongo.data.local.WorkoutSession.WorkoutSessionDao
import com.kmlc.strongo.data.local.WorkoutSession.WorkoutSessionEntity

@Database(
    entities = [
        ExerciseEntity::class,
        UserProfileEntity::class,
        ExerciseSetEntity::class,
        WorkoutSessionEntity::class
    ],
    version = 1
)
abstract class StrongoDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
    abstract fun userProfileDao(): UserProfileDao
    abstract fun exerciseSetDao(): ExerciseSetDao
    abstract fun WorkoutSessionDao(): WorkoutSessionDao

    companion object {
        @Volatile
        private var INSTANCE: StrongoDatabase? = null

        fun getInstance(context: Context): StrongoDatabase {
            // context.deleteDatabase("strongo-db")

            return INSTANCE ?: synchronized(lock = this) {
                INSTANCE ?: Room.databaseBuilder(
                    context = context.applicationContext,
                    klass = StrongoDatabase::class.java,
                    name = "strongo-db"
                    // ).addMigrations().build().also { INSTANCE = it }
                ).fallbackToDestructiveMigration(dropAllTables = true).build().also { INSTANCE = it }
            }
        }
    }
}
