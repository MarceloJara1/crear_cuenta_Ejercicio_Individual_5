package com.example.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.convertidora_two.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtener datos de la activity anterior
        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");
        String email = getIntent().getStringExtra("email");
        int imagen = getIntent().getIntExtra("imagen",0);

        // Obtener id de los componentes de la activity actual
        binding.buttonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.txtNom.getVisibility()!=View.VISIBLE){
                    binding.txtNom.setVisibility(View.VISIBLE);
                    binding.txtApe.setVisibility(View.VISIBLE);
                    binding.txtEma.setVisibility(View.VISIBLE);
                    binding.txtImg.setVisibility(View.VISIBLE);
                    binding.txtNombre.setText(nombre);
                    binding.txtApellido.setText(apellido);
                    binding.txtEmail.setText(email);
                    binding.txtNombre.setVisibility(View.VISIBLE);
                    binding.txtApellido.setVisibility(View.VISIBLE);
                    binding.txtEmail.setVisibility(View.VISIBLE);
                    binding.imgUser.setImageResource(imagen);
                    binding.imgUser.setVisibility(View.VISIBLE);
                    binding.buttonMostrar.setText("Ocultar datos");
                }else{
                    binding.txtNom.setVisibility(View.GONE);
                    binding.txtApe.setVisibility(View.GONE);
                    binding.txtEma.setVisibility(View.GONE);
                    binding.txtImg.setVisibility(View.GONE);
                    binding.txtNombre.setVisibility(View.GONE);
                    binding.txtApellido.setVisibility(View.GONE);
                    binding.txtEmail.setVisibility(View.GONE);
                    binding.imgUser.setVisibility(View.GONE);
                    binding.buttonMostrar.setText("Mostrar datos");
                }
            }
        });

        // Boton para volver a la activity anterior.
       binding.buttonSalir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               onBackPressed();
           }
       });


    }
}