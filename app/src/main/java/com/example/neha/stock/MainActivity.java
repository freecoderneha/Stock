package com.example.neha.stock;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  Choose a Website");

        Button titlebutton = (Button) findViewById(R.id.click);

        // Capture button click
        titlebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Execute Title AsyncTask
                Intent browserIntent = new Intent(MainActivity.this,StocksActivity.class);
                startActivity(browserIntent);
            }
        });


    }
}
