
/**
 * Este programa pinta por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Por favor, introduzca la altura del rombo: ");
            height = s.nextInt();
            if (height < 3 || height % 2 == 0)
                System.out.println("La altura introducida no es correcta (debe ser impar mayor o igual a 3). ");
        } while (height < 3 || height % 2 == 0);
        s.close();

        for (int i = height / 2; i >= 0; i--) {
            for (int j = 0; j < height; j++) {
                if (j == i || j == height - 1 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= height / 2; i++) {
            for (int j = 0; j < height; j++) {
                if (j == i || j == height - 1 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}