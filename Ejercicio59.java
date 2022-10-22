
/**
 * Este programa pinta por pantalla un árbol de navidad. El usuario debe
 * introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
 * que el usuario introduce una altura mayor o igual a 4.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Por favor, introduzca la altura del árbol: ");
            height = s.nextInt();
            if (height < 3)
                System.out.println("Altura incorrecta.");
            System.out.println();
        } while (height < 4);
        s.close();
        for (int j = height - 3; j > 0; j--)
            System.out.print(" ");
        System.out.println("*");
        for (int i = 1; i <= height - 2; i++) {
            for (int j = height - i - 2; j > 0; j--)
                System.out.print(" ");
            for (int j = i * 2 - 1; j > 0; j--) {
                if (i == 1 || i == height - 2)
                    System.out.print("^");
                else if (j == 1 || j == i * 2 - 1)
                    System.out.print("^");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int j = height - 3; j > 0; j--)
            System.out.print(" ");
        System.out.print("Y");
    }
}