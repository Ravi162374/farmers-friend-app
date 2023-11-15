package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class myprofile extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("people");
        TextView textViewData;
        // Get reference to the TextView
        textViewData = findViewById(R.id.textview);

        // Retrieve the person data from Firebase
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                StringBuilder stringBuilder = new StringBuilder();

                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Person person = snapshot.getValue(Person.class);

                    // Append the person data to the StringBuilder
                    stringBuilder.append("Name: ").append(person.getName()).append("\n");
                    stringBuilder.append("Age: ").append(person.getAge()).append("\n");
                    stringBuilder.append("Email: ").append(person.getEmail()).append("\n");
                    stringBuilder.append("Bio: ").append(person.getBio()).append("\n\n");
                }

                // Set the text in the TextView
                textViewData.setText(stringBuilder.toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Handle database error
            }
        });
    }
}