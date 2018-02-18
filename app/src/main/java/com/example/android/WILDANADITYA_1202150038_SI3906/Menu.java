package com.example.android.WILDANADITYA_1202150038_SI3906;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 1;i < 2; i++){
            foods.add("Ayam Kane");
            foods.add("Bebek Asli");
            foods.add("Ikan Laut");
            foods.add("Nasi Goreng");
            foods.add("Sate Bakar");

            priceses.add(30000);
            priceses.add(35000);
            priceses.add(20000);
            priceses.add(5000);
            priceses.add(20000);

            photos.add(R.drawable.ayam);
            photos.add(R.drawable.bebek);
            photos.add(R.drawable.ikan);
            photos.add(R.drawable.nasigoreng);
            photos.add(R.drawable.sate);
        }
    }
}
