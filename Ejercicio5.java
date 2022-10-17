/**
 * This program displays the numbers from 320 to 160, counting backwards 20 by
 * 20 using a while loop.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio5 {
    public static void main(String args[]) {
        int n = 320;
        while (n >= 160) {
            System.out.println(n);
            n -= 20;
        }
    }
}