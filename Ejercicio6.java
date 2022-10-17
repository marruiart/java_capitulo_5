/**
 * This program displays the numbers from 320 to 160, counting 20 by 20 using a
 * do-while loop.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio6 {
    public static void main(String args[]) {
        int n = 320;
        do {
            System.out.println(n);
            n -= 20;
        } while (n >= 160);
    }
}
