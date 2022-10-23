
/**
 * Este programa dice si un número introducido por teclado es o no primo. Un
 * número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * 
 * @autor Marina Ruiz
 */

import java.util.Scanner;

public class Ejercicio16 {

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num;
        do {
            System.out.print("Por favor, introduzca un número entero positivo: ");
            num = s.nextInt();
            if (num < 0)
                System.out.println("No se pueden introducir números negativos. ");
        } while (num < 0);
        s.close();

        if (isPrime(num))
            System.out.printf("%d es primo", num);
        else
            System.out.printf("%d no es primo", num);
    }
}
