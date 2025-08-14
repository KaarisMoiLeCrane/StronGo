package com.kmlc.strongo.ui.component.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Outlined.AccessTime: ImageVector
    get() {
        if (_AccessTime != null) {
            return _AccessTime!!
        }
        _AccessTime = ImageVector.Builder(
            name = "AccessTime",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Companion.Black)) {
                moveTo(11.99f, 2f)
                curveTo(6.47f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.47f, 10f, 9.99f, 10f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                reflectiveCurveTo(17.52f, 2f, 11.99f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                reflectiveCurveToRelative(3.58f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                reflectiveCurveToRelative(-3.58f, 8f, -8f, 8f)
                close()
                moveTo(11.78f, 7f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-0.4f, 0f, -0.72f, 0.32f, -0.72f, 0.72f)
                verticalLineToRelative(4.72f)
                curveToRelative(0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f)
                lineToRelative(4.15f, 2.49f)
                curveToRelative(0.34f, 0.2f, 0.78f, 0.1f, 0.98f, -0.24f)
                curveToRelative(0.21f, -0.34f, 0.1f, -0.79f, -0.25f, -0.99f)
                lineToRelative(-3.87f, -2.3f)
                lineTo(12.5f, 7.72f)
                curveToRelative(0f, -0.4f, -0.32f, -0.72f, -0.72f, -0.72f)
                close()
            }
        }.build()

        return _AccessTime!!
    }

@Suppress("ObjectPropertyName")
private var _AccessTime: ImageVector? = null