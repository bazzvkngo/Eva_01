package com.example.eva_01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class WorkSpace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_space);

        List<Routine> routines = new ArrayList<>();
        routines.add(new Routine("Cuerpo Completo", "En este esquema trabajaremos 3 días a la semana"));
        routines.add(new Routine("Tren Superior y Tren Inferior", "En este esquema trabajaremos 4 días a la semana"));
        routines.add(new Routine("Empuje, jalon y piernas", "En este esquema trabajaremos 5 a 6 días a la semana"));

        RoutineAdapter adapter = new RoutineAdapter(routines);

        RecyclerView recyclerView = findViewById(R.id.routineRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
