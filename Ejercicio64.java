
/**
 * Este programa pinta por pantalla un rectángulo hueco de 6 caracteres de ancho
 * por 3 de alto y, a continuación, un menú que permita agrandarlo, achicarlo o
 * cambiar su orientación. Cada vez que el rectángulo se agranda, se incrementa
 * en 1 tanto su anchura como su altura. Cuando se achica, se decrementa en 1 su
 * anchura y altura. Por último, cuando se cambia la orientación, los valores de
 * anchura y altura se intercambian. El valor mínimo de la altura o la anchura
 * es 2.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio64 {

    public static void printSquare(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height)
                    System.out.print("*");
                else if (j == 1 || j == width)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este rectángulo es de 3 alto x 6 ancho: ");
        System.out.println("******");
        System.out.println("*    *");
        System.out.println("******");
        int userDecision;
        int height = 3;
        int width = 6;
        do {
            System.out.println("1. Agrandarlo");
            System.out.println("2. Achicarlo");
            System.out.println("3. Cambiar la orientación");
            System.out.println("4. Salir");
            System.out.print("Indique qué quiere hacer con el rectángulo: ");
            userDecision = s.nextInt();
            switch (userDecision) {
                case 1:
                    height++;
                    width++;
                    break;
                case 2:
                    height--;
                    width--;
                    break;
                case 3:
                    int tmp = height;
                    height = width;
                    width = tmp;
                    break;
                case 4:
                    System.out.print("Adiós!");
                    return;
                default:
                    System.out.println();
                    System.out.println("Elección incorrecta, elija 1-4. ");
            }
            if (height < 2 || width < 2) {
                height++;
                width++;
                System.out.println();
                System.out.println("No se puede achicar más. ");
            }
            printSquare(height, width);
        } while (userDecision != 4);
        s.close();
    }
}