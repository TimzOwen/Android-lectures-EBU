package com.timzowen.androidlogo

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
import com.timzowen.androidlogo.ui.theme.AndroidlogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidlogoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposableAndroidLogo(
                    )
                }
            }
        }
    }
}

@Composable
fun ComposableAndroidLogo() {
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android logo",
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
        )
        Text(
            text = "Testing centered text"
        )
        Text(text = "One more Text Centered"
        )
        Text(text = "3rd text aligned again"
        )
    }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row{
            Image(
                painter = painterResource(id = R.drawable.ic_phone) ,
                contentDescription ="phone" )
            Text(
                text = "+254740254637"
            )
        }

    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidlogoTheme {
        ComposableAndroidLogo()
    }
}