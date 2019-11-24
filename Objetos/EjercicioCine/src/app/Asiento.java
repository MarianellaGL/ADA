package app;

import java.util.*;

public class Asiento {

    private int nroAsiento;
    private char letra;
    private Espectador espectador;

    public Asiento(char letra, int nro) {
        this.letra = letra;
        this.nroAsiento = nro;
        this.espectador = null;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nro) {
        this.nroAsiento = nro;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public boolean estaOcupado() {
        return espectador != null;

    }

    @Override
    public String toString() {
        if (estaOcupado()) {
            return "Asiento: " + letra + this.nroAsiento + "y " + espectador;

        }

        return "Asiento: " + letra + nroAsiento + " y este asiento está vacío ";
    }

}