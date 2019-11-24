package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Netflix
 */
public class Netflix {
    public static List<Pelicula> Catalogopelis = new ArrayList<Pelicula>();
    public static List<Serie> Catalogoseries = new ArrayList<Serie>();

    public static Serie BuscarSerie(String nombre) {

        for (Serie s : Netflix.Catalogoseries) {

            if (s.nombre.equals(nombre))

                return s;
        }

        return null;

    }

    public static Pelicula BuscarPelicula(String nombre) {

        for (Pelicula peli : Netflix.Catalogopelis) {

            if (peli.nombre.equals(nombre))

                return peli;
        }

        return null;
    }

    public static void LimpiarCatalogo() {

        Netflix.Catalogopelis.clear();
        Netflix.Catalogoseries.clear();

    }

    public static void InicializarCatalogo() {

        Netflix.AgregarBreakingBad();
    }

    public static void AgregarBreakingBad() {

        Serie breakingB = new Serie();
        breakingB.nombre = "Breaking Bad";
        breakingB.año = 2008;
        breakingB.genero = "Drama";

        Episodio ep = new Episodio("Piloto");
        ep.numerodeepisodio = 5;

        Websodio web = new Websodio("Resumen");
        web.numerodeepisodio = 1;

        Temporada t5 = new Temporada("Lalala");
        t5.numerotemporada = 5;

        t5.websodios.add(web);
        t5.episodios.add(ep);

        breakingB.temporadas.add(t5);

        Netflix.Catalogoseries.add(breakingB);
    }

}
