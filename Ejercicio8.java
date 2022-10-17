import java.util.Scanner;

/**
 * This program displays the multiplication table of a number given through the standard input.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please, introduce a number: ");
        int num = s.nextInt();
        for (int n = 0; n <=10; n++)
            System.out.printf("%d x %d = %d\n", num, n, num * n);
    }
}
