package com.example.learnjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetpackComposeTheme {
                Greeting(greeting = "Jetpack Compose")
            }
        }
    }
}

@Composable
fun Greeting(greeting: String) {
    Text(text = greeting)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnJetpackComposeTheme {
        LearnJetpackComposeTheme {
            Greeting(greeting = "Jetpack Compose")
        }
    }
}