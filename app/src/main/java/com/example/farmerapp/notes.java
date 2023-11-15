package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import android.os.Bundle;

public class notes extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText et_content=findViewById(R.id.et_content);
        Toolbar toolbar;
        toolbar = findViewById(R.id.actionbar1);
        toolbar.setOnMenuItemClickListener(item -> {
            if(item.getItemId()==R.id.save) {
                    String content = et_content.getText().toString();
                    try {
                        FileOutputStream fout = openFileOutput("file1.txt", MODE_PRIVATE);
                        fout.write(content.getBytes());
                        fout.close();
                        File fileDir = new File(getFilesDir(), "file1.txt");

                        Toast.makeText(getBaseContext(), "saved at" + fileDir, Toast.LENGTH_SHORT).show();

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
            }
            return true;
        });
    }
}