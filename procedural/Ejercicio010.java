import java.util.Scanner;

/**
 * Ejercicio00b
 */
public class Ejercicio010 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int p = 0;
        int e = 0;
        int v = 0;

        char caracter;

        System.out.println("Ingrese oracion con punto al final");

        caracter = Teclado.nextLine().charAt(0);
        /** El nextline lee la linea completa de lo que se ingresa */

        while (caracter != '.') {

            if (esVocal(caracter)) {

                v++;

            } else if (caracter == ' ') {

                e++;

            }
            caracter = Teclado.nextLine().charAt(0);
        }

        p++;

        System.out.println("vocales" + v);
        System.out.println("espacios" + e);
        System.out.println("puntos" + p);
    }

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