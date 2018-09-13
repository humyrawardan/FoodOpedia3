package com.example.user.food_o_pedia;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RangpurDetailsActivity extends AppCompatActivity {

    ImageView imgRes4;
    TextView txtName, txtDesc;
    Button btnCell, btnMap;

    String mobilenumber[] = {"01779-000775", "01985-429010", "0721-775459", "0721-774120", "01670-224800", " 01710-058947", "01557-776321", "01711-927887"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur_details);

        imgRes4 = findViewById(R.id.img_res4);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        btnCell = findViewById(R.id.btn_cell);
        btnMap = findViewById(R.id.btn_map);

        String getName = getIntent().getExtras().getString("res_name");

        if (getName.equals("one")) {
            imgRes4.setImageResource(R.drawable.rangpur1);
            txtName.setText("Ahar Restaurant");
            txtDesc.setText("BOTH BANGLA AND CHINESE RESTAURANT\n\nAddress: Station Road, Rangpur\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-" + mobilenumber[0]);
            btnCell.setText("CALL");
            btnMap.setText("MAP LOCATION");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[0]));
                    if (ActivityCompat.checkSelfPermission(RangpurDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(RangpurDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 25.221650);
                    intent.putExtra("longitude", 75.874240);
                    intent.putExtra("name", "Ahar Restaurant");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("two")) {
            imgRes4.setImageResource(R.drawable.rangpur2);
            txtName.setText("Lalbag Restaurant");
            txtDesc.setText("A FAST FOOD RESTAURANT\n\nAddress: Lalbag Restaurant. Lalbag Rangpur\n\nHours: Open 10.00AM Closes 11:30PM\n\nMobile Number-" + mobilenumber[1]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[1]));
                    if (ActivityCompat.checkSelfPermission(RangpurDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });

            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(RangpurDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 25.746640);
                    intent.putExtra("longitude", 89.251660);
                    intent.putExtra("name", "Lalbag Restaurant");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("three")) {
            imgRes4.setImageResource(R.drawable.rangpur3);
            txtName.setText("Cicily");
            txtDesc.setText("A CHINESE RESTAURANT\n\nAddress: City Bazar Rd, Rangpur\n\nHours: Closes: 10PM ⋅ Opens 10AM Thu\n\nMobile Number-" + mobilenumber[2]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[2]));
                    if (ActivityCompat.checkSelfPermission(RangpurDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });

            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(RangpurDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 23.689640);
                    intent.putExtra("longitude", 87.463830);
                    intent.putExtra("name", "Cicily");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("four")) {
            imgRes4.setImageResource(R.drawable.rangpur4);
            txtName.setText("Shawarma Kitchen");
            txtDesc.setText("A FAST FOOD RESTAURANT\n\nAddress:Rangpur City Bypass, Rangpur\n\nHours: Open 9.00AM Closes 11:59PM\n\nMobile Number- " + mobilenumber[3]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[3]));
                    if (ActivityCompat.checkSelfPermission(RangpurDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(RangpurDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 25.578830);
                    intent.putExtra("longitude", 85.077100);
                    intent.putExtra("name", "Shawarma Kitchen");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("five")) {
            imgRes4.setImageResource(R.drawable.rangpur5);
            txtName.setText("Nehal Hotel");
            txtDesc.setText("AN AUTHENTIC BANGLA RESTAURANT\n\nAddress:N517, Rangpur\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- " + mobilenumber[4]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[4]));
                    if (ActivityCompat.checkSelfPermission(RangpurDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(RangpurDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 25.740580);
                    intent.putExtra("longitude", 89.261140);
                    intent.putExtra("name", "Nehal Hotel");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("six")) {
            imgRes4.setImageResource(R.drawable.rangpur6);
            txtName.setText("Kosturi Restaurant");
            txtDesc.setText("AN AUTHENTIC BANGLA RESTAURANT\n\nAddress:N5, Rangpur\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- " + mobilenumber[5]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[5]));
                    if (ActivityCompat.checkSelfPermission(RangpurDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(RangpurDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 29.053590);
                    intent.putExtra("longitude", 77.708440);
                    intent.putExtra("name", "Kosturi Restaurant");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("seven")) {
            imgRes4.setImageResource(R.drawable.rangpur7);
            txtName.setText("Foodish");
            txtDesc.setText("A FAST FOOD RESTAURANT\n\nAddress:Dhaap Road, Rangpur\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- " + mobilenumber[6]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[6]));
                    if (ActivityCompat.checkSelfPermission(RangpurDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(RangpurDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 25.224420);
                    intent.putExtra("longitude", 75.877420);
                    intent.putExtra("name", "Foodish");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("eight")) {
            imgRes4.setImageResource(R.drawable.rangpur8);
            txtName.setText("Nasta-La-Vista");
            txtDesc.setText("A FAST FOOD AND CHINESE RESTAURANT\n\nAddress:House No. 81, Road No. 1, Islampur, Hanuman Tala Road, 5400\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- " + mobilenumber[7]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[7]));
                    if (ActivityCompat.checkSelfPermission(RangpurDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
            btnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(RangpurDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 24.914400);
                    intent.putExtra("longitude", 79.582620);
                    intent.putExtra("name", "Nasta-La-Vista");
                    startActivity(intent);
                }
            });

        }
    }
}
