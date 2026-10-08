package com.example.a40banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap

@Composable
fun BanderaSudafrica() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {

        val w = size.width
        val h = size.height


        drawRect(
            color = Color(0xFF002395),
            size = size
        )


        val amarilloFondo = Path().apply {
            moveTo(0f, h * 0.62f)
            lineTo(w * 0.40f, h * 0.50f)
            lineTo(w, h * 0.62f)
            lineTo(w, h)
            lineTo(0f, h)
            close()
        }

        drawPath(
            path = amarilloFondo,
            color = Color(0xFFFFB81C)
        )


        val apex = Offset(
            w * 0.36f,
            h / 2f
        )

        drawLine(
            color = Color.White,
            start = Offset(0f, 0f),
            end = apex,
            strokeWidth = h * 0.30f,
            cap = StrokeCap.Butt
        )

        drawLine(
            color = Color.White,
            start = Offset(0f, h),
            end = apex,
            strokeWidth = h * 0.30f,
            cap = StrokeCap.Butt
        )

        drawLine(
            color = Color.White,
            start = apex,
            end = Offset(w, h * 0.14f),
            strokeWidth = h * 0.30f,
            cap = StrokeCap.Butt
        )

        drawLine(
            color = Color.White,
            start = apex,
            end = Offset(w, h * 0.86f),
            strokeWidth = h * 0.30f,
            cap = StrokeCap.Butt
        )


        drawLine(
            color = Color(0xFF007A4D),
            start = Offset(0f, 0f),
            end = apex,
            strokeWidth = h * 0.20f,
            cap = StrokeCap.Butt
        )

        drawLine(
            color = Color(0xFF007A4D),
            start = Offset(0f, h),
            end = apex,
            strokeWidth = h * 0.20f,
            cap = StrokeCap.Butt
        )

        drawLine(
            color = Color(0xFF007A4D),
            start = apex,
            end = Offset(w, h * 0.14f),
            strokeWidth = h * 0.20f,
            cap = StrokeCap.Butt
        )

        drawLine(
            color = Color(0xFF007A4D),
            start = apex,
            end = Offset(w, h * 0.86f),
            strokeWidth = h * 0.20f,
            cap = StrokeCap.Butt
        )


        val amarillo = Path().apply {
            moveTo(0f, h * 0.12f)
            lineTo(w * 0.45f, h * 0.50f)
            lineTo(0f, h * 0.88f)
            lineTo(0f, h * 0.78f)
            lineTo(w * 0.34f, h * 0.50f)
            lineTo(0f, h * 0.22f)
            close()
        }


        val negro = Path().apply {
            moveTo(0f, h * 0.10f)
            lineTo(w * 0.35f, h * 0.50f)
            lineTo(0f, h * 0.88f)
            close()
        }

        drawPath(
            path = negro,
            color = Color.Black
        )
    }
}