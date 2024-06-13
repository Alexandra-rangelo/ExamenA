package com.example.examena;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<VistaHolder> {
    List<Integer> items;

    // toma una lista de enteros como parámetro.
    public Adaptador(List<Integer> items) {
        this.items = items;
    }

    @Override
    public VistaHolder onCreateViewHolder(ViewGroup parent, int viewType) { //necesita una nueva vista para mostrar un elemento.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false); //crea la vista a partir del archivo item_layout
        return new VistaHolder(view);
    }

    @Override
    public void onBindViewHolder(VistaHolder holder, int position) { //se llama para actualizar una vista con los datos en una posición específica
        holder.bind(items.get(position)); //actualizará la vista con el dato correspondiente.
    }

    @Override
    public int getItemCount() { //// devuelve el número total de elementos en la lista items
        return items.size(); //cuántos elementos hay en total.
    }
}
