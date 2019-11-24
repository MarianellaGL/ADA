package app;

/**
 * Episodio crear constructor para episodio y para websodio
 */
public class Episodio {

    public String nombreepisodio;
    public int numerodeepisodio;
    public int duracion;

    public Episodio(String piloto) {

        this.nombreepisodio = piloto;
    }

    public void reproducir() {

        System.out.println("reproduciendo " + this.nombreepisodio + " " + this.numerodeepisodio);

    }

}