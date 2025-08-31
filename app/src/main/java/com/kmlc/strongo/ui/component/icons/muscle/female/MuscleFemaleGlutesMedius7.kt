package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.GlutesMedius7: ImageVector
    get() {
        if (_MuscleFemaleGlutesMedius7 != null) {
            return _MuscleFemaleGlutesMedius7!!
        }
        _MuscleFemaleGlutesMedius7 = ImageVector.Builder(
            name = "MuscleFemaleGlutesMedius7",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(84.97f, 110.49f)
                curveToRelative(-2.95f, -1.65f, -3.05f, -11.37f, -0.3f, -29.82f)
                curveToRelative(3.76f, -25.24f, 8.98f, -37.53f, 18.48f, -43.53f)
                curveToRelative(11.52f, -7.27f, 42.21f, 5.57f, 45.53f, 19.04f)
                curveToRelative(0.75f, 3.04f, 0f, 4.19f, -5.57f, 8.62f)
                curveToRelative(-3.54f, 2.81f, -13.64f, 12.41f, -22.44f, 21.33f)
                curveToRelative(-8.8f, 8.92f, -17.92f, 17.5f, -20.26f, 19.08f)
                curveToRelative(-7.05f, 4.74f, -12.85f, 6.73f, -15.44f, 5.28f)
                close()
                moveTo(250f, 107.18f)
                curveToRelative(-7.47f, -4.99f, -11.37f, -8.71f, -10.55f, -10.04f)
                curveToRelative(0.39f, -0.63f, -0.13f, -1.14f, -1.16f, -1.14f)
                curveToRelative(-1.02f, 0f, -7.28f, -5.64f, -13.9f, -12.54f)
                curveToRelative(-6.62f, -6.9f, -15.12f, -14.75f, -18.88f, -17.46f)
                curveToRelative(-5.68f, -4.08f, -6.85f, -5.62f, -6.85f, -9f)
                curveToRelative(0f, -12.05f, 31.38f, -26.86f, 43.57f, -20.56f)
                curveToRelative(6.93f, 3.58f, 12.09f, 10.83f, 15.57f, 21.86f)
                curveToRelative(4.02f, 12.75f, 7.84f, 36.39f, 7.28f, 45.1f)
                curveToRelative(-0.41f, 6.34f, -0.51f, 6.49f, -5.08f, 6.91f)
                curveToRelative(-3.35f, 0.31f, -6.18f, -0.58f, -10f, -3.13f)
                close()
            }
        }.build()

        return _MuscleFemaleGlutesMedius7!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleGlutesMedius7: ImageVector? = null
