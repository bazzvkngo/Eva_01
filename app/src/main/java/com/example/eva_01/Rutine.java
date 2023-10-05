package com.example.eva_01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rutine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutine);

        Button finalizarButton = findViewById(R.id.finalizarRegistro);
        finalizarButton.setOnClickListener(v -> {
            Intent intent = new Intent(Rutine.this, WorkSpace.class);
            startActivity(intent);
        });
    }
}
