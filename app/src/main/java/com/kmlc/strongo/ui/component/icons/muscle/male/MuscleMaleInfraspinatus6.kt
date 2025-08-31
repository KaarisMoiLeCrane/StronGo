package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.Infraspinatus6: ImageVector
    get() {
        if (_MuscleMaleInfraspinatus6 != null) {
            return _MuscleMaleInfraspinatus6!!
        }
        _MuscleMaleInfraspinatus6 = ImageVector.Builder(
            name = "MuscleMaleInfraspinatus6",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(77.29f, 66.55f)
                curveTo(71f, 64.23f, 62.92f, 48.49f, 64.59f, 41.81f)
                curveTo(65.63f, 37.7f, 76.5f, 25.84f, 81.69f, 23.15f)
                curveToRelative(4.56f, -2.36f, 8.74f, -1.28f, 10.21f, 2.63f)
                curveToRelative(0.59f, 1.59f, 1.49f, 6.49f, 2f, 10.89f)
                curveToRelative(0.5f, 4.4f, 1.8f, 11.16f, 2.89f, 15.01f)
                curveToRelative(2.42f, 8.62f, 1.31f, 11.2f, -6.1f, 14.16f)
                curveToRelative(-6.01f, 2.4f, -8.43f, 2.53f, -13.39f, 0.71f)
                close()
                moveTo(260.31f, 65.79f)
                curveToRelative(-5.56f, -2.74f, -6.25f, -5.77f, -3.73f, -16.46f)
                curveToRelative(1.12f, -4.77f, 2.05f, -10.46f, 2.07f, -12.66f)
                curveToRelative(0.05f, -6.81f, 2.59f, -13.79f, 5.34f, -14.66f)
                curveToRelative(6.7f, -2.13f, 24.01f, 13.97f, 24.01f, 22.32f)
                curveToRelative(0f, 5.57f, -6.21f, 17.84f, -10.62f, 20.98f)
                curveToRelative(-4.54f, 3.23f, -11.12f, 3.42f, -17.06f, 0.49f)
                close()
            }
        }.build()

        return _MuscleMaleInfraspinatus6!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleInfraspinatus6: ImageVector? = null
