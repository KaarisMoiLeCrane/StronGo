package com.kmlc.strongo.di

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.kmlc.strongo.data.domain.TreatUserProfile
import com.kmlc.strongo.data.local.StrongoDatabase
import com.kmlc.strongo.data.local.UserProfile.UserProfileRepository
import com.kmlc.strongo.data.viewmodel.UserProfileViewModel

@Composable
fun provideUserProfileViewModel(): UserProfileViewModel {
    val context = LocalContext.current
    val db = remember { StrongoDatabase.getInstance(context) }
    val userProfileDao = remember { db.userProfileDao() }
    val userProfileRepo = remember { UserProfileRepository(userProfileDao) }
    val treatUserProfile = remember { TreatUserProfile() }

    return provideViewModel {
        UserProfileViewModel.Factory(
            repository = userProfileRepo,
            treatUserProfile = treatUserProfile
        )
    }
}