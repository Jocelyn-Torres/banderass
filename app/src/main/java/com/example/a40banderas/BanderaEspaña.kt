package com.example.a40banderas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BanderaEspana() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            // Franja roja superior
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color(0xFFAA151B))
            )

            // Franja amarilla
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                    .background(Color(0xFFF1BF00))
            )

            // Franja roja inferior
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color(0xFFAA151B))
            )
        }

        // Escudo de España
        Image(
            painter = painterResource(id = R.drawable.escudoespana),
            contentDescription = "Escudo de España",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .height(150.dp)
                .align(Alignment.Center)
        )
    }
}