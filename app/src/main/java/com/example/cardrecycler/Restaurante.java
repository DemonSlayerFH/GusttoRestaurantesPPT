package com.example.cardrecycler;

// Modelo con la información de cada restaurante.
public class Restaurante {
    private final String nombre;
    private final String descripcion;
    private final String categoria;

    public Restaurante(String nombre, String descripcion, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getCategoria() { return categoria; }
}
