package com.example.a40banderas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BanderaArgentina() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFF74ACDF))
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color.White)
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFF74ACDF))
        )
    }
}