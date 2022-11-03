
/**
 * Escribe un programa que lea un número n e imprima una pirámide de números con
 * n filas como en la siguiente figura:
 *     1
 *    121
 *   12321
 *  1234321
 * 123454321
 * 
 * @autor Marina Ruiz
 */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n;
        do {
            System.out.print("Por favor, introduce la altura de la pirámide (3 a 9): ");
            n = s.nextInt();
        } while (n < 3 || n > 9);
        s.close();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--)
                System.out.print(" ");
            for (int j = 1; j < i; j++)
                System.out.print(j);
            for (int j = i; j > 0; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}
