import java.util.Scanner;

/**
 * Devolver la suma de elementos de un array el n 13 es de mala suerte asi que
 * no debe sumarse, ignorar el numero siguientre al 13
 */

public class Ejercicio014 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int[] a = new int[12];

        /**Paso 1:  en vez de "int[] a, declaras la cantisad de numeros que vasa poner" */

        /**paso 2 declaras el array de n posiciones int [] nros = new int [n] */

        int suma = 0;

        /**recorro el array para llenarlo */

        /**recorro el array y pregunto por 13 */

        for (int i = 0; i < a[i]; i++) {

            System.out.println("ingrese primer nro de array A");
            a[i] = Teclado.nextInt();

            if (a[i] == 13 || a[i] == 14) {

                System.out.println("¿Qué estas haciendoooo?");

            } else {

                suma += a[i];

                System.out.println("el total es " + suma);
            }
        }

    }

}