import java.util.Scanner;

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

public class Ejercicio24 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número: ");
        int n = s.nextInt();
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
