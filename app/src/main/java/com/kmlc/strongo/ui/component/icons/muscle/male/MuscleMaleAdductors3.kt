package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.Adductors3: ImageVector
    get() {
        if (_MuscleMaleAdductors3 != null) {
            return _MuscleMaleAdductors3!!
        }
        _MuscleMaleAdductors3 = ImageVector.Builder(
            name = "Male.MuscleMaleAdductors3",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(142.63f, 309.3f)
                curveToRelative(-7.84f, -8.49f, -9.99f, -17.11f, -9.83f, -39.3f)
                curveToRelative(0.14f, -18.8f, 2.41f, -38.95f, 7.28f, -64.53f)
                curveToRelative(4.01f, -21.07f, 10.56f, -49.46f, 12.87f, -55.78f)
                curveToRelative(4.51f, -12.33f, 8.84f, -10.39f, 11.12f, 4.99f)
                curveToRelative(1.96f, 13.24f, 2.02f, 92.06f, 0.08f, 113.33f)
                curveToRelative(-3.98f, 43.63f, -4.8f, 46.67f, -12.55f, 46.67f)
                curveToRelative(-2.96f, 0f, -5.29f, -1.39f, -8.96f, -5.37f)
                close()
                moveTo(195.63f, 311.82f)
                curveToRelative(-5.49f, -8.79f, -9.68f, -107.27f, -6.3f, -148.04f)
                curveToRelative(1.77f, -21.3f, 4.71f, -27.08f, 9.57f, -18.78f)
                curveToRelative(2.68f, 4.57f, 3.99f, 9.25f, 9.69f, 34.48f)
                curveToRelative(13.7f, 60.65f, 16.71f, 104.99f, 8.28f, 122.2f)
                curveToRelative(-4.46f, 9.12f, -7.32f, 11.7f, -13.98f, 12.59f)
                curveToRelative(-4.55f, 0.61f, -5.58f, 0.26f, -7.27f, -2.45f)
                close()
            }
        }.build()

        return _MuscleMaleAdductors3!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleAdductors3: ImageVector? = null
