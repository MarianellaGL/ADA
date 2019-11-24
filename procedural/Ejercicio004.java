import java.util.Scanner;

/**
 * Ejercicio004
 */
public class Ejercicio004 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args)

    {
        int vm, vuelta;

        vm = 0;
        vuelta = 0;

        for (int i = 0; i < 15; i++) {

            int valor;
            System.out.println("Ingrese un valor");
            valor = Teclado.nextInt();

            if (valor > vm) {

                vm = valor;
                vuelta = i;

            } else {

                System.out.println("no hay valor mayor a cero");
            }

        }
        System.out.println("el valor mayor es " + vm);
        System.out.println("Se repitió a la vuelta " + vuelta);
    }
}