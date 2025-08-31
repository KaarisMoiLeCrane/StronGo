package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.PosteriorDeltoids1: ImageVector
    get() {
        if (_MuscleMalePosteriorDeltoids1 != null) {
            return _MuscleMalePosteriorDeltoids1!!
        }
        _MuscleMalePosteriorDeltoids1 = ImageVector.Builder(
            name = "MuscleMalePosteriorDeltoids1",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(315.72f, 231.03f)
                curveToRelative(-1.15f, -1.3f, -4.5f, -7.17f, -7.44f, -13.03f)
                curveToRelative(-10.61f, -21.15f, -25.72f, -37.99f, -44.45f, -49.55f)
                curveToRelative(-4.3f, -2.66f, -7.82f, -5.74f, -7.82f, -6.85f)
                curveToRelative(0f, -3.87f, 6.67f, -13.38f, 11.47f, -16.34f)
                curveToRelative(5.93f, -3.66f, 9.92f, -3.62f, 18.53f, 0.2f)
                curveToRelative(18.79f, 8.34f, 33.45f, 25.74f, 38.01f, 45.1f)
                curveToRelative(2.92f, 12.42f, -0.28f, 40.91f, -4.77f, 42.37f)
                curveToRelative(-0.79f, 0.26f, -2.37f, -0.6f, -3.52f, -1.9f)
                close()
                moveTo(30.77f, 228.93f)
                curveToRelative(-0.64f, -1.69f, -1.79f, -8.2f, -2.56f, -14.47f)
                curveToRelative(-2.95f, -24.09f, 3.15f, -40.85f, 20.89f, -57.45f)
                curveToRelative(7.77f, -7.26f, 21.12f, -14.35f, 27.04f, -14.35f)
                curveToRelative(5.5f, 0f, 12.46f, 4.39f, 16.57f, 10.45f)
                curveToRelative(5.08f, 7.48f, 4.41f, 9.81f, -4.39f, 15.25f)
                curveToRelative(-17.73f, 10.94f, -33.72f, 29.17f, -45.03f, 51.3f)
                curveToRelative(-6.63f, 12.98f, -10.12f, 15.56f, -12.52f, 9.26f)
                close()
            }
        }.build()

        return _MuscleMalePosteriorDeltoids1!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMalePosteriorDeltoids1: ImageVector? = null
