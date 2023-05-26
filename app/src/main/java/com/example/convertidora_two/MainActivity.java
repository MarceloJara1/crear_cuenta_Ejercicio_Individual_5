package com.example.convertidora_two;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtenemos los id de los difrentes componentes
        Button idButtonCrear = findViewById(R.id.buttonCrear);
        EditText idNombre = (EditText) findViewById(R.id.inputNombre);
        EditText idApellido = (EditText) findViewById(R.id.inputApellido);
        EditText idEmail = (EditText) findViewById(R.id.inputEmail);
        EditText idPass = (EditText) findViewById(R.id.inputPassword);

        // Configurar clicklistener para el boton Crear Usuario
        idButtonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Obtener valores de los componentes
                String nombre = idNombre.getText().toString();
                String apellido = idApellido.getText().toString();
                String email = idEmail.getText().toString();
                String pass = idPass.getText().toString();

                // Validar Ingresos

                if (nombre.trim().matches("[a-zA-Z]+") && apellido.trim().matches("[a-zA-Z]+")){

                    if (email.trim().matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")){

                        if (pass.trim().length()>5){
                            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                            intent.putExtra("nombre", nombre);
                            intent.putExtra("apellido", apellido);
                            intent.putExtra("email", email);
                            intent.putExtra("imagen", R.drawable.user_img);
                            startActivity(intent);

                        }else {Toast.makeText(MainActivity.this, "Contraseña demasiado corta...", Toast.LENGTH_SHORT).show();}

                    }else{Toast.makeText(MainActivity.this, "El correo ingresado no es valido...", Toast.LENGTH_SHORT).show();}

                }else{Toast.makeText(MainActivity.this, "Nombre o apellido no validos...", Toast.LENGTH_SHORT).show();}

            }
        });

        // Boton salir
        Button idButtonSalir = findViewById(R.id.btnSalir);

        idButtonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}