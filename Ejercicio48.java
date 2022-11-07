
/**
 * Este programa dice los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir
 * números largos.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long num;
        do {
            System.out.print("Introduzca un número entero: ");
            num = s.nextLong();
            if (num < 0)
                System.out.print("No se admiten números negativos. ");
        } while (num < 0);
        s.close();

        String digitsInNum = "Dígitos que aparecen en el número: ";
        String digitsNotInNum = "Dígitos que no aparecen: ";

        for (int i = 0; i < 10; i++) {
            long tmp = num;
            boolean isInNumber = false;
            long lastDigit;
            while (tmp > 0) {
                lastDigit = tmp % 10;
                if (lastDigit == i) {
                    isInNumber = true;
                    break;
                }
                tmp /= 10;
            }

            if (isInNumber == true)
                digitsInNum += i + " ";
            else
                digitsNotInNum += i + " ";
        }
        System.out.println(digitsInNum);
        System.out.println(digitsNotInNum);
    }
}