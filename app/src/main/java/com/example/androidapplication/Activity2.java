package com.example.androidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        TextView welcomeInfo = findViewById(R.id.welcomeInfo);
        welcomeInfo.setText("Welcome " + username + " to your Home Page");

        String url = "https://cdn-icons-png.flaticon.com/512/3607/3607444.png";
        ImageView imageView = findViewById(R.id.a2image);
        Picasso.get().load(url).into(imageView);

        Button btnLogOut = findViewById(R.id.buttonLogOut);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        WebView webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);

        String urlWebView = "https://dalivali.bg/?location=43";
        webView.loadUrl(urlWebView);
    }
}