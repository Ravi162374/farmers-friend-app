package com.example.farmerapp;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fragmentManager;
    private Fragment currentFragment;
    private String selectedLanguage; // Added variable to store selected language
    private SharedPreferences sharedPreferences; // Added shared preferences

    private BottomNavigationView.OnItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment;

            if (item.getItemId() == R.id.navigation_home) {
                selectedFragment = new HomeFragment();
            } else if (item.getItemId() == R.id.navigation_notes) {
                selectedFragment = new NotesFragment();
            } else if (item.getItemId() == R.id.navigation_profile) {
                selectedFragment = new ProfileFragment();
            } else if (item.getItemId() == R.id.navigation_technology) {
                selectedFragment = new TechnologyFragment();
            } else {
                selectedFragment = new HomeFragment();
            }

            if (selectedFragment != currentFragment) {
                replaceFragment(selectedFragment);
                currentFragment = selectedFragment;
            }

            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("LanguagePreferences", MODE_PRIVATE);

        Intent intent = getIntent();
        selectedLanguage = intent.getStringExtra("LANGUAGE");

        LanguagePreference.setSelectedLanguage(sharedPreferences, selectedLanguage); // Store selected language

        fragmentManager = getSupportFragmentManager();

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(navigationItemSelectedListener);

        if (savedInstanceState != null) {
            currentFragment = fragmentManager.getFragment(savedInstanceState, "currentFragment");
        } else {
            // Set the initial fragment
            currentFragment = new HomeFragment();
            replaceFragment(currentFragment);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        fragmentManager.putFragment(outState, "currentFragment", currentFragment);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, fragment);
        transaction.commit();
    }
}
