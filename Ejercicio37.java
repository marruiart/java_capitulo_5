
/**
 * Este programa es un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @autor Marina Ruiz
 */

import java.util.Scanner;

public class Ejercicio37 {

    public static int numLength(long num) {
        int length = 1;
        while (num / 10 > 0) {
            length++;
            num /= 10;
        }
        return length;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = s.nextLong();
        s.close();

        int numLength = numLength(num);
        long units = (long) Math.pow(10, numLength - 1);
        long tmp = num;
        String sticks = "";

        while (units / 10 > 0) {
            long firstDigit = tmp / units;
            for (long i = firstDigit; i > 0; i--)
                sticks += "|";
            sticks += "-";
            tmp %= units;
            units /= 10;
        }
        for (long i = tmp / units; i > 0; i--)
            sticks += "|";

        System.out.printf("El %d en decimal es el %s en el sistema de palotes.", num, sticks);
    }
}