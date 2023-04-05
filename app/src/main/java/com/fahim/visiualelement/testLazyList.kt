package com.fahim.visiualelement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun testLazyList() {

    Column {
        var nameList = listOf<String>("helo", "kalam", "ok", "islam")
        LazyColumn()
        {
            items(nameList) {
                Text(text = "user $it")
            }
        }
        Divider()
        var nameListrow = listOf<String>("helo", "kalam", "ok", "islam")
        LazyRow()
        {
            items(nameListrow) {
                Text(text = "user $it")
            }
        }
    }

}