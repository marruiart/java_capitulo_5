
/**
 * Este programa pinta por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que
 * comprobar que tanto la anchura como la altura sean mayores o iguales que 2,
 * en caso contrario se debe mostrar un mensaje de error.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        int width;
        do {
            System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
            width = s.nextInt();
            System.out.print("Ahora introduzca la altura (como mínimo 2): ");
            height = s.nextInt();
            if (height < 2 || width < 2)
                System.out.println(
                        "Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2. ");
        } while (height < 2 || width < 2);
        s.close();

        for (int i = 1; i <= height; i++) {
            if (i == 1 || i == height)
                for (int j = width; j > 0; j--)
                    System.out.print("*");
            else {
                System.out.print("*");
                for (int j = width - 2; j > 0; j--)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}