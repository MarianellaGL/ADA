import java.util.Scanner;

/**
 * Devolver la suma de elementos de un array el n 13 es de mala suerte asi que
 * no debe sumarse, ignorar el numero siguientre al 13
 */

public class Ejercicio014ladob {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int suma = 0;

        System.out.println("Ingrese cant numeros");
        n = Teclado.nextInt();

        boolean hay13 = false;
        int[] nros = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Ingrese el nro");

            nros[i] = Teclado.nextInt();

        }
        for (int i = 0; i < n; i++) {
            if (nros[i] == 13) {
                hay13 = true;

            } else {

                if (!hay13) {

                    suma = suma + nros[i];
                } else {
                    hay13 = false;
                }

            }

        }
    }
}
