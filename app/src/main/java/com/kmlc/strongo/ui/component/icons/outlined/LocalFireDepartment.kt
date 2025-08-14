package com.kmlc.strongo.ui.component.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Outlined.LocalFireDepartment: ImageVector
    get() {
        if (_LocalFireDepartment != null) {
            return _LocalFireDepartment!!
        }
        _LocalFireDepartment = ImageVector.Builder(
            name = "Outlined.LocalFireDepartment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 560f)
                quadTo(240f, 612f, 261f, 658.5f)
                quadTo(282f, 705f, 321f, 740f)
                quadTo(320f, 735f, 320f, 731f)
                quadTo(320f, 727f, 320f, 722f)
                quadTo(320f, 690f, 332f, 662f)
                quadTo(344f, 634f, 367f, 611f)
                lineTo(480f, 500f)
                lineTo(593f, 611f)
                quadTo(616f, 634f, 628f, 662f)
                quadTo(640f, 690f, 640f, 722f)
                quadTo(640f, 727f, 640f, 731f)
                quadTo(640f, 735f, 639f, 740f)
                quadTo(678f, 705f, 699f, 658.5f)
                quadTo(720f, 612f, 720f, 560f)
                quadTo(720f, 510f, 701.5f, 465.5f)
                quadTo(683f, 421f, 648f, 386f)
                lineTo(648f, 386f)
                quadTo(628f, 399f, 606f, 405.5f)
                quadTo(584f, 412f, 561f, 412f)
                quadTo(499f, 412f, 453.5f, 371f)
                quadTo(408f, 330f, 401f, 270f)
                lineTo(401f, 270f)
                quadTo(362f, 303f, 332f, 338.5f)
                quadTo(302f, 374f, 281.5f, 410.5f)
                quadTo(261f, 447f, 250.5f, 485f)
                quadTo(240f, 523f, 240f, 560f)
                close()
                moveTo(480f, 612f)
                lineTo(423f, 668f)
                quadTo(412f, 679f, 406f, 693f)
                quadTo(400f, 707f, 400f, 722f)
                quadTo(400f, 754f, 423.5f, 777f)
                quadTo(447f, 800f, 480f, 800f)
                quadTo(513f, 800f, 536.5f, 777f)
                quadTo(560f, 754f, 560f, 722f)
                quadTo(560f, 706f, 554f, 692.5f)
                quadTo(548f, 679f, 537f, 668f)
                lineTo(480f, 612f)
                close()
                moveTo(480f, 120f)
                lineTo(480f, 252f)
                quadTo(480f, 286f, 503.5f, 309f)
                quadTo(527f, 332f, 561f, 332f)
                quadTo(579f, 332f, 594.5f, 324.5f)
                quadTo(610f, 317f, 622f, 302f)
                lineTo(640f, 280f)
                quadTo(714f, 322f, 757f, 397f)
                quadTo(800f, 472f, 800f, 560f)
                quadTo(800f, 694f, 707f, 787f)
                quadTo(614f, 880f, 480f, 880f)
                quadTo(346f, 880f, 253f, 787f)
                quadTo(160f, 694f, 160f, 560f)
                quadTo(160f, 431f, 246.5f, 315f)
                quadTo(333f, 199f, 480f, 120f)
                close()
            }
        }.build()

        return _LocalFireDepartment!!
    }

@Suppress("ObjectPropertyName")
private var _LocalFireDepartment: ImageVector? = null
