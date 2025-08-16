package com.kmlc.strongo

import android.app.Application
import androidx.room.Room
import com.kmlc.strongo.data.local.StrongoDatabase

class StrongoApp : Application() {
    lateinit var database: StrongoDatabase
        private set

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            context = applicationContext,
            klass = StrongoDatabase::class.java,
            name = "strongo-db"
        ).build()
    }
}