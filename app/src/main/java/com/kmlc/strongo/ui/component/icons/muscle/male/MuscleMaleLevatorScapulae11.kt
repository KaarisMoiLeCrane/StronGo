package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.LevatorScapulae11: ImageVector
    get() {
        if (_MuscleMaleLevatorScapulae11 != null) {
            return _MuscleMaleLevatorScapulae11!!
        }
        _MuscleMaleLevatorScapulae11 = ImageVector.Builder(
            name = "MuscleMaleLevatorScapulae11",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(180.11f, 224.33f)
                curveToRelative(-0.97f, -2.75f, -5.57f, -11.01f, -10.22f, -18.37f)
                curveToRelative(-9.05f, -14.29f, -11.86f, -20.77f, -12.89f, -29.69f)
                curveToRelative(-0.77f, -6.67f, 0.22f, -7.08f, 3.54f, -1.46f)
                curveToRelative(1.35f, 2.28f, 5.3f, 7.01f, 8.78f, 10.51f)
                curveToRelative(9.53f, 9.58f, 13.91f, 19.56f, 14.49f, 33.02f)
                curveToRelative(0.5f, 11.81f, -0.87f, 14.04f, -3.69f, 6f)
                close()
            }
        }.build()

        return _MuscleMaleLevatorScapulae11!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleLevatorScapulae11: ImageVector? = null
