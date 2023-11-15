package com.example.farmerapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Locale;

public class ProfileFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam2;
    private SharedPreferences sharedPreferences;
    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            String mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        sharedPreferences = getActivity().getSharedPreferences("LanguagePreferences", getActivity().MODE_PRIVATE);

        // Retrieve selected language from shared preferences
        String selectedLanguage = LanguagePreference.getSelectedLanguage(sharedPreferences);
        Toolbar toolbar = v.findViewById(R.id.actionbar);
        Button centralButton = v.findViewById(R.id.central);

        toolbar.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.myinfo) {
                Intent intent = new Intent(getActivity(), myprofile.class);
                startActivity(intent);
            } else if (item.getItemId() == R.id.editprofile) {
                Intent intent = new Intent(getActivity(), profile.class);
                startActivity(intent);
            }
            return true;
        });

        centralButton.setOnClickListener(v1 -> {
            Intent intent = new Intent(getActivity(), schemes.class);
            intent.putExtra("key", "central");
            intent.putExtra("language", selectedLanguage);
            startActivity(intent);
        });

        Spinner spinner = v.findViewById(R.id.Spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.states, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedState = parent.getItemAtPosition(position).toString();
                if (selectedState.equals("తెలంగాణ")) {
                    // Code for handling the selected state
                    Intent intent = new Intent(getActivity(), schemes.class);
                    intent.putExtra("key", "telangana");
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Do nothing
            }
        });

        return v;
    }
}
