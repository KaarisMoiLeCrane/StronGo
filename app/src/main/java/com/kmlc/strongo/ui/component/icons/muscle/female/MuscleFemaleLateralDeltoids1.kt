package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.LateralDeltoids1: ImageVector
    get() {
        if (_MuscleFemaleLateralDeltoids1 != null) {
            return _MuscleFemaleLateralDeltoids1!!
        }
        _MuscleFemaleLateralDeltoids1 = ImageVector.Builder(
            name = "MuscleFemaleLateralDeltoids1",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(52.56f, 223f)
                curveToRelative(-0.45f, -2.02f, -1.44f, -6.07f, -2.19f, -9f)
                curveToRelative(-0.75f, -2.93f, -1.38f, -12.53f, -1.4f, -21.33f)
                curveToRelative(-0.03f, -14.2f, 0.38f, -17.13f, 3.65f, -26f)
                curveToRelative(3.52f, -9.59f, 6.83f, -15.09f, 13.14f, -21.83f)
                curveToRelative(3.41f, -3.65f, 10.47f, -7.5f, 13.75f, -7.5f)
                curveToRelative(2.04f, 0f, 1.99f, 0.34f, -0.46f, 3f)
                curveToRelative(-1.51f, 1.65f, -4.54f, 6.6f, -6.71f, 11f)
                curveToRelative(-7.87f, 15.9f, -11.34f, 32.61f, -10.83f, 52.07f)
                curveToRelative(0.26f, 9.98f, -0.19f, 14.5f, -1.84f, 18.26f)
                curveToRelative(-2.58f, 5.89f, -5.93f, 6.52f, -7.1f, 1.33f)
                close()
                moveTo(288.58f, 216.33f)
                curveToRelative(-1.4f, -2.94f, -2.34f, -7.75f, -2.26f, -11.67f)
                curveToRelative(0.24f, -12.38f, -2.24f, -30.64f, -5.43f, -40.01f)
                curveToRelative(-3.53f, -10.37f, -10.75f, -25.34f, -12.86f, -26.64f)
                curveToRelative(-0.75f, -0.46f, -1.36f, -1.72f, -1.36f, -2.79f)
                curveToRelative(0f, -3.22f, 9.28f, 2.3f, 15.84f, 9.42f)
                curveToRelative(6.65f, 7.22f, 11.36f, 17.08f, 13.39f, 28.06f)
                curveToRelative(2.96f, 15.99f, 0.8f, 48.62f, -3.21f, 48.62f)
                curveToRelative(-0.94f, 0f, -2.79f, -2.25f, -4.1f, -5f)
                close()
            }
        }.build()

        return _MuscleFemaleLateralDeltoids1!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleLateralDeltoids1: ImageVector? = null
