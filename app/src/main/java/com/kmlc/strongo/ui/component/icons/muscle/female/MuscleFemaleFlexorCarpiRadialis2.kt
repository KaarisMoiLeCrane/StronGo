package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.FlexorCarpiRadialis2: ImageVector
    get() {
        if (_MuscleFemaleFlexorCarpiRadialis2 != null) {
            return _MuscleFemaleFlexorCarpiRadialis2!!
        }
        _MuscleFemaleFlexorCarpiRadialis2 = ImageVector.Builder(
            name = "MuscleFemaleFlexorCarpiRadialis2",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(38.67f, 309.8f)
                curveToRelative(0f, -2.24f, 1.54f, -10.3f, 3.43f, -17.93f)
                curveToRelative(4.08f, -16.49f, 8.65f, -43.14f, 12.47f, -72.78f)
                curveToRelative(3.04f, -23.58f, 3.56f, -25.76f, 6.1f, -25.76f)
                curveToRelative(2.79f, 0f, 3.33f, 3.34f, 3.33f, 20.44f)
                curveToRelative(-0.01f, 27.9f, -5.58f, 54.58f, -17.55f, 84.11f)
                curveToRelative(-6.23f, 15.36f, -7.77f, 17.73f, -7.77f, 11.91f)
                close()
                moveTo(298.29f, 293.63f)
                curveToRelative(-15.17f, -32.32f, -22.29f, -60.89f, -22.29f, -89.44f)
                curveToRelative(0f, -13.52f, 0.65f, -17.52f, 2.84f, -17.52f)
                curveToRelative(1.9f, 0f, 3.46f, 5.25f, 5.83f, 19.53f)
                curveToRelative(5.69f, 34.39f, 11.66f, 62.5f, 16.81f, 79.14f)
                curveToRelative(3.49f, 11.26f, 5.1f, 19.89f, 3.87f, 20.66f)
                curveToRelative(-0.54f, 0.33f, -3.72f, -5.23f, -7.07f, -12.36f)
                close()
            }
        }.build()

        return _MuscleFemaleFlexorCarpiRadialis2!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleFlexorCarpiRadialis2: ImageVector? = null
