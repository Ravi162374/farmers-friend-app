package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;


public class forgotpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        Button forgotPasswordButton=findViewById(R.id.forgotPasswordButton);
        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText emailEditText;
                emailEditText=findViewById(R.id.emailEditText);
                String email = emailEditText.getText().toString().trim();

                // Validate email
                if (email.isEmpty()) {
                    Toast.makeText(forgotpassword.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Send password reset email
                FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(forgotpassword.this, "Password reset email sent", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(forgotpassword.this, "Failed to send password reset email", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

    }
}