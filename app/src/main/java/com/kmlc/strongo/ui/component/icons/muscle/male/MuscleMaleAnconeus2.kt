package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.Anconeus2: ImageVector
    get() {
        if (_MuscleMaleAnconeus2 != null) {
            return _MuscleMaleAnconeus2!!
        }
        _MuscleMaleAnconeus2 = ImageVector.Builder(
            name = "MuscleMaleAnconeus2",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.59f, 207.1f)
                curveToRelative(0.47f, -10.78f, 1.21f, -14.41f, 4.16f, -20.44f)
                curveToRelative(5.37f, -10.97f, 7.5f, -13.11f, 14.11f, -14.15f)
                curveToRelative(5.68f, -0.89f, 5.84f, -0.82f, 5.12f, 2.28f)
                curveToRelative(-0.41f, 1.76f, -2.39f, 7.1f, -4.41f, 11.87f)
                curveToRelative(-2.02f, 4.77f, -5.61f, 14.07f, -7.97f, 20.67f)
                curveToRelative(-3.87f, 10.8f, -4.66f, 12.04f, -7.94f, 12.44f)
                lineToRelative(-3.64f, 0.44f)
                close()
                moveTo(336.7f, 218.33f)
                curveToRelative(-0.86f, -2.62f, -14.07f, -37.26f, -15.75f, -41.28f)
                curveToRelative(-1.95f, -4.71f, -0.94f, -5.51f, 5.55f, -4.41f)
                curveToRelative(4.51f, 0.76f, 5.97f, 1.88f, 9.3f, 7.13f)
                curveToRelative(5.89f, 9.3f, 8.2f, 17.63f, 8.2f, 29.61f)
                curveToRelative(0f, 10.47f, -0.05f, 10.62f, -3.38f, 10.62f)
                curveToRelative(-1.86f, 0f, -3.62f, -0.75f, -3.92f, -1.67f)
                close()
            }
        }.build()

        return _MuscleMaleAnconeus2!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleAnconeus2: ImageVector? = null
