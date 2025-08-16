package com.kmlc.strongo.data.local.repository

import com.kmlc.strongo.data.local.dao.ExerciceDao
import com.kmlc.strongo.data.local.entity.ExerciceEntity

class ExerciceRepository(private val dao: ExerciceDao) {
    suspend fun insert(exercice: ExerciceEntity) = dao.insert(exercice)
    suspend fun getAll(): List<ExerciceEntity> = dao.getAll()
}