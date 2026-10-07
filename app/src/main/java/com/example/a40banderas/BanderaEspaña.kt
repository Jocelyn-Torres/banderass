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
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaEspana() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (rojoArriba, amarillo, rojoAbajo, escudo) = createRefs()

        Box(
            modifier = Modifier.background(Color(0xFFAA151B)).constrainAs(rojoArriba) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    height = Dimension.percent(0.25f)
                    width = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier.background(Color(0xFFF1BF00)).constrainAs(amarillo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(rojoArriba.bottom)
                    height = Dimension.percent(0.5f)
                    width = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier.background(Color(0xFFAA151B)).constrainAs(rojoAbajo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(amarillo.bottom)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        )

        Image(
            painter = painterResource(id = R.drawable.escudoespana),
            contentDescription = "Escudo de España",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(150.dp)
                .height(150.dp)
                .constrainAs(escudo) {
                    start.linkTo(parent.start)
                    top.linkTo(amarillo.top)
                    bottom.linkTo(amarillo.bottom)
                }
        )
    }
}