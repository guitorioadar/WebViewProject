package com.shoikot.webviewproject
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)

        // Enable JavaScript (if required)
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        // Load a web page
        webView.loadUrl("https://www.example.com")

        // Set a WebViewClient to handle page navigation
        webView.webViewClient = WebViewClient()
    }

    // Handle back button press in the WebView
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
