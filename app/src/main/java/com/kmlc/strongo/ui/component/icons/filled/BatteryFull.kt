package com.kmlc.strongo.ui.component.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Filled.BatteryFull: ImageVector
    get() {
        if (_BatteryFull != null) {
            return _BatteryFull!!
        }
        _BatteryFull = ImageVector.Builder(
            name = "Filled.BatteryFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(320f, 880f)
                quadTo(303f, 880f, 291.5f, 868.5f)
                quadTo(280f, 857f, 280f, 840f)
                lineTo(280f, 200f)
                quadTo(280f, 183f, 291.5f, 171.5f)
                quadTo(303f, 160f, 320f, 160f)
                lineTo(400f, 160f)
                lineTo(400f, 80f)
                lineTo(560f, 80f)
                lineTo(560f, 160f)
                lineTo(640f, 160f)
                quadTo(657f, 160f, 668.5f, 171.5f)
                quadTo(680f, 183f, 680f, 200f)
                lineTo(680f, 840f)
                quadTo(680f, 857f, 668.5f, 868.5f)
                quadTo(657f, 880f, 640f, 880f)
                lineTo(320f, 880f)
                close()
            }
        }.build()

        return _BatteryFull!!
    }

@Suppress("ObjectPropertyName")
private var _BatteryFull: ImageVector? = null
