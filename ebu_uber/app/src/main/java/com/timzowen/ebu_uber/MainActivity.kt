package com.timzowen.ebu_uber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView : WebView = findViewById(R.id.webview_maps)
        webView.settings.javaScriptEnabled=true
        webView.loadUrl("https://www.google.com/maps/@-1.262591,36.8127474,17z")


    }


}