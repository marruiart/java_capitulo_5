import java.util.Scanner;

/**
 * Este programa lee una lista de diez números y determina cuántos son
 * positivos, y cuántos son negativos.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio13 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < 10; i++) {
            int num = s.nextInt();
            if (num < 0)
                neg++;
            else
                pos++;
        }
        s.close();
        System.out.printf("Se han introducido %d números negativos y %d positivos", neg, pos);
    }
}
