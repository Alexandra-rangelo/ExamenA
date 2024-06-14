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

        int numero = getIntent().getIntExtra("numero", 0);
        int columns, rows;
        double sqrt = Math.sqrt(numero);

        if (sqrt == (int) sqrt) {  // Si la raíz cuadrada es un número entero
            columns = (int) sqrt;
            rows = (int) sqrt;
        } else {  // Si la raíz cuadrada no es un número entero (un decimal jaja)
            columns = (int) Math.floor(sqrt);
            rows = columns;
        }

        recyclerView.setLayoutManager(new GridLayoutManager(this, columns));

        // Crear una lista de elementos que incluirá números del 1 hasta el número máximo que cabe en el cuadrado
        List<Integer> items = new ArrayList<>();
        int totalItems = columns * rows;

        for (int i = 1; i <= totalItems; i++) {
            items.add(i);
        }

        adaptador = new Adaptador(items);
        recyclerView.setAdapter(adaptador);
    }
}
