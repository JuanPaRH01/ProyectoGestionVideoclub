package gestionvideoclub;

import java.util.ArrayList;

public class Cliente {
    
    private String codCliente;
    private String nombre;
    private String apellidos;
    private ArrayList<Pelicula> pelisAlquiladas;

    public Cliente(String codCliente, String nombre, String apellidos) {
        this.codCliente = codCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        pelisAlquiladas = new ArrayList<Pelicula>();
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ArrayList<Pelicula> getPelisAlquiladas() {
        return pelisAlquiladas;
    }

    public void setPelisAlquiladas(ArrayList<Pelicula> pelisAlquiladas) {
        this.pelisAlquiladas = pelisAlquiladas;
    }

    public boolean alquilar(Pelicula pelicula) {
        if (pelisAlquiladas.contains(pelicula)) {
            return false;
        } else {
            pelisAlquiladas.add(pelicula);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Cliente [codCliente=" + codCliente + ", nombre=" + nombre + ", apellidos=" + apellidos
                + ", pelisAlquiladas=" + pelisAlquiladas + "]";
    }
    
}
