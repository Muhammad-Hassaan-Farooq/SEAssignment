package com.example.diceroller

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun WelcomePage(onbuttonclick: () -> Unit) {
    Text(text = "Welcome to Dice Roller!")
    Button(onClick = onbuttonclick) {
        Text(text = "Go")
    }
}