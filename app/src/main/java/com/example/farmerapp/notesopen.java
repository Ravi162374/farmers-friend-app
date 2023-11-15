package com.example.farmerapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.IOException;

public class notesopen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notesopen);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView=findViewById(R.id.textview);
        try {
            FileInputStream fIn = openFileInput("file1.txt");
            int c;
            String temp="";
            while((c=fIn.read())!=-1)
            {
                temp=temp +Character.toString((char)c);
            }
            textView.setText(temp);

        } catch (IOException e) {
            Toast.makeText(getBaseContext(), "error occured try again", Toast.LENGTH_SHORT).show();
            throw new RuntimeException(e);

        }
    }
}