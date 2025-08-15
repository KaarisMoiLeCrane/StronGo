package com.kmlc.strongo.navigation

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalContext

@Composable
fun HideSystemBars() {
    val activity = LocalContext.current as? Activity
    SideEffect {
        activity?.window?.let { window ->
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                window.insetsController?.hide(/* p0 = */ WindowInsets.Type.navigationBars() or WindowInsets.Type.statusBars())
                window.insetsController?.systemBarsBehavior =
                    WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            } else {
                @Suppress(/* ...names =  */ "DEPRECATION")
                window.decorView.systemUiVisibility =
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                            View.SYSTEM_UI_FLAG_FULLSCREEN
            }
        }
    }
}
