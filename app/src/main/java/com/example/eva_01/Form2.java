package com.example.eva_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Form2 extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        TextView textDatoGenero = findViewById(R.id.textDatoGenero);
        TextView textDatoEdad = findViewById(R.id.textDatoEdad);
        TextView textDatoPeso = findViewById(R.id.textDatoPeso);

        String genero = sharedPreferences.getString("genero", "");
        String edad = sharedPreferences.getString("edad", "");
        String peso = sharedPreferences.getString("peso", "");

        textDatoGenero.setText(genero);
        textDatoEdad.setText(edad);
        textDatoPeso.setText(peso);

        ProgressBar progressBarForm2 = findViewById(R.id.progressForm2);
        progressBarForm2.setProgress(50);

        Button botonVolver = findViewById(R.id.volverForm);
        botonVolver.setOnClickListener(view -> {
            Intent intent = new Intent(Form2.this, Form.class);
            startActivity(intent);
        });
    }
}
