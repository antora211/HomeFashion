package com.example.homefashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button btn_catagory,btn_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_catagory = (Button)findViewById(R.id.buttonCatagory);
        btn_about = (Button)findViewById(R.id.buttonAbout);

        btn_catagory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCatagoryPage();
            }
        });

        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });
    }


    public void openCatagoryPage(){
        Intent intent = new Intent(MainActivity.this, CatagoryPage.class);
        startActivity(intent);
    }
}
