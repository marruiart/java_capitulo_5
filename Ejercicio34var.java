
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

public class Ejercicio34var {

    public static int numLength(long num) {
        int length = 1;
        while (num / 10 > 0) {
            length++;
            num /= 10;
        }
        return length;
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
        long countOdd = 0;
        long countEven = 0;
        long tmp = num1;
        while (tmp > 0) {

            lastDigit = num2 % 10;
            if (lastDigit % 2 == 0) {
                evenNum = evenNum * 10 + lastDigit;
                countEven++;
            } else {
                oddNum = oddNum * 10 + lastDigit;
                countOdd++;
            }

            lastDigit = num1 % 10;
            if (lastDigit % 2 == 0) {
                evenNum = evenNum * 10 + lastDigit;
                countEven++;
            } else {
                oddNum = oddNum * 10 + lastDigit;
                countOdd++;
            }
            num1 /= 10;
            num2 /= 10;
            tmp /= 10;
        }

        long tmpEvenNum = evenNum;
        long tmpOddNum = oddNum;
        oddNum -= oddNum;
        evenNum -= evenNum;

        while (countEven > 0 || countOdd > 0) {
            if (countEven > 0)
                evenNum += (long) Math.pow(10, countEven - 1) * (tmpEvenNum % 10);
            if (countOdd > 0)
                oddNum += (long) Math.pow(10, countOdd - 1) * (tmpOddNum % 10);

            countEven--;
            countOdd--;
            tmpEvenNum /= 10;
            tmpOddNum /= 10;
        }

        System.out.printf("El número formado por los dígitos pares es %d\n", evenNum);
        System.out.printf("El número formado por los dígitos impares es %d\n", oddNum);
    }
}