package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.FlexorCarpiRadialis2: ImageVector
    get() {
        if (_MuscleMaleFlexorCarpiRadialis2 != null) {
            return _MuscleMaleFlexorCarpiRadialis2!!
        }
        _MuscleMaleFlexorCarpiRadialis2 = ImageVector.Builder(
            name = "MuscleMaleFlexorCarpiRadialis2",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(47.13f, 273.96f)
                curveToRelative(-0.43f, -1.12f, -0.01f, -6.97f, 0.93f, -13f)
                curveToRelative(2.07f, -13.23f, 2.34f, -35.52f, 0.77f, -64.42f)
                curveToRelative(-1.06f, -19.58f, -0.96f, -21.54f, 1.1f, -22.33f)
                curveToRelative(4.26f, -1.64f, 7.23f, 1.59f, 9.99f, 10.89f)
                curveToRelative(5.93f, 19.9f, 5.72f, 42.86f, -0.58f, 66.56f)
                curveToRelative(-5.39f, 20.27f, -9.86f, 28.43f, -12.21f, 22.3f)
                close()
                moveTo(296.21f, 269.53f)
                curveToRelative(-1.53f, -3.56f, -4.42f, -12.41f, -6.43f, -19.67f)
                curveToRelative(-3.2f, -11.58f, -3.64f, -15.56f, -3.63f, -32.53f)
                curveToRelative(0.01f, -26.75f, 4.71f, -43.76f, 12.14f, -43.96f)
                curveToRelative(3.91f, -0.1f, 4.61f, 5.21f, 2.98f, 22.77f)
                curveToRelative(-1.5f, 16.26f, -1.06f, 52.39f, 0.89f, 72.19f)
                curveToRelative(0.98f, 9.92f, -1.94f, 10.51f, -5.95f, 1.19f)
                close()
            }
        }.build()

        return _MuscleMaleFlexorCarpiRadialis2!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleFlexorCarpiRadialis2: ImageVector? = null
