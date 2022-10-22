
/**
 * Este programa pinta dos pirámides rellenas hechas con asteriscos, una al lado
 * de la otra y separadas por un espacio en su base.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio63 {

    public static void printLowerArea(int heightPiram1, int heightPiram2, int line1, int line2) {
        for (int j = heightPiram1 - line1; j > 0; j--)
            System.out.print(" ");
        for (int j = line1 * 2 - 1; j > 0; j--)
            System.out.print("*");
        for (int j = heightPiram1 - line1 + heightPiram2 - line2 + 1; j > 0; j--)
            System.out.print(" ");
        for (int j = line2 * 2 - 1; j > 0; j--)
            System.out.print("*");
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int heigthPiram1;
        int heigthPiram2;
        do {
            System.out.print("Introduzca la altura de la primera pirámide: ");
            heigthPiram1 = s.nextInt();
            System.out.print("Introduzca la altura de la segunda pirámide: ");
            heigthPiram2 = s.nextInt();
            if (heigthPiram1 <= 0 || heigthPiram2 <= 0) {
                System.out.println();
                System.out.println("La altura es incorrecta. Debe ser mayor a 0.");
            }
        } while (heigthPiram1 <= 0 || heigthPiram2 <= 0);
        s.close();

        int heightLarge = heigthPiram1;
        int heightSmall = heigthPiram2;

        if (heigthPiram1 < heigthPiram2) {
            heightLarge = heigthPiram2;
            heightSmall = heigthPiram1;
        }
        int basePiram1 = heigthPiram1 * 2 - 1;
        int h1 = 1;
        while (h1 <= heightLarge - heightSmall) {
            if (heigthPiram1 > heigthPiram2) {
                for (int j = heightLarge - h1; j > 0; j--)
                    System.out.print(" ");
                for (int j = h1 * 2 - 1; j > 0; j--)
                    System.out.print("*");
            } else {
                for (int j = basePiram1 + heightLarge - h1 + 1; j > 0; j--)
                    System.out.print(" ");
                for (int j = h1 * 2 - 1; j > 0; j--)
                    System.out.print("*");
            }
            System.out.println();
            h1++;
        }
        for (int h2 = 1; h2 <= heightSmall; h2++) {
            if (heigthPiram1 > heigthPiram2)
                printLowerArea(heightLarge, heightSmall, h1, h2);
            else
                printLowerArea(heightSmall, heightLarge, h2, h1);
            System.out.println();
            h1++;
        }
    }
}