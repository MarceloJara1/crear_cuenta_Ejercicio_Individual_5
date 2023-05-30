package com.example.convertidora_two;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.convertidora_two.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Asignamos valores por defecto usando viewBinding
        binding.inputNombre.setText("Marcelo");
        binding.inputApellido.setText("Jara");
        binding.inputEmail.setText("marcelojaraoliva@gmail.com");
        binding.buttonCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Obtenemos los componentes
                String nombre = binding.inputNombre.getText().toString();
                String apellido = binding.inputApellido.getText().toString();
                String email = binding.inputEmail.getText().toString();
                String password = binding.inputPassword.getText().toString();



                //Validamos ingresos
                if (nombre.trim().matches("[a-zA-Z]+") && apellido.trim().matches("[a-zA-Z]+")){

                    if (email.trim().matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")){

                        if (password.trim().length()>5){
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
       binding.btnSalir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });

    }
}