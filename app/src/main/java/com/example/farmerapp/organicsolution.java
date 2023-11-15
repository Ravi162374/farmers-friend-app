package com.example.farmerapp;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.farmerapp.databinding.ActivitySolutionBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class organicsolution extends AppCompatActivity {
    private ActivitySolutionBinding binding;
    private DatabaseReference databaseReference;
    private StorageReference storageReference;
    private ProgressBar progressBar;
    private WebView webView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organicsolution);
        Intent intent = getIntent();
        String data = intent.getStringExtra("key");
        storageReference = FirebaseStorage.getInstance().getReference();
        if(data.equals("a")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            StorageReference fileRef = storageReference.child("organic/paddy/blast.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("b")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/sheathblight.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("c")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/brownspot.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("d")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/anthrcnose.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("e")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/bacterialspot.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("f")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/cercosporaleafspot.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("g")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/verticilliumwilt.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("h")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/fusariumwilt.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("i")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/bollrot.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        } else if(data.equals("j")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/redrot.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("k")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/smut.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("l")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/leafscald.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("m")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/leafspot.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("n")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/earlyleafspot.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
        else if(data.equals("o")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/crownrot.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        } else if(data.equals("p")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/leafcurlvirus.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        } else if(data.equals("q")) {
            webView = findViewById(R.id.w);
            webView.setWebViewClient(new WebViewClient());
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference = FirebaseStorage.getInstance().getReference();
            StorageReference fileRef = storageReference.child("organic/paddy/charcoalrot.html");
            fileRef.getDownloadUrl().addOnSuccessListener(uri -> {
                webView.loadUrl(uri.toString());progressBar.setVisibility(View.GONE);
            }).addOnFailureListener(e -> {
                Toast.makeText(organicsolution.this, "Failed to load HTML file", Toast.LENGTH_SHORT).show();
            });
        }
    }
}
