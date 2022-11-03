import java.util.Scanner;

/**
 * Este programa realiza el control de acceso a una caja fuerte. La combinación
 * será un número de 4 cifras. El programa nos pedirá la combinación para
 * abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la
 * combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto
 * satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja
 * fuerte.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int correctCode = 5691;
        int attempt = 0;
        do {
            System.out.print("Por favor, introduce un código de 4 dígitos: ");
            int code = s.nextInt();
            while (code > 9999 || code < 1000) {
                System.out.print("El código debe tener 4 dígitos: ");
                code = s.nextInt();
            }
            if ((float) code / (float) correctCode == 1) {
                System.out.print("¡La caja fuerte se ha abierto satisfactoriamente!");
                s.close();
                return;
            }
            System.out.print("Lo siento, esa no es la combinación. ");
            attempt++;
        } while (attempt < 4);
        s.close();
        System.out.print("No se permiten más intentos.");
    }
}
