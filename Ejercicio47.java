
/**
 * Este programa pinta un 8 por pantalla usando la letra
 * M. Se pide al usuario la altura, que debe ser un número entero impar mayor
 * o igual que 5. Si el número introducido no es correcto, el programa deberá
 * mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
 * La anchura de la figura siempre será de 6 caracteres.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
            height = s.nextInt();
            if (height % 2 == 0 || height < 5)
                System.out.println("La altura introducida no es correcta. ");
        } while (height % 2 == 0 || height < 5);
        s.close();
        for (int i = 1; i <= height; i++) {
            if (i == 1 || i == height / 2 + 1 || i == height)
                System.out.print("MMMMMM");
            else
                System.out.print("M    M");
            System.out.println();
        }
    }
}