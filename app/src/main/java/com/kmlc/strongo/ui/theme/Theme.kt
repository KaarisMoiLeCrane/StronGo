package com.kmlc.strongo.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = StronGoDarkAccent,              // Couleur d'accent principale
    onPrimary = StronGoDarkOnPrimary,         // Texte sur accent
    secondary = StronGoDarkProgress,          // Couleur secondaire (progress bar)
    onSecondary = StronGoDarkOnSecondary,     // Texte sur secondaire
    tertiary = StronGoDarkCard,               // Couleur tertiaire (cartes)
    onTertiary = StronGoDarkOnTertiary,       // Texte sur tertiaire
    background = StronGoDarkBackground,       // Fond principal
    onBackground = StronGoDarkOnBackground,   // Texte sur fond
    surface = StronGoDarkCard,                // Surface (cartes, dialogs)
    onSurface = StronGoDarkOnSurface,         // Texte sur surface
    error = Color(0xFFFF2B2B)
)

private val LightColorScheme = lightColorScheme(
    primary = StronGoLightAccent,              // Couleur d'accent principale
    onPrimary = StronGoLightOnPrimary,         // Texte sur accent
    secondary = StronGoLightProgress,          // Couleur secondaire (progress bar)
    onSecondary = StronGoLightOnSecondary,     // Texte sur secondaire
    tertiary = StronGoLightCard,               // Couleur tertiaire (cartes)
    onTertiary = StronGoLightOnTertiary,       // Texte sur tertiaire
    background = StronGoLightBackground,       // Fond principal
    onBackground = StronGoLightOnBackground,   // Texte sur fond
    surface = StronGoLightCard,                // Surface (cartes, dialogs)
    onSurface = StronGoLightOnSurface,         // Texte sur surface
    error = Color(0xFFFF2B2B)
)

@Override
@Composable
fun StronGoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
