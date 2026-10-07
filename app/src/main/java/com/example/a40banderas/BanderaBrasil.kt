package com.example.a40banderas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BanderaBrasil() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF009B3A)),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.escudobrasil),
            contentDescription = "Escudo de Brasil",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(180.dp)
        )
    }
}