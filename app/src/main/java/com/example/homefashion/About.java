package com.example.homefashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class About extends AppCompatActivity {

    private EditText order,cname,phone;
    private Button btn;
    OrderDetail orderDetail;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        order = (EditText)findViewById(R.id.orderno);
        cname = (EditText)findViewById(R.id.cName);
        phone = (EditText)findViewById(R.id.phne);
        btn = (Button)findViewById(R.id.save);
        orderDetail = new OrderDetail();
        ref = FirebaseDatabase.getInstance().getReference().child("OrderDetail");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orderDetail.setOrder(order.getText().toString().trim());
                orderDetail.setName(cname.getText().toString().trim());
                orderDetail.setPhone(phone.getText().toString().trim());
                ref.push().setValue(orderDetail);

                Intent intent = new Intent(About.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(About.this,"confirmed", Toast.LENGTH_LONG).show();
            }
        });
    }
}
