package com.example.examena;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class VistaHolder extends RecyclerView.ViewHolder {
    private TextView textViewItem;

    public VistaHolder(View itemView) {
        super(itemView);
        textViewItem = itemView.findViewById(R.id.textViewItem);
    }

    public void bind(int item) {
        textViewItem.setText(String.valueOf(item));
    }
}
