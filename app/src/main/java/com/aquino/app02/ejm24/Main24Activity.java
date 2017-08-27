package com.aquino.app02.ejm24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.aquino.app02.R;

public class Main24Activity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);

        webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("https://material.io/");
    }
}


