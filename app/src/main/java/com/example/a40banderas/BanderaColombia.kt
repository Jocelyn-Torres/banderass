package com.example.a40banderas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BanderaColombia() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .weight(2f)
                .fillMaxSize()
                .background(Color(0xFFFFD600))
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFF003893))
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFFCE1126))
        )
    }
}