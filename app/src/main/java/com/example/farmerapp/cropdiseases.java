package com.example.farmerapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class cropdiseases extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cropdiseases);

        recyclerView = findViewById(R.id.main_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();

        // PADDY CROP
        String[] paddyCropDiseases = getResources().getStringArray(R.array.paddy_crop_diseases);
        mList.add(new DataModel(arrayToList(paddyCropDiseases), getString(R.string.paddy_crop)));

        // CHILLIS
        String[] chillisDiseases = getResources().getStringArray(R.array.chillis_diseases);
        mList.add(new DataModel(arrayToList(chillisDiseases), getString(R.string.chillis)));

        // COTTON
        String[] cottonDiseases = getResources().getStringArray(R.array.cotton_diseases);
        mList.add(new DataModel(arrayToList(cottonDiseases), getString(R.string.cotton)));

        // SUGAR-CANE
        String[] sugarCaneDiseases = getResources().getStringArray(R.array.sugar_cane_diseases);
        mList.add(new DataModel(arrayToList(sugarCaneDiseases), getString(R.string.sugar_cane)));

        // GROUNDNUT
        String[] groundnutDiseases = getResources().getStringArray(R.array.groundnut_diseases);
        mList.add(new DataModel(arrayToList(groundnutDiseases), getString(R.string.groundnut)));

        // LADYFINGER
        String[] ladyfingerDiseases = getResources().getStringArray(R.array.ladyfinger_diseases);
        mList.add(new DataModel(arrayToList(ladyfingerDiseases), getString(R.string.ladyfinger)));

        // MANGO
        String[] mangoDiseases = getResources().getStringArray(R.array.mango_diseases);
        mList.add(new DataModel(arrayToList(mangoDiseases), getString(R.string.mango)));

        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);
    }

    private List<String> arrayToList(String[] array) {
        List<String> list = new ArrayList<>();
        for (String item : array) {
            list.add(item);
        }
        return list;
    }
}
