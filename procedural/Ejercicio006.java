import java.util.Scanner;

/**
 * Ejercicio006
 */
public class Ejercicio006 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        double pesopaquete, precio;
        int zonas;

        pesopaquete = 0;
        precio = 0;
        zonas = 0;

        if (pesopaquete < 5000) {

            System.out.println("Ingrese el peso del paquete en gramos");
            pesopaquete = Teclado.nextDouble();

            System.out.println("Ingrese el número de zona");
            zonas = Teclado.nextInt();

            switch (zonas) {

            case 1:

                precio = (pesopaquete * 11);

                System.out.println("El peso total por zona 1 es " + precio);

                break;

            case 2:

                precio = (pesopaquete * 10);

                System.out.println("El precio total por zona dos es " + precio);

                break;

            case 3:

                precio = (pesopaquete * 12);

                System.out.println("El precio total por zona tres es " + precio);

                break;

            case 4:

                precio = (pesopaquete * 24);

                System.out.println("El precio total por zona cuatro es" + precio);

                break;

            case 5:

                precio = (pesopaquete * 27);

                System.out.println("El precio total por zona cinco es " + precio);

                break;
            }

        } else {

            System.out.println("NO SE ACEPTAN PESOS MAYORES A CINCO MIL GRAMOS");

        }

    }
}