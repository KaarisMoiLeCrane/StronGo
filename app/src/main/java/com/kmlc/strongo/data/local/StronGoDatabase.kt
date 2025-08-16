package com.kmlc.strongo.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kmlc.strongo.data.local.Exercice.ExerciceDao
import com.kmlc.strongo.data.local.Exercice.ExerciceEntity

@Database(entities = [ExerciceEntity::class], version = 1)
abstract class StrongoDatabase : RoomDatabase() {
    abstract fun exerciceDao(): ExerciceDao

    companion object {
        @Volatile
        private var INSTANCE: StrongoDatabase? = null

        fun getInstance(context: Context): StrongoDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    StrongoDatabase::class.java,
                    "strongo_db"
                ).build().also { INSTANCE = it }
            }
        }
    }
}