
/**
 * Este programa pinta el número 155 mediante asteriscos. Al
 * usuario se le pedirán dos datos, la altura del cartel y el número de espacios
 * que habrá entre los números. La altura mínima es 5. La anchura de los números
 * siempre es la misma. La parte superior de los cincos también es siempre igual.
 * La parte inferior del 5 sí que varía en función de la altura.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        int spaces;
        do {
            System.out.print("Introduzca la altura (5 como mínimo): ");
            height = s.nextInt();
            System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
            spaces = s.nextInt();
            if (height < 5 || spaces < 1)
                System.out.println("Los parámetros introducidos no son correctos.");
        } while (height < 5 || spaces < 1);
        s.close();
        for (int i = 1; i <= height; i++) {
            if (i == 1 || i == height || i == 3) {
                System.out.print("*");
                for (int j = 2; j > 0; j--) {
                    for (int sp = spaces; sp > 0; sp--)
                        System.out.print(" ");
                    for (int five = 4; five > 0; five--)
                        System.out.print("*");
                }
                System.out.println();
            } else if (i < 3) {
                System.out.print("*");
                for (int j = 2; j > 0; j--) {
                    for (int sp = spaces; sp > 0; sp--)
                        System.out.print(" ");
                    System.out.print("*");
                    for (int sp = 3; sp > 0; sp--)
                        System.out.print(" ");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 2; j > 0; j--) {
                    for (int sp = spaces + 3; sp > 0; sp--)
                        System.out.print(" ");
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}