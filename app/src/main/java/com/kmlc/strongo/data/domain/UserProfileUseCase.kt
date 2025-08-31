package com.kmlc.strongo.data.domain

import com.kmlc.strongo.R
import com.kmlc.strongo.data.local.UserProfile.UserProfileEntity

class TreatUserProfile {
    val genderList = listOf(
        R.string.male,
        R.string.female,
        R.string.other
    )

    val levelList = listOf(
        R.string.beginner,
        R.string.intermediate,
        R.string.advanced
    )

    val goalList = listOf(
        R.string.gain_strength,
        R.string.gain_muscle,
        R.string.be_in_shape,
        R.string.lose_weight
    )

    fun execute(rawList: UserProfileEntity?): UserProfileEntity? {
        // Example: filter, map, sort, etc.
        return rawList
    }

    fun isProfileComplete(profile: UserProfileEntity?): Boolean {
        return profile != null
                && profile.name.isNotBlank()
                && profile.age in 15..120
                && genderList.contains(profile.gender)
                && profile.weight in 25f..400f
                && profile.size in 100f..250f
                && levelList.contains(profile.level)
                && goalList.contains(profile.goal)
    }
}