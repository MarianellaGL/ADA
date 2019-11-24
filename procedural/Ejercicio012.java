import java.util.Scanner;

/**
 * Ejercicio012
 * 
 * dados dos arrays de numeros enteros de siete posiciones generar un tercer
 * array con siete elementos donde cada elemento sea la suma de los dos arrays
 * anteriores Aclaraciones:c =Teclado.nextint(); es una función que devuelve un
 * valor, cuando uno ingrese dato y presiona enter va a funcionar
 * 
 * a[i]= Teclado.NextInt (); es una caja donde se meten valores, paso uno: ciclo
 * a
 * 
 * dentro del ciclo for había que hacer:
 * 
 * for (int; i<n; <i++){ a[i] = Teclado.nextInt;---> c=Teclado.nextInt;---->
 * c[i] = a[i]+ b[i]; C
 * 
 * print (c[i])+ " ")
 * 
 * dos for uno que llena a y otro que llena b, hay otro for que suma cada
 * posición de a y b
 * 
 * "alcance de las variables" si se declara la variable al principio en main, se
 * va a poder usar, fuera, cuando declaras la variable dentro del for,solo sirve
 * para dentro del ciclo }
 * 
 * se hace otro array que imprime los valores de c
 */
public class Ejercicio012 {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int a[] = new int[7];
        int b[] = new int[7];
        int c[] = new int[7];

        for (int i = 0; i < 7; i++) {

            System.out.println("ingrese primer nro de array A");
            a[i] = Teclado.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("ingrese primer nro de array B");
            b[i] = Teclado.nextInt();

        }

        for (int i = 0; i < 7; i++) {

            c[i] = a[i] + b[i];

        }

        /** muestro c */
        for (int i = 0; i < 7; i++) {

            System.out.println(c[i]);
        }

    }
}