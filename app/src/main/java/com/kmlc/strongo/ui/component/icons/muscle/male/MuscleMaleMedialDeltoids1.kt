package com.kmlc.strongo.ui.component.icons.muscle.male

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Male.MedialDeltoids1: ImageVector
    get() {
        if (_MuscleMaleMedialDeltoids1 != null) {
            return _MuscleMaleMedialDeltoids1!!
        }
        _MuscleMaleMedialDeltoids1 = ImageVector.Builder(
            name = "MuscleMaleMedialDeltoids1",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.13f, 233.67f)
                curveToRelative(-8.39f, -36.13f, -3.19f, -64.86f, 14.98f, -82.76f)
                curveToRelative(5.77f, -5.68f, 16.89f, -12.48f, 16.89f, -10.32f)
                curveToRelative(0f, 0.34f, -1.56f, 2.9f, -3.46f, 5.68f)
                curveToRelative(-12.29f, 17.94f, -20.84f, 50.8f, -17.91f, 68.79f)
                curveToRelative(1.25f, 7.69f, 0.2f, 14.14f, -3.47f, 21.27f)
                curveToRelative(-2.83f, 5.5f, -5.35f, 4.55f, -7.02f, -2.67f)
                close()
                moveTo(315.84f, 233.67f)
                curveToRelative(-3.03f, -7.03f, -3.27f, -9.75f, -2.2f, -24.51f)
                curveToRelative(1.49f, -20.43f, -8.05f, -52.31f, -19.39f, -64.82f)
                curveToRelative(-1.57f, -1.73f, -2.04f, -3f, -1.11f, -3f)
                curveToRelative(7.64f, 0f, 22.29f, 14.08f, 28.11f, 27.02f)
                curveToRelative(6.85f, 15.24f, 8.2f, 30.84f, 4.61f, 53.49f)
                curveToRelative(-3.18f, 20.05f, -5.36f, 22.63f, -10.02f, 11.83f)
                close()
            }
        }.build()

        return _MuscleMaleMedialDeltoids1!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleMaleMedialDeltoids1: ImageVector? = null
