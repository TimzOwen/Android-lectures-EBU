package com.timzowen.compose_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.compose_article.ui.theme.Compose_articleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_articleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticle("Compose")
                }
            }
        }
    }
}

@Composable
fun ComposeArticle(name: String) {
    Column {
        val img = painterResource(id = R.drawable.bg_compose_background)
        Box{
            Image(
                painter = img,
                contentDescription ="compose image",
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        Text(
            fontSize = 24.sp,
            text = "Jetpack Compose Article",
            modifier = Modifier
                .wrapContentWidth()
                .fillMaxWidth()
                .padding(start = 18.dp,)
        )
        Text(
            text = " Just a lot of compose materials by the Google android team here" +
                    "Jetpack allows you to build robust app quickly with less code. " +
                    "You write once for UI and backend . No more XML for UI" ,
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 18.dp, end = 8.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Compose_articleTheme {
        ComposeArticle("")
    }
}