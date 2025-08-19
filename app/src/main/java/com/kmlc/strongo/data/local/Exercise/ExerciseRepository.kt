package com.kmlc.strongo.data.local.Exercise

class ExerciseRepository(private val dao: ExerciseDao) {
    suspend fun insert(exercise: ExerciseEntity) = dao.insert(exercise)
    suspend fun getAll(): List<ExerciseEntity> = dao.getAll()
    suspend fun deleteAll() = dao.deleteAll()
    suspend fun getById(id: Int): ExerciseEntity? = dao.getById(id)
    suspend fun insertAll(exercises: List<ExerciseEntity>) = dao.insertAll(exercises)
    suspend fun deleteById(id: Int) = dao.deleteById(id)
}