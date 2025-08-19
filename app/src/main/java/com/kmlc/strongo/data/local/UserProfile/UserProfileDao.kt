package com.kmlc.strongo.data.local.UserProfile

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserProfileDao {
    @Insert
    suspend fun insert(profile: UserProfileEntity)

    @Query("SELECT * FROM UserProfileEntity LIMIT 1")
    suspend fun getProfile(): UserProfileEntity?

    @Query("DELETE FROM UserProfileEntity")
    suspend fun deleteAll()
}