package app;

import java.util.*;

public class Columna {

    public char letra;
    public List<Asiento> asientos = new ArrayList<Asiento>();

    public void agregarAsientos(int cant) {

        for (int i = 0; i < cant; i++) {
            Asiento a = new Asiento(this.letra, i + 1);
            this.asientos.add(a);
        }

    }

}