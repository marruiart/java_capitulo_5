
/**
 * Este programa es capaz de desplazar todos los dígitos de un número
 * de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
 * dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo
 * dígito, se queda igual.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio55 {

    public static int numLength(long num) {
        int length = 0;
        while (num / 10 > 0) {
            num /= 10;
            length++;
        }
        length++;
        return length;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long num = s.nextLong();
        s.close();
        long displacedNum = num / 10;
        int lastDigit = (int) num % 10;
        int numLength = numLength(num);
        int units = (int) Math.pow(10, numLength - 1);
        displacedNum += lastDigit * units;
        System.out.printf("El número %d desplazado a la izquierda es %d", num, displacedNum);
    }
}
