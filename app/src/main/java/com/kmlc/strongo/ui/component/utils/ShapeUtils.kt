package com.kmlc.strongo.ui.component.utils

import androidx.compose.foundation.shape.GenericShape
import kotlin.math.cos
import kotlin.math.sin

/**
 * Creates a polygon shape with the specified number of sides.
 *
 * @param sides The number of sides of the polygon. Must be greater than 2.
 * @return A [GenericShape] representing the polygon.
 */
fun polygonShape(sides: Int) = GenericShape { size, _ ->
    val radius = size.minDimension / 2
    val centerX = size.width / 2
    val centerY = size.height / 2
    for (i in 0 until sides) {
        val angle = Math.toRadians(360.0 * i / sides - 90)
        val x = centerX + radius * cos(x = angle).toFloat()
        val y = centerY + radius * sin(x = angle).toFloat()
        if (i == 0) moveTo(x, y) else lineTo(x, y)
    }
    close()
}