package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.LevatorScapulae11: ImageVector
    get() {
        if (_MuscleFemaleLevatorScapulae11 != null) {
            return _MuscleFemaleLevatorScapulae11!!
        }
        _MuscleFemaleLevatorScapulae11 = ImageVector.Builder(
            name = "MuscleFemaleLevatorScapulae11",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(173.58f, 227.81f)
                curveToRelative(-0.14f, -1.2f, -3.19f, -7.8f, -6.78f, -14.67f)
                curveToRelative(-6.5f, -12.41f, -10.85f, -24.46f, -10.75f, -29.72f)
                curveToRelative(0.04f, -2.3f, 0.41f, -2.1f, 2.2f, 1.24f)
                curveToRelative(1.18f, 2.2f, 4.14f, 6.33f, 6.57f, 9.18f)
                curveToRelative(5.91f, 6.94f, 10.14f, 19.85f, 9.5f, 29.04f)
                curveToRelative(-0.27f, 3.91f, -0.6f, 6.12f, -0.74f, 4.92f)
                close()
            }
        }.build()

        return _MuscleFemaleLevatorScapulae11!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleLevatorScapulae11: ImageVector? = null
