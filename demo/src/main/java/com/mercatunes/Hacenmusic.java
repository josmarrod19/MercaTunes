package com.mercatunes;

public class Hacenmusic {//--------------------------------------------------------------Clase Cancion------------------------------------------------------------------
    private String titulo;
    private String artista;
    private int duracion;
    private int reproducciones;

    public Hacenmusic(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.reproducciones = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista=artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion){
        this.duracion=duracion;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }
}