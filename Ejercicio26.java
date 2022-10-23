
/**
 * Este programa pide primero un número y a continuación un dígito. El programa
 * da la posición (o posiciones) que ocupa ese dígito en el número introducido
 * contando de izquierda a derecha.
 * 
 * @autor Marina Ruiz
 */

import java.util.Scanner;

public class Ejercicio26 {

    public static long reverseNum(long num) {
        long reversedNum = 0;
        while (num / 10 > 0) {
            long lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num /= 10;
        }
        long lastDigit = num % 10;
        reversedNum = reversedNum * 10 + lastDigit;
        return reversedNum;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long numHay;
        int needle;
        do {
            System.out.print("Por favor, introduce un número: ");
            numHay = s.nextInt();
            System.out.print("Introduce un dígito a buscar en el número anterior: ");
            needle = s.nextInt();
        } while (numHay < 0 || needle < 0);
        s.close();

        String strPositions = "";
        long tmp = numHay * 10;
        long reverseNumHay = reverseNum(numHay);
        int position = 0;
        while (tmp / 10 > 0) {
            long lastDigit = reverseNumHay % 10;
            if (lastDigit == needle)
                strPositions += (position + 1) + " ";
            reverseNumHay /= 10;
            tmp /= 10;
            position++;
        }

        if (position == 0)
            System.out.printf("El dígito %d no está en el número %d", needle, numHay);
        else
            System.out.printf("El dígito %d está en la/s posición/es %sdel número %d", needle, strPositions, numHay);
    }
}
