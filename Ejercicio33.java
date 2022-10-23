
/**
 * Este programa pinta la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Introduzca la altura de la U: ");
            height = s.nextInt();
            if (height < 0)
                System.out.println("La altura debe ser positiva. ");
        } while (height < 0);
        s.close();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height; j++) {
                if (i == height)
                    if (j == 1 || j == height)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                else if (j == 1 || j == height)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}