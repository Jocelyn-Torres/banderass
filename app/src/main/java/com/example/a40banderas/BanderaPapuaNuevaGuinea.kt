package com.example.a40banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaPapuaNuevaGuinea() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val w = size.width
        val h = size.height

        // Fondo rojo
        drawRect(
            color = Color(0xFFCE1126),
            size = size
        )

        // Triángulo negro inferior
        val negro = Path().apply {
            moveTo(0f, 0f)
            lineTo(0f, h)
            lineTo(w, h)
            close()
        }

        drawPath(
            path = negro,
            color = Color.Black
        )
// =========================
// AVE DEL PARAÍSO AMARILLA
// =========================

        val ave = Path().apply {
            moveTo(w * 0.16f, h * 0.53f)
            lineTo(w * 0.23f, h * 0.45f)
            lineTo(w * 0.29f, h * 0.37f)
            lineTo(w * 0.35f, h * 0.42f)
            lineTo(w * 0.42f, h * 0.36f)
            lineTo(w * 0.39f, h * 0.47f)
            lineTo(w * 0.51f, h * 0.42f)
            lineTo(w * 0.42f, h * 0.51f)
            lineTo(w * 0.51f, h * 0.56f)
            lineTo(w * 0.39f, h * 0.55f)
            lineTo(w * 0.34f, h * 0.64f)
            lineTo(w * 0.31f, h * 0.54f)
            lineTo(w * 0.22f, h * 0.61f)
            lineTo(w * 0.25f, h * 0.51f)
            close()
        }

        drawPath(
            path = ave,
            color = Color(0xFFFCD116)
        )

        // =========================
        // ESTRELLAS EN EL ROJO
        // =========================

        val estrellas = listOf(
            // Estrella grande
            Offset(w * 0.80f, h * 0.27f),

            // Estrella superior
            Offset(w * 0.64f, h * 0.16f),

            // Estrella derecha
            Offset(w * 0.67f, h * 0.68f),

            // Estrella inferior derecha
            Offset(w * 0.74f, h * 0.50f),

            // Estrella central
            Offset(w * 0.55f, h * 0.90f)
        )

        for (estrella in estrellas) {
            drawPath(
                path = crearEstrella(
                    estrella.x,
                    estrella.y,
                    h * 0.035f,
                    h * 0.014f
                ),
                color = Color.White
            )
        }
    }
}

fun crearEstrella(
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