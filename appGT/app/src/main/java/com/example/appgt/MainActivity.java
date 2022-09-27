package com.example.appgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnDaenerys;
    Button btnJon;
    Button btnArya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDaenerys = findViewById(R.id.btnDaenerys);
        btnJon = findViewById(R.id.btnJon);
        btnArya = findViewById(R.id.btnArya);

        btnDaenerys.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                Intent activity_main = new Intent(MainActivity.this, DaenerysActivity.class);
                startActivity(activity_main);
            }
        });

        btnJon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity_main = new Intent(MainActivity.this, JonActivity.class);
                startActivity(activity_main);
            }
        });

        btnArya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity_main = new Intent(MainActivity.this, AryaActivity.class);
                startActivity(activity_main);
            }
        });

    }

}