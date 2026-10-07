package com.example.a40banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke

@Composable
fun BanderaBrasil() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF009B3A))
    ) {

        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {

            val centroX = size.width / 2
            val centroY = size.height / 2

            val ancho = size.width * 0.75f
            val alto = size.height * 0.55f

            val rombo = Path().apply {
                moveTo(centroX, centroY - alto / 2)
                lineTo(centroX + ancho / 2, centroY)
                lineTo(centroX, centroY + alto / 2)
                lineTo(centroX - ancho / 2, centroY)
                close()
            }

            drawPath(
                path = rombo,
                color = Color(0xFFFFDF00)
            )

            drawCircle(
                color = Color(0xFF002776),
                radius = size.minDimension * 0.18f,
                center = Offset(centroX, centroY)
            )
        }
    }
}