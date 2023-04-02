package com.fahim.visiualelement

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp

@Composable
fun testText() {
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "this is option")
        Text(text = stringResource(id = R.string.test), color = Color.Blue, fontSize = 45.sp)

        var name = remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text(text = "Enter Name") }
        )


        var surename = remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(
            value = surename.value,
            onValueChange = { surename.value = it },
            label = { Text(text = "Enter Name") }
        )
    }


}