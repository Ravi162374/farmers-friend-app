package com.example.farmerapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;

import java.util.Locale;

public class login extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button signupButton;
    private Button signinButton;
    private Button forgotPasswordButton;
    private Spinner languageSpinner;
    private ProgressBar signinProgressBar;

    private FirebaseAuth firebaseAuth;
    private static  String selectedLanguage;
    private static String data;
    // Added variable to store selected language

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();
        FirebaseApp.initializeApp(this);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        signupButton = findViewById(R.id.signupButton);
        signinButton = findViewById(R.id.signinButton);
        forgotPasswordButton = findViewById(R.id.forgotPasswordButton);
        languageSpinner = findViewById(R.id.languageSpinner);
        signinProgressBar = findViewById(R.id.signinProgressBar);

        // Set up the spinner with the language array
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        languageSpinner.setAdapter(adapter);

        // Set a listener for the spinner item selection
        languageSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedLanguage = parent.getItemAtPosition(position).toString();
                if (selectedLanguage.equals("తెలుగు")) {
                    changeAppLanguage("te");
                    data="తెలుగు";
                    finish();
                    startActivity(getIntent());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }

            private void changeAppLanguage(String languageCode) {
                Locale newLocale = new Locale(languageCode);
                Locale.setDefault(newLocale);

                Resources resources = getResources();
                Configuration configuration = resources.getConfiguration();
                configuration.setLocale(newLocale);
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        });

        ImageButton visibilityToggleButton = findViewById(R.id.visibilityToggleButton);
        visibilityToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int inputType = passwordEditText.getInputType();
                if (inputType == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
                    passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    visibilityToggleButton.setImageResource(R.drawable.ic_visibility_off);
                } else {
                    passwordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    visibilityToggleButton.setImageResource(R.drawable.ic_visibility_on);
                }
                passwordEditText.setSelection(passwordEditText.getText().length());
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Validate email and password
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(login.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
                    return;
                } else if (email.length() < 6) {
                    Toast.makeText(login.this, "Password must be greater than 6 letters", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Create user with email and password
                firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(login.this, task -> {
                            if (task.isSuccessful()) {
                                Toast.makeText(login.this, "Registration successful", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(login.this, MainActivity.class);
                                intent.putExtra("LANGUAGE", data); // Add selected language as an extra
                                startActivity(intent);
                                finish();
                            } else {
                                Exception exception = task.getException();
                                if (exception instanceof FirebaseAuthException) {
                                    FirebaseAuthException authException = (FirebaseAuthException) exception;
                                    // Handle specific Firebase authentication exception
                                    Toast.makeText(login.this, "Registration failed: " + authException.getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isInternetConnected()) {
                    Toast.makeText(login.this, "No internet connection", Toast.LENGTH_SHORT).show();
                    return;
                }

                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Validate email and password
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(login.this, "Please enter email and password", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Show the progress bar
                signinProgressBar.setVisibility(View.VISIBLE);

                // Disable the signinButton while signing in
                signinButton.setEnabled(false);

                // Sign in user with email and password
                firebaseAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(login.this, task -> {
                            // Hide the progress bar
                            signinProgressBar.setVisibility(View.GONE);

                            // Enable the signinButton
                            signinButton.setEnabled(true);

                            if (task.isSuccessful()) {
                                FirebaseUser user = firebaseAuth.getCurrentUser();
                                if (user != null) {
                                    // User is signed in, navigate to MainActivity
                                    Intent intent = new Intent(login.this, MainActivity.class);
                                    intent.putExtra("LANGUAGE", data); // Add selected language as an extra
                                    startActivity(intent);
                                    finish();
                                }
                            } else {
                                Exception exception = task.getException();
                                if (exception instanceof FirebaseAuthException) {
                                    FirebaseAuthException authException = (FirebaseAuthException) exception;
                                    // Handle specific Firebase authentication exception
                                    Toast.makeText(login.this, "Sign in failed: " + authException.getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });

        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ForgotPasswordActivity
                Intent intent = new Intent(login.this, forgotpassword.class);
                startActivity(intent);
            }
        });
    }

    private boolean isInternetConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
            return activeNetwork != null && activeNetwork.isConnected();
        }
        return false;
    }
}
