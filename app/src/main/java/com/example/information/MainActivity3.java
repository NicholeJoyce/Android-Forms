package com.example.information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
private EditText st3, brgy3, ct3, p3, zc3;
private Button home3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        st3 = findViewById(R.id.txtst3);
        brgy3 = findViewById(R.id.txtbrgy3);
        ct3 = findViewById(R.id.txtct3);
        p3 = findViewById(R.id.txtp3);
        zc3 = findViewById(R.id.txtzc3);
        home3 = findViewById(R.id.btnhome3);

        String street = getIntent().getStringExtra("keyst1");
        String barangay = getIntent(). getStringExtra("keybrgy1");
        String city = getIntent(). getStringExtra("keyct1");
        String province = getIntent(). getStringExtra("keyp1");
        String zipcode = getIntent(). getStringExtra("keyzc1");

        Intent i2 = new Intent(MainActivity3.this, MainActivity.class);
        st3.setText(street);
        brgy3.setText(barangay);
        ct3.setText(city);
        p3.setText(province);
        zc3.setText(zipcode);


        }
    public void home3(){
        Intent intent = new Intent(MainActivity3.this,MainActivity.class);
        startActivity(intent);
    }
}