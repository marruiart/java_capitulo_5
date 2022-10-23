
/**
 * Este programa pinta una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio19 {
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
            for (int j = height - i; j > 0; j--)
                System.out.print(" ");
            for (int j = i * 2 - 1; j > 0; j--)
                System.out.print(fillerChar);
            System.out.println();
        }
    }
}