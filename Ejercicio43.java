
/**
 * Este programa permite partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio43 {

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
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int position = s.nextInt();
        s.close();

        int length = numLength(num);
        long units = (long) Math.pow(10, length - position + 1);
        long rightHalf = num % units;
        long leftHalf = num / units;
        System.out.printf("El número %d partido es el %d y el %d.", num, leftHalf, rightHalf);
    }
}