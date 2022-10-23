
/**
 * Este programa calcula el factorial de un número entero leído por teclado.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio28 {

    public static long getFactorial(long num) {
        long fact = 1;
        if (num == 1)
            return 1;
        for (long i = num; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long num;
        do {
            System.out.print("Por favor, introduzca un número entero: ");
            num = s.nextInt();
        } while (num < 0);
        s.close();

        System.out.printf("%d! = %d", num, getFactorial(num));
    }
}