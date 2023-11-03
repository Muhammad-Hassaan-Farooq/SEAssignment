package com.example.diceroller

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WelcomePage(onbuttonclick: () -> Unit, modifier: Modifier) {
    Text(text = "Welcome to Dice Roller!", modifier = modifier.fillMaxSize(0.5f))
    Button(onClick = onbuttonclick,modifier= modifier.fillMaxSize(0.5f)) {
        Text(text = "Go")
    }
}