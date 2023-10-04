package com.example.eva_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class NewUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        Button siguienteButton = findViewById(R.id.button3);

        siguienteButton.setOnClickListener(view -> {
            Intent intent = new Intent(NewUser.this, Form.class);
            startActivity(intent);
        });
    }
    }