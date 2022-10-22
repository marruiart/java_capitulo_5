
/**
 * Este programa pinta un reloj de arena relleno hecho de asteriscos. El
 * programa debe pedir la altura. Se debe comprobar que la altura sea un número
 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de
 * error.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Por favor, introduzca la altura del reloj de arena: ");
            height = s.nextInt();
            if (height < 3 || height % 2 == 0)
                System.out.println("La altura introducida no es correcta (debe ser impar mayor o igual a 3). ");
        } while (height < 3 || height % 2 == 0);
        s.close();

        for (int i = 0; i <= height / 2; i++) {
            for (int j = i; j > 0; j--)
                System.out.print(" ");
            for (int j = height - i * 2; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }

        for (int i = height / 2 - 1; i >= 0; i--) {
            for (int j = i; j > 0; j--)
                System.out.print(" ");
            for (int j = height - i * 2; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}