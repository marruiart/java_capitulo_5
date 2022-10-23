
/**
 * Este programa muestra por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num1;
        int num2;
        do {
            System.out.print("Por favor, introduce un número: ");
            num1 = s.nextInt();
            System.out.print("Introduce otro número: ");
            num2 = s.nextInt();
            if (num1 < 0 || num2 < 0)
                System.out.println("Números incorrectos.");
        } while (num1 < 0 || num2 < 0);
        s.close();

        for (int i = 1; i < num1; i++) {
            if (i % num2 != 0)
                System.out.println(i);
        }
    }
}