
/**
 * Este programa pinta una pirámide hueca por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        String fillerChar;
        do {
            System.out.print("Introduzca la altura de la pirámide: ");
            height = s.nextInt();
            System.out.print("Introduzca el caracter de relleno: ");
            fillerChar = s.next();
            if (height < 0)
                System.out.println("Altura incorrecta. ");
        } while (height < 0);
        s.close();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height * 2 - 1; j++) {
                if (i == height)
                    System.out.print("*");
                else if (j <= height - i || j >= height + i || (j > height - i + 1 && j < height + i - 1))
                    System.out.print(" ");
                else
                    System.out.print(fillerChar);
            }
            System.out.println();
        }
    }
}