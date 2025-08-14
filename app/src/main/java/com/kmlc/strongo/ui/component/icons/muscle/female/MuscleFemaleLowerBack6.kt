package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.LowerBack6: ImageVector
    get() {
        if (_MuscleFemaleLowerBack6 != null) {
            return _MuscleFemaleLowerBack6!!
        }
        _MuscleFemaleLowerBack6 = ImageVector.Builder(
            name = "Female.MuscleFemaleLowerBack6",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(158.3f, 259.47f)
                curveToRelative(-3.63f, -5.75f, -10.5f, -12.54f, -19.97f, -19.77f)
                curveToRelative(-7.91f, -6.03f, -8.36f, -17.93f, -0.83f, -22.17f)
                curveToRelative(2.14f, -1.21f, 5.14f, -4.77f, 6.68f, -7.93f)
                curveToRelative(3.06f, -6.29f, 9.23f, -26.3f, 12.61f, -40.93f)
                curveToRelative(2.3f, -9.97f, 4.89f, -14.19f, 7.24f, -11.84f)
                curveToRelative(1.77f, 1.77f, 3.35f, 95.15f, 1.73f, 102.41f)
                curveToRelative(-0.64f, 2.88f, -1.75f, 5.43f, -2.46f, 5.66f)
                curveToRelative(-0.71f, 0.24f, -2.96f, -2.21f, -5f, -5.43f)
                close()
                moveTo(181.69f, 261.67f)
                curveToRelative(-0.56f, -2.02f, -1.03f, -26.46f, -1.03f, -54.31f)
                curveToRelative(0f, -46.59f, 0.18f, -50.68f, 2.26f, -51.08f)
                curveToRelative(1.8f, -0.35f, 2.98f, 1.97f, 5.73f, 11.31f)
                curveToRelative(12.6f, 42.71f, 13.93f, 45.99f, 20.07f, 49.61f)
                curveToRelative(3.25f, 1.92f, 4.68f, 3.9f, 5.34f, 7.37f)
                curveToRelative(1.69f, 8.99f, 0.25f, 11.47f, -11.72f, 20.23f)
                curveToRelative(-3.47f, 2.55f, -8.75f, 8.21f, -11.72f, 12.58f)
                curveToRelative(-2.97f, 4.37f, -5.97f, 7.95f, -6.66f, 7.95f)
                curveToRelative(-0.69f, 0f, -1.72f, -1.65f, -2.28f, -3.67f)
                close()
            }
        }.build()

        return _MuscleFemaleLowerBack6!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleLowerBack6: ImageVector? = null
