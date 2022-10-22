
/**
 * Este programa inserta un dígito dentro de un número indicando la posición. El
 * nuevo dígito se colocará en la posición indicada y el resto de dígitos se
 * desplazará hacia la derecha. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Suponemos que el usuario introduce correctamente los
 * datos. Se recomienda usar long en lugar de int ya que el primero admite
 * números más largos.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio44 {

    public static int numLength(long num) {
        int length = 1;
        while (num / 10 > 0) {
            num /= 10;
            length++;
        }
        return length;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long num = s.nextLong();
        System.out.print("Introduzca la posición donde quiere insertar: ");
        int position = s.nextInt();
        System.out.print("Introduzca el dígito que quiere insertar: ");
        int insertedDigit = s.nextInt();
        s.close();

        int length = numLength(num);
        long units = (long) Math.pow(10, length - position + 1);
        long rightHalf = num % units;
        long leftHalf = num / units * units * 10;
        insertedDigit *= units;
        long newNum = leftHalf + insertedDigit + rightHalf;
        System.out.printf("El número resultante es %d", newNum);
    }
}