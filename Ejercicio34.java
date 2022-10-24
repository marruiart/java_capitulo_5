
/**
 * Este programa pide dos números por teclado y que luego mezcla en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando
 * los dígitos de la siguiente manera: primer dígito del primer número, primer
 * dígito del segundo número, segundo dígito del primer número, segundo dígito
 * del segundo número, tercer dígito del primer número… Para facilitar el
 * ejercicio, podemos suponer que el usuario introducirá dos números de la misma
 * longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en
 * lugar de int donde sea necesario para admitir números largos.
 * 
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio34 {

    public static int numLength(long num) {
        int length = 1;
        while (num / 10 > 0) {
            length++;
            num /= 10;
        }
        return length;
    }

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
        long num1;
        long num2;
        int numLength1;
        int numLength2;
        do {
            System.out.print("Por favor, introduzca un número: ");
            num1 = s.nextInt();
            numLength1 = numLength(num1);
            System.out.print("Introduzca otro número: ");
            num2 = s.nextInt();
            numLength2 = numLength(num2);

            if (num1 < 0 || num2 < 0)
                System.out.println("No se admiten números negativos. ");
        } while (num1 < 0 || num2 < 0 || numLength1 != numLength2);
        s.close();

        long lastDigit;
        long oddNum = 0;
        long evenNum = 0;
        long tmp = num1;
        while (tmp > 0) {

            lastDigit = num2 % 10;
            if (lastDigit % 2 == 0) {
                evenNum *= 10;
                evenNum += lastDigit;
            } else {
                oddNum *= 10;
                oddNum += lastDigit;
            }

            lastDigit = num1 % 10;
            if (lastDigit % 2 == 0) {
                evenNum *= 10;
                evenNum += lastDigit;
            } else {
                oddNum *= 10;
                oddNum += lastDigit;
            }
            num1 /= 10;
            num2 /= 10;
            tmp /= 10;
        }

        System.out.printf("El número formado por los dígitos pares es %d\n", reverseNum(evenNum));
        System.out.printf("El número formado por los dígitos impares es %d\n", reverseNum(oddNum));
    }
}