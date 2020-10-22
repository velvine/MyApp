package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openalc (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://andela.com/alc/"));
        startActivity(browserIntent);
    }

 public void myprofile(View view){
        Intent intent=new Intent(this,Profile.class);
        startActivity(intent);
 }

    }
