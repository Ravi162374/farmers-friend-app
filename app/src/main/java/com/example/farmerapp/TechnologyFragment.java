package com.example.farmerapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TechnologyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TechnologyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TechnologyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TechnologyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TechnologyFragment newInstance(String param1, String param2) {
        TechnologyFragment fragment = new TechnologyFragment();
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
        View v= inflater.inflate(R.layout.fragment_technology, container, false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Toolbar toolbar=v.findViewById(R.id.actionbartechnology);
        toolbar.setOnMenuItemClickListener((MenuItem item) -> {
            if (item.getItemId() == R.id.solidfertilizers) {
                Intent intent = new Intent(getActivity(), solidfertilizers.class);
                startActivity(intent);
            }
            else
            {
                Intent intent=new Intent(getActivity(), cropdiseases.class);
                startActivity(intent);
            }
            return true;
        });
        ImageButton ib1=v.findViewById(R.id.ib1);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),tech.class);
                intent.putExtra("key", "broadcasting");
                startActivity(intent);
            }
        });
        ImageButton ib2=v.findViewById(R.id.ib2);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),tech.class);
                intent.putExtra("key", "placement");
                startActivity(intent);
            }
        });
        ImageButton ib3=v.findViewById(R.id.ib3);
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),tech.class);
                intent.putExtra("key", "bandplacement");
                startActivity(intent);
            }
        });
        ImageButton ib4=v.findViewById(R.id.ib4);
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),tech.class);
                intent.putExtra("key", "pellet");
                startActivity(intent);
            }
        });
        ImageButton ib5=v.findViewById(R.id.ib5);
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),tech.class);
                intent.putExtra("key", "stater");
                startActivity(intent);
            }
        });
        ImageButton ib6=v.findViewById(R.id.ib6);
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),tech.class);
                intent.putExtra("key", "foliar");
                startActivity(intent);
            }
        });
        ImageButton ib7=v.findViewById(R.id.ib7);
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),tech.class);
                intent.putExtra("key", "fertigation");
                startActivity(intent);
            }
        });
        ImageButton ib8=v.findViewById(R.id.ib8);
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),tech.class);
                intent.putExtra("key", "araial");
                startActivity(intent);
            }
        });
        return v;
    }
}