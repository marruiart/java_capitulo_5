
/**
 * Este programa pide un número entero positivo por teclado y
 * muestra a continuación los números desde el 1 al número introducido junto
 * con su factorial.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio39 {

    public static long getFactorial(int num) {
        if (num == 1)
            return 1;
        long fact = 1;
        for (long i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int givenNum = s.nextInt();
        s.close();

        for (int num = 1; num <= givenNum; num++) {
            long fact = getFactorial(num);
            System.out.printf("%d! = %d\n", num, fact);
        }
    }
}