import java.util.Scanner;

/**
 * Este programa pide una base y un exponente (entero positivo) y que calcula la
 * potencia.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio14 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número (base): ");
        int base = s.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponential = s.nextInt();
        s.close();
        if (exponential < 0) {
            System.out.print("El exponente debe ser positivo: ");
            exponential = s.nextInt();
        }
        double result = Math.pow(base, exponential);
        System.out.printf("El resultado de %d^%d es %.0f", base, exponential, result);
    }
}
