package com.fahim.visiualelement

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage

@Composable
fun testImage() {

    Column() {
        var image = painterResource(id = R.drawable.record)
        Image(painter = image, contentDescription = "")

        var drableImage = painterResource(id = R.drawable.ic_android_black_24dp)
        Image(painter = drableImage, contentDescription = "")


        AsyncImage(
            model = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg",
            contentDescription = null
        )

        var context = LocalContext.current
        Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show()
    }


}