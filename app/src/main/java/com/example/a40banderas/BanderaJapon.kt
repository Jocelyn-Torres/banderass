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

@Composable
fun BanderaJapon() {

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        val (circulo) = createRefs()

        Box(
            modifier = Modifier
                .fillMaxSize()
                .constrainAs(circulo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        ) {

            Canvas(
                modifier = Modifier.fillMaxSize()
            ) {

                drawCircle(
                    color = Color(0xFFBC002D),
                    radius = size.minDimension * 0.22f,
                    center = Offset(
                        size.width / 2,
                        size.height / 2
                    )
                )
            }
        }
    }
}