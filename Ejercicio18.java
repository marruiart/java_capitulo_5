
/**
 * Este programa obtiene los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num1;
        int num2;
        do {
            System.out.print("Introduzca un número: ");
            num1 = s.nextInt();
            System.out.print("Introduzca otro número diferente: ");
            num2 = s.nextInt();
            if (num1 < 0 || num2 < 0 || num1 == num2)
                System.out.println("Números incorrectos. ");
        } while (num1 < 0 || num2 < 0 || num1 == num2);
        s.close();

        int max;
        int min;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        for (int i = min; i <= max; i += 7) {
            System.out.println(i);
        }
    }
}