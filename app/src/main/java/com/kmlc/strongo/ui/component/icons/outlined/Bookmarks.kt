package com.kmlc.strongo.ui.component.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Outlined.Bookmarks: ImageVector
    get() {
        if (_Bookmarks != null) {
            return _Bookmarks!!
        }
        _Bookmarks = ImageVector.Builder(
            name = "Outlined.Bookmarks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 880f)
                lineTo(160f, 320f)
                quadTo(160f, 287f, 183.5f, 263.5f)
                quadTo(207f, 240f, 240f, 240f)
                lineTo(560f, 240f)
                quadTo(593f, 240f, 616.5f, 263.5f)
                quadTo(640f, 287f, 640f, 320f)
                lineTo(640f, 880f)
                lineTo(400f, 760f)
                lineTo(160f, 880f)
                close()
                moveTo(240f, 759f)
                lineTo(400f, 673f)
                lineTo(560f, 759f)
                lineTo(560f, 320f)
                quadTo(560f, 320f, 560f, 320f)
                quadTo(560f, 320f, 560f, 320f)
                lineTo(240f, 320f)
                quadTo(240f, 320f, 240f, 320f)
                quadTo(240f, 320f, 240f, 320f)
                lineTo(240f, 759f)
                close()
                moveTo(720f, 720f)
                lineTo(720f, 160f)
                quadTo(720f, 160f, 720f, 160f)
                quadTo(720f, 160f, 720f, 160f)
                lineTo(280f, 160f)
                lineTo(280f, 80f)
                lineTo(720f, 80f)
                quadTo(753f, 80f, 776.5f, 103.5f)
                quadTo(800f, 127f, 800f, 160f)
                lineTo(800f, 720f)
                lineTo(720f, 720f)
                close()
                moveTo(240f, 320f)
                lineTo(240f, 320f)
                quadTo(240f, 320f, 240f, 320f)
                quadTo(240f, 320f, 240f, 320f)
                lineTo(560f, 320f)
                quadTo(560f, 320f, 560f, 320f)
                quadTo(560f, 320f, 560f, 320f)
                lineTo(560f, 320f)
                lineTo(400f, 320f)
                lineTo(240f, 320f)
                close()
            }
        }.build()

        return _Bookmarks!!
    }

@Suppress("ObjectPropertyName")
private var _Bookmarks: ImageVector? = null
