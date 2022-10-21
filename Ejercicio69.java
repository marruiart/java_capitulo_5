
/**
 * Este programa pinta una pirámide maya. Por los lados, se trata de una
 * pirámide normal y corriente. Por el centro se van pintando líneas de
 * asteriscos de forma alterna (empezando por la superior): la primera se pinta,
 * la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide
 * siempre tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a
 * la pirámide normal tienen 4 asteriscos. El programa pedirá la altura. Se
 * supone que el usuario introducirá un número entero mayor o igual a 3; no es
 * necesario comprobar los datos de entrada.
 * 
 * @autor Marina Ruiz
 */

import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide: ");
        int height = s.nextInt();
        int central = 4;
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j >= 0; j--)
                System.out.print(" ");
            for (int j = i; j > 0; j--)
                System.out.print("*");
            for (int j = central; j > 0; j--) {
                if (i % 2 == 0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            for (int j = i; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }
        s.close();
    }
}