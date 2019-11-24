package app;

import java.util.List;
import java.util.ArrayList;

/**
 * Serie
 */
public class Serie extends Contenido {

    public List<Temporada> temporadas = new ArrayList<Temporada>();

    public Temporada getTemporada(int nro)

    {// recorrer cada temporada
     // si el numero de temp del ciclo es igual a numero devolver temporada//

        for (Temporada tempo : this.temporadas) {

            // "te"guarda el objeto temporada "this" es yo mismo, el objeto mismo

            if (tempo.numerotemporada == nro) {

                return tempo;

            }

        }
        return null;

    }

}