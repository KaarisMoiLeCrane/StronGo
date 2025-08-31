package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.Supraspinatus1: ImageVector
    get() {
        if (_MuscleFemaleSupraspinatus1 != null) {
            return _MuscleFemaleSupraspinatus1!!
        }
        _MuscleFemaleSupraspinatus1 = ImageVector.Builder(
            name = "MuscleFemaleSupraspinatus1",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(109.67f, 156.59f)
                curveToRelative(-8.01f, -2.24f, -16.61f, -5.04f, -19.12f, -6.22f)
                curveToRelative(-2.5f, -1.18f, -8.3f, -2.91f, -12.88f, -3.85f)
                curveToRelative(-4.58f, -0.94f, -8.33f, -2.41f, -8.33f, -3.27f)
                curveToRelative(0f, -1.95f, 9.73f, -3.08f, 34f, -3.93f)
                curveToRelative(10.27f, -0.36f, 21.13f, -1.31f, 24.14f, -2.1f)
                curveToRelative(9.04f, -2.39f, 11.5f, -1.4f, 13.54f, 5.46f)
                curveToRelative(2.44f, 8.21f, 0.45f, 15.3f, -4.69f, 16.74f)
                curveToRelative(-6.65f, 1.86f, -11.94f, 1.3f, -26.66f, -2.82f)
                close()
                moveTo(209.83f, 158.69f)
                curveToRelative(-4.58f, -1.85f, -5.41f, -10.17f, -1.92f, -19.21f)
                curveToRelative(1.48f, -3.84f, 1.53f, -3.85f, 9.79f, -2.9f)
                curveToRelative(4.56f, 0.53f, 18.2f, 1.12f, 30.3f, 1.32f)
                curveToRelative(12.1f, 0.2f, 23.95f, 0.45f, 26.33f, 0.56f)
                curveToRelative(6.95f, 0.32f, 5.2f, 3.47f, -2.87f, 5.16f)
                curveToRelative(-3.96f, 0.83f, -10.47f, 3.01f, -14.47f, 4.83f)
                curveToRelative(-11.3f, 5.17f, -32.98f, 11.55f, -38.94f, 11.46f)
                curveToRelative(-2.96f, -0.05f, -6.66f, -0.6f, -8.22f, -1.23f)
                close()
            }
        }.build()

        return _MuscleFemaleSupraspinatus1!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleSupraspinatus1: ImageVector? = null
