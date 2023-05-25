package com.example.convertidora_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String nombre = getIntent().getStringExtra("nombre");
        String apellido = getIntent().getStringExtra("apellido");
        String email = getIntent().getStringExtra("email");
        int imagen = getIntent().getIntExtra("imagen",0);
        Button idButtonMostrar = findViewById(R.id.buttonMostrar);
        TextView txtNombre = findViewById(R.id.txtNombre);
        TextView txtApellido = findViewById(R.id.txtApellido);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtNom = findViewById(R.id.txtNom);
        TextView txtApe = findViewById(R.id.txtApe);
        TextView txtEma = findViewById(R.id.txtEma);
        TextView txtImg = findViewById(R.id.txtImg);
        ImageView idImagen = findViewById(R.id.imgUser);

        idButtonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNom.getVisibility() != View.VISIBLE){
                    txtNom.setVisibility(View.VISIBLE);
                    txtApe.setVisibility(View.VISIBLE);
                    txtEma.setVisibility(View.VISIBLE);
                    txtImg.setVisibility(View.VISIBLE);
                    txtNombre.setText(nombre);
                    txtApellido.setText(apellido);
                    txtEmail.setText(email);
                    idImagen.setImageResource(imagen);
                    txtNombre.setVisibility(View.VISIBLE);
                    txtApellido.setVisibility(View.VISIBLE);
                    txtEmail.setVisibility(View.VISIBLE);
                    idImagen.setVisibility(View.VISIBLE);
                    idButtonMostrar.setText("Ocultar datos");

                }else{
                    txtNom.setVisibility(View.GONE);
                    txtApe.setVisibility(View.GONE);
                    txtEma.setVisibility(View.GONE);
                    txtImg.setVisibility(View.GONE);
                    txtNombre.setVisibility(View.GONE);
                    txtApellido.setVisibility(View.GONE);
                    txtEmail.setVisibility(View.GONE);
                    idImagen.setVisibility(View.GONE);
                    idButtonMostrar.setText("Mostrar datos");
                }

            }
        });


        Button idButtonSalir = findViewById(R.id.buttonSalir);

        idButtonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}