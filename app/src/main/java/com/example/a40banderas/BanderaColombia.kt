package com.example.a40banderas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaColombia() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (amarillo, azul, rojo) = createRefs()

        Box(
            modifier = Modifier.background(Color(0xFFFFD600)).constrainAs(amarillo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    height = Dimension.percent(0.5f)
                    width = Dimension.fillToConstraints
                }

        )

        Box(
            modifier = Modifier.background(Color(0xFF003893)).constrainAs(azul) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(amarillo.bottom)
                    height = Dimension.percent(0.25f)
                    width = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier.background(Color(0xFFCE1126)).constrainAs(rojo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(azul.bottom)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }

        )


    }
}