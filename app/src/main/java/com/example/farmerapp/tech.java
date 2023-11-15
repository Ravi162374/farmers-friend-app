package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class tech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        WebView web=findViewById(R.id.w);
        Intent intent = getIntent();
        String data = intent.getStringExtra("key");
        if(data.equals("broadcasting"))
        {
            web.loadUrl("file:///android_asset/Broadcasting.html");
        }
        else if(data.equals("bandplacement"))
        {
            web.loadUrl("file:///android_asset/Band-placement.html");
        }
        else if(data.equals("fertigation"))
        {
            web.loadUrl("file:///android_asset/fertigation.html");
        }
        else if(data.equals("foliar"))
        {
            web.loadUrl("file:///android_asset/Foliar_application.html");
        }
        else if(data.equals("pellet"))
        {
            web.loadUrl("file:///android_asset/Pellet_application.html");
        }
        else if(data.equals("stater"))
        {
            web.loadUrl("file:///android_asset/starter_sol.html");
        }
        else if(data.equals("placement"))
        {
            web.loadUrl("file:///android_asset/Placement.html");
        }
    }
}