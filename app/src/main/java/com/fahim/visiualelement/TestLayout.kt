package com.fahim.visiualelement

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun testLayout() {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Text(text = "Hello Fahamin")
        // Text(text = "Are you happy")

        /*Row(modifier = Modifier
            .background(Color.Blue)
            .width(45.dp)
            .height(45.dp)) {

        }

        Row(modifier = Modifier
            .background(Color.Blue)
            .width(45.dp)
            .height(45.dp)) {

        }
        Row(modifier = Modifier
            .background(Color.Blue)
            .width(45.dp)
            .height(45.dp)) {

        }*/

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize(1f)
                .background(Color.Blue)
        ) {
            Text(text = "hello \n Android", modifier = Modifier.background(Color.Green))
            CircularProgressIndicator()
        }
    }

}