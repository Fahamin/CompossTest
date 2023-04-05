package com.fahim.visiualelement

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

@Composable
fun testButtons() {

    var context = LocalContext.current

    var images = painterResource(id = R.drawable.ic_android_black_24dp);
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show() }) {
          Image(painter = images, contentDescription = "")
            Text(text = "Button Test")
        }
    }
}