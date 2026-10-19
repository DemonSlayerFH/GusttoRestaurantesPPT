package com.example.cardrecycler;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // Restaurantes ficticios para demostrar el funcionamiento del listado.
        List<Restaurante> restaurantes = new ArrayList<>();
        restaurantes.add(new Restaurante("La Trattoria", "Pastas artesanales y pizzas preparadas al horno.", "Comida italiana"));
        restaurantes.add(new Restaurante("Sabor del Mar", "Pescados y mariscos inspirados en la cocina costera.", "Pescados y mariscos"));
        restaurantes.add(new Restaurante("El Buen Asado", "Parrilladas, carnes a la brasa y acompañamientos.", "Parrilla"));
        restaurantes.add(new Restaurante("Sushi House", "Rolls, nigiris y preparaciones de inspiración japonesa.", "Comida japonesa"));
        restaurantes.add(new Restaurante("Rincón Veggie", "Platos vegetarianos con ingredientes frescos.", "Vegetariana"));

        RestauranteAdapter adapter = new RestauranteAdapter(restaurantes, restaurante ->
                Toast.makeText(MainActivity.this,
                        "Seleccionaste: " + restaurante.getNombre(), Toast.LENGTH_SHORT).show()
        );
        recyclerView.setAdapter(adapter);
    }
}
