
/**
 * Este programa es capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría
 * a dar la vuelta y se colocaría a la derecha. Si el número tiene un solo
 * dígito, se queda igual.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio52 {

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
        int numLength = numLength(num);
        int units = (int) Math.pow(10, numLength - 1);
        int firstDigit = (int) num / units;
        long displacedNum = num - firstDigit * units;
        displacedNum = displacedNum * 10 + firstDigit;
        System.out.printf("El número %d desplazado a la izquierda es %d", num, displacedNum);
    }
}
