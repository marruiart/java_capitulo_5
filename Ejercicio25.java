
/**
 * Este programa pide un número por teclado y que luego muestra ese
 * número al revés.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio25 {

    public static long reverseNum(long num) {
        long reversedNum = 0;
        while (num > 0) {
            long lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long num;
        do {
            System.out.print("Introduzca un número: ");
            num = s.nextInt();
        } while (num < 0);
        s.close();

        long reversedNum = reverseNum(num);
        System.out.printf("El número %d al revés es %d", num, reversedNum);
    }
}