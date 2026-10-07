package com.example.a40banderas

import androidx.compose.ui.graphics.Path
import kotlin.math.cos
import kotlin.math.sin

fun trianglePath(
    cx: Float,
    cy: Float,
    r: Float,
    rotationDeg: Float
): Path {
    val path = Path()

    for (i in 0..2) {
        val angle = Math.toRadians(
            (rotationDeg + i * 120).toDouble()
        )

        val x = cx + r * cos(angle).toFloat()
        val y = cy + r * sin(angle).toFloat()

        if (i == 0) {
            path.moveTo(x, y)
        } else {
            path.lineTo(x, y)
        }
    }

    path.close()
    return path
}
