package com.example.learnjetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learnjetpackcompose.ui.theme.LearnJetpackComposeTheme
import com.google.android.material.color.MaterialColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                   DefaultPreview()
                }
            }
        }
    }
}

@Composable
fun StudentDetails(name: String, roll: String, age: String) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .clickable {
                Log.d("TAG", "name : $name is clicked")
            }
    ) {
        Column(modifier = Modifier.padding(start = 16.dp)) {
            Text(
                text = "Name: Md. $name",
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
                style = MaterialTheme.typography.subtitle1,
                color = Color.DarkGray
            )
            Text(
                text = "Age: $age, roll: $roll",
                modifier = Modifier.padding(bottom = 8.dp),
                style = MaterialTheme.typography.caption,
                color = Color.DarkGray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnJetpackComposeTheme {
        Surface(color = MaterialTheme.colors.background) {
           Column(
               verticalArrangement = Arrangement.Top,
               horizontalAlignment = Alignment.Start,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(8.dp)
                   .clip(RoundedCornerShape(16.dp))
                   .verticalScroll(rememberScrollState())
           ) {
               StudentDetails(name = "Warid", roll = "1", age = "13")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Hossain", roll = "2", age = "14")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Warid", roll = "1", age = "13")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Hossain", roll = "2", age = "14")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Warid", roll = "1", age = "13")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Hossain", roll = "2", age = "14")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Warid", roll = "1", age = "13")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Hossain", roll = "2", age = "14")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Hossain", roll = "2", age = "14")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Warid", roll = "1", age = "13")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Hossain", roll = "2", age = "14")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Warid", roll = "1", age = "13")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Hossain", roll = "2", age = "14")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Warid", roll = "1", age = "13")
               Spacer(modifier = Modifier.height(2.dp))
               StudentDetails(name = "Hossain", roll = "2", age = "14")
           }
        }
    }
}