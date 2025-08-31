package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.LateralDeltoids1: ImageVector
    get() {
        if (_MuscleMaleLateralDeltoids1 != null) {
            return _MuscleMaleLateralDeltoids1!!
        }
        _MuscleMaleLateralDeltoids1 = ImageVector.Builder(
            name = "MuscleMaleLateralDeltoids1",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.22f, 237.07f)
                curveToRelative(-5.27f, -16.92f, -6.41f, -44.38f, -2.38f, -57.68f)
                curveToRelative(3.51f, -11.6f, 8.24f, -20.2f, 15.28f, -27.76f)
                curveToRelative(5.96f, -6.4f, 18.12f, -13.59f, 20.51f, -12.12f)
                curveToRelative(0.62f, 0.39f, -0.74f, 2.83f, -3.02f, 5.44f)
                curveToRelative(-4.94f, 5.63f, -12.35f, 21.39f, -16.17f, 34.38f)
                curveToRelative(-2.19f, 7.45f, -2.78f, 13.5f, -2.95f, 30f)
                curveToRelative(-0.17f, 17.64f, -0.59f, 21.45f, -2.84f, 26f)
                curveToRelative(-3.42f, 6.91f, -6.61f, 7.57f, -8.42f, 1.74f)
                close()
                moveTo(315.31f, 234.32f)
                curveToRelative(-3.69f, -8.06f, -3.79f, -9.02f, -2.61f, -24.99f)
                curveToRelative(1.47f, -19.86f, -4.92f, -43.87f, -16.12f, -60.57f)
                curveToRelative(-3.34f, -4.98f, -5.86f, -9.26f, -5.6f, -9.52f)
                curveToRelative(0.26f, -0.26f, 3.44f, 0.92f, 7.08f, 2.62f)
                curveToRelative(12.38f, 5.77f, 24.44f, 22.32f, 28.76f, 39.47f)
                curveToRelative(4f, 15.87f, -0.19f, 58.69f, -5.84f, 59.76f)
                curveToRelative(-1.74f, 0.33f, -3.23f, -1.46f, -5.66f, -6.77f)
                close()
            }
        }.build()

        return _MuscleMaleLateralDeltoids1!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleLateralDeltoids1: ImageVector? = null