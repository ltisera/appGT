package com.example.appgt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNumero1;
    EditText etNumero2;
    Button btnPromedio;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvNota);
        etNumero1 = findViewById(R.id.etnota1);
        etNumero2 = findViewById(R.id.etnota2);

        btnPromedio = findViewById(R.id.btnPromedio);

        btnPromedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.valueOf(etNumero1.getText().toString());
                int n2 = Integer.valueOf(etNumero2.getText().toString());
                float rf = new Float((n1 +  n2) / 2);
                String cadena = "El resultado es: " + Float.toString(rf);
                tvResultado.setText(cadena);
                Toast.makeText(MainActivity.this, cadena, Toast.LENGTH_SHORT).show();
            }
        });
    }
}