
/**
 * Este programa suma los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @autor Marina Ruiz
 */
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num;
    do {
      System.out.print("Introduzca un número entero positivo: ");
      num = s.nextInt();
      if (num < 0)
        System.out.println("No se admiten negativos. ");
    } while (num < 0);
    s.close();

    long sum = 0;
    for (int i = num; i < num + 100; i++) {
      sum += i;
    }

    System.out.printf("La suma de los 100 números siguientes a %d es %d", num, sum);
  }
}
