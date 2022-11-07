
/**
 * Este programa calcula el máximo, el mínimo y la media de una serie
 * de números enteros positivos introducidos por teclado. El programa terminará
 * cuando el usuario introduzca un número primo. Este último número no se
 * tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
 * números ha introducido el usuario (sin contar el primo que sirve para salir).
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio49 {

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0)
                return false;
        return true;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num;
        int max = 0;
        int min = (int) Math.pow(2, 32);
        float average;
        int sum = 0;
        int count = 1;
        boolean primeNum;
        System.out.println(
                "Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        do {
            System.out.print("Numero " + count + ": ");
            num = s.nextInt();
            primeNum = isPrime(num);
            if (num >= 0 && !primeNum) {
                if (num > max)
                    max = num;
                if (num < min)
                    min = num;
                sum += num;
                count++;
            } else if (num < 0)
                System.out.print("Los números negativos no son válidos. ");
        } while (!primeNum);
        s.close();
        count--;
        average = (float) sum / count;
        System.out.printf("Ha introducido %d números no primos. \nMáximo: %d \nMínimo: %d \nMedia: %.2f", count, max,
                min, average);
    }
}