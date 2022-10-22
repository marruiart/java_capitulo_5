
/**
* Este programa cambia un dígito dentro de un número dando la posición y el valor 
* nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el 1. Se 
* recomienda usar long en lugar de int ya que el primero admite números más largos. 
* Suponemos que el usuario introduce correctamente los datos.
*
* @author: Marina Ruiz Artacho
**/

import java.util.Scanner;

public class Ejercicio45 {

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
        System.out.print("Introduzca la posición dentro del número: ");
        int position = s.nextInt();
        System.out.print("Introduzca el nuevo dígito: ");
        int newDigit = s.nextInt();
        s.close();

        int length = numLength(num);
        long tmp = num;
        long units = length - position;
        for (long i = units; i > 0; i--) {
            tmp /= 10;
        }
        long digit = tmp % 10;

        units = (int) Math.pow(10, units);
        num -= units * digit;
        num += units * newDigit;

        System.out.printf("El número resultante es %d", num);
    }
}