import java.util.Scanner;

/**
 * Este programa recibe dos números, uno real (base) y un
 * entero positivo (exponente), y saca por pantalla todas las potencias con base
 * el numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el
 * 3, se deberán mostrar 2¹, 2², 2³.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio15 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número (base): ");
        double base = s.nextInt();
        System.out.print("Introduce el exponente: ");
        int lastPower = s.nextInt();
        s.close();
        
        for (int i = 1; i <= lastPower; i++) {
            double power = 1;
            for (int j = 1; j <= i; j++) {
                power *= base;
            }
            System.out.print(base + "^" + i + " = ");
            System.out.println(power);
        }
    }
}
