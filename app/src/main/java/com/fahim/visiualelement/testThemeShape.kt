package com.fahim.visiualelement

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun testThemeShape() {
    Column(verticalArrangement = Arrangement.Center) {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colors.primary)
                .fillMaxSize(0.2f)
                .height(10.dp)
        ) {

        }

        Box(
            modifier = Modifier
                .padding(8.dp)
                .clip(MaterialTheme.shapes.small)
                .background(Color.Red)
                .height(145.dp)
                .width(145.dp)
        ) {

        }

    }
}


