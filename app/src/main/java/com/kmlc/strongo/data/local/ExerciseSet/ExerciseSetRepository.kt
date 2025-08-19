package com.kmlc.strongo.data.local.ExerciseSet

class ExerciseSetRepository(private val dao: ExerciseSetDao) {
    suspend fun insert(set: ExerciseSetEntity) = dao.insert(set)
    suspend fun insertAll(sets: List<ExerciseSetEntity>) = dao.insertAll(sets)
    suspend fun getBySession(sessionId: Int): List<ExerciseSetEntity> = dao.getBySession(sessionId)
    suspend fun getHistoryByExercise(exerciseId: Int): List<ExerciseSetEntity> = dao.getHistoryByExercise(exerciseId)
    suspend fun deleteById(id: Int) = dao.deleteById(id)
    suspend fun deleteBySession(sessionId: Int) = dao.deleteBySession(sessionId)
    suspend fun deleteAll() = dao.deleteAll()
}
