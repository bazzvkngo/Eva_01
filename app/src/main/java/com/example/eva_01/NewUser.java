package com.example.eva_01;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class NewUser extends AppCompatActivity {

    private EditText correoEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        correoEditText = findViewById(R.id.editTextTextEmailAddress);
        passwordEditText = findViewById(R.id.editTextTextPassword);

        Button siguienteButton = findViewById(R.id.button3);

        siguienteButton.setOnClickListener(view -> {
            String correo = correoEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();

            if (correo.isEmpty() || password.isEmpty()) {
                Toast.makeText(NewUser.this, "Complete los datos de registro", Toast.LENGTH_SHORT).show();
            } else {

                mostrarAlertDialog();
            }
        });
    }

    private void mostrarAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Registro Exitoso")
                .setMessage("Bienvenido futuro héroe")
                .setPositiveButton("OK", (dialog, which) -> {
                    dialog.dismiss();
                    Intent intent = new Intent(NewUser.this, Form.class);
                    startActivity(intent);
                })
                .setCancelable(false)
                .create()
                .show();
    }
}
