
/**
 * Este programa, dado un número entero positivo, dice cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
 * de izquierda a derecha. Usa long en lugar de int donde sea necesario para
 * admitir números largos.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num;
        do {
            System.out.print("Por favor, introduzca un número entero positivo: ");
            num = s.nextInt();
            if (num < 0)
                System.out.println("Número introducido incorrecto. ");
        } while (num < 0);
        s.close();

        long evenNums = 0;
        long tmp = num * 10;
        long lastDigit;
        while (tmp / 10 > 0) {
            lastDigit = (num % 10);
            if (lastDigit % 2 == 0) {
                evenNums *= 10;
                evenNums += lastDigit;
            }
            num /= 10;
            tmp /= 10;
        }

        long sum = 0;
        String evenString = "";
        tmp = evenNums * 10;
        while (tmp / 10 > 0) {
            sum += (evenNums % 10);
            evenString += (evenNums % 10) + " ";
            evenNums /= 10;
            tmp /= 10;
        }

        System.out.printf("Dígitos pares: %s\n", evenString);
        System.out.printf("Suma de los dígitos pares: %d\n", sum);

    }
}