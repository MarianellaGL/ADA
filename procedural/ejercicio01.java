import java.util.Scanner;

/**
 * ejercicio01
 */
public class ejercicio01 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d;
        double f;

        System.out.println("ingrese valor a");
        a = Teclado.nextInt();

        System.out.println("Ingrese valor b");
        b = Teclado.nextInt();

        System.out.println("Ingrese valor c");
        c = Teclado.nextInt();

        d = a + b + c;

        f = d / 3d;

        System.out.println("El promedio es:" + f);

    }
}