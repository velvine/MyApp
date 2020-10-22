package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import android.os.Bundle;

public class AboutAlc extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        String url = "https://andela.com/alc/";
        webView = (WebView) findViewById(R.id.parent);

        webView.setWebViewClient(new mWebClient());
        webView.loadUrl(url);
    }
    private class mWebClient extends WebViewClient{
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
            handler.proceed();
        }
    }
}
