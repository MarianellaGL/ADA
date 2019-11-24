import java.util.Scanner;

/**
 * StringOrac=Teclado.NextLine(); <-----Este lee el caracter entero char c=
 * orac.to.CharArray();<----particiona y genera el conteo de caracteres charAt0
 * significa dame el primero de la cadena
 */

public class Ejercicio013 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int p = 0;
        int e = 0;
        int v = 0;

        String oracion;
        char[] letras;

        System.out.println("Ingrese oracion con punto al final");

        oracion = Teclado.nextLine();
        letras = oracion.toCharArray();

        /** El nextline lee la linea completa de lo que se ingresa */

        for (int i = 0; i < letras.length; i++) {

            if (esVocal(letras[i])) {

                v++;

            } else if (letras[i] == ' ') {

                e++;

            }

            else {
                p++;
            }
        }

        System.out.println("vocales" + v);
        System.out.println("espacios" + e);
        System.out.println("puntos" + p);
    }

    // recibe como parámetro solo UN caracter "letras[i] es un char por eso va a
    // funcionar "
    static boolean esVocal(char caracter) {
        switch (caracter) {
        case 'a':
        case 'A':
        case 'E':
        case 'e':
        case 'I':
        case 'i':
        case 'O':
        case 'o':
        case 'u':
        case 'U':
            return true;
        }
        return false;

    }

}
/**
 * primero dclaro dos variables "string" oracion y char va a ser mis letras
 * teclado next line va a leer una cadena de caracteres y se guarda en la
 * variable oración lo que sigue es la linea lenght es propiedad que tiene los
 * arreglos, es una propiedad de un array que mide el largo del string
 * 
 * The method esVocal() in the type Ejercicio013 is not applicable for the
 * arguments (char[]) no puede aplicar un array dentro de un array
 */