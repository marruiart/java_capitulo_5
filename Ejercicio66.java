
/**
 * Este programa pinta una señal para desviar el tráfico hacia la derecha. La
 * señal es una doble flecha con el vértice apuntando a la derecha. Se pide al
 * usuario la altura de la figura, que debe ser un número impar mayor o igual
 * que 3. La distancia entre cada flecha de asteriscos es siempre de 4 espacios.
 * Si la altura introducida por el usuario no es un número impar mayor o igual
 * que 3, el programa debe mostrar un mensaje de error.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int height;
        do {
            System.out.print("Introduce la altura de la pirámide: ");
            height = s.nextInt();
            if (height % 2 == 0 || height < 3)
                System.out.print("La alura debe ser un número impar y mayor o igual a 3. ");
        } while (height % 2 == 0 || height < 3);
        s.close();

        for (int i = 0; i < height; i++) {
            if (i < height / 2 + 1)
                for (int j = i; j > 0; j--) {
                    System.out.print(" ");
                }
            else
                for (int j = height - i - 1; j > 0; j--) {
                    System.out.print(" ");
                }
            System.out.print("*    *");
            System.out.println();
        }
    }
}