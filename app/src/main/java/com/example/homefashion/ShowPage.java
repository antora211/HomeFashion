package com.example.homefashion;

import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ShowPage extends AppCompatActivity {



    DatabaseReference reference;
    RecyclerView recyclerView;
    ArrayList<BedProfile> list;
    BedAdapter adapter;
    public static String choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Posts List");



        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        list = new ArrayList<BedProfile>();

        reference = FirebaseDatabase.getInstance().getReference(choice);


        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren())
                {
                    BedProfile p = dataSnapshot1.getValue(BedProfile.class);
                    list.add(p);
                }
                adapter = new BedAdapter(ShowPage.this,list);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(ShowPage.this, "Opsss.... Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
