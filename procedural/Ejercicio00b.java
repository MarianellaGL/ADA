import java.util.Scanner;

/**
 * Ejercicio00b
 */
public class Ejercicio00b {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int a, x, m, c;
        a = 0;
        x = 0;
        m = 0;
        c = 0;

        System.out.println("Ingrese año de nacimiento");
        a = Teclado.nextInt();

        while (a > 0) {

            if (a >= 1962 && a <= 1982) {

                x = x + 1;

            } else {
                if (a >= 1983 && a <= 1994) {

                    m = m + 1;

                } else {
                    c = c + 1;

                }

            }
            a = Teclado.nextInt();

        }
        System.out.println("Hay" + c + "de centenials");
        System.out.println("Hay" + m + "de millenials");
        System.out.println("Hay " + x + "de generacion x");
    }
}