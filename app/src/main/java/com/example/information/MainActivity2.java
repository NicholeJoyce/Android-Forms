package com.example.information;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
private EditText fn2, mn2, ln2, tel2, em2;
private Button home2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fn2 = findViewById(R.id.txtfn2);
        mn2 = findViewById(R.id. txtmn2);
        ln2 = findViewById(R.id.txtln2);
        tel2 = findViewById(R.id.txttel2);
        em2 = findViewById(R.id.txtemail2);

        home2 = findViewById(R.id.btnhome2);


                String first2 = getIntent().getStringExtra("keyfn1");
                String middle2 = getIntent(). getStringExtra("keymn1");
                String last2 = getIntent(). getStringExtra("keyln1");
                String telno2 = getIntent(). getStringExtra("keytel1");
                String emailadd2 = getIntent(). getStringExtra("keyemail1");

                Intent i2 = new Intent(MainActivity2.this, MainActivity.class);
                fn2.setText(first2);
                mn2.setText(middle2);
                ln2.setText(last2);
                tel2.setText(telno2);
                em2.setText(emailadd2);

            }
    public void home2(){
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }

            }

