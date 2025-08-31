package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.GlutesMedius7: ImageVector
    get() {
        if (_MuscleMaleGlutesMedius7 != null) {
            return _MuscleMaleGlutesMedius7!!
        }
        _MuscleMaleGlutesMedius7 = ImageVector.Builder(
            name = "MuscleMaleGlutesMedius7",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(89.38f, 114.75f)
                curveToRelative(-2.11f, -3.95f, -1.65f, -30.89f, 0.73f, -42.4f)
                curveToRelative(1.16f, -5.61f, 3.53f, -13.02f, 5.28f, -16.46f)
                curveToRelative(5.38f, -10.62f, 17.17f, -18.59f, 27.43f, -18.55f)
                curveToRelative(8.56f, 0.04f, 27.85f, 13.81f, 27.85f, 19.89f)
                curveToRelative(0f, 3.21f, -2.86f, 6.13f, -9.17f, 9.35f)
                curveToRelative(-6.25f, 3.19f, -15.14f, 12.71f, -23.73f, 25.42f)
                curveToRelative(-8.6f, 12.72f, -20.68f, 25.33f, -24.27f, 25.33f)
                curveToRelative(-1.5f, 0f, -3.36f, -1.16f, -4.12f, -2.58f)
                close()
                moveTo(243.76f, 109.67f)
                curveTo(239.72f, 105.45f, 232.06f, 95.84f, 226.75f, 88.3f)
                curveTo(217.66f, 75.41f, 211.09f, 69.03f, 201.46f, 63.73f)
                curveToRelative(-2.92f, -1.61f, -4.13f, -3.25f, -4.13f, -5.62f)
                curveToRelative(0f, -8.36f, 20.24f, -21.95f, 30.26f, -20.32f)
                curveToRelative(12.75f, 2.07f, 21.96f, 10.65f, 27.07f, 25.19f)
                curveToRelative(4.77f, 13.59f, 6.62f, 43.34f, 3.24f, 52.14f)
                curveToRelative(-1.66f, 4.32f, -6.59f, 2.42f, -14.14f, -5.44f)
                close()
            }
        }.build()

        return _MuscleMaleGlutesMedius7!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleGlutesMedius7: ImageVector? = null
