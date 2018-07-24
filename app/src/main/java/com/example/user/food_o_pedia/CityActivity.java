package com.example.user.food_o_pedia;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CityActivity extends AppCompatActivity {

    Button btnDhaka,btnCtg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        btnDhaka=findViewById(R.id.btn_dhaka);
        btnCtg=findViewById(R.id.btn_ctg);


        btnDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CityActivity.this,DhakaresActivity.class);
                Toast.makeText(CityActivity.this, "Restaurants of Dhaka", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnCtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CityActivity.this,CtgresActivity.class);
                Toast.makeText(CityActivity.this, "Restaurants of Chattogram", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

    }
}
