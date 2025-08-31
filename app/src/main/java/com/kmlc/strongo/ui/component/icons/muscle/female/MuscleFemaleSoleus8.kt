package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.Soleus8: ImageVector
    get() {
        if (_MuscleFemaleSoleus8 != null) {
            return _MuscleFemaleSoleus8!!
        }
        _MuscleFemaleSoleus8 = ImageVector.Builder(
            name = "MuscleFemaleSoleus8",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(108.38f, 161.38f)
                curveToRelative(-10.51f, -6.41f, -15.05f, -20.08f, -15.04f, -45.29f)
                curveToRelative(0.01f, -27.11f, 4.38f, -49.05f, 13.3f, -66.78f)
                curveToRelative(4.06f, -8.06f, 6.53f, -10.64f, 10.19f, -10.64f)
                curveToRelative(5.92f, 0f, 6.33f, 3.13f, 6.58f, 49.33f)
                curveToRelative(0.13f, 23.83f, 0.92f, 49.28f, 1.76f, 56.55f)
                curveToRelative(1.31f, 11.39f, 1.24f, 13.65f, -0.52f, 16.33f)
                curveToRelative(-2.61f, 3.98f, -10.18f, 4.21f, -16.27f, 0.49f)
                close()
                moveTo(221.1f, 160.68f)
                curveToRelative(-1.13f, -2.48f, -1.12f, -7.98f, 0.03f, -21.74f)
                curveToRelative(0.85f, -10.13f, 1.54f, -34.94f, 1.54f, -55.14f)
                curveToRelative(0f, -40.97f, 0.62f, -45.13f, 6.69f, -45.13f)
                curveToRelative(6.65f, 0f, 12.91f, 12.57f, 18.96f, 38f)
                curveToRelative(3.66f, 15.4f, 4.13f, 19.71f, 4.24f, 38.67f)
                curveToRelative(0.15f, 25.89f, -1.52f, 32.2f, -11.13f, 42.18f)
                curveTo(235.67f, 163.47f, 234.64f, 164f, 228.88f, 164f)
                curveToRelative(-5.39f, 0f, -6.49f, -0.47f, -7.79f, -3.32f)
                close()
            }
        }.build()

        return _MuscleFemaleSoleus8!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleSoleus8: ImageVector? = null
