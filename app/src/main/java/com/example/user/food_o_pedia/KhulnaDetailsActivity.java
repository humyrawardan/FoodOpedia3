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

public class KhulnaDetailsActivity extends AppCompatActivity {

    ImageView imgRes7;
    TextView txtName, txtDesc;
    Button btnCell,btnMap;

    String mobilenumber[] = {"01712-121434", "01755-559933", "091-63398", "01842-326252", "01612-666664", " 01710-058947", "01765-868220", "01823-254709"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna_details);

        imgRes7 = findViewById(R.id.img_res7);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        btnCell=findViewById(R.id.btn_cell);
        btnMap=findViewById(R.id.btn_map);

        String getName = getIntent().getExtras().getString("res_name");

        if (getName.equals("one")) {
            imgRes7.setImageResource(R.drawable.khulna1);
            txtName.setText("Mejban Bari");
            txtDesc.setText("A HOUSE OF AUTHENTIC AND MOUTH WATERING MEJBANI GOSHT FROM CHITTAGONG\n\nAddress:Gollamari - Sonadanga Bypass Rd, Khulna 9208\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[0]);
            btnCell.setText("CALL");
            btnMap.setText("MAP LOCATION");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[0]));
                    if (ActivityCompat.checkSelfPermission(KhulnaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(KhulnaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",56.238430);
                    intent.putExtra("longitude",-120.795550);
                    intent.putExtra("name","Mejban Bari");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("two")) {
            imgRes7.setImageResource(R.drawable.khulna2);
            txtName.setText("City Light Cafe");
            txtDesc.setText("A MULTI CUISINE RESTAURANT\n\nAddress:G.M. Baksh Tower, 22 Sir Iqbal Rd, Khulna 9100\n\nHours: Open 10.00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[1]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[1]));
                    if (ActivityCompat.checkSelfPermission(KhulnaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(KhulnaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",22.809780);
                    intent.putExtra("longitude",89.564390);
                    intent.putExtra("name","City Light Cafe");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("three")) {
            imgRes7.setImageResource(R.drawable.khulna3);
            txtName.setText("Firefly Restaurant");
            txtDesc.setText("A MULTI CUISINE RESTAURANT\n\nAddress:Khulna\n\nHours: Closes soon: 10PM ⋅ Opens 10AM Thu\n\nMobile Number-" +mobilenumber[2]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[2]));
                    if (ActivityCompat.checkSelfPermission(KhulnaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(KhulnaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",22.845640);
                    intent.putExtra("longitude",89.540329);
                    intent.putExtra("name","Firefly Restaurant");
                    startActivity(intent);
                }
            });

        } else if (getName.equals("four")) {
            imgRes7.setImageResource(R.drawable.khulna4);
            txtName.setText("Mega Biriyani");
            txtDesc.setText("A BIRYANI HOUSE\n\nAddress:Eid Ghah Rd, Meghar More, Khalishpur, Khulna 9100\n\nHours: Open 9.00AM Closes 11:59PM\n\nMobile Number- "+mobilenumber[3]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[3]));
                    if (ActivityCompat.checkSelfPermission(KhulnaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(KhulnaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",22.809780);
                    intent.putExtra("longitude",89.564390);
                    intent.putExtra("name","Mega Biriyani");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("five")) {
            imgRes7.setImageResource(R.drawable.khulna5);
            txtName.setText("Fakrul Biriyani Ghar");
            txtDesc.setText("A BIRYANI HOUSE\n\nAddress: 338,First floor, Hayder Complex, Near Sandhya Bazar, Sher-E-Bangla Road, Moylapota More, Khulna\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[4]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[4]));
                    if (ActivityCompat.checkSelfPermission(KhulnaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(KhulnaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",22.868334);
                    intent.putExtra("longitude",89.417176);
                    intent.putExtra("name","Fakrul Biriyani Ghar");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("six")) {
            imgRes7.setImageResource(R.drawable.khulna6);
            txtName.setText("Radhuni Hotel");
            txtDesc.setText("A BANGLA CUISINE RESTAURANT\n\nAddress:207, First Floor, Hayder Complex, Sher-E-Bangla Road, Moylapota More, Khulna 9100\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[5]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[5]));
                    if (ActivityCompat.checkSelfPermission(KhulnaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(KhulnaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",22.868334);
                    intent.putExtra("longitude",89.417176);
                    intent.putExtra("name","Radhuni Hotel");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("seven")) {
            imgRes7.setImageResource(R.drawable.khulna7);
            txtName.setText("Grill House");
            txtDesc.setText("A KABAB HOUSE\n\nAddress:KDA, New Market, Khulna - Jessore - Dhaka Hwy, Khulna 9100\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[6]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[6]));
                    if (ActivityCompat.checkSelfPermission(KhulnaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(KhulnaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude",23.7333);
                    intent.putExtra("longitude",90.3839);
                    intent.putExtra("name","Grill House");
                    startActivity(intent);
                }
            });

        }
        else if (getName.equals("eight")) {
            imgRes7.setImageResource(R.drawable.khulna8);
            txtName.setText("Kacchi Ghar");
            txtDesc.setText("AN AUTHENTIC KACCHI HOUSE\n\nAddress:KDA Avenue, Khulna\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[7]);

            btnCell.setText("CALL");
            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[7]));
                    if (ActivityCompat.checkSelfPermission(KhulnaDetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
                    Intent intent=new Intent(KhulnaDetailsActivity.this,MapsActivity.class);
                    intent.putExtra("latitude", 22.868334);
                    intent.putExtra("longitude",89.417176);
                    intent.putExtra("name","Kacchi Ghar");
                    startActivity(intent);
                }
            });

        }
    }
}
