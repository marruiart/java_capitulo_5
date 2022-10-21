import java.util.Scanner;

/**
 * Este programa muestra en tres columnas, el cuadrado y el cubo de los 5
 * primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio11 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número: ");
        double num = s.nextDouble();
        s.close();
        System.out.printf("|   NUMERO   |  CUADRADO  |    CUBO    |\n");
        System.out.printf("----------------------------------------\n");
        for (double nextNum = num; nextNum < num + 5; nextNum++) {
            double pow = Math.pow(nextNum, 2);
            double cube = Math.pow(nextNum, 3);
            System.out.printf("| %10.2f | %10.2f | %10.2f |\n", nextNum, pow, cube);
        }
    }
}
