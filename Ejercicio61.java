
/**
 * Este programa pinta por pantalla la letra V. El ancho del palo de la V es
 * siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
 * mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
 * debe mostrar un mensaje de error.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio61 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Introduzca la altura de la V (un número mayor o igual a 3): ");
            height = s.nextInt();
            if (height < 3)
                System.out.println("Altura incorrecta.");
            System.out.println();
        } while (height < 3);
        s.close();
        String width = "***";
        for (int i = 0; i < height; i++) {
            for (int j = i; j > 0; j--)
                System.out.print(" ");
            System.out.print(width);
            for (int j = height * 2 - i * 2 - 2; j > 0; j--)
                System.out.print(" ");
            System.out.print(width);
            System.out.println();
        }
    }
}