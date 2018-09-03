package com.example.user.food_o_pedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MymensinghresActivity extends AppCompatActivity {

    Button btnSarinda,btnAvanti,btnDhan,btnFood,btnRom,btnSpice,btnBest,btnCris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensinghres);

        btnSarinda=findViewById(R.id.btn_sarinda);
        btnAvanti=findViewById(R.id.btn_avanti);
        btnDhan=findViewById(R.id.btn_dhan);
        btnFood=findViewById(R.id.btn_food);
        btnRom=findViewById(R.id.btn_rom);
        btnSpice=findViewById(R.id.btn_spice);
        btnBest=findViewById(R.id.btn_best);
        btnCris=findViewById(R.id.btn_cris);

        btnSarinda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MymensinghresActivity.this,MymensinghDetailsActivity.class);
                intent.putExtra("res_name","one");
                Toast.makeText(MymensinghresActivity.this, "Sarinda Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnAvanti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MymensinghresActivity.this,MymensinghDetailsActivity.class);
                intent.putExtra("res_name","two");
                Toast.makeText(MymensinghresActivity.this, "Avanti", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnDhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MymensinghresActivity.this,MymensinghDetailsActivity.class);
                intent.putExtra("res_name","three");
                Toast.makeText(MymensinghresActivity.this, "Dhanshiri Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MymensinghresActivity.this,MymensinghDetailsActivity.class);
                intent.putExtra("res_name","four");
                Toast.makeText(MymensinghresActivity.this, "Food King", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnRom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MymensinghresActivity.this,MymensinghDetailsActivity.class);
                intent.putExtra("res_name","five");
                Toast.makeText(MymensinghresActivity.this, "ROM III", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnSpice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MymensinghresActivity.this,MymensinghDetailsActivity.class);
                intent.putExtra("res_name","six");
                Toast.makeText(MymensinghresActivity.this, "Spice Klub", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnBest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MymensinghresActivity.this,MymensinghDetailsActivity.class);
                intent.putExtra("res_name","seven");
                Toast.makeText(MymensinghresActivity.this, "Best Bite", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnCris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MymensinghresActivity.this,MymensinghDetailsActivity.class);
                intent.putExtra("res_name","eight");
                Toast.makeText(MymensinghresActivity.this, "Crispicy", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
