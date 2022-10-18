import java.util.Scanner;

/**
 * Este programa muestra la tabla de multiplicar de un número introducido por
 * teclado.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número: ");
        int num = s.nextInt();
        for (int n = 0; n <= 10; n++)
            System.out.printf("%d x %d = %d\n", num, n, num * n);
        s.close();
    }
}
