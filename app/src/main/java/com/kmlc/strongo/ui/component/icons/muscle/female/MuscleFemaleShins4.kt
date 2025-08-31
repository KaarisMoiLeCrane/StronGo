package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.Shins4: ImageVector
    get() {
        if (_MuscleFemaleShins4 != null) {
            return _MuscleFemaleShins4!!
        }
        _MuscleFemaleShins4 = ImageVector.Builder(
            name = "MuscleFemaleShins4",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(136.23f, 241.67f)
                curveToRelative(-1.85f, -1.58f, -4f, -7.31f, -6.63f, -17.67f)
                curveToRelative(-2.14f, -8.43f, -7.83f, -28.23f, -12.63f, -44f)
                curveToRelative(-4.8f, -15.77f, -9.66f, -33.17f, -10.79f, -38.67f)
                curveToRelative(-6.03f, -29.39f, -6.06f, -54.31f, -0.09f, -80.93f)
                curveToRelative(7.49f, -33.41f, 12.31f, -38.41f, 20.49f, -21.26f)
                curveToRelative(3.84f, 8.04f, 8.09f, 25.72f, 10.62f, 44.19f)
                curveToRelative(0.7f, 5.13f, 1.65f, 27.93f, 2.09f, 50.66f)
                curveToRelative(0.84f, 42.99f, 2.53f, 72.27f, 5.24f, 90.92f)
                curveToRelative(1.58f, 10.87f, 0.94f, 15.99f, -2.26f, 18.02f)
                curveToRelative(-2.31f, 1.47f, -2.99f, 1.32f, -6.04f, -1.28f)
                close()
                moveTo(210.02f, 240.88f)
                curveToRelative(-1.75f, -2.67f, -1.83f, -4.91f, -0.55f, -15.67f)
                curveToRelative(0.82f, -6.9f, 1.96f, -43.45f, 2.53f, -81.22f)
                curveToRelative(1.05f, -68.81f, 1.65f, -77.53f, 6.65f, -95.99f)
                curveToRelative(2.19f, -8.08f, 6.17f, -15.64f, 9.05f, -17.18f)
                curveToRelative(4.44f, -2.38f, 6.77f, 0.87f, 11.64f, 16.22f)
                curveToRelative(6.89f, 21.7f, 9.13f, 35.89f, 9.1f, 57.62f)
                curveToRelative(-0.03f, 23.66f, -2.96f, 40.49f, -14.26f, 82f)
                curveToRelative(-4.69f, 17.23f, -9.58f, 36.06f, -10.86f, 41.84f)
                curveToRelative(-3.19f, 14.36f, -8.67f, 19.45f, -13.3f, 12.38f)
                close()
            }
        }.build()

        return _MuscleFemaleShins4!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleShins4: ImageVector? = null
