package com.example.user.food_o_pedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DhakaresActivity extends AppCompatActivity {

    Button btnStar,btnLatitude23,btnOlea,btnNandos,btnFavola,btnBunka,btnIzumi,btnPrego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhakares);

        btnStar=findViewById(R.id.btn_star);
        btnLatitude23=findViewById(R.id.btn_latitude23);
        btnOlea=findViewById(R.id.btn_olea);
        btnNandos=findViewById(R.id.btn_nandos);
        btnFavola=findViewById(R.id.btn_favola);
        btnBunka=findViewById(R.id.btn_bunka);
        btnIzumi=findViewById(R.id.btn_izumi);
        btnPrego=findViewById(R.id.btn_prego);

        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(DhakaresActivity.this,DhakaDetailsActivity.class);
                intent.putExtra("res_name","one");
                Toast.makeText(DhakaresActivity.this, "Star kabab and restaurant", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnLatitude23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DhakaresActivity.this,DhakaDetailsActivity.class);
                intent.putExtra("res_name","two");
                Toast.makeText(DhakaresActivity.this, "Latitude 23", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnOlea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DhakaresActivity.this,DhakaDetailsActivity.class);
                intent.putExtra("res_name","three");
                Toast.makeText(DhakaresActivity.this, "Olea", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnNandos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DhakaresActivity.this,DhakaDetailsActivity.class);
                intent.putExtra("res_name","four");
                Toast.makeText(DhakaresActivity.this, "Nando's", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnFavola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DhakaresActivity.this,DhakaDetailsActivity.class);
                intent.putExtra("res_name","five");
                Toast.makeText(DhakaresActivity.this, "Favola", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnBunka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DhakaresActivity.this,DhakaDetailsActivity.class);
                intent.putExtra("res_name","six");
                Toast.makeText(DhakaresActivity.this, "Bunka", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnIzumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DhakaresActivity.this,DhakaDetailsActivity.class);
                intent.putExtra("res_name","seven");
                Toast.makeText(DhakaresActivity.this, "Izumi", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        btnPrego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DhakaresActivity.this,DhakaDetailsActivity.class);
                intent.putExtra("res_name","eight");
                Toast.makeText(DhakaresActivity.this, "Prego", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
