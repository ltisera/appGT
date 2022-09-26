package com.example.appgt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TerminosYCondicionesActivity extends AppCompatActivity {
    Button btnAceptar;
    Toolbar mi_toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos_ycondiciones);

        btnAceptar = findViewById(R.id.btnAceptarTerminos);
        mi_toolbar = findViewById(R.id.mi_toolbar);
        setSupportActionBar(mi_toolbar);
        getSupportActionBar().setTitle("Terminos y conditions");




        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TerminosYCondicionesActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}