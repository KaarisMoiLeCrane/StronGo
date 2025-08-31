package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.Infraspinatus6: ImageVector
    get() {
        if (_MuscleFemaleInfraspinatus6 != null) {
            return _MuscleFemaleInfraspinatus6!!
        }
        _MuscleFemaleInfraspinatus6 = ImageVector.Builder(
            name = "MuscleFemaleInfraspinatus6",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(84.24f, 62.27f)
                curveTo(80.09f, 57.83f, 75.85f, 43.89f, 75.56f, 33.76f)
                curveTo(75.35f, 26.29f, 75.7f, 25.14f, 79.29f, 21.38f)
                curveTo(84.81f, 15.62f, 96.37f, 10.14f, 100.73f, 11.23f)
                lineToRelative(3.43f, 0.86f)
                lineToRelative(-0.51f, 23.35f)
                curveTo(103.07f, 61.89f, 102.44f, 63.58f, 92.53f, 64.89f)
                curveTo(88.21f, 65.46f, 86.81f, 65.02f, 84.24f, 62.27f)
                close()
                moveTo(244.73f, 62.33f)
                curveToRelative(-3.36f, -2.95f, -3.43f, -3.38f, -4.2f, -26.54f)
                curveToRelative(-0.76f, -23.05f, -0.72f, -23.56f, 2.01f, -24.42f)
                curveToRelative(3.7f, -1.17f, 7.37f, 0.09f, 15.73f, 5.42f)
                curveToRelative(8.97f, 5.72f, 11.42f, 10.37f, 10.3f, 19.56f)
                curveToRelative(-1.17f, 9.59f, -4.06f, 19.47f, -7.22f, 24.65f)
                curveToRelative(-2.27f, 3.71f, -3.4f, 4.33f, -7.92f, 4.33f)
                curveToRelative(-3.57f, 0f, -6.38f, -0.97f, -8.7f, -3f)
                close()
            }
        }.build()

        return _MuscleFemaleInfraspinatus6!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleInfraspinatus6: ImageVector? = null
