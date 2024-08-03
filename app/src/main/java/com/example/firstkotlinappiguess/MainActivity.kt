package com.example.firstkotlinappiguess

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.firstkotlinappiguess.ui.theme.Aquamarine
import com.example.firstkotlinappiguess.ui.theme.Azure
import com.example.firstkotlinappiguess.ui.theme.Chartreuse
import com.example.firstkotlinappiguess.ui.theme.Cyan
import com.example.firstkotlinappiguess.ui.theme.Dawn
import com.example.firstkotlinappiguess.ui.theme.Lime
import com.example.firstkotlinappiguess.ui.theme.Mint
import com.example.firstkotlinappiguess.ui.theme.Olive
import com.example.firstkotlinappiguess.ui.theme.Periwinkle
import com.example.firstkotlinappiguess.ui.theme.Sunset
import com.example.firstkotlinappiguess.ui.theme.Yellowish


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 350, height = 15, backgroundColor = Periwinkle)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 330, height = 15, backgroundColor = Azure)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 310, height = 15, backgroundColor = Cyan)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 290, height = 15, backgroundColor = Mint)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 270, height = 15, backgroundColor = Lime)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 250, height = 15, backgroundColor = Chartreuse)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 230, height = 15, backgroundColor = Olive)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 210, height = 15, backgroundColor = Yellowish)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 190, height = 15, backgroundColor = Dawn)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 170, height = 15, backgroundColor = Sunset)
                CustomiseText(text = "", fontSize = 24, color = Color.Black, width = 350, height = 25, backgroundColor = Color.White)
                CustomiseText(text = "welcome to funny clicker game", fontSize = 24, color = Color.Black, width = 650, height = 100, backgroundColor = Color.White)
                CustomiseText(text = "", fontSize = 24, color = Color.Black, width = 350, height = 25, backgroundColor = Color.White)
                CustomiseTextCenterClutterless(text = "", fontSize = 24, color = Color.Black, width = 450, height = 5, backgroundColor = Color.Gray)
                CustomiseTextCenterClutterless(text = "Click to start game", fontSize = 24, color = Color.Black, width = 450, height = 45, backgroundColor = Color.LightGray)
                CustomiseTextCenterClutterless(text = "", fontSize = 24, color = Color.Black, width = 450, height = 5, backgroundColor = Color.Gray)
                CustomiseText(text = "", fontSize = 24, color = Color.Black, width = 350, height = 10, backgroundColor = Color.White)
                CustomiseTextCenterClutterless(text = "", fontSize = 24, color = Color.Black, width = 450, height = 5, backgroundColor = Color.Gray)
                CustomiseTextCenterClutterless(text = "View achievements", fontSize = 24, color = Color.Black, width = 450, height = 45, backgroundColor = Color.LightGray)
                CustomiseTextCenterClutterless(text = "", fontSize = 24, color = Color.Black, width = 450, height = 5, backgroundColor = Color.Gray)
                CustomiseText(text = "", fontSize = 24, color = Color.Black, width = 350, height = 10, backgroundColor = Color.White)
                CustomiseTextCenterClutterless(text = "", fontSize = 24, color = Color.Black, width = 450, height = 5, backgroundColor = Color.Gray)
                CustomiseTextCenterClutterless(text = "Save and exit", fontSize = 24, color = Color.Black, width = 450, height = 45, backgroundColor = Color.LightGray)
                CustomiseTextCenterClutterless(text = "", fontSize = 24, color = Color.Black, width = 450, height = 5, backgroundColor = Color.Gray)
                CustomiseText(text = "", fontSize = 24, color = Color.Black, width = 350, height = 10, backgroundColor = Color.White)
                CustomiseText(text = "", fontSize = 24, color = Color.Black, width = 450, height = 25, backgroundColor = Color.White)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 170, height = 15, backgroundColor = Sunset)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 190, height = 15, backgroundColor = Dawn)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 210, height = 15, backgroundColor = Yellowish)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 230, height = 15, backgroundColor = Olive)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 250, height = 15, backgroundColor = Chartreuse)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 270, height = 15, backgroundColor = Lime)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 290, height = 15, backgroundColor = Mint)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 310, height = 15, backgroundColor = Cyan)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 330, height = 15, backgroundColor = Azure)
                CustomiseTextCenter(text = "", fontSize = 24, color = Aquamarine, width = 350, height = 15, backgroundColor = Periwinkle)


            }
        }
    }
}