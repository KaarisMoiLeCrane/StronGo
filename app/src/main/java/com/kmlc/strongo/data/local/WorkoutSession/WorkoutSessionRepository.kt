package com.kmlc.strongo.data.local.WorkoutSession

class WorkoutSessionRepository(private val dao: WorkoutSessionDao) {
    suspend fun insert(session: WorkoutSessionEntity) = dao.insert(session)
    suspend fun getAll(): List<WorkoutSessionEntity> = dao.getAll()
    suspend fun getById(id: Int): WorkoutSessionEntity? = dao.getById(id)
    suspend fun deleteAll() = dao.deleteAll()
    suspend fun deleteById(id: Int) = dao.deleteById(id)
}
