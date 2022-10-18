/**
 * Este programa muestra los números del 320 al 160, contando de 20 en 20
 * utilizando un bucle do-while.
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
