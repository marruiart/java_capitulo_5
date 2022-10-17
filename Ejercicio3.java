/**
 * This program displays the numbers that are multiples of 5 from 0 to 100 using
 * a do-while loop.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio3 {
    public static void main(String args[]) {
        int n = 0;
        do {
            System.out.println(n);
            n += 5;
        } while (n <= 100);
    }
}
