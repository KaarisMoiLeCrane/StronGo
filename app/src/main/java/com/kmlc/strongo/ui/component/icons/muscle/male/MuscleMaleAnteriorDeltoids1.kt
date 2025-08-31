package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.AnteriorDeltoids1: ImageVector
    get() {
        if (_MuscleMaleAnteriorDeltoids1 != null) {
            return _MuscleMaleAnteriorDeltoids1!!
        }
        _MuscleMaleAnteriorDeltoids1 = ImageVector.Builder(
            name = "MuscleMaleAnteriorDeltoids1",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(40.53f, 216.31f)
                curveToRelative(-3.92f, -2.61f, -4.72f, -7.01f, -3.18f, -17.38f)
                curveToRelative(3.65f, -24.58f, 11.38f, -44.66f, 21.32f, -55.45f)
                curveToRelative(7.8f, -8.46f, 14.73f, -10.83f, 31.32f, -10.72f)
                curveToRelative(21.17f, 0.14f, 27.1f, 4.71f, 14.54f, 11.2f)
                curveToRelative(-21.31f, 11.01f, -38.73f, 30.41f, -53.21f, 59.26f)
                curveToRelative(-6.66f, 13.26f, -8.04f, 14.93f, -10.8f, 13.09f)
                close()
                moveTo(303.33f, 212.46f)
                curveToRelative(-1.1f, -2.63f, -2f, -5.22f, -2f, -5.75f)
                curveToRelative(0f, -0.53f, -2.4f, -4.68f, -5.33f, -9.22f)
                curveToRelative(-2.93f, -4.54f, -5.33f, -8.52f, -5.33f, -8.85f)
                curveToRelative(0f, -0.33f, -3.91f, -5.67f, -8.7f, -11.87f)
                curveToRelative(-10.83f, -14.03f, -18.11f, -20.49f, -32.94f, -29.24f)
                curveToRelative(-6.4f, -3.78f, -11.65f, -7.2f, -11.67f, -7.61f)
                curveToRelative(-0.02f, -0.41f, 0.75f, -1.82f, 1.71f, -3.13f)
                curveToRelative(3.17f, -4.34f, 23.12f, -6.21f, 35.56f, -3.35f)
                curveToRelative(8.18f, 1.89f, 13.31f, 6.16f, 20.51f, 17.09f)
                curveToRelative(8.55f, 12.97f, 12.48f, 25.13f, 15.49f, 47.85f)
                curveToRelative(1.92f, 14.5f, -3.1f, 24.16f, -7.31f, 14.07f)
                close()
            }
        }.build()

        return _MuscleMaleAnteriorDeltoids1!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleAnteriorDeltoids1: ImageVector? = null
