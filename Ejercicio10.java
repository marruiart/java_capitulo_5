import java.util.Scanner;

/**
 * Este programa calcula la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio10 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        float sum = 0;
        float count = 0;
        while (num >= 0) {
            System.out.print("Introduce un número: ");
            num = s.nextInt();
            if (num >= 0) {
                sum += num;
                count++;
            }
        }
        float average = sum / count;
        if (count > 0)
            System.out.printf("La media de los números es %.2f\n", average);
        s.close();
    }
}
