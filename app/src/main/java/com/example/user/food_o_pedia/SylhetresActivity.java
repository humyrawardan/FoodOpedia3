package com.example.user.food_o_pedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SylhetresActivity extends AppCompatActivity {

    Button btnMad,btnPanshi,btnWoondaal,btnPachbhai,btnNewhandi,btnAlphine,btnStacks,btnHotspot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhetres);

        btnMad=findViewById(R.id.btn_mad);
        btnPanshi=findViewById(R.id.btn_panshi);
        btnWoondaal=findViewById(R.id.btn_woondaal);
        btnPachbhai=findViewById(R.id.btn_pachbhai);
        btnNewhandi=findViewById(R.id.btn_newhandi);
        btnAlphine=findViewById(R.id.btn_alphine);
        btnStacks=findViewById(R.id.btn_stacks);
        btnHotspot=findViewById(R.id.btn_hotspot);

        btnMad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SylhetresActivity.this,SylhetDetailsActivity.class);
                intent.putExtra("res_name","one");
                Toast.makeText(SylhetresActivity.this, "Mad Grill", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
       btnPanshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SylhetresActivity.this,SylhetDetailsActivity.class);
                intent.putExtra("res_name","two");
                Toast.makeText(SylhetresActivity.this, "Panshi Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnWoondaal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SylhetresActivity.this,SylhetDetailsActivity.class);
                intent.putExtra("res_name","three");
                Toast.makeText(SylhetresActivity.this, "Woondaal King Kabab", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnPachbhai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SylhetresActivity.this,SylhetDetailsActivity.class);
                intent.putExtra("res_name","four");
                Toast.makeText(SylhetresActivity.this, "Pach Bhai Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnNewhandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SylhetresActivity.this,SylhetDetailsActivity.class);
                intent.putExtra("res_name","five");
                Toast.makeText(SylhetresActivity.this, "New Handi Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnAlphine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SylhetresActivity.this,SylhetDetailsActivity.class);
                intent.putExtra("res_name","six");
                Toast.makeText(SylhetresActivity.this, "Alphine Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


        btnStacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SylhetresActivity.this,SylhetDetailsActivity.class);
                intent.putExtra("res_name","seven");
                Toast.makeText(SylhetresActivity.this, "Stacks O'Snacks", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnHotspot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SylhetresActivity.this,SylhetDetailsActivity.class);
                intent.putExtra("res_name","eight");
                Toast.makeText(SylhetresActivity.this, "Hot Spot", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

}

