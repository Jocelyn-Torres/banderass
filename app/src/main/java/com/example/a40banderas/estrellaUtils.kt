package com.example.a40banderas

import androidx.compose.ui.graphics.Path
import kotlin.math.cos
import kotlin.math.sin

fun estrellaCuba(
    cx: Float,
    cy: Float,
    radioExterior: Float,
    radioInterior: Float
): Path {
    val path = Path()

    for (i in 0 until 10) {
        val radio = if (i % 2 == 0) {
            radioExterior
        } else {
            radioInterior
        }

        val angulo = Math.toRadians(
            (-90 + i * 36).toDouble()
        )

        val x = cx + radio * cos(angulo).toFloat()
        val y = cy + radio * sin(angulo).toFloat()

        if (i == 0) {
            path.moveTo(x, y)
        } else {
            path.lineTo(x, y)
        }
    }

    path.close()
    return path


}

