package com.example.user.food_o_pedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BarishalresActivity extends AppCompatActivity {

    Button btnBfg,btnRiver,btnEl,btnKorai,btnChina,btnTawa,btnBells,btnSubtime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barishalres);


        btnBfg=findViewById(R.id.btn_bfg);
        btnRiver=findViewById(R.id.btn_river);
        btnEl=findViewById(R.id.btn_el);
        btnKorai=findViewById(R.id.btn_korai);
        btnChina=findViewById(R.id.btn_china);
        btnTawa=findViewById(R.id.btn_tawa);
        btnBells=findViewById(R.id.btn_bells);
        btnSubtime=findViewById(R.id.btn_subtime);

        btnBfg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BarishalresActivity.this,BarishalDetailsActivity.class);
                intent.putExtra("res_name","one");
                Toast.makeText(BarishalresActivity.this, "BFG Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnRiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BarishalresActivity.this,BarishalDetailsActivity.class);
                intent.putExtra("res_name","two");
                Toast.makeText(BarishalresActivity.this, "The River Cafe", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnEl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BarishalresActivity.this,BarishalDetailsActivity.class);
                intent.putExtra("res_name","three");
                Toast.makeText(BarishalresActivity.this, "EL Foodee", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnKorai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BarishalresActivity.this,BarishalDetailsActivity.class);
                intent.putExtra("res_name","four");
                Toast.makeText(BarishalresActivity.this, "Handi Korai", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BarishalresActivity.this,BarishalDetailsActivity.class);
                intent.putExtra("res_name","five");
                Toast.makeText(BarishalresActivity.this, "China Palace", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnTawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BarishalresActivity.this,BarishalDetailsActivity.class);
                intent.putExtra("res_name","six");
                Toast.makeText(BarishalresActivity.this, "Tawa Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnBells.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BarishalresActivity.this,BarishalDetailsActivity.class);
                intent.putExtra("res_name","seven");
                Toast.makeText(BarishalresActivity.this, "Bells Diner", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnSubtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BarishalresActivity.this,BarishalDetailsActivity.class);
                intent.putExtra("res_name","eight");
                Toast.makeText(BarishalresActivity.this, "Subtime", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
