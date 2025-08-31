package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.BicepsFemoris9: ImageVector
    get() {
        if (_MuscleMaleBicepsFemoris9 != null) {
            return _MuscleMaleBicepsFemoris9!!
        }
        _MuscleMaleBicepsFemoris9 = ImageVector.Builder(
            name = "MuscleMaleBicepsFemoris9",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(139.93f, 307.25f)
                curveToRelative(-4.09f, -4.93f, -7.96f, -54.77f, -7.85f, -101.19f)
                curveToRelative(0.09f, -39.21f, 0.91f, -48.21f, 4.66f, -50.95f)
                curveToRelative(3.46f, -2.53f, 4.38f, -2.28f, 8.71f, 2.35f)
                curveToRelative(7.38f, 7.91f, 12.09f, 32.95f, 14f, 74.54f)
                curveToRelative(0.98f, 21.4f, -1.22f, 41.28f, -6.37f, 57.33f)
                curveToRelative(-5.24f, 16.33f, -9.57f, 22.23f, -13.14f, 17.92f)
                close()
            }
        }.build()

        return _MuscleMaleBicepsFemoris9!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleBicepsFemoris9: ImageVector? = null
