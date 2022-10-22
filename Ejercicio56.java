
/**
 * Este programa pinta un triángulo rectángulo relleno apuntando hacia abajo. 
 * El usuario debe introducir la altura de la figura.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Introduzca la altura de la figura: ");
            height = s.nextInt();
        } while (height < 2);
        s.close();
        for (int i = 0; i < height; i++) {
            for (int j = i; j > 0; j--)
                System.out.print(" ");
            for (int j = height - i; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}