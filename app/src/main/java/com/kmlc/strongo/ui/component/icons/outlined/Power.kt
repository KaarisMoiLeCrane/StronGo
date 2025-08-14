package com.kmlc.strongo.ui.component.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Outlined.Power: ImageVector
    get() {
        if (_Power != null) {
            return _Power!!
        }
        _Power = ImageVector.Builder(
            name = "Outlined.Power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(460f, 760f)
                lineTo(500f, 760f)
                lineTo(500f, 686f)
                lineTo(640f, 546f)
                lineTo(640f, 360f)
                quadTo(640f, 360f, 640f, 360f)
                quadTo(640f, 360f, 640f, 360f)
                lineTo(320f, 360f)
                quadTo(320f, 360f, 320f, 360f)
                quadTo(320f, 360f, 320f, 360f)
                lineTo(320f, 546f)
                lineTo(460f, 686f)
                lineTo(460f, 760f)
                close()
                moveTo(380f, 840f)
                lineTo(380f, 720f)
                lineTo(240f, 580f)
                lineTo(240f, 360f)
                quadTo(240f, 327f, 263.5f, 303.5f)
                quadTo(287f, 280f, 320f, 280f)
                lineTo(360f, 280f)
                lineTo(320f, 320f)
                lineTo(320f, 120f)
                lineTo(400f, 120f)
                lineTo(400f, 280f)
                lineTo(560f, 280f)
                lineTo(560f, 120f)
                lineTo(640f, 120f)
                lineTo(640f, 320f)
                lineTo(600f, 280f)
                lineTo(640f, 280f)
                quadTo(673f, 280f, 696.5f, 303.5f)
                quadTo(720f, 327f, 720f, 360f)
                lineTo(720f, 580f)
                lineTo(580f, 720f)
                lineTo(580f, 840f)
                lineTo(380f, 840f)
                close()
                moveTo(480f, 560f)
                lineTo(480f, 560f)
                lineTo(480f, 560f)
                lineTo(480f, 560f)
                quadTo(480f, 560f, 480f, 560f)
                quadTo(480f, 560f, 480f, 560f)
                lineTo(480f, 560f)
                quadTo(480f, 560f, 480f, 560f)
                quadTo(480f, 560f, 480f, 560f)
                lineTo(480f, 560f)
                lineTo(480f, 560f)
                lineTo(480f, 560f)
                close()
            }
        }.build()

        return _Power!!
    }

@Suppress("ObjectPropertyName")
private var _Power: ImageVector? = null
