import java.util.Scanner;

/**
 * Ejercicio007 El dueño de un estacionamiento requiere un diagrama de flujo con
 * el algoritmo que le permita determinar cuánto debe cobrar por el uso del
 * estacionamiento a sus clientes. Las tarifas que se tienen son las siguientes:
 * a. Las dos primeras horas a $5.00 c/u. b. Las siguientes tres a $4.00 c/u. c.
 * Las cinco siguientes a $3.00 c/u. d. Después de diez horas el costo por cada
 * una es de dos pesos.
 */
public class Ejercicio007 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int ph, h;
        ph = 0;
        h = 0;

        System.out.println("Ingrese cantidad de horas");
        h = Teclado.nextInt();

        if (h == 2) {

            ph = (2 * 5);

        } else if (h >= 5 && h <= 10) {

            ph = (10 + (3 * 4));

        } else if (h >= 10 && h < 20) {

            ph = ((2 * 5) + (3 * 4) + (3 * 5));

        } else {

            h++;

            ph = ((h * 2) + (2 * 5) + (3 * 4) + (3 * 5));

        }

        System.out.println("El precio es " + ph);

    }
}
