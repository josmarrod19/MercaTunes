package com.mercatunes;
import java.util.ArrayList;
import java.util.List;

public class Carrito { // ------------------------------------------------------------Clase PLaylist--------------------------------------------------------------------
    private String nombre;
    private List<Hacenmusic> canciones;
    private int duracionTotal;

    public void setCanciones(List<Hacenmusic> canciones) {
        this.canciones = canciones;
    }

    public void setDuracionTotal(int duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

    public Carrito(String nombre){
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
        this.duracionTotal = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public List<Hacenmusic> getCanciones(){
        List<Hacenmusic> copia = new ArrayList<>(canciones);
        return copia;
    }

    public void getDuracionTotal() {
        for (Hacenmusic c : canciones) {
            duracionTotal += c.getDuracion();
        }
    }
}