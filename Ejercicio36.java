
/**
 * Este programa dice si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita
 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda
 * usar long en lugar de int ya que el primero admite números más largos.
 * 
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio36 {

    public static long reverseNum(long num) {
        long reversedNum = 0;
        while (num > 0) {
            long lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long num;
        do {
            System.out.print("Por favor, introduzca un número entero positivo: ");
            num = s.nextInt();
            if (num < 0)
                System.out.println("Número introducido incorrecto. ");
        } while (num < 0);
        s.close();

        String isPalindromic = "no es capicúa";
        long reversedNum = reverseNum(num);
        if (num == reversedNum) {
            isPalindromic = "es capicúa";
        }
        System.out.printf("El %d %s.", num, isPalindromic);
    }
}