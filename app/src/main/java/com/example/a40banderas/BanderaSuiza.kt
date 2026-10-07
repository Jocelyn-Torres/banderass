package com.example.a40banderas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BanderaSuiza() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD52B1E)),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .width(50.dp)
                .height(140.dp)
                .background(Color.White)
        )

        Box(
            modifier = Modifier
                .width(140.dp)
                .height(50.dp)
                .background(Color.White)
        )
    }
}