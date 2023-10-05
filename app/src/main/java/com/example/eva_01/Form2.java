package com.example.eva_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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

        Button botonVolver = findViewById(R.id.volverForm3);
        botonVolver.setOnClickListener(view -> {
            Intent intent = new Intent(Form2.this, Form.class);
            startActivity(intent);
        });

        Button botonSiguiente = findViewById(R.id.siguienteForm2);
        botonSiguiente.setOnClickListener(view -> {
            RadioGroup radioGroup = findViewById(R.id.radioGroupObjetivo);
            int radioButtonId = radioGroup.getCheckedRadioButtonId();

            if (radioButtonId == -1) {
                Toast.makeText(Form2.this, "Seleccione un objetivo", Toast.LENGTH_SHORT).show();
            } else {
                RadioButton radioButtonSeleccionado = findViewById(radioButtonId);
                String objetivoSeleccionado = radioButtonSeleccionado.getText().toString();

                sharedPreferences.edit().putString("objetivo", objetivoSeleccionado).apply();

                Intent intent = new Intent(Form2.this, Form3.class);
                startActivity(intent);
            }
        });
    }
}
