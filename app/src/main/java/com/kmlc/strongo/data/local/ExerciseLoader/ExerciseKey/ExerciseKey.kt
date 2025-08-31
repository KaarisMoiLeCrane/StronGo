package com.kmlc.strongo.data.local.ExerciseLoader

object ExerciseKey {
    val map = ExerciseKeyPart1.map + ExerciseKeyPart2.map + ExerciseKeyPart3.map + ExerciseKeyPart4.map + ExerciseKeyPart5.map + ExerciseKeyPart6.map + ExerciseKeyPart7.map + ExerciseKeyPart8.map

    fun getResId(key: String): Int? = map[key]
}
