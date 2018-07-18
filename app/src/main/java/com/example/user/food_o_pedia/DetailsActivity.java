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

public class DetailsActivity extends AppCompatActivity {

    ImageView imgRes;
    TextView txtName, txtDesc;
    Button btnCell;

    String mobilenumber[] = {"01819-342634", "031-652050", " 01819-237777", " 01972-232823", " 031-652079", " 01739-936084", " 01818-111541", "01767-885533"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgRes = findViewById(R.id.img_res);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        btnCell=findViewById(R.id.btn_cell);

        String getName = getIntent().getExtras().getString("res_name");

        if (getName.equals("one")) {
            imgRes.setImageResource(R.drawable.handi);
            txtName.setText("Handi");
            txtDesc.setText("Address: Punak Bhaban, Dampara Police Line, M M Ali Road, CDA Avenue, Chittagong 4000\n\nHours: Open 10:00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[0]);
            btnCell.setText("CALL");

            btnCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[0]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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

        } else if (getName.equals("two")) {
            imgRes.setImageResource(R.drawable.meridian);
            txtName.setText("Meridian Hotel & Restaurant");
            txtDesc.setText("Address: 1367 CDA Avenue, Chittagong 4000\n\nHours: Open 10.00AM Closes 11:30PM\n\nMobile Number-"+mobilenumber[1]);

            btnCell.setText("CALL");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[1]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
        } else if (getName.equals("three")) {
            imgRes.setImageResource(R.drawable.greedy);
            txtName.setText("Greedy Guts");
            txtDesc.setText("Address: Naval Avenue, CRB Road, Chittagong 4000\n\nHours: Closes soon: 10PM ⋅ Opens 10AM Thu\n\nMobile Number-" +mobilenumber[2]);

            btnCell.setText("CALL");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[2]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
        } else if (getName.equals("four")) {
            imgRes.setImageResource(R.drawable.cube);
            txtName.setText("Cube");
            txtDesc.setText("Address: 84/A, Khan Manor, Jamalkhan, Chittagong 4000\n\nHours: Open 9.00AM Closes 11:59PM\n\nMobile Number- "+mobilenumber[3]);

            btnCell.setText("CALL");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[3]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
        }
        else if (getName.equals("five")) {
            imgRes.setImageResource(R.drawable.bonanza);
            txtName.setText("Bonanza");
            txtDesc.setText("Address: 2nd & 3rd Floor 1692, Golden Plaza, CD Avenue, GEC Circle, Chittagong 4000\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[4]);

            btnCell.setText("CALL");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[4]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
        }
        else if (getName.equals("six")) {
            imgRes.setImageResource(R.drawable.regalo);
            txtName.setText("Regalo");
            txtDesc.setText("Address: 42, Moss Rose Heights, M.M Ali road, WASA Circle, Lalkhan Bazar, Chittogong 4000\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[5]);

            btnCell.setText("CALL");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[5]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
        }
        else if (getName.equals("seven")) {
            imgRes.setImageResource(R.drawable.pavilion);
            txtName.setText("The Pavilion");
            txtDesc.setText("Address: 787, Avenue Centre, CDA Avenue, East Nasirabad, Chittagong 4000\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[6]);

            btnCell.setText("CALL");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[6]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
        }
        else if (getName.equals("eight")) {
            imgRes.setImageResource(R.drawable.errante);
            txtName.setText("Errante");
            txtDesc.setText("Address: 94, 8th Floor & Rooftop, Eves Center, Nasirabad Housing Society, Road No 3, Nasirabad, Chittagong 4203\n\nHours: Closes  11PM ⋅ Opens 12PM Thu\n\nMobile Number- "+mobilenumber[7]);

            btnCell.setText("CALL");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobilenumber[7]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
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
        }



    }
}

