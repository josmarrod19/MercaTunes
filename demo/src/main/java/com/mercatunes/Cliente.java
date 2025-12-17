package com.mercatunes;
import java.util.List;

public class Cliente {//------------------------------------------------------------Clase Usuario------------------------------------------------------------------------
    private String nombre;
    private String email;
    private List<Carrito> listas;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setListas(List<Carrito> listas) {
        this.listas = listas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    
    public List<Carrito> getListas() {
        return listas;
    }
}
