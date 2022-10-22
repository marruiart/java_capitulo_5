
/**
 * Este programa pinta un triángulo rectángulo vacío apuntando hacia abajo, 
 * pegado a la izquierda. El usuario debe introducir la altura de la figura.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Introduzca la altura de la figura: ");
            height = s.nextInt();
        } while (height < 2);
        s.close();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == 1)
                    System.out.print("*");
                else if (j == 1 || j == height - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}