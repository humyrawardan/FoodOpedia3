package com.example.user.food_o_pedia;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DhakaDetailsActivity extends AppCompatActivity {

    ImageView imgRes1;
    TextView txtName, txtDesc;
    Button btnCell,btnMap;

    String mobilenumber[] = {"01511-932681", "01966-660053", " 01966-660054", " 01841-113322", " 01966-660069", " 01987-009810", " 01933-446677", "029891988"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka_details);

        imgRes1 = findViewById(R.id.img_res1);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        btnCell=findViewById(R.id.btn_cell);
        btnMap=findViewById(R.id.btn_map);

        String getName = getIntent().getExtras().getString("res_name");

        if (getName.equals("one")) {
            imgRes1.setImageResource(R.drawable.star);
            txtName.setText("Star Kabab");
            txtDesc.setText("Address:Banani, Dhaka City 1213, Bangladesh\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[0]);
            btnCell.setText("CALL");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[0]));
                    if (ActivityCompat.checkSelfPermission(DhakaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(DhakaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",28.438010);
                    intent.putExtra("longitude",77.110530);
                    intent.putExtra("name","Star Kabab");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("two")) {
            imgRes1.setImageResource(R.drawable.latitude23);
            txtName.setText("Latitude 23");
            txtDesc.setText("Address: House 236, Lake Road, Mohakhali New Dohs, Dhaka 1206\n\nHours: Open 10.00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[1]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[1]));
                    if (ActivityCompat.checkSelfPermission(DhakaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(DhakaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",32.945120);
                    intent.putExtra("longitude",-104.464440);
                    intent.putExtra("name","Latitude 23");
                    startActivity(intent);
                }
            });
        } else if (getName.equals("three")) {
            imgRes1.setImageResource(R.drawable.olea);
            txtName.setText("Olea");
            txtDesc.setText("Address: Airport Road | Le Meridien, 79/A Commercial Area, Dhaka City 1229\n\nHours: Closes soon: 10PM ⋅ Opens 10AM Thu\n\nMobile Number-" +mobilenumber[2]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[2]));
                    if (ActivityCompat.checkSelfPermission(DhakaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(DhakaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",23.836419);
                    intent.putExtra("longitude",90.417795);
                    intent.putExtra("name","Olea");
                    startActivity(intent);
                }
            });
        } else if (getName.equals("four")) {
            imgRes1.setImageResource(R.drawable.nandos);
            txtName.setText("Nando's");
            txtDesc.setText("Address: No. 16 Rd | 43, 27 Old, Dhaka City 1209\n\nHours: Open 9.00AM Closes 11:59PM\n\nMobile Number- "+mobilenumber[3]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[3]));
                    if (ActivityCompat.checkSelfPermission(DhakaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(DhakaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",27.191800);
                    intent.putExtra("longitude",78.020630);
                    intent.putExtra("name","Nando's");
                    startActivity(intent);
                }
            });
        }
        else if (getName.equals("five")) {
            imgRes1.setImageResource(R.drawable.favola);
            txtName.setText("Favola");
            txtDesc.setText("Address:Airport Road | 79/A Commercial Area, Le Meridien, Nikunja 2, Dhaka City 1229\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[4]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[4]));
                    if (ActivityCompat.checkSelfPermission(DhakaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(DhakaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",35.045280);
                    intent.putExtra("longitude",-94.622410);
                    intent.putExtra("name","Favola");
                    startActivity(intent);
                }
            });
        }
        else if (getName.equals("six")) {
            imgRes1.setImageResource(R.drawable.bunka);
            txtName.setText("Bunka");
            txtDesc.setText("Address:Road 96, House 19, Gulshan 2, Dhaka City 1212\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[5]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[5]));
                    if (ActivityCompat.checkSelfPermission(DhakaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(DhakaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",22.706900);
                    intent.putExtra("longitude",120.436190);
                    intent.putExtra("name","Bunka");
                    startActivity(intent);
                }
            });
        }
        else if (getName.equals("seven")) {
            imgRes1.setImageResource(R.drawable.izumi);
            txtName.setText("Izumi");
            txtDesc.setText("Address: House 24, Road 113 | Gulshan-2, Dhaka City\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[6]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[6]));
                    if (ActivityCompat.checkSelfPermission(DhakaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(DhakaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",43.021350);
                    intent.putExtra("longitude",-74.408090);
                    intent.putExtra("name","Izumi");
                    startActivity(intent);
                }
            });
        }
        else if (getName.equals("eight")) {
            imgRes1.setImageResource(R.drawable.prego);
            txtName.setText("Prego");
            txtDesc.setText("Address: 45 Main Gulshan Avenue Plot-01 Road | Gulshan 2, Dhaka City 1212\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[7]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[7]));
                    if (ActivityCompat.checkSelfPermission(DhakaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(DhakaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",22.653890);
                    intent.putExtra("longitude",120.299320);
                    intent.putExtra("name","Prego");
                    startActivity(intent);
                }
            });
        }



    }
}


