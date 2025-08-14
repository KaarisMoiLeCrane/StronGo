package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.Abductors3: ImageVector
    get() {
        if (_MuscleFemaleAbductors3 != null) {
            return _MuscleFemaleAbductors3!!
        }
        _MuscleFemaleAbductors3 = ImageVector.Builder(
            name = "Female.MuscleFemaleAbductors3",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(89.11f, 99.95f)
                curveToRelative(-1.22f, -0.71f, -3.24f, -3.96f, -4.48f, -7.22f)
                curveToRelative(-1.86f, -4.86f, -2.01f, -7.06f, -0.85f, -12.33f)
                curveToRelative(0.78f, -3.53f, 1.8f, -11.21f, 2.27f, -17.08f)
                curveToRelative(1.03f, -12.89f, 3.84f, -27.09f, 5.73f, -28.98f)
                curveToRelative(3.83f, -3.83f, 8.63f, 3.77f, 11.23f, 17.75f)
                curveToRelative(1.14f, 6.11f, 1.01f, 8.82f, -0.67f, 14.06f)
                curveToRelative(-1.14f, 3.57f, -2.49f, 11.59f, -3f, 17.83f)
                curveToRelative(-1.22f, 15.06f, -4.09f, 19.54f, -10.23f, 15.95f)
                close()
                moveTo(246.69f, 97.38f)
                curveTo(245.92f, 95.94f, 244.66f, 89.79f, 243.89f, 83.71f)
                curveTo(243.12f, 77.64f, 241.63f, 70.4f, 240.58f, 67.64f)
                curveToRelative(-2.47f, -6.51f, -2.44f, -17.39f, 0.09f, -25.9f)
                curveToRelative(3.44f, -11.58f, 8.34f, -12.41f, 11.34f, -1.92f)
                curveToRelative(2.4f, 8.37f, 7.23f, 39.21f, 7.28f, 46.42f)
                curveToRelative(0.04f, 5.5f, -0.61f, 7.59f, -3.19f, 10.33f)
                curveToRelative(-3.86f, 4.1f, -7.48f, 4.42f, -9.41f, 0.82f)
                close()
            }
        }.build()

        return _MuscleFemaleAbductors3!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleAbductors3: ImageVector? = null
