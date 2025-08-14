package com.kmlc.strongo.ui.component.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Filled.LineStyle: ImageVector
    get() {
        if (_LineStyle != null) {
            return _LineStyle!!
        }
        _LineStyle = ImageVector.Builder(
            name = "Filled.LineStyle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 800f)
                lineTo(120f, 720f)
                lineTo(200f, 720f)
                lineTo(200f, 800f)
                lineTo(120f, 800f)
                close()
                moveTo(120f, 640f)
                lineTo(120f, 560f)
                lineTo(320f, 560f)
                lineTo(320f, 640f)
                lineTo(120f, 640f)
                close()
                moveTo(120f, 480f)
                lineTo(120f, 400f)
                lineTo(440f, 400f)
                lineTo(440f, 480f)
                lineTo(120f, 480f)
                close()
                moveTo(120f, 320f)
                lineTo(120f, 160f)
                lineTo(840f, 160f)
                lineTo(840f, 320f)
                lineTo(120f, 320f)
                close()
                moveTo(280f, 800f)
                lineTo(280f, 720f)
                lineTo(360f, 720f)
                lineTo(360f, 800f)
                lineTo(280f, 800f)
                close()
                moveTo(380f, 640f)
                lineTo(380f, 560f)
                lineTo(580f, 560f)
                lineTo(580f, 640f)
                lineTo(380f, 640f)
                close()
                moveTo(440f, 800f)
                lineTo(440f, 720f)
                lineTo(520f, 720f)
                lineTo(520f, 800f)
                lineTo(440f, 800f)
                close()
                moveTo(520f, 480f)
                lineTo(520f, 400f)
                lineTo(840f, 400f)
                lineTo(840f, 480f)
                lineTo(520f, 480f)
                close()
                moveTo(600f, 800f)
                lineTo(600f, 720f)
                lineTo(680f, 720f)
                lineTo(680f, 800f)
                lineTo(600f, 800f)
                close()
                moveTo(640f, 640f)
                lineTo(640f, 560f)
                lineTo(840f, 560f)
                lineTo(840f, 640f)
                lineTo(640f, 640f)
                close()
                moveTo(760f, 800f)
                lineTo(760f, 720f)
                lineTo(840f, 720f)
                lineTo(840f, 800f)
                lineTo(760f, 800f)
                close()
            }
        }.build()

        return _LineStyle!!
    }

@Suppress("ObjectPropertyName")
private var _LineStyle: ImageVector? = null
