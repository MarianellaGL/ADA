import java.util.Scanner;

/**
 * Ejercicio011 dados diez numeros que representan edades calcular el promedio
 * imprimirlo y luego imprimir todas las edades ingresadas
 */
public class Ejercicio011 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[] edades = new int[10];
        /**
         * declaro que hay un nuevo array de diez posiciones, el cuánto tengo me lo da
         * el "new int" de 10 lugares
         */

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese el nro#" + i);

            int numero;
            numero = Teclado.nextInt();
            edades[i] = numero;
            /**
             * "i" va a valer lo que vale cada iteración, el for te va a acomodar ne memoria
             * cuanto va a valer
             */

        }

        int suma = 0;
        int prom = 0;

        System.out.println("Edades recibidas");

        for (int i = 0; i < 10; i++) {

            suma += edades[i];

        }
        prom = suma / 10;

        System.out.println("El promedio es " + prom);

        /** el promedio va abajo de la llave porque sino te lo tira antes */

        for (int i = 0; i < 10; i++) {

            System.out.println("edad " + edades[i]);
            /** edad sub i es como decir qué hay en la posición del array */
        }

    }

}/**
  * separó para la realización del problema en tres ciclos diferentes, ninguno
  * tiene que ver con ninguno
  */