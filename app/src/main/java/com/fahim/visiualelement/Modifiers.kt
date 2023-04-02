package com.fahim.visiualelement

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TestModify() {
    Column(modifier = Modifier.padding(24.dp)
        .background(Color.Blue).background(Color.Cyan)
        .fillMaxSize()
        .clickable {  })
    {

        Text(text = "Hello Fahamin", modifier =
        Modifier.background(Color.Green))
        Text(text = "Hello fahim")

    }
}