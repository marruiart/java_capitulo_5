
/**
 * Este programa pinta por pantalla un par de calcetines, de los que
 * se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
 * El usuario debe introducir la altura. Suponemos que el usuario introduce una
 * altura mayor o igual a 4. Observa que la talla de los calcetines y la
 * distancia que hay entre ellos (dos espacios) no cambia, lo único que
 * varía es la altura.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Introduzca la altura de los calcetines: ");
            height = s.nextInt();
            if (height < 3)
                System.out.println("Altura incorrecta.");
            System.out.println();
        } while (height < 4);
        s.close();
        String top = "***     ***";
        String bottom = "******  ******";
        for (int i = height - 2; i > 0; i--) {
            System.out.print(top);
            System.out.println();
        }
        for (int i = 2; i > 0; i--) {
            System.out.print(bottom);
            System.out.println();
        }
    }
}