package com.timzowen.mapview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapview : WebView = findViewById<WebView>(R.id.web_googleMaps)
        mapview.settings.javaScriptEnabled = true
        mapview.loadUrl("https://www.google.com/maps/@-1.262591,36.8127474,17z")
    }
}