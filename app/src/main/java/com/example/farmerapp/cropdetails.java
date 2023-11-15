package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class cropdetails extends AppCompatActivity {
    private WebView webView;
    private ProgressBar progressBar;
    private StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cropdetails);
        Intent intent = getIntent();
        String data = intent.getStringExtra("key");
        String language=intent.getStringExtra("language");
        WebView web=findViewById(R.id.w);
        if(data.equals("cotton"))
        {
            web.loadUrl("file:///android_asset/cotton_diseases.html");
        }
        if(data.equals("central")&&language.equals("తెలుగు")) {
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("centraltelugu.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(cropdetails.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("groundnut"))
        {
            web.loadUrl("file:///android_asset/groundnut_diseases.html");
        }
        else if(data.equals("ladyfinger"))
        {
            web.loadUrl("file:///android_asset/ladyfinger_diseases.html");
        }
        else if(data.equals("maize"))
        {
            web.loadUrl("file:///android_asset/maize_disease.html");
        }
        else if(data.equals("mango"))
        {
            web.loadUrl("file:///android_asset/mangotrees_diseases.html");
        }
        else if(data.equals("mirchi"))
        {
            web.loadUrl("file:///android_asset/chilis_diseases.html");
        }
        else if(data.equals("paddy"))
        {
            web.loadUrl("file:///android_asset/paddy_diseases.html");
        }
        else if(data.equals("sugarcane"))
        {
            web.loadUrl("file:///android_asset/sugarcane_diseases.html");
        }
    }
}