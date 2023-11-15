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

public class schemes extends AppCompatActivity {
private WebView webView;
private ProgressBar progressBar;
private StorageReference storageReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);
        Intent intent = getIntent();
        String data = intent.getStringExtra("key");
        String language=intent.getStringExtra("language");
        if(data.equals("central")&&language.equals("తెలుగు")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("centraltelugu.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(schemes.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("central")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("central.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(schemes.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("telangana")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("telangana.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(schemes.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("spray")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("spray.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(schemes.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("cult")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("cult.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(schemes.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
    }
}