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
fun BanderaAlemania() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (negro, rojo, amarillo) = createRefs()

        Box(
            modifier = Modifier
                .constrainAs(negro) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    height = Dimension.percent(0.333f)
                    width = Dimension.fillToConstraints
                }
                .background(Color.Black)
        )

        Box(
            modifier = Modifier
                .constrainAs(rojo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(negro.bottom)
                    height = Dimension.percent(0.334f)
                    width = Dimension.fillToConstraints
                }
                .background(Color(0xFFDD0000))
        )

        Box(
            modifier = Modifier
                .constrainAs(amarillo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(rojo.bottom)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
                .background(Color(0xFFFFCE00))
        )
    }
}