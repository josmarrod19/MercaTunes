package com.mercatunes;
import java.util.List;

public class Mercatunes {//-------------------------------------------------------------Clase Spotify--------------------------------------------------------------------------
    private List<Cliente> usuarios;
    private List<Hacenmusic> canciones;

    public List<Cliente> getUsuarios() {
        return usuarios;
    }
    
    public void setUsuarios(List<Cliente> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Hacenmusic> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Hacenmusic> canciones) {
        this.canciones = canciones;
    }
}
