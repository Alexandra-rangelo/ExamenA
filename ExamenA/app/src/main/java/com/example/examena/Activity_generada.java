package com.example.examena;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

//mostrar una lista de números en un RecyclerView en una cuadrícula de 4 columnas
public class Activity_generada extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adaptador adaptador;
    private static final int NUM_COLUMNS = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generada);

        recyclerView = findViewById(R.id.recyclerView); //Asigna el RecyclerView del layout a la variable recyclerView utilizando su ID.
        //Configura el RecyclerView para usar un GridLayoutManager con el número de columnas especificado por NUM_COLUMNS
        recyclerView.setLayoutManager(new GridLayoutManager(this, NUM_COLUMNS));

        int numero = getIntent().getIntExtra("numero", 0);

        // Calcula el número de elementos que llena completamente las filas de cuatro columnas
        int numberOfItemsToShow = (numero / NUM_COLUMNS) * NUM_COLUMNS;

        //Crea una nueva lista de enteros para almacenar los elementos que se mostrarán en el RecyclerView.
        List<Integer> items = new ArrayList<>();
        for (int i = 1; i <= numberOfItemsToShow; i++) {
            items.add(i); //Agrega el valor actual de i a la lista items
        }

        adaptador = new Adaptador(items);
        recyclerView.setAdapter(adaptador);
    }
}
