package com.example.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button idButtonCrear = findViewById(R.id.buttonCrear);
        EditText idNombre = findViewById(R.id.inputNombre);
        EditText idApellido = findViewById(R.id.inputApellido);
        EditText idEmail = findViewById(R.id.inputEmail);

        idButtonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = idNombre.getText().toString();
                String apellido = idApellido.getText().toString();
                String email = idEmail.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("nombre",nombre);
                intent.putExtra("apellido",apellido);
                intent.putExtra("email",email);
                intent.putExtra("imagen", R.drawable.user_img);
                startActivity(intent);
            }
        });

        Button idButtonSalir = findViewById(R.id.btnSalir);

        idButtonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}