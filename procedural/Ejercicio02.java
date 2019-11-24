import java.util.Scanner;

/**
 * Ejercicio02
 */
public class Ejercicio02 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;

        System.out.println("Ingresa un numerito");
        a = Teclado.nextInt();

        System.out.println("ingresa otro gato");
        b = Teclado.nextInt();

        if (a > b) {
            System.out.println("a es mayor");
        } else {
            if (a < b) {
                System.out.println("a es menor");
            } else {
                System.out.println("son iguales");
            }
        }
    }
}
