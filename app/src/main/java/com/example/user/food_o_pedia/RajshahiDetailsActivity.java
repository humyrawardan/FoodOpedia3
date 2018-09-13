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

public class RajshahiDetailsActivity extends AppCompatActivity {

    ImageView imgRes3;
    TextView txtName, txtDesc;
    Button btnCell,btnMap;

    String mobilenumber[] = {"01779-000775", "01985-429010", "0721-775459", "0721-774120", "01670-224800", " 01710-058947", "01557-776321", "01711-927887"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi_details);

        imgRes3 = findViewById(R.id.img_res3);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        btnCell=findViewById(R.id.btn_cell);
        btnMap=findViewById(R.id.btn_map);

        String getName = getIntent().getExtras().getString("res_name");

        if (getName.equals("one")) {
            imgRes3.setImageResource(R.drawable.rajshahi1);
            txtName.setText("Order's Up");
            txtDesc.setText("A FAST FOOD RESTAURANT\n\nAddress:Jamal super market,2nd floor, Saheb Bazar Road, Rajshahi\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[0]);
            btnCell.setText("CALL");
            btnMap.setText("MAP LOCATION");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[0]));
                    if (ActivityCompat.checkSelfPermission(RajshahiDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(RajshahiDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",17.361690);
                    intent.putExtra("longitude",78.485100);
                    intent.putExtra("name","Order's Up");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("two")) {
            imgRes3.setImageResource(R.drawable.rajshahi2);
            txtName.setText("Rahman's Bar-B-Q");
            txtDesc.setText("A BARBECUE AND FAST FOOD RESTAURANT\n\nAddress: Greater Rd, Rajshahi\n\nHours: Open 10.00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[1]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[1]));
                    if (ActivityCompat.checkSelfPermission(RajshahiDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(RajshahiDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",12.821520);
                    intent.putExtra("longitude",80.028510);
                    intent.putExtra("name","Rahman's Bar-B-Q");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("three")) {
            imgRes3.setImageResource(R.drawable.rajshahi3);
            txtName.setText("Master Chef");
            txtDesc.setText("BOTH BANGLA AND CHINESE RESTAURANT\n\nAddress:R685, Rajshahi Association (Alokar More), Rajshahi 6100\n\nHours: Closes soon: 10PM ⋅ Opens 10AM Thu\n\nMobile Number-" +mobilenumber[2]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[2]));
                    if (ActivityCompat.checkSelfPermission(RajshahiDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(RajshahiDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",52.172889);
                    intent.putExtra("longitude",-7.140369);
                    intent.putExtra("name","Master Chef");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("four")) {
            imgRes3.setImageResource(R.drawable.rajshahi4);
            txtName.setText("Nanking Restaurant ");
            txtDesc.setText("A CHINESE RESTAURANT\n\nAddress: Moni Bazar, Rajshahi\n\nHours: Open 9.00AM Closes 11:59PM\n\nMobile Number- "+mobilenumber[3]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[3]));
                    if (ActivityCompat.checkSelfPermission(RajshahiDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(RajshahiDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",32.736970);
                    intent.putExtra("longitude",74.867200);
                    intent.putExtra("name","Nanking Restaurant ");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("five")) {
            imgRes3.setImageResource(R.drawable.rajshahi5);
            txtName.setText("The Hideout Cafe");
            txtDesc.setText("A FAST FOOD RESTAURANT\n\nAddress:227, Level-2, New Widened Rd, Rajshahi 6100\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[4]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[4]));
                    if (ActivityCompat.checkSelfPermission(RajshahiDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(RajshahiDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",17.380500);
                    intent.putExtra("longitude",78.477300);
                    intent.putExtra("name","The Hideout Cafe");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("six")) {
            imgRes3.setImageResource(R.drawable.rajshahi6);
            txtName.setText("Twist and Taste");
            txtDesc.setText("A CHINESE AND FAST FOOD RESTAURANT\n\nAddress:Jamal Super Market, 1st floor, Rajshahi 6100\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[5]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[5]));
                    if (ActivityCompat.checkSelfPermission(RajshahiDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(RajshahiDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",51.365500);
                    intent.putExtra("longitude",-2.902380);
                    intent.putExtra("name","Twist and Taste");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("seven")) {
            imgRes3.setImageResource(R.drawable.rajshahi7);
            txtName.setText("Khan Teheri Ghor");
            txtDesc.setText("A RESTAURANT THAT PROVIDE AUTHENTIC TEHARI\n\nAddress:Senadighir Mor, Rajshahi\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[6]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[6]));
                    if (ActivityCompat.checkSelfPermission(RajshahiDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(RajshahiDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",24.452547);
                    intent.putExtra("longitude",88.614494);
                    intent.putExtra("name","Khan Teheri Ghor");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("eight")) {
            imgRes3.setImageResource(R.drawable.rajshahi8);
            txtName.setText("Salt Meat");
            txtDesc.setText("A FAST FOOD RESTAURANT\n\nAddress: New Widened Rd, Rajshahi\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[7]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[7]));
                    if (ActivityCompat.checkSelfPermission(RajshahiDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(RajshahiDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude", 53.522580);
                    intent.putExtra("longitude",-8.913830);
                    intent.putExtra("name","Salt Meat");
                    startActivity(intent);
                }
            });

        }
    }
}
