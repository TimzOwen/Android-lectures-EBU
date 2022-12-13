package com.timzowen.androidlogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    ComposableAndroidLogo()
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
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )
        Text(
            text = "Timz Owen",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Mobile Developer instructor",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Green
        )
    }

    Column(modifier = Modifier.fillMaxSize()
        .padding(bottom = 30.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(horizontalArrangement = Arrangement.Center){
            Icon(
                painter = painterResource(id = R.drawable.ic_phone) ,
                tint = Color.Green,
                modifier = Modifier
                    .weight(1f),
                contentDescription ="phone" )
            Text(
                text = "+254740254637",
                modifier = Modifier.weight(1f)
            )
        }
        Row(horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()){
            Icon(
                painter = painterResource(id = R.drawable.ic_phone) ,
                contentDescription ="phone" ,
                modifier = Modifier.weight(1f),
                tint = Color.Green)
            Text(
                modifier = Modifier.weight(1f),
                text = "+254740254637",
            )
        }
        Row(horizontalArrangement = Arrangement.Center){
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_contact_mail_24) ,
                tint = Color.Green,
                modifier = Modifier.weight(1f),
                contentDescription ="phone" )
            Text(
                modifier = Modifier.weight(1f),
                text = "timz.owen@google.com"
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