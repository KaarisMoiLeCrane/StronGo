package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.Soleus8: ImageVector
    get() {
        if (_MuscleMaleSoleus8 != null) {
            return _MuscleMaleSoleus8!!
        }
        _MuscleMaleSoleus8 = ImageVector.Builder(
            name = "MuscleMaleSoleus8",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(111.62f, 163.99f)
                curveToRelative(-6.62f, -5.2f, -8.3f, -12.94f, -8.13f, -37.32f)
                curveToRelative(0.17f, -24.35f, 2.48f, -42.16f, 7.86f, -60.64f)
                curveToRelative(6.2f, -21.3f, 13.16f, -30.1f, 19.1f, -24.16f)
                curveToRelative(1.83f, 1.83f, 2.19f, 4.87f, 2.08f, 17.17f)
                curveToRelative(-0.14f, 15.06f, -1.62f, 99.47f, -1.78f, 101.23f)
                curveToRelative(-0.05f, 0.52f, -1.4f, 2.17f, -3f, 3.67f)
                curveToRelative(-3.83f, 3.57f, -11.62f, 3.59f, -16.13f, 0.04f)
                close()
                moveTo(224f, 164f)
                curveToRelative(-1.47f, -1.47f, -2.71f, -3.12f, -2.75f, -3.67f)
                curveToRelative(-0.12f, -1.38f, -1.52f, -82.99f, -1.74f, -101.13f)
                curveToRelative(-0.2f, -16.43f, 1f, -19.64f, 7.04f, -18.94f)
                curveToRelative(6.65f, 0.77f, 15.58f, 24.07f, 20.34f, 53.07f)
                curveToRelative(2.26f, 13.76f, 2.29f, 55.21f, 0.05f, 61.54f)
                curveToRelative(-2.92f, 8.23f, -7.22f, 11.8f, -14.21f, 11.8f)
                curveToRelative(-4.29f, 0f, -6.85f, -0.78f, -8.73f, -2.67f)
                close()
            }
        }.build()

        return _MuscleMaleSoleus8!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleSoleus8: ImageVector? = null
