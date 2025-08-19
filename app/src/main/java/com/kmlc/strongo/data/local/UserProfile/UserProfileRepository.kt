package com.kmlc.strongo.data.local.UserProfile

class UserProfileRepository(private val dao: UserProfileDao) {
    suspend fun insert(profile: UserProfileEntity) = dao.insert(profile)
    suspend fun getProfile(): UserProfileEntity? = dao.getProfile()
    suspend fun deleteAll() = dao.deleteAll()
}