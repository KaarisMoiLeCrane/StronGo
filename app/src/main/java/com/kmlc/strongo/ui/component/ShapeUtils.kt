package com.kmlc.strongo.ui.component

import androidx.compose.foundation.shape.GenericShape
import kotlin.math.cos
import kotlin.math.sin

// Pour la forme hexagone (PolygonShape) :
fun polygonShape(sides: Int) = GenericShape { size, _ ->
    val radius = size.minDimension / 2
    val centerX = size.width / 2
    val centerY = size.height / 2
    for (i in 0 until sides) {
        val angle = Math.toRadians(360.0 * i / sides - 90)
        val x = centerX + radius * cos(angle).toFloat()
        val y = centerY + radius * sin(angle).toFloat()
        if (i == 0) moveTo(x, y) else lineTo(x, y)
    }
    close()
}