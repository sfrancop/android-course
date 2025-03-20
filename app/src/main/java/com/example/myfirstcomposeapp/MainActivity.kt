package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.components.layout.MyBox
import com.example.myfirstcomposeapp.components.layout.MyColumn
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyColumn(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // from 4 separate [Float] components. Alpha and ColorSpace are optional val rgbaWhiteFloat = Color(red = 1f, green = 1f, blue = 1f, alpha = 1f,     ColorSpace. get(ColorSpaces. Srgb))  // from a 32-bit SRGB color integer val fromIntWhite = Color(android. graphics. Color. WHITE) val fromLongBlue = Color(0xFF0000FF)  // from SRGB integer component values. Alpha is optional val rgbaWhiteInt = Color(red = 0xFF, green = 0xFF, blue = 0xFF, alpha = 0xFF)
    val fromIntWhite = Color(130)
    Text(
        text = "Hello $name!",
        modifier = modifier.background(Color.Red).width(23.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstComposeAppTheme {
        Greeting("Android")
    }
}