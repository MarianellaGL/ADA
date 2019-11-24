import java.util.Scanner;

/**
 * Ejercicio003
 */
public class Ejercicio003 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
        double s;

        a = 0;
        b = 0;
        c = 0;
        d = 0;

        System.out.println("Ingrese importe");

        s = Teclado.nextDouble();

        while (s > 0) {

            if (s >= 999) {
                a++;

            } else {
                if (s < 999 && s >= 780) {
                    b++;

                } else {
                    if (s < 780 && s >= 520) {
                        c++;

                    } else {
                        d++;

                    }
                }

            }
            s = Teclado.nextDouble();
        }

        System.out.println("hay " + a + " empleados ricos");
        System.out.println("hay " + b + " empleados que perciben sueldos medios");
        System.out.println("hay " + c + " empleados que perciben sueldos bajos");
        System.out.println("hay " + d + " empleados que perciben sueldos por debajo del bajo");
    }
}