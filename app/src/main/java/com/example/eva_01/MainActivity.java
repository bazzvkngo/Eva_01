package com.example.eva_01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtén una referencia al botón "YA TENGO UNA CUENTA" por su ID
        Button yaTengoCuentaButton = findViewById(R.id.button2);

        // Agrega un OnClickListener al botón "YA TENGO UNA CUENTA"
        yaTengoCuentaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para iniciar la actividad User
                Intent intent = new Intent(MainActivity.this, User.class);
                startActivity(intent);
            }
        });
    }
}
