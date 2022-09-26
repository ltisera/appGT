package com.example.appgt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etUsuario, etPassword;
    Button btnIniciarSesion, btnRegistrarUsuario;
    CheckBox cbRecordarUsuario;
    Toolbar mi_toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mi_toolbar = findViewById(R.id.mi_toolbar);
        setSupportActionBar(mi_toolbar);
        getSupportActionBar().setTitle("Mis Examenessss");


        etUsuario = findViewById(R.id.etUsuario);
        etPassword = findViewById(R.id.etPassword);

        cbRecordarUsuario = findViewById(R.id.cbRecordarUsuario);

        btnIniciarSesion  = findViewById(R.id.btnIniciarSesion);
        btnRegistrarUsuario = findViewById(R.id.btnRegistrarUsuario);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("TODO","queonda");
                String usuario = etUsuario.getText().toString();
                String password = etPassword.getText().toString();

                if(usuario.isEmpty() || password.isEmpty()){
                    Toast.makeText(LoginActivity.this, "datos vasciosn", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this,"usuario: " + usuario + " pasS: " + password, Toast.LENGTH_SHORT).show();
                    Intent main_activity = new Intent(LoginActivity.this, MainActivity.class);
                    main_activity.putExtra("usuario", usuario);
                    startActivity(main_activity);
                    finish();
                }
            }
        });

        btnRegistrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main_activity = new Intent(LoginActivity.this, TerminosYCondicionesActivity.class);
                startActivity(main_activity);
            }
        });

    }
}