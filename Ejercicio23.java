
/**
 * Este programa permite ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num;
        int sum = 0;
        int count = 0;
        do {
            System.out.print("Introduzca un número entero positivo: ");
            num = s.nextInt();
            sum += num;
            count++;
        } while (sum <= 10000);
        s.close();

        float average = (float) sum / count;

        System.out.printf("Total acumulado: %d\n", sum);
        System.out.printf("Cantidad de números introducidos: %d\n", count);
        System.out.printf("Media: %.2f\n", average);
    }
}