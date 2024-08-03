package com.example.firstkotlinappiguess.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class HwScreen {
    @Composable
    fun HomeworkScreen()
    {
        Column(
            modifier = Modifier.fillMaxSize().background(color = Color.Black)
        ){

        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewHW()
    {
        HomeworkScreen()
    }

}