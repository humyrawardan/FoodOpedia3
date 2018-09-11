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

public class BarishalDetailsActivity extends AppCompatActivity {


    ImageView imgRes5;
    TextView txtName, txtDesc;
    Button btnCell, btnMap;

    String mobilenumber[] = {"01722-222678", "01713-393416", "01715-848121", "01796-333222", "01790-441111", "01971-868292", "01777-735171", "01683-822002"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barishal_details);

        imgRes5 = findViewById(R.id.img_res5);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        btnCell = findViewById(R.id.btn_cell);
        btnMap = findViewById(R.id.btn_map);

        String getName = getIntent().getExtras().getString("res_name");

        if (getName.equals("one")) {
            imgRes5.setImageResource(R.drawable.barishal1);
            txtName.setText("BFG Restaurant");
            txtDesc.setText("A 3 STAR CHINESE RESTAURANT\n\nAddress:Sadar Rd, Barisal 8200\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-" + mobilenumber[0]);
            btnCell.setText("CALL");
            btnMap.setText("MAP LOCATION");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[0]));
                    if (ActivityCompat.checkSelfPermission(BarishalDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent = new Intent(BarishalDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 23.116470);
                    intent.putExtra("longitude", 83.196110);
                    intent.putExtra("name", "BFG Restaurant");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("two")) {
            imgRes5.setImageResource(R.drawable.barishal2);
            txtName.setText("The River Cafe");
            txtDesc.setText("AN AMERICAN RESTAURANT\n\nAddress:Police Line Rd, Barisal 8200\n\nHours: Open 10.00AM Closes 11:30PM\n\nMobile Number-" + mobilenumber[1]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[1]));
                    if (ActivityCompat.checkSelfPermission(BarishalDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent = new Intent(BarishalDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 20.453270);
                    intent.putExtra("longitude", 85.906880);
                    intent.putExtra("name", "The River Cafe");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("three")) {
            imgRes5.setImageResource(R.drawable.barishal3);
            txtName.setText("EL Foodee");
            txtDesc.setText("A MAXICAN BASE RESTAURANT\n\nAddress:Bells Park, Band Rd, Barisal\n\nHours: Closes: 10PM ⋅ Opens 10AM Thu\n\nMobile Number-" + mobilenumber[2]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[2]));
                    if (ActivityCompat.checkSelfPermission(BarishalDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent = new Intent(BarishalDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 44.527780);
                    intent.putExtra("longitude", -79.988660);
                    intent.putExtra("name", "EL Foodee");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("four")) {
            imgRes5.setImageResource(R.drawable.barishal4);
            txtName.setText("Handi Korai");
            txtDesc.setText("A FAMILY STYLE INTERNATIONAL QUALITY RESTAURANT\n\nAddress:Top Floor, Hotel Arena,135 Sadar Road, Barisal\n\nHours: Open 9.00AM Closes 11:59PM\n\nMobile Number- " + mobilenumber[3]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[3]));
                    if (ActivityCompat.checkSelfPermission(BarishalDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent = new Intent(BarishalDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 43.096320);
                    intent.putExtra("longitude", -89.878010);
                    intent.putExtra("name", "Handi Korai");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("five")) {
            imgRes5.setImageResource(R.drawable.barishal5);
            txtName.setText("China Palace");
            txtDesc.setText("A CHINESE RESTAURANT\n\nAddress:Sadar Rd, Barisal\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- " + mobilenumber[4]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[4]));
                    if (ActivityCompat.checkSelfPermission(BarishalDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent = new Intent(BarishalDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 23.116470);
                    intent.putExtra("longitude", 83.196110);
                    intent.putExtra("name", "China Palace");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("six")) {
            imgRes5.setImageResource(R.drawable.barishal6);
            txtName.setText("Tawa Restaurant");
            txtDesc.setText("A MULTI CUISINE RESTAURANT\n\nAddress:1178, Choumatha, C and B Rd, Barisal\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- " + mobilenumber[5]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[5]));
                    if (ActivityCompat.checkSelfPermission(BarishalDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent = new Intent(BarishalDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 32.485470);
                    intent.putExtra("longitude", -81.204720);
                    intent.putExtra("name", "Tawa Restaurant");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("seven")) {
            imgRes5.setImageResource(R.drawable.barishal7);
            txtName.setText("Bells Diner");
            txtDesc.setText("A MULTI CUISINE RESTAURANT\n\nAddress:Band Road, Barisal 8200\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- " + mobilenumber[6]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[6]));
                    if (ActivityCompat.checkSelfPermission(BarishalDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent = new Intent(BarishalDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 53.860050);
                    intent.putExtra("longitude", -110.408190);
                    intent.putExtra("name", "Bells Diner");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("eight")) {
            imgRes5.setImageResource(R.drawable.barishal8);
            txtName.setText("Subtime");
            txtDesc.setText("A MAXICAN CUISINE RESTAURANT\n\nAddress:862 East Bogra Road Barisal\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- " + mobilenumber[7]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[7]));
                    if (ActivityCompat.checkSelfPermission(BarishalDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent = new Intent(BarishalDetailsActivity.this, MapsActivity.class);
                    intent.putExtra("latitude", 22.672160);
                    intent.putExtra("longitude", 88.418190);
                    intent.putExtra("name", "Subtime");
                    startActivity(intent);
                }
            });

        }
    }
}
