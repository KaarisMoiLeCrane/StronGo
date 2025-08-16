package com.kmlc.strongo.data.local.Exercice

class ExerciceRepository(private val dao: ExerciceDao) {
    suspend fun insert(exercice: ExerciceEntity) = dao.insert(exercice)
    suspend fun getAll(): List<ExerciceEntity> = dao.getAll()
    suspend fun deleteAll() = dao.deleteAll()
}