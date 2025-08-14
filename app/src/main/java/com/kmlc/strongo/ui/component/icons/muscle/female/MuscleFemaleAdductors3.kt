package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.Adductors3: ImageVector
    get() {
        if (_MuscleFemaleAdductors3 != null) {
            return _MuscleFemaleAdductors3!!
        }
        _MuscleFemaleAdductors3 = ImageVector.Builder(
            name = "Female.MuscleFemaleAdductors3",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(195.08f, 328.21f)
                curveToRelative(-2.85f, -1.85f, -4.19f, -6.78f, -6.26f, -22.88f)
                curveToRelative(-7.32f, -57.1f, -11f, -138.64f, -6.75f, -149.7f)
                curveToRelative(3.4f, -8.87f, 8.78f, 7.64f, 19.21f, 59.03f)
                curveToRelative(7.62f, 37.52f, 9.79f, 54.17f, 9.93f, 76f)
                curveToRelative(0.11f, 17.56f, -0.17f, 19.97f, -3f, 26.24f)
                curveToRelative(-4.02f, 8.9f, -9.53f, 13.65f, -13.13f, 11.31f)
                close()
                moveTo(152.33f, 324.63f)
                curveTo(138.73f, 315.04f, 137.72f, 275.99f, 149.23f, 205.08f)
                curveTo(155.89f, 164.08f, 158.94f, 152f, 162.65f, 152f)
                curveToRelative(3.79f, 0f, 4.64f, 12.06f, 4.66f, 66.67f)
                curveToRelative(0.02f, 55.35f, -1.82f, 92.57f, -5.09f, 102.57f)
                curveToRelative(-1.78f, 5.46f, -5.26f, 6.66f, -9.9f, 3.39f)
                close()
            }
        }.build()

        return _MuscleFemaleAdductors3!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleAdductors3: ImageVector? = null
