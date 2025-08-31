package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.Brachialis10: ImageVector
    get() {
        if (_MuscleMaleBrachialis10 != null) {
            return _MuscleMaleBrachialis10!!
        }
        _MuscleMaleBrachialis10 = ImageVector.Builder(
            name = "MuscleMaleBrachialis10",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.03f, 188.38f)
                curveToRelative(-2.08f, -3.19f, -2.34f, -6.84f, -2.2f, -30.33f)
                curveToRelative(0.19f, -31.21f, 1.81f, -39.36f, 11.93f, -60.03f)
                curveToRelative(4.97f, -10.15f, 6.78f, -12.68f, 9.06f, -12.67f)
                curveToRelative(2.24f, 0.02f, 3.5f, 1.72f, 5.91f, 7.99f)
                curveToRelative(9.47f, 24.61f, 9.22f, 56.25f, -0.63f, 80.86f)
                curveToRelative(-6.13f, 15.32f, -18.55f, 22.63f, -24.07f, 14.17f)
                close()
                moveTo(305.55f, 187.37f)
                curveToRelative(-16.71f, -15.1f, -21.4f, -62.55f, -9.28f, -94.02f)
                curveToRelative(2.42f, -6.28f, 3.67f, -7.98f, 5.91f, -7.99f)
                curveToRelative(2.28f, -0.02f, 4.09f, 2.51f, 9.06f, 12.67f)
                curveToRelative(9.61f, 19.62f, 11.56f, 28.92f, 12.31f, 58.65f)
                curveToRelative(0.57f, 22.68f, 0.39f, 25.82f, -1.79f, 30f)
                curveToRelative(-3.56f, 6.84f, -9.15f, 7.08f, -16.21f, 0.7f)
                close()
            }
        }.build()

        return _MuscleMaleBrachialis10!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleBrachialis10: ImageVector? = null
