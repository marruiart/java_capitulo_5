
/**
 * Este programa calcula la media de los dígitos que contiene un número
 * entero introducido por teclado.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduzca un número: ");
            num = s.nextInt();
        } while (num < 0);
        s.close();
        float sum = 0;
        int tmp = num;
        int lastDigit;
        int numLength = 0;
        while (tmp > 0) {
            lastDigit = tmp % 10;
            sum += lastDigit;
            tmp /= 10;
            numLength++;
        }

        float average = sum / numLength;
        System.out.printf("La media de los dígitos de %d es %.2f", num, average);
    }
}