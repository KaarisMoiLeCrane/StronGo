package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.Glutes7: ImageVector
    get() {
        if (_MuscleMaleGlutes7 != null) {
            return _MuscleMaleGlutes7!!
        }
        _MuscleMaleGlutes7 = ImageVector.Builder(
            name = "Male.MuscleMaleGlutes7",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(126.27f, 180.83f)
                curveToRelative(-11.89f, -4.45f, -21.25f, -13.53f, -28.34f, -27.5f)
                curveToRelative(-2.89f, -5.7f, -3.74f, -9.27f, -3.81f, -16f)
                curveToRelative(-0.1f, -10.18f, 2.34f, -14.82f, 9.81f, -18.63f)
                curveToRelative(6.08f, -3.1f, 13.2f, -10.81f, 23.41f, -25.37f)
                curveToRelative(13.43f, -19.14f, 22.61f, -26.67f, 32.52f, -26.67f)
                curveToRelative(2.67f, 0f, 4.84f, 1.13f, 6.71f, 3.51f)
                curveToRelative(2.66f, 3.38f, 2.76f, 5.05f, 2.76f, 44.6f)
                curveToRelative(0f, 24.6f, -0.58f, 43.81f, -1.45f, 47.86f)
                curveToRelative(-1.79f, 8.35f, -6.13f, 13.7f, -13.49f, 16.65f)
                curveToRelative(-7.83f, 3.13f, -21.82f, 3.9f, -28.12f, 1.54f)
                close()
                moveTo(198.22f, 180.83f)
                curveToRelative(-7.23f, -2.03f, -12.08f, -5.24f, -16.14f, -10.68f)
                curveToRelative(-2.6f, -3.48f, -2.8f, -6.08f, -3.66f, -48.58f)
                curveToRelative(-0.82f, -40.51f, -0.69f, -45.36f, 1.33f, -49.57f)
                curveToRelative(2.7f, -5.61f, 7.19f, -6.6f, 15.51f, -3.43f)
                curveToRelative(7.13f, 2.72f, 13.13f, 8.95f, 26.55f, 27.57f)
                curveToRelative(6.4f, 8.88f, 13.31f, 16.84f, 16.85f, 19.39f)
                curveToRelative(14.34f, 10.36f, 14f, 9.85f, 14f, 20.69f)
                curveToRelative(0f, 12.11f, -4.11f, 21.78f, -13.55f, 31.87f)
                curveToRelative(-11.49f, 12.29f, -26.21f, 16.87f, -40.9f, 12.74f)
                close()
            }
        }.build()

        return _MuscleMaleGlutes7!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleGlutes7: ImageVector? = null
