package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.PosteriorDeltoids1: ImageVector
    get() {
        if (_MuscleFemalePosteriorDeltoids1 != null) {
            return _MuscleFemalePosteriorDeltoids1!!
        }
        _MuscleFemalePosteriorDeltoids1 = ImageVector.Builder(
            name = "MuscleFemalePosteriorDeltoids1",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(46f, 217.33f)
                curveToRelative(-1.64f, -2.66f, -2.83f, -20.42f, -1.84f, -27.68f)
                curveToRelative(1.15f, -8.46f, 11.78f, -31.36f, 18.35f, -39.51f)
                curveToRelative(6.78f, -8.42f, 11.81f, -11.46f, 18.94f, -11.46f)
                curveToRelative(7.98f, 0f, 11.31f, 2.75f, 13.5f, 11.13f)
                curveToRelative(1.63f, 6.24f, 1.57f, 6.56f, -1.63f, 9.02f)
                curveToRelative(-21.29f, 16.42f, -34.19f, 32.93f, -39.97f, 51.18f)
                curveToRelative(-2.49f, 7.86f, -5.29f, 10.65f, -7.35f, 7.33f)
                close()
                moveTo(288.91f, 208.66f)
                curveTo(281.31f, 188.99f, 269.21f, 172.72f, 254.21f, 162f)
                curveToRelative(-4.1f, -2.93f, -7.67f, -5.93f, -7.94f, -6.67f)
                curveToRelative(-0.78f, -2.18f, 1.68f, -11.81f, 3.7f, -14.49f)
                curveToRelative(2.42f, -3.21f, 12.58f, -4.43f, 18.05f, -2.17f)
                curveToRelative(6.51f, 2.7f, 14.29f, 12.8f, 22.41f, 29.14f)
                lineToRelative(7.56f, 15.2f)
                lineToRelative(-0.06f, 13.49f)
                curveToRelative(-0.1f, 22.88f, -3.25f, 27.12f, -9.03f, 12.15f)
                close()
            }
        }.build()

        return _MuscleFemalePosteriorDeltoids1!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemalePosteriorDeltoids1: ImageVector? = null
