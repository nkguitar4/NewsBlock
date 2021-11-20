package com.google.com.newsblock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webView extends AppCompatActivity {

    Toolbar toolbar;
   // WebView webView;
   // String url;
   // WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        toolbar = findViewById(R.id.toolbark);
        setSupportActionBar(toolbar);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://abcnews.go.com");


    }
}