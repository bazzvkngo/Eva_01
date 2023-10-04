package com.example.eva_01;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Form3 extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        String objetivoSeleccionado = sharedPreferences.getString("objetivo", "");

        TextView textMiObjetivo = findViewById(R.id.textMiObjetivo);
        textMiObjetivo.setText(objetivoSeleccionado);

        Button volverButton = findViewById(R.id.volverForm3);
        volverButton.setOnClickListener(view -> {
            Intent intent = new Intent(Form3.this, Form2.class);
            startActivity(intent);
        });
    }
}
