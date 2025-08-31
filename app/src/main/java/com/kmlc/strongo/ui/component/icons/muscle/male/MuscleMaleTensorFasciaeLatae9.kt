package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.TensorFasciaeLatae9: ImageVector
    get() {
        if (_MuscleMaleTensorFasciaeLatae9 != null) {
            return _MuscleMaleTensorFasciaeLatae9!!
        }
        _MuscleMaleTensorFasciaeLatae9 = ImageVector.Builder(
            name = "MuscleMaleTensorFasciaeLatae9",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(198.18f, 123.9f)
                curveToRelative(-4.26f, -3.35f, -4.35f, -5.72f, -0.85f, -22.57f)
                curveToRelative(1.92f, -9.23f, 2.64f, -17.98f, 2.65f, -32.27f)
                curveToRelative(0.02f, -19.17f, 0.91f, -26.56f, 4.9f, -40.73f)
                lineToRelative(1.97f, -7f)
                horizontalLineToRelative(5.81f)
                curveToRelative(8.93f, 0f, 9.59f, 1.35f, 10.69f, 21.9f)
                curveToRelative(0.53f, 9.9f, 0.58f, 20.27f, 0.12f, 23.04f)
                curveToRelative(-0.46f, 2.78f, -2.03f, 11.95f, -3.49f, 20.38f)
                curveToRelative(-1.46f, 8.43f, -3f, 18.82f, -3.42f, 23.07f)
                curveToRelative(-0.6f, 6.06f, -1.65f, 8.74f, -4.81f, 12.33f)
                curveToRelative(-4.66f, 5.3f, -8.5f, 5.82f, -13.58f, 1.83f)
                close()
            }
        }.build()

        return _MuscleMaleTensorFasciaeLatae9!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleTensorFasciaeLatae9: ImageVector? = null
