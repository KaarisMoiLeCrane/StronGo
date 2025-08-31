package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.BicepsFemoris9: ImageVector
    get() {
        if (_MuscleFemaleBicepsFemoris9 != null) {
            return _MuscleFemaleBicepsFemoris9!!
        }
        _MuscleFemaleBicepsFemoris9 = ImageVector.Builder(
            name = "MuscleFemaleBicepsFemoris9",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(136.12f, 280.22f)
                curveToRelative(-5.34f, -9.98f, -10.31f, -102.93f, -6.94f, -129.9f)
                curveToRelative(1.11f, -8.88f, 2.67f, -10.99f, 7.25f, -9.84f)
                curveToRelative(8.72f, 2.19f, 13.78f, 21.91f, 16.88f, 65.83f)
                curveToRelative(1.58f, 22.4f, 0.6f, 35.47f, -4.13f, 55.01f)
                curveToRelative(-2.62f, 10.83f, -7.78f, 21.33f, -10.48f, 21.33f)
                curveToRelative(-0.7f, 0f, -1.86f, -1.1f, -2.57f, -2.44f)
                close()
            }
        }.build()

        return _MuscleFemaleBicepsFemoris9!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleBicepsFemoris9: ImageVector? = null
