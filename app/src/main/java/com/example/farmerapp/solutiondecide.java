package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class solutiondecide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solutiondecide);
        Intent intent = getIntent();
        String data = intent.getStringExtra("key");
        String id = null;
        if(data.equals("blast")||data.equals("అగ్గి తెగులు"))
        {
            id="a";
        }
        else if(data.equals("sheath Blight")||data.equals("కోశం ముడత"))
        {
            id="b";
        }
        else if(data.equals("brown Spot")||data.equals("గోధుమ రంగు మచ్చ"))
        {
            id="c";
        }
        else if(data.equals("anthracnose")||data.equals("ఆంత్రాక్నోస్"))
        {
            id="d";
        }
        else if(data.equals("bacterial Spot")||data.equals("మచ్చ తెగులు"))
        {
            id="e";
        }
        else if(data.equals("cercospora Leaf Spot")||data.equals("సెర్కోస్పోరా ఆకు మచ్చ"))
        {
            id="f";
        }
        else if(data.equals("verticillium Wilt")||data.equals("వెర్టిసిలియం విల్ట్"))
        {
            id="g";
        }
        else if(data.equals("fusarium Wilt")||data.equals("ఫ్యూసేరియం విల్ట్"))
        {
            id="h";
        }
        else if(data.equals("boll Rot")||data.equals("కాయ తెగులు"))
        {
            id="i";
        }
        else if(data.equals("red Rot")||data.equals("ఎరుపు తెగులు"))
        {
            id="j";
        }
        else if(data.equals("smut")||data.equals("స్మట్"))
        {
            id="k";
        }
        else if(data.equals("leaf Scald")||data.equals("ఆకు మంట"))
        {
            id="l";
        }
        else if(data.equals("leaf Spot")||data.equals("ఆకు మచ్చ"))
        {
            id="m";
        }
        else if(data.equals("early Leaf Spot")||data.equals("ప్రారంభ ఆకు మచ్చ"))
        {
            id="n";
        }
        else if(data.equals("crown Rot")||data.equals("కిరీటం తెగులు"))
        {
            id="o";
        }
        else if(data.equals("leaf Curl Virus")||data.equals("లీఫ్ కర్ల్ వైరస్"))
        {
            id="p";
        }
        else if(data.equals("charcoal Rot")||data.equals("బొగ్గు తెగులు"))
        {
            id="q";
        }
        Button b1 = findViewById(R.id.btnInorganicFertilizers);
        String finalId = id;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(solutiondecide.this, solution.class);
                intent.putExtra("key", finalId);
                startActivity(intent);
            }
        });
        Button b2 = findViewById(R.id.btnOrganicFertilizers);
        String finalId1 = id;
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(solutiondecide.this, organicsolution.class);
                intent.putExtra("key", finalId1);
                startActivity(intent);
            }
        });
        Button b3 = findViewById(R.id.btnEffectsOfDiseases);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(solutiondecide.this, solution.class);
                intent.putExtra("key",finalId);
                startActivity(intent);
            }
        });
    }
}