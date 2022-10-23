/**
 * Este programa muestra por pantalla todos los números primos entre 2 y 100,
 * ambos incluidos.
 *
 * @author: Marina Ruiz Artacho
 **/

public class Ejercicio22 {

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num))
                System.out.println(num);
        }
    }
}