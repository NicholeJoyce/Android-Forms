package com.example.information;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity4 extends AppCompatActivity {
    private EditText url4;
    private Button nav4, home4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        url4 = findViewById(R.id.txturl4);
        nav4 = findViewById(R.id.btnnav);
        home4 = findViewById(R.id.btnhome4);

    }
    public void home4(){
        Intent intent = new Intent(MainActivity4.this,MainActivity.class);
        startActivity(intent);
    }

    public void nav4(View view) {
        String url = "http://" + url4.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}