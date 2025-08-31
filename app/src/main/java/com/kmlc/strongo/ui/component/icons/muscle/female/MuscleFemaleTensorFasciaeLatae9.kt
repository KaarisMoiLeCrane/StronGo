package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.TensorFasciaeLatae9: ImageVector
    get() {
        if (_MuscleFemaleTensorFasciaeLatae9 != null) {
            return _MuscleFemaleTensorFasciaeLatae9!!
        }
        _MuscleFemaleTensorFasciaeLatae9 = ImageVector.Builder(
            name = "MuscleFemaleTensorFasciaeLatae9",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(190.02f, 125.53f)
                curveToRelative(0.37f, -0.37f, -0.69f, -2.11f, -2.34f, -3.87f)
                curveToRelative(-3.85f, -4.09f, -4.64f, -13.02f, -5.81f, -65.19f)
                lineToRelative(-0.87f, -38.86f)
                lineToRelative(2.88f, -1.54f)
                curveToRelative(3.8f, -2.03f, 6.85f, -0.9f, 10.12f, 3.76f)
                curveToRelative(8.16f, 11.65f, 13.12f, 17.48f, 15.54f, 18.24f)
                curveToRelative(2.19f, 0.7f, 2.59f, 1.68f, 2.05f, 5.06f)
                curveToRelative(-0.37f, 2.31f, -1.29f, 8.1f, -2.04f, 12.87f)
                curveToRelative(-0.75f, 4.77f, -1.72f, 18.27f, -2.14f, 30f)
                curveToRelative(-0.6f, 16.67f, -1.21f, 21.66f, -2.76f, 22.81f)
                curveToRelative(-1.09f, 0.81f, -1.99f, 2.91f, -1.99f, 4.67f)
                curveToRelative(-0.01f, 5.39f, -4.6f, 11.44f, -9.2f, 12.12f)
                curveToRelative(-2.26f, 0.33f, -3.81f, 0.3f, -3.44f, -0.07f)
                close()
            }
        }.build()

        return _MuscleFemaleTensorFasciaeLatae9!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleTensorFasciaeLatae9: ImageVector? = null
