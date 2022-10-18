import java.util.Scanner;

/**
 * Este programa nos dice cuántos dígitos tiene un número introducido por
 * teclado. La única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long readNum = s.nextLong();
        long num = readNum;
        int count = 0;
        do {
            num /= 10;
            count++;
        } while (num != 0);
        System.out.printf("El número %d tiene %d dígitos", readNum, count);
        s.close();
    }
}