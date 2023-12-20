package com.example.hf4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CurrencyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        String[] currencyCodes = {"EUR", "HUF"};
        String[] buyRates = {"4.59", "1.50"};
        String[] sellRates = {"4.20", "1.30"};
        String[] currencyNames = {"Euro", "Hungarian Forint"};


        adapter = new CurrencyAdapter(this, currencyCodes, buyRates, sellRates, currencyNames);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }
}
