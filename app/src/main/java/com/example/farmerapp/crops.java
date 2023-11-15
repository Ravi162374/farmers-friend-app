package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class crops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops);
        ImageButton button1=findViewById(R.id.ib1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(crops.this,cropdetails.class );
                intent.putExtra("key","paddy");
                startActivity(intent);
            }
        });

        ImageButton button2=findViewById(R.id.ib2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(crops.this,cropdetails.class );
                intent.putExtra("key","mirchi");
                startActivity(intent);
            }
        });

        ImageButton button3=findViewById(R.id.ib3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(crops.this,cropdetails.class );
                intent.putExtra("key","sugarcane");
                startActivity(intent);
            }
        });

        ImageButton button4=findViewById(R.id.ib4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(crops.this,cropdetails.class );
                intent.putExtra("key","cotton");
                startActivity(intent);
            }
        });

        ImageButton button5=findViewById(R.id.ib5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(crops.this,cropdetails.class );
                intent.putExtra("key","groundnut");
                startActivity(intent);
            }
        });

        ImageButton button6=findViewById(R.id.ib6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(crops.this,cropdetails.class );
                intent.putExtra("key","ladyfinger");
                startActivity(intent);
            }
        });

        ImageButton button7=findViewById(R.id.ib7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(crops.this,cropdetails.class );
                intent.putExtra("key","mango");
                startActivity(intent);
            }
        });

        ImageButton button8=findViewById(R.id.ib8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(crops.this,cropdetails.class );
                intent.putExtra("key","maize");
                startActivity(intent);
            }
        });
    }
}