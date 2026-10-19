package com.example.cardrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// El Adapter coloca los datos de los restaurantes en cada CardView.
public class RestauranteAdapter extends RecyclerView.Adapter<RestauranteAdapter.RestauranteViewHolder> {

    public interface OnRestauranteClickListener {
        void onRestauranteClick(Restaurante restaurante);
    }

    private final List<Restaurante> restaurantes;
    private final OnRestauranteClickListener listener;

    public RestauranteAdapter(List<Restaurante> restaurantes, OnRestauranteClickListener listener) {
        this.restaurantes = restaurantes;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RestauranteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card, parent, false);
        return new RestauranteViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull RestauranteViewHolder holder, int position) {
        Restaurante restaurante = restaurantes.get(position);
        holder.txtNombre.setText(restaurante.getNombre());
        holder.txtCategoria.setText(restaurante.getCategoria());
        holder.txtDescripcion.setText(restaurante.getDescripcion());

        holder.btnVer.setOnClickListener(v -> listener.onRestauranteClick(restaurante));
        holder.itemView.setOnClickListener(v -> listener.onRestauranteClick(restaurante));
    }

    @Override
    public int getItemCount() { return restaurantes.size(); }

    static class RestauranteViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre, txtCategoria, txtDescripcion;
        Button btnVer;

        public RestauranteViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtCategoria = itemView.findViewById(R.id.txtCategoria);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
            btnVer = itemView.findViewById(R.id.btnVer);
        }
    }
}
