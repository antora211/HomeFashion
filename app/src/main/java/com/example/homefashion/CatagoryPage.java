package com.example.homefashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CatagoryPage extends AppCompatActivity {

    private Button btn_bed,btn_dressing,btn_wear,btn_dinning,btn_reading,btn_sofa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory_page);

        btn_bed = (Button)findViewById(R.id.buttonBed);
        btn_dressing = (Button)findViewById(R.id.buttonDressingTable);
        btn_wear = (Button)findViewById(R.id.buttonWeardrobe);
        btn_dinning = (Button)findViewById(R.id.buttonDinningTable);
        btn_reading = (Button)findViewById(R.id.buttonReadingTable);
        btn_sofa = (Button)findViewById(R.id.buttonSofaSet);

        btn_bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPage.choice = "bed";
                startActivity(new Intent(CatagoryPage.this,ShowPage.class));
            }
        });
        btn_dressing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPage.choice = "dressingTable";
                startActivity(new Intent(CatagoryPage.this,ShowPage.class));
            }
        });
        btn_wear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPage.choice = "weardrobe";
                startActivity(new Intent(CatagoryPage.this,ShowPage.class));
            }
        });
        btn_dinning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPage.choice = "dinningTable";
                startActivity(new Intent(CatagoryPage.this,ShowPage.class));
            }
        });
        btn_reading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPage.choice = "readingTable";
                startActivity(new Intent(CatagoryPage.this,ShowPage.class));
            }
        });
        btn_sofa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPage.choice = "Sofa set";
                startActivity(new Intent(CatagoryPage.this,ShowPage.class));
            }
        });
    }

}
