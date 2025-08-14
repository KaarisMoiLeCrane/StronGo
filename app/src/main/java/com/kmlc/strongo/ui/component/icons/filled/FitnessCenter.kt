package com.kmlc.strongo.ui.component.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Filled.FitnessCenter: ImageVector
    get() {
        if (_FitnessCenter != null) {
            return _FitnessCenter!!
        }
        _FitnessCenter = ImageVector.Builder(
            name = "Filled.FitnessCenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(536f, 876f)
                lineTo(480f, 820f)
                lineTo(622f, 678f)
                lineTo(282f, 338f)
                lineTo(140f, 480f)
                lineTo(84f, 424f)
                lineTo(140f, 366f)
                lineTo(84f, 310f)
                lineTo(168f, 226f)
                lineTo(112f, 168f)
                lineTo(168f, 112f)
                lineTo(226f, 168f)
                lineTo(310f, 84f)
                lineTo(366f, 140f)
                lineTo(424f, 84f)
                lineTo(480f, 140f)
                lineTo(338f, 282f)
                lineTo(678f, 622f)
                lineTo(820f, 480f)
                lineTo(876f, 536f)
                lineTo(820f, 594f)
                lineTo(876f, 650f)
                lineTo(792f, 734f)
                lineTo(848f, 792f)
                lineTo(792f, 848f)
                lineTo(734f, 792f)
                lineTo(650f, 876f)
                lineTo(594f, 820f)
                lineTo(536f, 876f)
                close()
            }
        }.build()

        return _FitnessCenter!!
    }

@Suppress("ObjectPropertyName")
private var _FitnessCenter: ImageVector? = null
