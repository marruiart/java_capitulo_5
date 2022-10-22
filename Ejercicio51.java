
/**
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
 * (todos los que encuentre). Este programa  muestra un número antes
 * y después de haber sido comido por el gusano. Si el animalito no se ha comido
 * ningún dígito, el programa debe indicarlo.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio51 {

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
        long eatenNum = 0;
        long tmp = num;
        int units = 1;
        int lastDigit;
        int donutDigit = 0;
        while (tmp / 10 > 0) {
            lastDigit = (int) tmp % 10;
            if (lastDigit != 8 && lastDigit != 0) {
                eatenNum += lastDigit * units;
                units *= 10;
            } else
                donutDigit++;
            tmp /= 10;
        }
        lastDigit = (int) tmp % 10;
        if (lastDigit != 8 && lastDigit != 0)
            eatenNum += lastDigit * units;
        if (donutDigit > 0)
            System.out.printf("El número %d después de ser comido por el gusano es %d", num, eatenNum);
        else
            System.out.printf("El gusano numérico no se ha comido ningún dígito.");

    }
}
