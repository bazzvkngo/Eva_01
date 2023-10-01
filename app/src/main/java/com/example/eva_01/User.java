package com.example.eva_01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        // Obtén una referencia al botón "salir" por su ID
        Button salirButton = findViewById(R.id.salir);

        // Agrega un OnClickListener al botón "salir"
        salirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para iniciar la actividad MainActivity
                Intent intent = new Intent(User.this, MainActivity.class);
                startActivity(intent);
                // Opcionalmente, puedes finalizar la actividad actual
                finish();
            }
        });
    }
}
