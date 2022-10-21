import java.util.Scanner;

/**
 * Este programa muestra en tres columnas, el cuadrado y el cubo de los 5
 * números enteros que se introduce por teclado.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio11var {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.printf("|   NUMERO   |  CUADRADO  |    CUBO    |\n");
        System.out.printf("----------------------------------------\n");
        for (int i = 0; i < 5; i++) {
            System.out.print("Por favor, introduce un número: ");
            double num = s.nextDouble();
            System.out.print("\033[F[2K\r");
            double pow = Math.pow(num, 2);
            double cube = Math.pow(num, 3);       
            System.out.printf("| %10.2f | %10.2f | %10.2f |\n", num, pow, cube);
        }
        s.close();
    }
}
