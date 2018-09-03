package com.example.user.food_o_pedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RajshahiresActivity extends AppCompatActivity {

    Button btnOrder,btnRahman,btnMaster,btnNanking,btnHideout,btnTwist,btnKhan,btnSalt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahires);

        btnOrder=findViewById(R.id.btn_order);
        btnRahman=findViewById(R.id.btn_rahman);
        btnMaster=findViewById(R.id.btn_master);
        btnNanking=findViewById(R.id.btn_nanking);
        btnHideout=findViewById(R.id.btn_hideout);
        btnTwist=findViewById(R.id.btn_twist);
        btnKhan=findViewById(R.id.btn_khan);
        btnSalt=findViewById(R.id.btn_salt);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RajshahiresActivity.this,RajshahiDetailsActivity.class);
                intent.putExtra("res_name","one");
                Toast.makeText(RajshahiresActivity.this, "Order's Up", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnRahman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RajshahiresActivity.this,RajshahiDetailsActivity.class);
                intent.putExtra("res_name","two");
                Toast.makeText(RajshahiresActivity.this, "Rahman's Bar-B-Q", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnMaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RajshahiresActivity.this,RajshahiDetailsActivity.class);
                intent.putExtra("res_name","three");
                Toast.makeText(RajshahiresActivity.this, "Master Chef", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnNanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RajshahiresActivity.this,RajshahiDetailsActivity.class);
                intent.putExtra("res_name","four");
                Toast.makeText(RajshahiresActivity.this, "Nanking Restaurant ", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnHideout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RajshahiresActivity.this,RajshahiDetailsActivity.class);
                intent.putExtra("res_name","five");
                Toast.makeText(RajshahiresActivity.this, "The Hideout Cafe", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnTwist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RajshahiresActivity.this,RajshahiDetailsActivity.class);
                intent.putExtra("res_name","six");
                Toast.makeText(RajshahiresActivity.this, "Twist and Taste", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnKhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RajshahiresActivity.this,RajshahiDetailsActivity.class);
                intent.putExtra("res_name","seven");
                Toast.makeText(RajshahiresActivity.this, "Khan Teheri Ghor", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnSalt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RajshahiresActivity.this,RajshahiDetailsActivity.class);
                intent.putExtra("res_name","eight");
                Toast.makeText(RajshahiresActivity.this, "Salt Meat", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
