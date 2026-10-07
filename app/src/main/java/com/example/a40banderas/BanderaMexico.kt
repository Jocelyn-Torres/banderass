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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaMexico(modifier: Modifier = Modifier) {

    ConstraintLayout(
        modifier = modifier.fillMaxSize()
    ) {

        val (verde, blanco, rojo, escudo) = createRefs()

        val lineaGuia1 = createGuidelineFromStart(0.33f)
        val lineaGuia2 = createGuidelineFromStart(0.66f)


        Box(
            modifier = Modifier
                .background(Color(0xFF006847))
                .constrainAs(verde) {
                    start.linkTo(parent.start)
                    end.linkTo(lineaGuia1)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )


        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(blanco) {
                    start.linkTo(lineaGuia1)
                    end.linkTo(lineaGuia2)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )


        Box(
            modifier = Modifier
                .background(Color(0xFFCE1126))
                .constrainAs(rojo) {
                    start.linkTo(lineaGuia2)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )


        Image(
            painter = painterResource(id = R.drawable.escudo),
            contentDescription = "Escudo de México",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(120.dp)
                .constrainAs(escudo) {
                    start.linkTo(lineaGuia1)
                    end.linkTo(lineaGuia2)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaMexicoPreview() {
    BanderaMexico()
}