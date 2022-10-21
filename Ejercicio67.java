
/**
 * Este programa pinta una escalera que va descendiendo 
 * de izquierda a derecha. El programa pedirá el 
 * número de escalones y la altura de cada escalón. 
 * La anchura de los escalones siempre es la misma: 4 asteriscos.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el número de escalones: ");
        int numSteps = s.nextInt();
        System.out.print("Introduce la altura de los escalones: ");
        int height = s.nextInt();
        s.close();
        for (int i = 1; i <= numSteps; i++) {
            for (int h = height; h > 0; h--) {
                for (int length = 4 * i; length > 0; length--)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}