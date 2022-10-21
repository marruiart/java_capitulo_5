
/**
 * Este programa pinta por pantalla la letra A. El usuario 
 * debe introducir la altura total y la fila en la que debe 
 * aparecer el palito horizontal (contando desde el vértice). 
 * La altura mínima es de 3 pisos. La fila donde va el palito 
 * horizontal debe ser mayor que 1 y menor que la altura total. 
 * Si el usuario introduce algún dato incorrecto, el programa 
 * muestra un mensaje de error.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        int linePosition;
        do {
            System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
            height = s.nextInt();
            System.out.print("Introduzca la fila del palito horizontal (entre 2 y 6): ");
            linePosition = s.nextInt();
            if (height < 3 || !(linePosition > 1 && linePosition < height))
                System.out.println("Los datos introducidos son incorrectos.");
        } while (height < 3 || !(linePosition > 1 && linePosition < height));

        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 2 * i - 1; j > 0; j--) {
                if (j == 2 * i - 1 | j == 1)
                    System.out.print("*");
                else if (i != linePosition)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}