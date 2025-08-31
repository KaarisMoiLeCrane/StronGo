package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.Brachioradialis2: ImageVector
    get() {
        if (_MuscleMaleBrachioradialis2 != null) {
            return _MuscleMaleBrachioradialis2!!
        }
        _MuscleMaleBrachioradialis2 = ImageVector.Builder(
            name = "MuscleMaleBrachioradialis2",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(63.33f, 251f)
                curveToRelative(4.06f, -21.09f, 2.81f, -37.39f, -4.24f, -55.31f)
                curveToRelative(-2.65f, -6.74f, -12.11f, -22.32f, -20.73f, -34.15f)
                curveToRelative(-5.57f, -7.64f, -6.25f, -9.4f, -7.07f, -18.17f)
                curveToRelative(-1f, -10.7f, 0.03f, -18.04f, 2.55f, -18.04f)
                curveToRelative(3.64f, 0f, 10.22f, 9.06f, 13.59f, 18.71f)
                curveToRelative(1.91f, 5.48f, 6.78f, 16.42f, 10.81f, 24.32f)
                curveToRelative(11.05f, 21.61f, 11.76f, 24.68f, 11.69f, 50.31f)
                curveToRelative(-0.07f, 23.94f, -2.05f, 37.33f, -5.51f, 37.33f)
                curveToRelative(-1.66f, 0f, -1.87f, -0.97f, -1.09f, -5f)
                close()
                moveTo(282.49f, 248.33f)
                curveToRelative(-0.98f, -4.41f, -1.72f, -17.02f, -1.76f, -29.67f)
                curveToRelative(-0.07f, -25.63f, 0.64f, -28.69f, 11.69f, -50.31f)
                curveToRelative(4.04f, -7.9f, 8.9f, -18.84f, 10.81f, -24.32f)
                curveToRelative(3.37f, -9.65f, 9.95f, -18.71f, 13.59f, -18.71f)
                curveToRelative(2.52f, 0f, 3.55f, 7.33f, 2.55f, 18.04f)
                curveToRelative(-0.82f, 8.77f, -1.51f, 10.53f, -7.07f, 18.17f)
                curveToRelative(-25.42f, 34.89f, -31.36f, 56.2f, -24.96f, 89.46f)
                curveToRelative(0.78f, 4.03f, 0.56f, 5f, -1.09f, 5f)
                curveToRelative(-1.41f, 0f, -2.58f, -2.39f, -3.75f, -7.67f)
                close()
            }
        }.build()

        return _MuscleMaleBrachioradialis2!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleBrachioradialis2: ImageVector? = null
