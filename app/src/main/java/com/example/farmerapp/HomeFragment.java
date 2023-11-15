package com.example.farmerapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.content.SharedPreferences;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private SharedPreferences sharedPreferences;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_home, container, false);
        // Retrieve shared preferences
        sharedPreferences = getActivity().getSharedPreferences("LanguagePreferences", getActivity().MODE_PRIVATE);

        // Retrieve selected language from shared preferences
        String selectedLanguage = LanguagePreference.getSelectedLanguage(sharedPreferences);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Toolbar toolbar=v.findViewById(R.id.actionbar);
        toolbar.setOnMenuItemClickListener((MenuItem item) -> {
            if (item.getItemId() == R.id.crops) {
                Intent intent = new Intent(getActivity(), crops.class);
                startActivity(intent);
            }
            else if(item.getItemId()==R.id.organic)
            {
                Intent intent=new Intent(getActivity(), cropdiseases.class);
                startActivity(intent);
            }

            else if(item.getItemId()==R.id.serach)
            {
                Intent intent=new Intent(getActivity(),search.class);
                startActivity(intent);
            }
            return true;
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button ib1=v.findViewById(R.id.b1);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), schemes.class);
                intent.putExtra("key","spray");
                startActivity(intent);
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button ib2=v.findViewById(R.id.b2);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), schemes.class);
                intent.putExtra("key","cult");
                startActivity(intent);
            }
        });
        return v;
    }
}