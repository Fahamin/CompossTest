package com.fahim.visiualelement

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

@Composable
fun testDraging() {
    var offsetx by remember {
        mutableStateOf(
            0f
        )
    }
    var offsety by remember {
        mutableStateOf(
            0f
        )
    }
    Column() {
        Box(modifier = Modifier
            .offset { IntOffset(offsetx.roundToInt(), offsety.roundToInt()) }
            .background(Color.Red)
            .size(100.dp)
            .pointerInput(Unit) {
                detectDragGestures { change, dragAmount ->
                    change.consume()
                    offsetx += dragAmount.x
                    offsety += dragAmount.y

                }
            })
    }
}