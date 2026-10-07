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
fun BanderaSuiza() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (fondo, vertical, horizontal) = createRefs()

        Box(
            modifier = Modifier
                .background(Color(0xFFD52B1E))
                .constrainAs(fondo) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(vertical) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.percent(0.16f)
                    height = Dimension.percent(0.55f)
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(horizontal) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.percent(0.55f)
                    height = Dimension.percent(0.10f)
                }
        )
    }
}