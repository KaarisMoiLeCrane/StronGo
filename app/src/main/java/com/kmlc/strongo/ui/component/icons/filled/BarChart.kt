package com.kmlc.strongo.ui.component.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Filled.BarChart: ImageVector
    get() {
        if (_BarChart != null) {
            return _BarChart!!
        }
        _BarChart = ImageVector.Builder(
            name = "Filled.BarChart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(640f, 800f)
                lineTo(640f, 520f)
                lineTo(800f, 520f)
                lineTo(800f, 800f)
                lineTo(640f, 800f)
                close()
                moveTo(400f, 800f)
                lineTo(400f, 160f)
                lineTo(560f, 160f)
                lineTo(560f, 800f)
                lineTo(400f, 800f)
                close()
                moveTo(160f, 800f)
                lineTo(160f, 360f)
                lineTo(320f, 360f)
                lineTo(320f, 800f)
                lineTo(160f, 800f)
                close()
            }
        }.build()

        return _BarChart!!
    }

@Suppress("ObjectPropertyName")
private var _BarChart: ImageVector? = null
