import java.util.Scanner;

/**
 * Ejercicio005
 */
public class Ejercicio005 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        double n, cn, v, t1, t2, t3, tt;
        int a, b, c;

        System.out.println("Ingrese numero de ventas");
        n = Teclado.nextDouble();

        a = 0;
        b = 0;
        c = 0;
        t1 = 0;
        t2 = 0;
        t3 = 0;
        tt = 0;
        cn = 1;

        while (cn <= n) {

            System.out.println("Ingrese monto de la venta");
            v = Teclado.nextDouble();

            if (v > 1000) {

                a++;
                t1 = t1 + v;

            } else {
                if (v > 500) {
                    b++;
                    t2 = t2 + v;

                } else {

                    c++;

                    t3 = t1 + v;
                }

            }

            tt = tt + v;
            cn++;
        }

        System.out.println("las ventas " + a);
        System.out.println("y el total uno es " + t1);
        System.out.println("las ventas" + b);
        System.out.println(" y el total dos es" + t2);
        System.out.println("y el total tres es" + t3);
        System.out.println("las ventas" + c);
        System.out.println("el total de ventas es " + tt);
    }
}
