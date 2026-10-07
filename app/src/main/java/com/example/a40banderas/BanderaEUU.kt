package com.example.a40banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BanderaEstadosUnidos() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            repeat(13) { indice ->

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .background(
                            if (indice % 2 == 0)
                                Color(0xFFB22234)
                            else
                                Color.White
                        )
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth(0.4f)
                .height(180.dp)
                .background(Color(0xFF3C3B6E))
        ) {

            Canvas(
                modifier = Modifier.fillMaxSize()
            ) {

                val filas = 9
                val columnas = 6

                val espacioX = size.width / columnas
                val espacioY = size.height / filas

                for (fila in 0 until filas) {

                    for (columna in 0 until columnas) {

                        drawCircle(
                            color = Color.White,
                            radius = 3.dp.toPx(),
                            center = androidx.compose.ui.geometry.Offset(
                                x = espacioX * columna + espacioX / 2,
                                y = espacioY * fila + espacioY / 2
                            )
                        )
                    }
                }
            }
        }
    }
}