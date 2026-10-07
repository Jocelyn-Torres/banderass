package com.example.a40banderas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaArgentina() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (azulArriba, blanco, azulAbajo, escudo) = createRefs()

        Box(
            modifier = Modifier.background(Color(0xFF74ACDF)).constrainAs(azulArriba) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    height = Dimension.percent(0.333f)
                    width = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier.background(Color.White).constrainAs(blanco) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(azulArriba.bottom)
                    height = Dimension.percent(0.334f)
                    width = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier.background(Color(0xFF74ACDF)).constrainAs(azulAbajo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(blanco.bottom)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }

        )

        Image(
            painter = painterResource(id = R.drawable.escudoargentina),
            contentDescription = "Escudo de Argentina",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(100.dp)
                .height(150.dp)
                .constrainAs(escudo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    horizontalBias = 0.5f
                    verticalBias = 0.5f
                }
        )
    }
}