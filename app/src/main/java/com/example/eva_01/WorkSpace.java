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
        routines.add(new Routine("Rutina 1", "Descripción de la Rutina 1"));
        routines.add(new Routine("Rutina 2", "Descripción de la Rutina 2"));
        routines.add(new Routine("Rutina 3", "Descripción de la Rutina 3"));

        RoutineAdapter adapter = new RoutineAdapter(routines);

        RecyclerView recyclerView = findViewById(R.id.routineRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
