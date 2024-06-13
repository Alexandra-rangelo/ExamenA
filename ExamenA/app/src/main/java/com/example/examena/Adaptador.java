package com.example.examena;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Adaptador extends RecyclerView.Adapter<VistaHolder> {
    private List<Integer> items;

    public Adaptador(List<Integer> items) {
        this.items = items;
    }

    @Override
    public VistaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new VistaHolder(view);
    }

    @Override
    public void onBindViewHolder(VistaHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
