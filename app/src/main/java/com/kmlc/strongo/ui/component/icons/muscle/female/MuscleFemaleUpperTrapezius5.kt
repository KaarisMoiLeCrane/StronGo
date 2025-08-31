package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.UpperTrapezius5: ImageVector
    get() {
        if (_MuscleFemaleUpperTrapezius5 != null) {
            return _MuscleFemaleUpperTrapezius5!!
        }
        _MuscleFemaleUpperTrapezius5 = ImageVector.Builder(
            name = "MuscleFemaleUpperTrapezius5",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(114.67f, 139.16f)
                curveToRelative(0f, -3.05f, 5.2f, -7.19f, 18.17f, -14.47f)
                curveToRelative(6.13f, -3.44f, 11.6f, -6.96f, 12.15f, -7.81f)
                curveToRelative(2.23f, -3.45f, 4.18f, -16.98f, 4.26f, -29.61f)
                curveToRelative(0.05f, -8.54f, 0.67f, -13.98f, 1.69f, -15f)
                curveToRelative(2.45f, -2.45f, 13.72f, -2.03f, 15.9f, 0.61f)
                curveToRelative(1.44f, 1.74f, 1.75f, 7.81f, 1.47f, 28.81f)
                curveToRelative(-0.43f, 31.99f, 0.52f, 30.36f, -19.15f, 32.81f)
                curveToRelative(-7.23f, 0.9f, -16.6f, 2.8f, -20.82f, 4.21f)
                curveToRelative(-9.59f, 3.21f, -13.67f, 3.35f, -13.67f, 0.45f)
                close()
                moveTo(214.3f, 139.3f)
                curveToRelative(-2.77f, -1.02f, -11.47f, -2.82f, -19.33f, -4.01f)
                curveToRelative(-7.86f, -1.19f, -15.57f, -2.41f, -17.13f, -2.71f)
                curveToRelative(-4.54f, -0.87f, -6f, -6.72f, -5.65f, -22.68f)
                curveToRelative(0.18f, -8.01f, 0.12f, -19.2f, -0.13f, -24.86f)
                curveToRelative(-0.56f, -12.69f, 0.55f, -14.38f, 9.39f, -14.38f)
                curveToRelative(7.79f, 0f, 9.22f, 1.9f, 9.22f, 12.25f)
                curveToRelative(0f, 9.43f, 2.63f, 30.51f, 4.15f, 33.37f)
                curveToRelative(0.67f, 1.25f, 6.46f, 4.99f, 12.86f, 8.31f)
                curveToRelative(12.3f, 6.36f, 18.98f, 11.57f, 18.98f, 14.8f)
                curveToRelative(0f, 2.46f, -5.53f, 2.42f, -12.37f, -0.09f)
                close()
            }
        }.build()

        return _MuscleFemaleUpperTrapezius5!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleUpperTrapezius5: ImageVector? = null
