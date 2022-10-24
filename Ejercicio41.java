
/**
 * Este programa dice cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = s.nextLong();
        s.close();

        int even = 0;
        int odd = 0;
        long tmp = num;

        while (tmp > 0) {
            long lastDigit = tmp % 10;
            if (lastDigit % 2 == 0)
                even++;
            else
                odd++;
            tmp /= 10;
        }
            
        System.out.printf("El %d contiene %d dígitos pares y %d dígitos impares.", num, even, odd);
    }
}