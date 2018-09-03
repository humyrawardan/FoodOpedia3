package com.example.user.food_o_pedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RangpurresActivity extends AppCompatActivity {

    Button btnAhar,btnLalbag,btnCicily,btnShwarma,btnNehal,btnKosturi,btnFoodish,btnNasta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpurres);

        btnAhar=findViewById(R.id.btn_ahar);
        btnLalbag=findViewById(R.id.btn_lalbag);
        btnCicily=findViewById(R.id.btn_cicily);
        btnShwarma=findViewById(R.id.btn_shwarma);
        btnNehal=findViewById(R.id.btn_nehal);
        btnKosturi=findViewById(R.id.btn_kosturi);
        btnFoodish=findViewById(R.id.btn_foodish);
        btnNasta=findViewById(R.id.btn_nasta);

        btnAhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RangpurresActivity.this,RangpurDetailsActivity.class);
                intent.putExtra("res_name","one");
                Toast.makeText(RangpurresActivity.this, "Ahar Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnLalbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RangpurresActivity.this,RangpurDetailsActivity.class);
                intent.putExtra("res_name","two");
                Toast.makeText(RangpurresActivity.this, "Lalbag Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnCicily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RangpurresActivity.this,RangpurDetailsActivity.class);
                intent.putExtra("res_name","three");
                Toast.makeText(RangpurresActivity.this, "Cicily", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnShwarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RangpurresActivity.this,RangpurDetailsActivity.class);
                intent.putExtra("res_name","four");
                Toast.makeText(RangpurresActivity.this, "Shawarma Kitchen", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnNehal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RangpurresActivity.this,RangpurDetailsActivity.class);
                intent.putExtra("res_name","five");
                Toast.makeText(RangpurresActivity.this, "Nehal Hotel", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnKosturi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RangpurresActivity.this,RangpurDetailsActivity.class);
                intent.putExtra("res_name","six");
                Toast.makeText(RangpurresActivity.this, "Kosturi Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnFoodish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RangpurresActivity.this,RangpurDetailsActivity.class);
                intent.putExtra("res_name","seven");
                Toast.makeText(RangpurresActivity.this, "Foodish", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnNasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RangpurresActivity.this,RangpurDetailsActivity.class);
                intent.putExtra("res_name","eight");
                Toast.makeText(RangpurresActivity.this, "Nasta-La-Vista", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
