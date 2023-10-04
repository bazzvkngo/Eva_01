package com.example.eva_01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;

public class Form extends AppCompatActivity {

    private ProgressBar progressBar;
    private SharedPreferences sharedPreferences;
    private Spinner spinnerEdad;
    private Spinner spinnerPeso;
    private Spinner spinnerGenero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        progressBar = findViewById(R.id.progressForm2);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        int initialProgress = sharedPreferences.getInt("progress", 0);
        progressBar.setProgress(initialProgress);

        Button siguienteButton = findViewById(R.id.siguienteForm);
        Button volverButton = findViewById(R.id.volverForm);

        spinnerEdad = findViewById(R.id.spinnerEdad);
        ArrayAdapter<CharSequence> edadAdapter = ArrayAdapter.createFromResource(this,
                R.array.edades_array, android.R.layout.simple_spinner_item);
        edadAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEdad.setAdapter(edadAdapter);

        spinnerPeso = findViewById(R.id.spinnerPeso);
        ArrayAdapter<CharSequence> pesoAdapter = ArrayAdapter.createFromResource(this,
                R.array.peso_array, android.R.layout.simple_spinner_item);
        pesoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPeso.setAdapter(pesoAdapter);

        spinnerGenero = findViewById(R.id.spinnerGenero);
        ArrayAdapter<CharSequence> generoAdapter = ArrayAdapter.createFromResource(this,
                R.array.genero_array, android.R.layout.simple_spinner_item);
        generoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGenero.setAdapter(generoAdapter);

        siguienteButton.setOnClickListener(view -> {
            String generoSeleccionado = spinnerGenero.getSelectedItem().toString();
            String edadSeleccionada = spinnerEdad.getSelectedItem().toString();
            String pesoSeleccionado = spinnerPeso.getSelectedItem().toString();

            sharedPreferences.edit().putString("genero", generoSeleccionado).apply();
            sharedPreferences.edit().putString("edad", edadSeleccionada).apply();
            sharedPreferences.edit().putString("peso", pesoSeleccionado).apply();

            Intent intent = new Intent(Form.this, Form2.class);
            startActivity(intent);

            updateProgress(25);
        });

        volverButton.setOnClickListener(view -> {
            Intent intent = new Intent(Form.this, NewUser.class);
            startActivity(intent);
            finish();
        });
    }

    private void updateProgress(int progress) {
        progressBar.setProgress(progress);
        sharedPreferences.edit().putInt("progress", progress).apply();
    }
}
