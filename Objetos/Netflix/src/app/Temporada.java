package app;

import java.util.List;
import java.util.ArrayList;

/**
 * Temporada
 */
public class Temporada {

    public String nombretemporada;
    public int numerotemporada;
    public List<Episodio> episodios = new ArrayList<Episodio>();
    public List<Websodio> websodios = new ArrayList<Websodio>();

    public Temporada(String nombretemporada) {

        this.nombretemporada = nombretemporada;
    }

    public Episodio getEpisodio(int nro) {

        for (Episodio ep : this.episodios) {

            // "te"guarda el objeto temporada

            if (ep.numerodeepisodio == nro) {

                return ep;

            }

        }
        return null;
    }

    public Websodio getWebsodio(int nro) {

        for (Websodio web : this.websodios) {

            if (web.numerodeepisodio == nro) {

                return web;

            }
        }
        return null;

    }
}
