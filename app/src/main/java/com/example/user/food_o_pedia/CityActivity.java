package com.example.user.food_o_pedia;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CityActivity extends AppCompatActivity {

    Button btnDhaka,btnCtg,btnKhulna,btnSylhet,btnRajshahi,btnRangpur,btnMymensingh,btnBarishal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        btnDhaka=findViewById(R.id.btn_dhaka);
        btnCtg=findViewById(R.id.btn_ctg);
        btnKhulna=findViewById(R.id.btn_khulna);
        btnSylhet=findViewById(R.id.btn_sylhet);
        btnRajshahi=findViewById(R.id.btn_rajshahi);
        btnRangpur=findViewById(R.id.btn_rangpur);
        btnMymensingh=findViewById(R.id.btn_mymensingh);
        btnBarishal=findViewById(R.id.btn_barishal);



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
        btnSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CityActivity.this,SylhetresActivity.class);
                Toast.makeText(CityActivity.this, "Restaurants of Sylhet", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CityActivity.this,KhulnaresActivity.class);
                Toast.makeText(CityActivity.this, "Restaurants of Khulna", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        btnRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CityActivity.this,RajshahiresActivity.class);
                Toast.makeText(CityActivity.this, "Restaurants of Rajshahi", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CityActivity.this,RangpurresActivity.class);
                Toast.makeText(CityActivity.this, "Restaurants of Rangpur", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnMymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CityActivity.this,MymensinghresActivity.class);
                Toast.makeText(CityActivity.this, "Restaurants of Mymensingh", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
        btnBarishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CityActivity.this,BarishalresActivity.class);
                Toast.makeText(CityActivity.this, "Restaurants of Barishal", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

    }
}
