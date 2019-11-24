import java.util.Scanner;

/**
 * Ejercicio009 dado un número que representa un año, imprimir si es año
 * bisiesto o no.
 */
public class Ejercicio009 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int a;

        System.out.println("Ingrese año");
        a = Teclado.nextInt();

        System.out.println(esbisiesto(a));

    }

    private static boolean esbisiesto(int a) {

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {

            return true;

        } else {
            return false;
        }

    }

}
