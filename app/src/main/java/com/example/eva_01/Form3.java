package com.example.eva_01;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;

public class Form3 extends AppCompatActivity {

    private ProgressBar progressBar;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form3);

        progressBar = findViewById(R.id.progressForm2);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        int progress = sharedPreferences.getInt("progress", 50);
        progressBar.setProgress(progress);
    }

    private void updateProgress(int progress) {
        progressBar.setProgress(progress);
        sharedPreferences.edit().putInt("progress", progress).apply();
    }

    private void onActivityComplete() {
        updateProgress(75);
    }
}