package com.example.information;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private EditText fn1, mn1, ln1, st1, brgy1, ct1, p1, zc1, tel1, email1;
private Button personal, add, url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fn1 = findViewById(R.id.txtfn);
        mn1 = findViewById(R.id.txtmn);
        ln1 = findViewById(R.id.txtln);
        st1 = findViewById(R.id.txtst);
        brgy1 = findViewById(R.id.txtbrgy);
        ct1 = findViewById(R.id.txtct);
        p1 = findViewById(R.id.txtp);
        zc1 = findViewById(R.id.txtzc);
        tel1 = findViewById(R.id.txttel);
        email1 = findViewById(R.id.txtemail);
        personal = findViewById(R.id.btnpersonal);
        add = findViewById(R.id.btnadd);
         url = findViewById(R.id.btnurl);

         personal.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 String first = fn1.getText().toString();
                 String middle = mn1.getText().toString();
                 String last = ln1.getText().toString();
                 String street = st1.getText().toString();
                 String barangay = ct1.getText().toString();
                 String city = ct1.getText().toString();
                 String province = p1.getText().toString();
                 String zipcode = zc1.getText().toString();
                 String telno = tel1.getText().toString();
                 String emailadd = email1.getText().toString();

                 Intent i1 = new Intent(MainActivity.this, MainActivity2.class);

                 i1.putExtra("keyfn1", first);
                 i1.putExtra("keymn1", middle);
                 i1.putExtra("keyln1", last);
                 i1.putExtra("keyst1", street);
                 i1.putExtra("keytel1", telno);
                 i1.putExtra("keyemail1", emailadd);

                 startActivity(i1);


             }
         });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String street = st1.getText().toString();
                String barangay = ct1.getText().toString();
                String city = ct1.getText().toString();
                String province = p1.getText().toString();
                String zipcode = zc1.getText().toString();


                Intent i2 = new Intent(MainActivity.this, MainActivity3.class);

                i2.putExtra("keyst1", street);
                i2.putExtra("keybrgy1", barangay);
                i2.putExtra("keyct1", city);
                i2.putExtra("keyp1", province);
                i2.putExtra("keyzc1", zipcode);


                startActivity(i2);
            }
        });

        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String link = fn1.getText().toString();


                Intent i3 = new Intent(MainActivity.this, MainActivity4.class);
                i3.putExtra("keyurl", link);


                startActivity(i3);
            }
        });

    }

}
