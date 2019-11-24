import java.util.Scanner;

/**
 * Ejercicio008 Realice un algoritmo que, con base en una calificación
 * proporcionada (0-10), indique con letra la calificación que le corresponde:
 * 10 es “A”, 9 es “B”, 8 es “C”, 7 y 6 son “D”, y de 5 a 0 son “F”. Represente
 * el diagrama de flujo y el pseudocódigo.
 */

public class Ejercicio008 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int nota;

        nota = 0;

        System.out.println("ingrese nota numérica");
        nota = Teclado.nextInt();

        if (nota == 10) {

            System.out.println("la nota es A ");

        } else if (nota == 9) {

            System.out.println("la nota es B");

        } else if (nota == 8) {

            System.out.println("la nota es C");

        } else if (nota == 7 || nota == 6) {

            System.out.println("la nota es D");

        } else {

            System.out.println("la nota es F");

        }

    }

}