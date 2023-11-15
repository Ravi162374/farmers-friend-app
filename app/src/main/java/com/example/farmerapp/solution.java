package com.example.farmerapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.farmerapp.databinding.ActivitySolutionBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

public class solution extends AppCompatActivity {
    private ActivitySolutionBinding binding;
    private DatabaseReference databaseReference;
    private StorageReference storageReference;
    private ProgressBar progressBar;
    private TextView p0,p1,p2,p3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySolutionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button b1=findViewById(R.id.buy);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(solution.this,buy.class);
                startActivity(intent);
            }
        });
        Button b2=findViewById(R.id.buy1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(solution.this,buy.class);
                startActivity(intent);
            }
        });
        Button b3=findViewById(R.id.buy2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(solution.this,buy.class);
                startActivity(intent);
            }
        });
        databaseReference = FirebaseDatabase.getInstance().getReference();
        storageReference = FirebaseStorage.getInstance().getReference();
        Intent intent = getIntent();
        String data = intent.getStringExtra("key");
        if (data.equals("a")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/blast/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/blast/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/blast/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/blast/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("b")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Sheath blight disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/sheathblight/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/sheathblight/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/sheathblight/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/sheathblight/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("c")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Brownspot disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/brownspot/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/brownspot/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/brownspot/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/brownspot/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        /*else if (data.equals("d")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/anthracnose/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/anthracnose/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/anthracnose/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/anthracnose/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("e")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/bacterialspot/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/bacterialspot/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/bacterialspot/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            storageReference.child("inorganic/paddy/bacterialspot/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("f")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);

            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/cercosporaleafspot/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/cercosporaleafspot/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/cercosporaleafspot/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/cercosporaleafspot/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("g")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/verticilliumwilt/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/verticilliumwilt/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/verticilliumwilt/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/verticilliumwilt/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("h")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");

            storageReference.child("inorganic/paddy/fusariumwilt/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/fusariumwilt/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/fusariumwilt/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/fusariumwilt/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("i")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/bollrot/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/bollrot/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/bollrot/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/bollrot/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("j")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");

            storageReference.child("inorganic/paddy/redrot/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/redrot/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/redrot/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/redrot/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("k")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");

            storageReference.child("inorganic/paddy/smut/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/smut/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/smut/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/smut/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("l")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/leafscald/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/leafscald/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/leafscald/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/leafscald/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("m")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/LeafSpot/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/LeafSpot/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/LeafSpot/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/LeafSpot/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("n")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/earlyleafspot/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/earlyleafspot/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/earlyleafspot/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/earlyleafspot/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("o")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");

            storageReference.child("inorganic/paddy/crownrot/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/crownrot/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/crownrot/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/crownrot/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("p")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/leafcurlvirus/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/leafcurlvirus/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/leafcurlvirus/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/leafcurlvirus/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }
        else if (data.equals("q")) {
            TextView p0,p1,p2,p3;
            p0 = findViewById(R.id.p0);p1 = findViewById(R.id.p1);p2 = findViewById(R.id.p2);p3 = findViewById(R.id.p3);
            p0.setText("Blast disease");
            p1.setText("Mancozeb");
            p2.setText("popicon");
            p3.setText("Tricyclazole");
            storageReference.child("inorganic/paddy/mangomalformation/image0.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView0);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
            progressBar = findViewById(R.id.progressBar1);progressBar.setVisibility(View.VISIBLE);
            storageReference.child("inorganic/paddy/mangomalformation/image1.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView1);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/mangomalformation/image2.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView2);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});

            storageReference.child("inorganic/paddy/mangomalformation/image3.jpeg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                @Override
                public void onSuccess(Uri uri) {
                    Picasso.get().load(uri).into(binding.imageView3);progressBar.setVisibility(View.GONE);}
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception exception) {Log.e("Firebase", "Image retrieval failed", exception);}});
        }*/
    }
}
