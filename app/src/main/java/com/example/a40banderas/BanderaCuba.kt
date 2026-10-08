package com.example.a40banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path

@Composable
fun BanderaCuba() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        val band = size.height / 5f

        for (i in 0 until 5) {
            if (i % 2 == 0) {
                drawRect(
                    color = Color(0xFF002E6E),
                    topLeft = Offset(0f, i * band),
                    size = Size(size.width, band)
                )
            }
        }

        val triWidth = size.width * 0.38f

        val trianglePath = Path().apply {
            moveTo(0f, 0f)
            lineTo(triWidth, size.height / 2f)
            lineTo(0f, size.height)
            close()
        }

        drawPath(
            path = trianglePath,
            color = Color(0xFFCB1428)
        )

        val cx = triWidth * 0.38f
        val cy = size.height / 2f

        drawPath(
            path = estrellaCuba(
                cx,
                cy,
                size.height * 0.10f,
                size.height * 0.04f
            ),
            color = Color.White
        )
    }
}