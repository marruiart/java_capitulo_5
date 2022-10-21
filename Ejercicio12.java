import java.util.Scanner;

/**
 * Este programa muestra los n primeros términos de la serie de Fibonacci. El
 * primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se
 * calcula sumando los dos anteriores, por lo que tendríamos que los términos
 * son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio12 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el número de términos a mostrar: ");
        int n = s.nextInt();
        s.close();
        int num1 = 0;
        int num2 = 1;
        int tmp;
        for (int i = 1; i <= n; i++) {
            if (i != n)
                System.out.print(num1 + ", ");
            else 
                System.out.print(num1);
            tmp = num1;
            num1 = num2;
            num2 = tmp + num1;
        }
    }
}
