package com.kmlc.strongo.data.domain

import com.kmlc.strongo.R
import com.kmlc.strongo.data.local.UserProfile.UserProfileEntity

class TreatUserProfile {
    fun execute(rawList: UserProfileEntity?): UserProfileEntity? {
        // Example: filter, map, sort, etc.
        return rawList
    }

    fun isProfileComplete(profile: UserProfileEntity?): Boolean {
        return profile != null
                && profile.name.isNotBlank()
                && profile.age in 15..120
                && profile.gender.isNotBlank()
                && profile.weight in 25f..400f
                && profile.size in 100f..250f
                && profile.level != R.string.beginner
                && profile.level != R.string.intermediate
                && profile.level != R.string.advanced
                && profile.goal != R.string.gain_strength
                && profile.goal != R.string.gain_muscle
                && profile.goal != R.string.be_in_shape
                && profile.goal != R.string.lose_weight
    }
}