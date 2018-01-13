package com.example.neha.stock;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class StocksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stocks);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" Stocks");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        final ArrayList<Stock> stocks = new ArrayList<Stock>();
        stocks.add(new Stock("C","Copper"));
        stocks.add(new Stock("CM","Copper Mini"));
        stocks.add(new Stock("AL","Aluminium"));
        stocks.add(new Stock("ALM","Aluminium Mini"));
        stocks.add(new Stock("ZN","Zinc"));
        stocks.add(new Stock("ZNM","Zinc Mini"));
        stocks.add(new Stock("PB","Lead"));
        stocks.add(new Stock("PBM","Lead Mini"));
        stocks.add(new Stock("NI","Nickel"));
        stocks.add(new Stock("NIM","Nickel Mini"));
        stocks.add(new Stock("GC","Gold"));
        stocks.add(new Stock("GG","Gold Guinea"));
        stocks.add(new Stock("GM","Gold Mini"));
        stocks.add(new Stock("GP","Gold Petal"));
        stocks.add(new Stock("GD","Gold Petal(N.D)"));
        stocks.add(new Stock("SI","Silver"));
        stocks.add(new Stock("SIM","Silver Mini"));
        stocks.add(new Stock("AG","Silver 1000"));
        stocks.add(new Stock("AGM","Silver Micro"));




        StockAdapter adapter = new StockAdapter(this,stocks);

        GridView listView = (GridView) findViewById(R.id.grid);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                String[] links = getResources().getStringArray(R.array.link);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}
