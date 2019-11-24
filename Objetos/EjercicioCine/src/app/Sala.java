package app;

import java.util.*;

public class Sala {
    public Pelicula pelicula;
    public List<Columna> columnas = new ArrayList<Columna>();

    public Sala(Pelicula pelicula) {

        this.pelicula = pelicula;

    }

    /** genero el metodo para agregar las columnas */
    public void agregarColumnas(char letra, int cantAsientos) {
        Columna c = new Columna();
        c.letra = letra;
        c.agregarAsientos(cantAsientos);

        columnas.add(c);

    }

    public Asiento proximoAsientoDisponible() {

        for (Columna c : columnas) {
            for (Asiento a : c.asientos) {
                if (!a.estaOcupado())
                    return a;
            }
        }
        return null;
    }

    public List<Asiento> asientosLibres() {

        List<Asiento> r = new ArrayList<Asiento>();

        for (Columna c : columnas) {
            for (Asiento a : c.asientos) {
                if (!a.estaOcupado())
                    r.add(a);
            }
        }
        return r;
    }

    public int cantAsientosLibres() {
        return this.asientosLibres().size();
    }

    public boolean puedeVer(Espectador espectador) {

        return pelicula.getEdadMin() > espectador.getEdad();

    }

}