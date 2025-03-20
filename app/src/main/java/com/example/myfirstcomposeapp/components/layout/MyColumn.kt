package com.example.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.Greeting

@Preview
@Composable
fun MyColumn(modifier: Modifier = Modifier){
    // Columns are the one ables to arrange the content
    Column(modifier = modifier) {
        // Los modifiers son acumulativos, se aplica lo especificado en los parametros y dentro de las funciones
        MyBox(modifier.background(Color.Cyan))
        Greeting(
            name = "Sergio",
            modifier = Modifier
        )
    }
}