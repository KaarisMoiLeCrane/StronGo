package com.kmlc.strongo.ui.component.icons.muscle.female

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.kmlc.strongo.ui.component.icons.StronGoIcons

val StronGoIcons.Muscle.Female.MedialDeltoids1: ImageVector
    get() {
        if (_MuscleFemaleMedialDeltoids1 != null) {
            return _MuscleFemaleMedialDeltoids1!!
        }
        _MuscleFemaleMedialDeltoids1 = ImageVector.Builder(
            name = "MuscleFemaleMedialDeltoids1",
            defaultWidth = 349.33.dp,
            defaultHeight = 349.33.dp,
            viewportWidth = 349.33f,
            viewportHeight = 349.33f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(52.09f, 217.67f)
                curveToRelative(-2.49f, -11.86f, -3.3f, -33.36f, -1.57f, -41.67f)
                curveToRelative(3.14f, -15.06f, 12.6f, -30.29f, 21.94f, -35.32f)
                curveToRelative(5.29f, -2.85f, 7.75f, -1.97f, 4.57f, 1.64f)
                curveToRelative(-3.22f, 3.66f, -8.44f, 14.77f, -11.74f, 25.01f)
                curveToRelative(-2.39f, 7.42f, -3.11f, 13.17f, -3.47f, 28f)
                curveToRelative(-0.47f, 19.1f, -2.8f, 30f, -6.42f, 30f)
                curveToRelative(-1f, 0f, -2.37f, -3.17f, -3.32f, -7.67f)
                close()
                moveTo(289.4f, 215.9f)
                curveToRelative(-2.02f, -4.45f, -2.68f, -8.78f, -2.7f, -17.62f)
                curveToRelative(-0.02f, -6.45f, -0.97f, -16.29f, -2.12f, -21.87f)
                curveToRelative(-2.37f, -11.49f, -11.02f, -32.59f, -15.17f, -37f)
                curveToRelative(-3.89f, -4.14f, -1.98f, -5.09f, 4.06f, -2.01f)
                curveToRelative(5.4f, 2.76f, 13.83f, 13.06f, 17.8f, 21.78f)
                curveToRelative(4.71f, 10.34f, 6.49f, 26.57f, 4.83f, 44.13f)
                curveToRelative(-0.83f, 8.79f, -2.07f, 16.54f, -2.76f, 17.23f)
                curveToRelative(-0.78f, 0.78f, -2.26f, -0.96f, -3.93f, -4.64f)
                close()
            }
        }.build()

        return _MuscleFemaleMedialDeltoids1!!
    }

@Suppress("ObjectPropertyName")
private var _MuscleFemaleMedialDeltoids1: ImageVector? = null
