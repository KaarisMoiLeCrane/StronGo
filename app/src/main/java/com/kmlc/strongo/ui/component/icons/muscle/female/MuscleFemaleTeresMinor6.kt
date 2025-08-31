package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.TeresMinor6: ImageVector
    get() {
        if (_MuscleFemaleTeresMinor6 != null) {
            return _MuscleFemaleTeresMinor6!!
        }
        _MuscleFemaleTeresMinor6 = ImageVector.Builder(
            name = "MuscleFemaleTeresMinor6",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(100f, 32f)
                curveTo(98.17f, 30.57f, 96.06f, 29.38f, 95.31f, 29.36f)
                curveTo(94.57f, 29.35f, 91.87f, 28.22f, 89.31f, 26.87f)
                curveTo(86.76f, 25.51f, 81.56f, 23.37f, 77.77f, 22.13f)
                curveTo(73.98f, 20.88f, 70.18f, 19.02f, 69.34f, 18.01f)
                curveTo(67.11f, 15.33f, 68.24f, 9.25f, 71.33f, 7.24f)
                curveTo(73.62f, 5.75f, 75.25f, 6.02f, 82.67f, 9.09f)
                curveTo(96.31f, 14.72f, 114.33f, 34.75f, 105.67f, 34.64f)
                curveTo(104.38f, 34.62f, 101.83f, 33.43f, 100f, 32f)
                close()
                moveTo(234.67f, 32.22f)
                curveToRelative(0f, -1.34f, 3.75f, -6.29f, 8.33f, -11f)
                curveToRelative(6.24f, -6.41f, 10.51f, -9.45f, 17f, -12.14f)
                curveToRelative(7.42f, -3.07f, 9.05f, -3.33f, 11.33f, -1.85f)
                curveToRelative(3.09f, 2.01f, 4.22f, 8.09f, 1.99f, 10.77f)
                curveToRelative(-0.84f, 1.02f, -4.64f, 2.87f, -8.43f, 4.12f)
                curveToRelative(-3.79f, 1.25f, -8.99f, 3.38f, -11.54f, 4.74f)
                curveToRelative(-2.56f, 1.36f, -5.26f, 2.48f, -6f, 2.5f)
                curveToRelative(-0.74f, 0.02f, -2.85f, 1.2f, -4.69f, 2.64f)
                curveToRelative(-4.25f, 3.33f, -8f, 3.43f, -8f, 0.22f)
                close()
            }
        }.build()

        return _MuscleFemaleTeresMinor6!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleTeresMinor6: ImageVector? = null
