package com.example.appgt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    Toolbar mi_toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saludarUsuario();

        mi_toolbar = findViewById(R.id.mi_toolbar);
        setSupportActionBar(mi_toolbar);
        getSupportActionBar().setTitle("ME Pantalla ppal");

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

    @Override
     
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.item_agregar){
            //realizo algo
            Intent intent = new Intent (MainActivity.this, AgregarExamenActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void saludarUsuario(){
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String usuario = bundle.getString("usuario");

            Toast.makeText(MainActivity.this, "Hola " + usuario, Toast.LENGTH_SHORT).show();
        }
    }
}

