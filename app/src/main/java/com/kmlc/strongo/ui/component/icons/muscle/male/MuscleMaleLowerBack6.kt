package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.LowerBack6: ImageVector
    get() {
        if (_MuscleMaleLowerBack6 != null) {
            return _MuscleMaleLowerBack6!!
        }
        _MuscleMaleLowerBack6 = ImageVector.Builder(
            name = "Male.MuscleMaleLowerBack6",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(153.44f, 239.44f)
                curveToRelative(-5.81f, -5.86f, -11.97f, -10.38f, -19.23f, -14.1f)
                curveToRelative(-12.4f, -6.36f, -14.11f, -8.18f, -14.17f, -15.1f)
                curveToRelative(-0.06f, -6.99f, 1.86f, -9.96f, 8.03f, -12.43f)
                curveToRelative(6.91f, -2.76f, 11.85f, -9.22f, 19.36f, -25.31f)
                curveToRelative(14.17f, -30.33f, 16.13f, -33.05f, 20.08f, -27.84f)
                curveToRelative(1.74f, 2.3f, 1.94f, 9.01f, 1.44f, 48.67f)
                curveToRelative(-0.58f, 45.5f, -1.33f, 53.65f, -5.05f, 54.37f)
                curveToRelative(-1.05f, 0.2f, -5.76f, -3.51f, -10.46f, -8.26f)
                close()
                moveTo(186.38f, 245f)
                curveToRelative(-2.41f, -4.22f, -3.36f, -97.55f, -1.02f, -100.36f)
                curveToRelative(3.18f, -3.84f, 8.55f, 2.06f, 13.72f, 15.07f)
                curveToRelative(5.15f, 12.95f, 13.74f, 28.67f, 18.03f, 32.96f)
                curveToRelative(2.52f, 2.52f, 6.59f, 5.24f, 9.04f, 6.05f)
                curveToRelative(6.06f, 2f, 8.41f, 9.09f, 5.41f, 16.29f)
                curveToRelative(-1.71f, 4.1f, -3.78f, 5.75f, -12.98f, 10.37f)
                curveToRelative(-7.58f, 3.81f, -13.57f, 8.13f, -19.5f, 14.06f)
                curveToRelative(-4.71f, 4.71f, -9.11f, 8.56f, -9.77f, 8.56f)
                curveToRelative(-0.67f, 0f, -1.98f, -1.35f, -2.92f, -3f)
                close()
            }
        }.build()

        return _MuscleMaleLowerBack6!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleLowerBack6: ImageVector? = null
