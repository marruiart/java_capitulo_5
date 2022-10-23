
/**
 * Este programa muestra, cuenta y suma los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long num;
        do {
            System.out.print("Introduzca un número entero positivo: ");
            num = s.nextInt();
        } while (num < 2);
        s.close();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.printf("Hay %d múltiplo/s de 3 entre el 1 y el %d", count, num);
    }
}