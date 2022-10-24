
/**
 * Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 
 * y el 9. Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, 
 * el 5 y el 6. Un número es afortunado si contiene más números de la suerte que 
 * de la mala suerte. Este programa dice si un número introducido por el usuario
 * es afortunado o no.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = s.nextInt();
        s.close();
        int tmp = num;
        int lastDigit;
        int luck = 0;
        int badLuck = 0;
        while (tmp > 0) {
            lastDigit = tmp % 10;
            if (lastDigit == 3 || lastDigit == 7 || lastDigit == 8 || lastDigit == 9)
                luck++;
            else
                badLuck++;
            tmp /= 10;
        }

        if (luck > badLuck)
            System.out.printf("%d es un número de la suerte!", num);
        else if (badLuck > luck)
            System.out.printf("%d es un número que da mala suerte", num);
        else
            System.out.printf("%d es un número neutro!", num);
    }
}