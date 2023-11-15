package com.example.farmerapp;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class search extends AppCompatActivity {
    ListView listView;
    SearchView searchView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchView = findViewById(R.id.search_bar);
        listView = findViewById(R.id.list_item);

        arrayList = new ArrayList<>();
        arrayList.add(getString(R.string.Crops));;
        arrayList.add(getString(R.string.Broadcasting));
        arrayList.add(getString(R.string.Pellet));
        arrayList.add(getString(R.string.Foliar));
        arrayList.add(getString(R.string.Arial));
        arrayList.add(getString(R.string.Stater));
        arrayList.add(getString(R.string.Placement));
        // Add the remaining items using the respective string resources

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(search.this, "You clicked " + arrayList.get(position), Toast.LENGTH_SHORT).show();
                String selectedItem = arrayList.get(position);
                if(selectedItem.equals("CROPS")||selectedItem.equals("పంటలు")) {
                    Intent intent = new Intent(search.this, crops.class);
                    startActivity(intent);
                }
                else if(selectedItem.equals("Broadcasting")||selectedItem.equals("ప్రసార పద్ధతి")) {
                    Intent intent = new Intent(search.this, tech.class);
                    intent.putExtra("key","broadcasting");
                    startActivity(intent);
                }
                else if(selectedItem.equals("Pellet")||selectedItem.equals("గుళిక")) {
                    Intent intent = new Intent(search.this, tech.class);
                    intent.putExtra("key","pellet");
                    startActivity(intent);
                }
                else if(selectedItem.equals("Placement")||selectedItem.equals("ప్లేస్మెంట్ పద్ధతి")) {
                    Intent intent = new Intent(search.this, tech.class);
                    intent.putExtra("key","placement");
                    startActivity(intent);
                }
                else if(selectedItem.equals("Arial")||selectedItem.equals("ఏరియల్ స్ప్రే")) {
                    Intent intent = new Intent(search.this, tech.class);
                    intent.putExtra("key","arial");
                    startActivity(intent);
                }
                else if(selectedItem.equals("Stater")||selectedItem.equals("స్టేటర్")) {
                    Intent intent = new Intent(search.this, tech.class);
                    intent.putExtra("key","stater");
                    startActivity(intent);
                }
                else if(selectedItem.equals("Foliar")||selectedItem.equals("ఫోలియర్ పద్ధతి")) {
                    Intent intent = new Intent(search.this, tech.class);
                    intent.putExtra("key","foliar");
                    startActivity(intent);
                }
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                arrayAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
