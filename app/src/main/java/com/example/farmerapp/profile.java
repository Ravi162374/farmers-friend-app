package com.example.farmerapp;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class profile extends AppCompatActivity {

    private EditText editTextName, editTextAge, editTextEmail, editTextBio;
    private Button buttonSave;
    private DatabaseReference databaseReference;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
            // Initialize the Firebase Realtime Database
            databaseReference = FirebaseDatabase.getInstance().getReference();
            System.out.println("welcome");

            // Get references to the EditText fields and the Save button
            editTextName = findViewById(R.id.editTextName);
            editTextAge = findViewById(R.id.editTextAge);
            editTextEmail = findViewById(R.id.editTextEmail);
            editTextBio = findViewById(R.id.editTextBio);
            buttonSave = findViewById(R.id.buttonSave);

            // Handle the Save button click event
            buttonSave.setOnClickListener(view -> {
                // Retrieve the person data from the EditText fields
                String name = editTextName.getText().toString().trim();
                String age = editTextAge.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String bio = editTextBio.getText().toString().trim();

                // Create a Person object with the retrieved data
                Person person = new Person(name, age, email, bio);

                // Upload the person data to Firebase
                databaseReference.child("people").push().setValue(person)
                        .addOnSuccessListener(aVoid -> {
                            Toast.makeText(profile.this, "Data uploaded successfully!", Toast.LENGTH_SHORT).show();
                            // Clear the EditText fields after successful upload
                            editTextName.setText("");
                            editTextAge.setText("");
                            editTextEmail.setText("");
                            editTextBio.setText("");
                        })
                        .addOnFailureListener(e -> {
                            Toast.makeText(profile.this, "Failed to upload data!", Toast.LENGTH_SHORT).show();
                        });
            });
    }
}
