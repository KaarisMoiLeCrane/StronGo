package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.Glutes7: ImageVector
    get() {
        if (_MuscleFemaleGlutes7 != null) {
            return _MuscleFemaleGlutes7!!
        }
        _MuscleFemaleGlutes7 = ImageVector.Builder(
            name = "Female.MuscleFemaleGlutes7",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(122.33f, 171.89f)
                curveToRelative(-19.37f, -4.56f, -37.76f, -23.21f, -39.36f, -39.92f)
                curveToRelative(-0.89f, -9.23f, 2.11f, -13.97f, 11.42f, -18.07f)
                curveToRelative(6.15f, -2.71f, 11.06f, -6.9f, 25.61f, -21.83f)
                curveToRelative(9.9f, -10.16f, 19.54f, -19.43f, 21.41f, -20.59f)
                curveToRelative(5.08f, -3.15f, 15.24f, -5.9f, 19.06f, -5.17f)
                curveToRelative(7.54f, 1.44f, 7.99f, 3.19f, 9.66f, 38.13f)
                curveToRelative(0.91f, 19.1f, 1.08f, 35.17f, 0.41f, 39.45f)
                curveToRelative(-2.09f, 13.25f, -9.73f, 20.77f, -27.19f, 26.78f)
                curveToRelative(-8.27f, 2.85f, -12.98f, 3.12f, -21.02f, 1.23f)
                close()
                moveTo(203.77f, 170.21f)
                curveToRelative(-14.12f, -5.1f, -22.38f, -12.32f, -25.05f, -21.92f)
                curveToRelative(-1.58f, -5.7f, -1.78f, -26.94f, -0.52f, -56.05f)
                curveToRelative(1.06f, -24.5f, 1.95f, -26.23f, 12.98f, -25.29f)
                curveToRelative(11.37f, 0.97f, 16.31f, 4.27f, 34.82f, 23.32f)
                curveToRelative(13.44f, 13.83f, 19.44f, 18.98f, 26.67f, 22.89f)
                curveToRelative(10.37f, 5.61f, 12.61f, 8.72f, 12.62f, 17.52f)
                curveToRelative(0.02f, 18.75f, -22.37f, 39.8f, -44.63f, 41.97f)
                curveToRelative(-6.45f, 0.63f, -9.72f, 0.16f, -16.9f, -2.43f)
                close()
            }
        }.build()

        return _MuscleFemaleGlutes7!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleGlutes7: ImageVector? = null
