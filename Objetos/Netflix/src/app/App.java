package app;

//redefinir el método reproducir del websodio

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Inicializando Catalogo");

        Netflix.InicializarCatalogo();

        Serie bb = Netflix.BuscarSerie("Breaking Bad");

        Temporada laMejorTemporada = bb.getTemporada(5);

        Episodio elMejor;

        elMejor = laMejorTemporada.getEpisodio(5);

        elMejor.reproducir();

        Websodio elWebsodio;

        elWebsodio = laMejorTemporada.getWebsodio(1);

        elWebsodio.reproducir();

    }
}