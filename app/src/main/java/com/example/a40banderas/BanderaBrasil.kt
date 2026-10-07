package com.example.a40banderas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaBrasil() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (fondo, escudo) = createRefs()

        Box(
            modifier = Modifier
                .constrainAs(fondo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
                .background(Color(0xFF009B3A))
        )


        Image(
            painter = painterResource(id = R.drawable.escudobrasil),
            contentDescription = "Escudo de Brasil",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(180.dp)
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