package app;

import java.util.*;

public class Espectador {

    public String nombre;
    public int edad;
    public int dinero;

    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    /**
     * creamos un método para que el espectador si quiere entrar pague su entrada
     */
    public void pagar(double precio) {

        dinero -= precio;
    }

    /**
     * generamos otro método que indique si tiene o no dinero y otro para la edad
     * minima
     */
    public boolean tieneDinero(double precioEntrada) {
        return dinero >= precioEntrada;
    }

    public boolean tieneEdad(int edadMin) {
        return edad >= edadMin;
    }

    @Override
    public String toString() {
        return "Espectador [dinero=" + dinero + ", edad=" + edad + ", nombre=" + nombre + "]";
    }

}