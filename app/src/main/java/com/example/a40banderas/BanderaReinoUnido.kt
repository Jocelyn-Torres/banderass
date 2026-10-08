package com.example.a40banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path

@Composable
fun BanderaReinoUnido() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val w = size.width
        val h = size.height

        drawRect(
            color = Color(0xFF012169),
            size = size
        )


        val diagonalBlanca1 = Path().apply {
            moveTo(0f, 0f)
            lineTo(w * 0.13f, 0f)
            lineTo(w, h * 0.87f)
            lineTo(w, h)
            lineTo(w * 0.87f, h)
            lineTo(0f, h * 0.13f)
            close()
        }

        drawPath(
            path = diagonalBlanca1,
            color = Color.White
        )

        val diagonalBlanca2 = Path().apply {
            moveTo(w, 0f)
            lineTo(w, h * 0.13f)
            lineTo(w * 0.13f, h)
            lineTo(0f, h)
            lineTo(0f, h * 0.87f)
            lineTo(w * 0.87f, 0f)
            close()
        }

        drawPath(
            path = diagonalBlanca2,
            color = Color.White
        )


        val diagonalRoja1 = Path().apply {
            moveTo(0f, 0f)
            lineTo(w * 0.055f, 0f)
            lineTo(w, h * 0.945f)
            lineTo(w, h)
            lineTo(w * 0.945f, h)
            lineTo(0f, h * 0.055f)
            close()
        }

        drawPath(
            path = diagonalRoja1,
            color = Color(0xFFC8102E)
        )

        val diagonalRoja2 = Path().apply {
            moveTo(w, 0f)
            lineTo(w, h * 0.055f)
            lineTo(w * 0.055f, h)
            lineTo(0f, h)
            lineTo(0f, h * 0.945f)
            lineTo(w * 0.945f, 0f)
            close()
        }

        drawPath(
            path = diagonalRoja2,
            color = Color(0xFFC8102E)
        )


        drawRect(
            color = Color.White,
            topLeft = Offset(0f, h * 0.38f),
            size = androidx.compose.ui.geometry.Size(
                w,
                h * 0.24f
            )
        )

        drawRect(
            color = Color.White,
            topLeft = Offset(w * 0.38f, 0f),
            size = androidx.compose.ui.geometry.Size(
                w * 0.24f,
                h
            )
        )



        drawRect(
            color = Color(0xFFC8102E),
            topLeft = Offset(0f, h * 0.44f),
            size = androidx.compose.ui.geometry.Size(
                w,
                h * 0.12f
            )
        )

        drawRect(
            color = Color(0xFFC8102E),
            topLeft = Offset(w * 0.44f, 0f),
            size = androidx.compose.ui.geometry.Size(
                w * 0.12f,
                h
            )
        )
    }
}