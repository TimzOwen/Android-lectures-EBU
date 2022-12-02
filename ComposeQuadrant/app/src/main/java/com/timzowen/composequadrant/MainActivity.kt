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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
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
            ComposableCardInfo(
                title = stringResource(R.string.text_composable),
                desc = stringResource(R.string.composable_text),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            ComposableCardInfo(
                title = stringResource(R.string.image_composable),
                desc = stringResource(R.string.composable_image),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableCardInfo(
                title = stringResource(R.string.column_composable),
                desc = stringResource(R.string.composable_column),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            ComposableCardInfo(title = stringResource(R.string.row_composable),
                desc = stringResource(id = R.string.composable_row),
                backgroundColor = Color.Blue,
                modifier = Modifier.weight(1f)
            )
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