package com.example.firstkotlinappiguess

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstkotlinappiguess.ui.theme.Aquamarine
import com.example.firstkotlinappiguess.ui.theme.Periwinkle
import androidx.compose.ui.Alignment

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = Color.Red
    )
}

@Composable
fun SumNumber(num1: Int, num2: Int) {
    Text(
        text = (num1 + num2).toString(),
        color = Aquamarine,
    )
}

@Composable
fun CustomiseText(
    text: String = "Default String",
    color: Color = Color.Black,
    fontSize: Int = 24,
    width: Int = 100,
    height: Int = 100,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Blue
) {
    Text(
        text = text,
        color = color,
        fontSize = fontSize.sp,
        modifier = modifier
            .background(color = backgroundColor)
            .width(width.dp)
            .height(height.dp)
            .padding(start = 50.dp)
    )
}

@Composable
fun CustomiseTextCenterClutterless(
    text: String = "Default String",
    color: Color = Color.Black,
    fontSize: Int = 24,
    width: Int = 100,
    height: Int = 100,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Blue
) {
    Box(
        modifier = modifier
            .padding(0.dp) // Adjust padding as needed
    ) {
        Text(
            text = text,
            color = color,
            fontSize = fontSize.sp,
            modifier = Modifier
                .background(color = backgroundColor)
                .width(width.dp)
                .height(height.dp)
                .align(Alignment.Center) // Centers the text block within the Box
        )
    }
}

@Composable
fun CustomiseTextCenter(
    text: String = "Default String",
    color: Color = Color.Black,
    fontSize: Int = 24,
    width: Int = 100,
    height: Int = 100,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color.Blue
) {
    Box(
        modifier = modifier
            .padding(4.dp) // Adjust padding as needed
    ) {
        Text(
            text = text,
            color = color,
            fontSize = fontSize.sp,
            modifier = Modifier
                .background(color = backgroundColor)
                .width(width.dp)
                .height(height.dp)
                .align(Alignment.Center) // Centers the text block within the Box
        )
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue)
    ) {
        CustomiseText(
            text = "lol",
            fontSize = 12,
            modifier = Modifier.background(color = Periwinkle)
        )
    }
}



