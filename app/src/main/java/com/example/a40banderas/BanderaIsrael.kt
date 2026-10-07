package com.example.a40banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
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

@Composable
fun BanderaIsrael() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {

            val azul = Color(0xFF0038B8)


            drawRect(
                color = azul,
                topLeft = Offset(
                    0f,
                    size.height * 0.12f
                ),
                size = Size(
                    size.width,
                    size.height * 0.12f
                )
            )


            drawRect(
                color = azul,
                topLeft = Offset(
                    0f,
                    size.height * 0.76f
                ),
                size = Size(
                    size.width,
                    size.height * 0.12f
                )
            )


            val cx = size.width / 2
            val cy = size.height / 2
            val r = size.minDimension * 0.18f

            drawPath(
                path = trianglePath(
                    cx,
                    cy,
                    r,
                    -90f
                ),
                color = azul,
                style = Stroke(width = 8f)
            )

            drawPath(
                path = trianglePath(
                    cx,
                    cy,
                    r,
                    90f
                ),
                color = azul,
                style = Stroke(width = 8f)
            )
        }
    }
}