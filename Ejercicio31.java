
/**
 * Este programa pinta la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de
 * la mitad (división entera entre 2) de la altura más uno.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Introduzca la altura de la L: ");
            height = s.nextInt();
            if (height < 0)
                System.out.println("Altura incorrecta. ");
        } while (height < 0);
        s.close();

        for (int i = 1; i <= height; i++) {
            if (i == height) {
                for (int j = 0; j <= height / 2; j++)
                    System.out.print("*");
                System.out.println();
            } else {
                System.out.print("*");
                System.out.println();
            }
        }
    }
}