package app;

import java.util.*;

public class Cine {

    private Sala sala;
    private Pelicula pelicula;
    private double precio;

    public Cine(Sala sala, Pelicula pelicula, double precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public boolean sePuedeSentar(Espectador e) {

        return e.tieneDinero(precio) && e.tieneEdad(pelicula.getEdadMin());
    }

    public void mostrar() {
        System.out.println("información cine:");
        System.out.println("Pelicula Reproducida: " + pelicula);
        System.out.println("Precio Entrada: " + precio);
    }

}