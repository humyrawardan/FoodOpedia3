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

public class SylhetDetailsActivity extends AppCompatActivity {

    ImageView imgRes2;
    TextView txtName, txtDesc;
    Button btnCell,btnMap;

    String mobilenumber[] = {"01954-556677", "01761-152939", "01717-020505", "01710-459607", " 01759-962096", " 01715-195550", "01783-893527", "01955-517070"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet_details);

        imgRes2 = findViewById(R.id.img_res2);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        btnCell=findViewById(R.id.btn_cell);
        btnMap=findViewById(R.id.btn_map);

        String getName = getIntent().getExtras().getString("res_name");

        if (getName.equals("one")) {
            imgRes2.setImageResource(R.drawable.sylhet1);
            txtName.setText("The Mad Grill");
            txtDesc.setText("Address:  Nayasarak Point, Manik Pir Road, 3100\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[0]);
            btnCell.setText("CALL");
            btnMap.setText("MAP LOCATION");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[0]));
                    if (ActivityCompat.checkSelfPermission(SylhetDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(SylhetDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",-38.347500);
                    intent.putExtra("longitude",144.758900);
                    intent.putExtra("name","The Mad Grill");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("two")) {
            imgRes2.setImageResource(R.drawable.sylhet2);
            txtName.setText("Panshi Restaurant");
            txtDesc.setText("Address: Jallarpar Road Zindabazar, Sylhet 3100\n\nHours: Open 10.00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[1]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[1]));
                    if (ActivityCompat.checkSelfPermission(SylhetDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(SylhetDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",24.705173);
                    intent.putExtra("longitude",91.678084);
                    intent.putExtra("name","Panshi Restaurant");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("three")) {
            imgRes2.setImageResource(R.drawable.sylhet3);
            txtName.setText("Woondaal King Kabab");
            txtDesc.setText("Address: Barud Kana Point Purbo Zinda Bazar Barutkhana Road, 3100\n\nHours: Closes soon: 10PM ⋅ Opens 10AM Thu\n\nMobile Number-" +mobilenumber[2]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[2]));
                    if (ActivityCompat.checkSelfPermission(SylhetDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(SylhetDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",23.745223);
                    intent.putExtra("longitude",90.365783);
                    intent.putExtra("name","Woondaal King Kabab");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("four")) {
            imgRes2.setImageResource(R.drawable.sylhet4);
            txtName.setText("Pach Bhai Restaurant");
            txtDesc.setText("Address:Dariapara Road, Sylhet 3100\n\nHours: Open 9.00AM Closes 11:59PM\n\nMobile Number- "+mobilenumber[3]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[3]));
                    if (ActivityCompat.checkSelfPermission(SylhetDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(SylhetDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",43.6);
                    intent.putExtra("longitude",1.44);
                    intent.putExtra("name","Pach Bhai Restaurant");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("five")) {
            imgRes2.setImageResource(R.drawable.sylhet5);
            txtName.setText("New Handi restaurant");
            txtDesc.setText("Address:Karima Mansion, Hazrat Shahjalal Rd, Sylhet 3100\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[4]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[4]));
                    if (ActivityCompat.checkSelfPermission(SylhetDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(SylhetDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",24.600114);
                    intent.putExtra("longitude",91.681376);
                    intent.putExtra("name","New Handi Restaurant");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("six")) {
            imgRes2.setImageResource(R.drawable.sylhet6);
            txtName.setText("Alphine Restaurant");
            txtDesc.setText("Address:Karimganj - Sylhet Road, Sylhet 3100\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[5]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[5]));
                    if (ActivityCompat.checkSelfPermission(SylhetDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(SylhetDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",24.9);
                    intent.putExtra("longitude",91.86667);
                    intent.putExtra("name","Alphine Restaurant");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("seven")) {
            imgRes2.setImageResource(R.drawable.sylhet7);
            txtName.setText("Stacks O'Snacks");
            txtDesc.setText("Address: 1st floor(Opposite of Car City) Darshondowri,West, Sylhet - Sunamganj Hwy, Sylhet\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[6]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[6]));
                    if (ActivityCompat.checkSelfPermission(SylhetDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(SylhetDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",24.9);
                    intent.putExtra("longitude",91.86667);
                    intent.putExtra("name","Stacks O'Snacks");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("eight")) {
            imgRes2.setImageResource(R.drawable.sylhet8);
            txtName.setText("Hot Spot");
            txtDesc.setText("Address:Ground Floor, Sylhet Millennium, Zinda Bazar, Sylhet 3100\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[7]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[7]));
                    if (ActivityCompat.checkSelfPermission(SylhetDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(SylhetDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude", 24.9);
                    intent.putExtra("longitude",91.86667);
                    intent.putExtra("name","Hot Spot");
                    startActivity(intent);
                }
            });

        }





    }
}
