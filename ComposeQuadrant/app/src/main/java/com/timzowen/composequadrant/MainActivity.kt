package com.timzowen.composequadrant

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.timzowen.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposableQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposableQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
        }
        
    }
}

@Composable
fun ComposableCardInfo(
    title: String,
    desc: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
    ){
    Column (
        modifier= modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        ComposableQuadrantApp()
    }
}