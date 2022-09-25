package com.example.appgt;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = findViewById(R.id.etUsuario);
        etPassword = findViewById(R.id.etPassword);

        cbRecordarUsuario = findViewById(R.id.cbRecordadUsuario);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("TODO", "Se apreto el boton iniciar sesion");

                //Traer el texto y transformarlo en un String
                String usuario = etUsuario.getText().toString();
                String password = etPassword.getText().toString();

                //Verificar si los datos estan vacios
                if(usuario.isEmpty() || password.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Completar Datos", Toast.LENGTH_SHORT).show();
                } else{
                    //Intent: Darle curso a uan intencion. Va a ir de un lado a otro
                    Intent main_activity = new Intent(LoginActivity.this, MainActivity.class);
                    main_activity.putExtra("usuario", usuario);
                    startActivity(main_activity);
                    //Se elimina la activity que esta llamando a ese metodo
                    finish();
                }

            }
        });
    }
}