import java.util.Scanner;

/**
 * Ejercicio00
 */
public class Ejercicio00 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;

        System.out.println("INGRESE PRIMER NUMERO");
        a = Teclado.nextInt();

        System.out.println("INGRESE SEGUNDO NUMERO");
        b = Teclado.nextInt();

        c = (a * b);

        System.out.println("EL RESULTADO ES: " + c);

    }
}