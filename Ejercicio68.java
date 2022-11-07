
/**
 * Este programa pide un número por teclado y 
 * luego lo “disloca” de tal forma que a cada dígito 
 * se le suma 1 si es par y se le resta 1 si es impar. 
 * Usa long en lugar de int donde sea necesario para 
 * admitir números largos.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio68 {

    public static int numLength(long num) {
        int length = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }
        return length;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long num = s.nextLong();
        s.close();
        long tmp = num;
        long newNum = 0;
        int lastDigit;
        int numLength = numLength(num);
        int units = 1;

        for (int i = numLength; i > 0; i--) {
            lastDigit = (int) tmp % 10;
            if (lastDigit % 2 == 0)
                lastDigit++;
            else
                lastDigit--;
            newNum += units * lastDigit;
            tmp = tmp / 10;
            units *= 10;
        }
        newNum += tmp % 10;
        System.out.printf("El número %d 'dislocado' es %d", num, newNum);
    }
}