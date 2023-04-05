package com.fahim.visiualelement

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment

@Composable
fun alettDialogTest() {

    var opendialg = remember {
        mutableStateOf(false)
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { opendialg.value = true }) {
            Text(text = "Dialog Open")
        }

        if (opendialg.value) {
            AlertDialog(
                onDismissRequest = { opendialg.value = false },
                title = { Text(text = "This is Dialog") },
                text = { Text(text = "Whats UP") },

                confirmButton = {
                    Button(onClick = { opendialg.value = false }) {
                        Text(text = "ok")
                    }
                },
                dismissButton = {
                    Button(onClick = { opendialg.value = false }) {
                        Text(text = "Cancle")
                    }
                }
            )

        }
    }
}