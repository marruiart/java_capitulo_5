
/**
 * Este programa va pidiendo números hasta que se introduzca un
 * numero negativo y nos dice cuántos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el
 * cómputo.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num;
        int count = 0;
        int countOdd = 0;
        int sumOdd = 0;
        int max = 0;
        do {
            System.out.print("Introduzca un número (negativo para salir): ");
            num = s.nextInt();
            if (num % 2 != 0 && num > 0) {
                countOdd++;
                sumOdd += num;
            }
            if (num > max)
                max = num;
            if (num > 0)
                count++;
        } while (num >= 0);
        s.close();

        float average = (float) sumOdd / countOdd;
        
        System.out.println();
        System.out.printf("Cantidad de números introducidos: %d\n", count);
        System.out.printf("Media de los impares: %.2f\n", average);
        System.out.printf("Mayor de los pares: %d\n", max);
    }
}