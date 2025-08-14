package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.Abductors3: ImageVector
    get() {
        if (_MuscleMaleAbductors3 != null) {
            return _MuscleMaleAbductors3!!
        }
        _MuscleMaleAbductors3 = ImageVector.Builder(
            name = "Male.MuscleMaleAbductors3",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(92.51f, 96.52f)
                curveToRelative(-1.17f, -4.64f, 0.32f, -46.79f, 1.82f, -51.86f)
                curveToRelative(2.68f, -9.01f, 10.46f, -1.32f, 13.85f, 13.69f)
                curveToRelative(1.47f, 6.53f, 1.28f, 8.02f, -2.74f, 21.33f)
                curveToRelative(-2.38f, 7.87f, -4.86f, 15.66f, -5.52f, 17.31f)
                curveToRelative(-1.68f, 4.23f, -6.3f, 3.93f, -7.41f, -0.48f)
                close()
                moveTo(251.98f, 94.33f)
                curveToRelative(-0.8f, -3.12f, -3f, -10.39f, -4.88f, -16.17f)
                curveToRelative(-3.94f, -12.07f, -3.71f, -19.15f, 0.98f, -30.04f)
                curveToRelative(2.82f, -6.55f, 6.9f, -9.68f, 9.39f, -7.19f)
                curveToRelative(3.15f, 3.15f, 5.34f, 51.16f, 2.57f, 56.33f)
                curveToRelative(-2.58f, 4.82f, -6.42f, 3.42f, -8.06f, -2.93f)
                close()
            }
        }.build()

        return _MuscleMaleAbductors3!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleAbductors3: ImageVector? = null
