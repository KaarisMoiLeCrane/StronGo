package com.kmlc.strongo.ui.component.view

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

sealed class IconClass {
    data class Vector(val imageVector: ImageVector) : IconClass()
    data class PainterIcon(val painter: Painter) : IconClass()
}