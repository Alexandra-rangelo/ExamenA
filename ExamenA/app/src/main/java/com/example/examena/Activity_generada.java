package com.example.examena;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Activity_generada extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generada);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));

        int numero = getIntent().getIntExtra("numero", 0);

        List<Integer> items = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            items.add(i);
        }

        adaptador = new Adaptador(items);
        recyclerView.setAdapter(adaptador);
    }
}
