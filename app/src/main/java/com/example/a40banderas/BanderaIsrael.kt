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
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaIsrael(modifier: Modifier = Modifier) {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (fondo, logo) = createRefs()

        Box(
            modifier = Modifier
                .background(Color.White)
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

            // Estrella de David
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