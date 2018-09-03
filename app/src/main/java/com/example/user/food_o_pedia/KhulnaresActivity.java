package com.example.user.food_o_pedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class KhulnaresActivity extends AppCompatActivity {

    Button btnMejban,btnCity,btnFire,btnMega,btnFakrul,btnRadhuni,btnGrill,btnKacchi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulnares);

        btnMejban=findViewById(R.id.btn_mejban);
        btnCity=findViewById(R.id.btn_city);
        btnFire=findViewById(R.id.btn_fire);
        btnMega=findViewById(R.id.btn_mega);
        btnFakrul=findViewById(R.id.btn_fakrul);
        btnRadhuni=findViewById(R.id.btn_radhuni);
        btnGrill=findViewById(R.id.btn_grill);
        btnKacchi=findViewById(R.id.btn_kacchi);

        btnMejban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(KhulnaresActivity.this,KhulnaDetailsActivity.class);
                intent.putExtra("res_name","one");
                Toast.makeText(KhulnaresActivity.this, "Mejban Bari", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KhulnaresActivity.this,KhulnaDetailsActivity.class);
                intent.putExtra("res_name","two");
                Toast.makeText(KhulnaresActivity.this, "City Light Cafe", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KhulnaresActivity.this,KhulnaDetailsActivity.class);
                intent.putExtra("res_name","three");
                Toast.makeText(KhulnaresActivity.this, "Firefly Restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnMega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KhulnaresActivity.this,KhulnaDetailsActivity.class);
                intent.putExtra("res_name","four");
                Toast.makeText(KhulnaresActivity.this, "Mega Biriyani", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnFakrul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KhulnaresActivity.this,KhulnaDetailsActivity.class);
                intent.putExtra("res_name","five");
                Toast.makeText(KhulnaresActivity.this, "Fakrul Biryani Ghar", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnRadhuni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KhulnaresActivity.this,KhulnaDetailsActivity.class);
                intent.putExtra("res_name","six");
                Toast.makeText(KhulnaresActivity.this, "Radhuni Hotel", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnGrill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KhulnaresActivity.this,KhulnaDetailsActivity.class);
                intent.putExtra("res_name","seven");
                Toast.makeText(KhulnaresActivity.this, "Grill House", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnKacchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KhulnaresActivity.this,KhulnaDetailsActivity.class);
                intent.putExtra("res_name","eight");
                Toast.makeText(KhulnaresActivity.this, "Kacchi Ghar", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }


    }

