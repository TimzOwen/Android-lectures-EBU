package com.timzowen.businesscardcompose

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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timzowen.businesscardcompose.ui.theme.BusinessCardComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardImage("Google","drinks")
                }
            }
        }
    }
}

@Composable
fun BusinessAdvertText(name: String,food:String ){
    Column {
        Text(
            text = "Welcome on board $name",
            fontSize = 26.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 8.dp, end = 8.dp, top = 18.dp)
        )
        Text(
            text = "Lets Order some $food",
            fontSize = 22.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 8.dp, end = 8.dp)
        )
    }
}

@Composable
fun BusinessCardImage(name: String, food: String){

    Image(
        painter = painterResource(id = R.drawable.google),
        contentDescription = "sample",
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    )

    BusinessAdvertText(name = "Google", food = "Juice")

}

@Preview(showBackground = true)
@Composable
fun BusinessPreview(){
    BusinessCardImage("Facebook","likes")
}
