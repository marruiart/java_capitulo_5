
/**
 * Este programa pinta una X hecha de asteriscos. El programa pide la
 * altura. Se debe comprobar que la altura sea un número impar mayor o
 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Por favor, introduzca la altura de la X: ");
            height = s.nextInt();
            if (height < 3)
                System.out.println("La altura es incorrecta, debe ser mayor o igual a 3. ");
        } while (height < 3);
        s.close();

        for (int i = 0; i <= height / 2; i++) {
            for (int j = height; j >= 0; j--) {
                if (j == i || j == height - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = height / 2 - 1; i >= 0; i--) {
            for (int j = height; j >= 0; j--) {
                if (j == i || j == height - i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}