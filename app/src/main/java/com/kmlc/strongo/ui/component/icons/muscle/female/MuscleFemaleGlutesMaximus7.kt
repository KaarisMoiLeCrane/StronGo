package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.GlutesMaximus7: ImageVector
    get() {
        if (_MuscleFemaleGlutesMaximus7 != null) {
            return _MuscleFemaleGlutesMaximus7!!
        }
        _MuscleFemaleGlutesMaximus7 = ImageVector.Builder(
            name = "MuscleFemaleGlutesMaximus7",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(118.59f, 170.15f)
                curveToRelative(-10f, -3.86f, -15.52f, -7.45f, -22.12f, -14.44f)
                curveToRelative(-8.72f, -9.22f, -12.76f, -17.11f, -12.88f, -25.15f)
                curveToRelative(-0.12f, -8.02f, 2.74f, -12.36f, 10.37f, -15.74f)
                curveToRelative(8.7f, -3.85f, 14.37f, -8.57f, 25.7f, -21.41f)
                curveToRelative(5.54f, -6.28f, 13.05f, -13.9f, 16.7f, -16.95f)
                curveToRelative(7.25f, -6.05f, 19.11f, -10.55f, 24.32f, -9.25f)
                curveToRelative(6.31f, 1.58f, 6.99f, 4.65f, 8.72f, 39.25f)
                curveToRelative(1.94f, 38.75f, 1.24f, 44.22f, -6.68f, 52.14f)
                curveToRelative(-10.77f, 10.77f, -31.83f, 16.28f, -44.13f, 11.54f)
                close()
                moveTo(206f, 170.22f)
                curveToRelative(-9.51f, -3.17f, -16.28f, -7.34f, -21.17f, -13.05f)
                curveToRelative(-7.15f, -8.35f, -7.29f, -9.66f, -6.35f, -58.49f)
                curveToRelative(0.57f, -29.5f, 2.48f, -33.62f, 14.57f, -31.36f)
                curveToRelative(9.28f, 1.74f, 15.75f, 6.48f, 33.61f, 24.63f)
                curveToRelative(13.93f, 14.16f, 19.73f, 19.1f, 25.66f, 21.87f)
                curveToRelative(9.29f, 4.35f, 12.37f, 8.6f, 12.25f, 16.87f)
                curveToRelative(-0.19f, 12.93f, -12.69f, 29.39f, -27.67f, 36.48f)
                curveToRelative(-9.32f, 4.41f, -22.83f, 5.74f, -30.9f, 3.05f)
                close()
            }
        }.build()

        return _MuscleFemaleGlutesMaximus7!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleGlutesMaximus7: ImageVector? = null
