package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.AnteriorDeltoids1: ImageVector
    get() {
        if (_MuscleFemaleAnteriorDeltoids1 != null) {
            return _MuscleFemaleAnteriorDeltoids1!!
        }
        _MuscleFemaleAnteriorDeltoids1 = ImageVector.Builder(
            name = "MuscleFemaleAnteriorDeltoids1",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(63.82f, 207f)
                curveTo(62.08f, 202.6f, 64.31f, 179.44f, 67.58f, 168f)
                curveToRelative(3.19f, -11.17f, 9.76f, -23.73f, 14.65f, -28.03f)
                curveToRelative(2.42f, -2.12f, 6.93f, -4.54f, 10.02f, -5.38f)
                curveToRelative(7.53f, -2.03f, 21.46f, -0.52f, 24.31f, 2.63f)
                curveToRelative(2.01f, 2.22f, 1.78f, 2.62f, -3.54f, 6.15f)
                curveToRelative(-17.8f, 11.78f, -35.06f, 36.44f, -43.59f, 62.3f)
                curveToRelative(-1.96f, 5.93f, -3.65f, 6.33f, -5.62f, 1.33f)
                close()
                moveTo(278.5f, 203f)
                curveToRelative(-0.79f, -2.02f, -2.23f, -5.77f, -3.19f, -8.33f)
                curveToRelative(-0.97f, -2.57f, -3.46f, -7.79f, -5.53f, -11.61f)
                curveToRelative(-11.85f, -21.82f, -19.04f, -30.88f, -30.56f, -38.53f)
                curveToRelative(-9.07f, -6.02f, -9.68f, -7.05f, -5.94f, -10.08f)
                curveToRelative(3.91f, -3.16f, 20.93f, -3.45f, 26.73f, -0.45f)
                curveToRelative(7.06f, 3.65f, 13.31f, 14.04f, 19.27f, 32.03f)
                curveToRelative(5.16f, 15.58f, 6.4f, 40.64f, 2.01f, 40.64f)
                curveToRelative(-0.74f, 0f, -1.99f, -1.65f, -2.78f, -3.67f)
                close()
            }
        }.build()

        return _MuscleFemaleAnteriorDeltoids1!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleAnteriorDeltoids1: ImageVector? = null
