package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.RectusFemoris3: ImageVector
    get() {
        if (_MuscleFemaleRectusFemoris3 != null) {
            return _MuscleFemaleRectusFemoris3!!
        }
        _MuscleFemaleRectusFemoris3 = ImageVector.Builder(
            name = "MuscleFemaleRectusFemoris3",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(135.65f, 251.15f)
                curveToRelative(-0.53f, -0.83f, -2.12f, -9.53f, -3.55f, -19.33f)
                curveToRelative(-1.42f, -9.8f, -5.39f, -28.62f, -8.81f, -41.82f)
                curveToRelative(-14.91f, -57.51f, -17.93f, -77.09f, -15.39f, -99.79f)
                curveToRelative(0.81f, -7.22f, 2.05f, -14.21f, 2.76f, -15.55f)
                curveToRelative(4.93f, -9.2f, 22.73f, 15.61f, 33.66f, 46.91f)
                curveToRelative(4.27f, 12.22f, 4.34f, 12.81f, 4.3f, 35.76f)
                curveToRelative(-0.04f, 20.67f, -0.6f, 26.61f, -4.94f, 52f)
                curveToRelative(-2.69f, 15.77f, -5.39f, 31.97f, -5.99f, 36f)
                curveToRelative(-0.6f, 4.03f, -1.52f, 6.65f, -2.05f, 5.82f)
                close()
                moveTo(214.24f, 250.67f)
                curveToRelative(-0.42f, -1.1f, -1.66f, -6.8f, -2.77f, -12.67f)
                curveToRelative(-1.1f, -5.87f, -4.45f, -22.29f, -7.43f, -36.5f)
                curveToRelative(-6.89f, -32.8f, -8.49f, -47.77f, -6.68f, -62.36f)
                curveToRelative(2.68f, -21.55f, 14.33f, -50.59f, 24.61f, -61.31f)
                curveToRelative(7.74f, -8.07f, 10.09f, -7.53f, 12.28f, 2.85f)
                curveToRelative(5.11f, 24.19f, 3.41f, 48.09f, -6.89f, 97.31f)
                curveToRelative(-7.14f, 34.1f, -8.26f, 40.74f, -9.39f, 55.7f)
                curveToRelative(-0.99f, 13.15f, -2.53f, 20.15f, -3.74f, 16.98f)
                close()
            }
        }.build()

        return _MuscleFemaleRectusFemoris3!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleRectusFemoris3: ImageVector? = null
