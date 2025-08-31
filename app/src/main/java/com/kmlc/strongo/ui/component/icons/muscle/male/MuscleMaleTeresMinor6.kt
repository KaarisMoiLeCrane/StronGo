package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.TeresMinor6: ImageVector
    get() {
        if (_MuscleMaleTeresMinor6 != null) {
            return _MuscleMaleTeresMinor6!!
        }
        _MuscleMaleTeresMinor6 = ImageVector.Builder(
            name = "MuscleMaleTeresMinor6",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(88.43f, 56.66f)
                curveToRelative(-3.06f, -1.85f, -11.76f, -5.83f, -19.33f, -8.85f)
                curveToRelative(-7.57f, -3.02f, -14.51f, -6.08f, -15.43f, -6.81f)
                curveToRelative(-0.92f, -0.73f, -1.67f, -3.64f, -1.67f, -6.47f)
                curveToRelative(0f, -7f, 4.15f, -9.94f, 10.78f, -7.63f)
                curveToRelative(11.58f, 4.02f, 20.73f, 10.23f, 28.97f, 19.65f)
                curveToRelative(4.63f, 5.29f, 8.18f, 10.33f, 7.9f, 11.2f)
                curveToRelative(-0.92f, 2.81f, -5.51f, 2.36f, -11.21f, -1.09f)
                close()
                moveTo(254.01f, 58.68f)
                curveToRelative(-1.13f, -1.83f, 0.17f, -3.83f, 8.9f, -13.7f)
                curveToRelative(5.8f, -6.56f, 9.85f, -9.67f, 17.33f, -13.27f)
                curveToRelative(13.47f, -6.5f, 14.37f, -6.72f, 17.95f, -4.37f)
                curveToRelative(2.4f, 1.58f, 3.15f, 3.27f, 3.15f, 7.2f)
                curveToRelative(0f, 2.83f, -0.75f, 5.74f, -1.67f, 6.47f)
                curveToRelative(-0.92f, 0.73f, -7.37f, 3.57f, -14.33f, 6.31f)
                curveToRelative(-6.97f, 2.74f, -15.74f, 6.71f, -19.5f, 8.83f)
                curveToRelative(-7.16f, 4.03f, -10.46f, 4.74f, -11.83f, 2.53f)
                close()
            }
        }.build()

        return _MuscleMaleTeresMinor6!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleTeresMinor6: ImageVector? = null
