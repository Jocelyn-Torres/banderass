package com.example.a40banderas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaTurquia() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (fondo, logo) = createRefs()

        Box(
            modifier = Modifier
                .background(Color(0xFFE30A17))
                .constrainAs(fondo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(logo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        ) {

            val centro = Offset(size.width * 0.42f, size.height * 0.5f)

            drawCircle(
                color = Color.White,
                radius = size.minDimension * 0.20f,
                center = centro
            )

            drawCircle(
                color = Color(0xFFE30A17),
                radius = size.minDimension * 0.16f,
                center = Offset(
                    centro.x + size.minDimension * 0.07f,
                    centro.y - size.minDimension * 0.02f
                )
            )

            val estrellaCentro = Offset(
                size.width * 0.57f,
                size.height * 0.42f
            )

            val puntos = mutableListOf<Offset>()

            val radioExterior = size.minDimension * 0.08f
            val radioInterior = radioExterior * 0.4f

            for (i in 0 until 10) {
                val angulo = Math.toRadians((i * 36.0) - 90.0)

                val radio = if (i % 2 == 0) {
                    radioExterior
                } else {
                    radioInterior
                }

                puntos.add(
                    Offset(
                        estrellaCentro.x + (radio * kotlin.math.cos(angulo)).toFloat(),
                        estrellaCentro.y + (radio * kotlin.math.sin(angulo)).toFloat()
                    )
                )
            }

            val path = androidx.compose.ui.graphics.Path().apply {
                moveTo(puntos[0].x, puntos[0].y)

                for (i in 1 until puntos.size) {
                    lineTo(puntos[i].x, puntos[i].y)
                }

                close()
            }

            drawPath(
                path = path,
                color = Color.White
            )
        }
    }
}