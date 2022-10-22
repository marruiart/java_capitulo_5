
/**
 * Este programa pide un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo
 * o no.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio42 {

    public static String isPrime(int num) {
        if (num <= 1)
            return (" no es primo");
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0)
                return (" no es primo");
        return (" es primo");
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = s.nextInt();
        s.close();

        for (int i = 0; i < 5; i++) {
            int nextNum = num + i;
            String numPrime = isPrime(nextNum);
            System.out.println(nextNum + numPrime);
        }
    }
}