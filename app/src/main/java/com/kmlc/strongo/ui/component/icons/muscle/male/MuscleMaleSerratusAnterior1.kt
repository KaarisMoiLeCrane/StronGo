package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.SerratusAnterior1: ImageVector
    get() {
        if (_MuscleMaleSerratusAnterior1 != null) {
            return _MuscleMaleSerratusAnterior1!!
        }
        _MuscleMaleSerratusAnterior1 = ImageVector.Builder(
            name = "MuscleMaleSerratusAnterior1",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(87.07f, 309.04f)
                curveToRelative(-5.55f, -6.01f, -8.94f, -13.74f, -10.12f, -23.04f)
                curveToRelative(-1.72f, -13.65f, -2.51f, -43.72f, -1.2f, -45.72f)
                curveToRelative(0.88f, -1.34f, 2.29f, -1.06f, 6.49f, 1.33f)
                curveToRelative(5.92f, 3.37f, 17.7f, 13.14f, 17.73f, 14.72f)
                curveToRelative(0.01f, 0.55f, -2.03f, 1f, -4.53f, 1f)
                curveToRelative(-5.45f, 0f, -5.52f, 1.57f, -0.38f, 9.42f)
                curveToRelative(4.55f, 6.94f, 4.5f, 7.92f, -0.33f, 7.92f)
                horizontalLineToRelative(-3.93f)
                lineToRelative(3.22f, 7.04f)
                curveToRelative(4.2f, 9.17f, 4.77f, 13.76f, 1.64f, 13.24f)
                curveToRelative(-2.03f, -0.34f, -2.28f, 0.66f, -2f, 7.98f)
                curveToRelative(0.37f, 9.52f, -1.7f, 11.44f, -6.61f, 6.12f)
                close()
                moveTo(254.38f, 311.27f)
                curveToRelative(-0.4f, -0.4f, -0.48f, -4.33f, -0.18f, -8.73f)
                curveToRelative(0.49f, -7.1f, 0.28f, -7.96f, -1.82f, -7.6f)
                curveToRelative(-3.18f, 0.54f, -2.64f, -3.99f, 1.59f, -13.22f)
                lineToRelative(3.22f, -7.04f)
                horizontalLineToRelative(-3.93f)
                curveToRelative(-4.84f, 0f, -4.88f, -0.97f, -0.33f, -7.92f)
                curveToRelative(5.14f, -7.85f, 5.07f, -9.42f, -0.38f, -9.42f)
                curveToRelative(-2.5f, 0f, -4.54f, -0.45f, -4.53f, -1f)
                curveToRelative(0.03f, -1.57f, 11.81f, -11.35f, 17.73f, -14.72f)
                curveToRelative(4.2f, -2.39f, 5.61f, -2.68f, 6.49f, -1.33f)
                curveToRelative(1.31f, 1.99f, 0.52f, 32.07f, -1.2f, 45.72f)
                curveToRelative(-1.8f, 14.27f, -12.08f, 29.85f, -16.66f, 25.27f)
                close()
            }
        }.build()

        return _MuscleMaleSerratusAnterior1!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleSerratusAnterior1: ImageVector? = null
