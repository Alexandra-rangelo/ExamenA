package com.example.examena;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

//gestionar la vista de un solo elemento dentro del RecyclerView
public class VistaHolder extends RecyclerView.ViewHolder {
    private TextView textViewItem;

    //se enlaza la vista TextView (textViewItem) a su ID correspondiente en el layout del elemento
    public VistaHolder(View itemView) {
        super(itemView);
        textViewItem = itemView.findViewById(R.id.textViewItem);
    }

    //se llama para actualizar la vista TextView con los datos del elemento.
    public void bind(int item) {
        textViewItem.setText(String.valueOf(item));
    }
}
