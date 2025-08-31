package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.Brachioradialis2: ImageVector
    get() {
        if (_MuscleFemaleBrachioradialis2 != null) {
            return _MuscleFemaleBrachioradialis2!!
        }
        _MuscleFemaleBrachioradialis2 = ImageVector.Builder(
            name = "MuscleFemaleBrachioradialis2",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(52.33f, 124.79f)
                lineToRelative(-0.97f, 4.43f)
                curveToRelative(-1.69f, 7.7f, 0.66f, 24.11f, 5.42f, 37.87f)
                curveToRelative(8.93f, 25.79f, 11.36f, 39.6f, 11.56f, 65.57f)
                curveToRelative(0.11f, 14.53f, 0.28f, 15.93f, 1.07f, 8.67f)
                curveToRelative(1.48f, -13.62f, 1.39f, -39.59f, -0.17f, -49.22f)
                curveTo(68.46f, 187.28f, 66.12f, 176.43f, 64.04f, 168f)
                curveToRelative(-2.08f, -8.43f, -4.52f, -19.53f, -5.42f, -24.67f)
                curveToRelative(-0.9f, -5.13f, -2.68f, -11.41f, -3.96f, -13.94f)
                close()
                moveTo(283.95f, 126.56f)
                curveToRelative(-0.34f, 0.06f, -0.8f, 0.88f, -1.47f, 2.1f)
                curveToRelative(-1.21f, 2.2f, -2.61f, 7.9f, -3.13f, 12.67f)
                curveToRelative(-0.51f, 4.77f, -2.41f, 15.87f, -4.21f, 24.67f)
                curveToRelative(-4.09f, 19.99f, -5.36f, 44.73f, -3.23f, 63.34f)
                curveToRelative(0.88f, 7.7f, 1.93f, 15.37f, 2.34f, 17.05f)
                curveToRelative(1.53f, 6.33f, 1.6f, 1.72f, 0.17f, -10.87f)
                curveToRelative(-2.1f, -18.48f, 0.14f, -40.65f, 6.26f, -62.09f)
                curveToRelative(4.42f, -15.46f, 4.71f, -17.63f, 4.36f, -32.67f)
                curveToRelative(-0.25f, -10.84f, -0.35f, -14.35f, -1.09f, -14.21f)
                close()
                moveTo(66.9f, 252.79f)
                curveToRelative(-0f, 0.01f, -0f, 0.01f, -0f, 0.03f)
                curveToRelative(0f, -0.01f, 0.01f, -0.01f, 0.01f, -0.02f)
                curveToRelative(-0f, -0f, -0f, -0f, -0.01f, -0.01f)
                close()
            }
        }.build()

        return _MuscleFemaleBrachioradialis2!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleBrachioradialis2: ImageVector? = null
