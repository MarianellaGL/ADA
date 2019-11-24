package app;

public class Websodio extends Episodio {

    public Websodio(String resumen) {

        super(resumen);
    }

   
    public void reproducir() {

        System.out.println("Websodio en reproduccion " + this.nombreepisodio + " " + this.numerodeepisodio);

    }


}