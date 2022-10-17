import java.util.Scanner;

/**
 * This program simulates performs access control to a safe. The combination
 * will be a 4-digit number. The program will ask for the combination to open
 * it. If the answer is not correct, it will display the message "Sorry, the
 * combination is not correct" and if it is correct it will display "The safe
 * has been opened successfully". There are four opportunities to open the safe.
 * 
 * @autor Marina Ruiz
 */

public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int correctCode = 5691;
        int attempt = 0;
        do {
            System.out.print("Please, introduce the 4-digit code: ");
            int code = s.nextInt();
            while (code > 9999 || code < 1000) {
                System.out.print("Please, introduce a 4-digit code: ");
                code = s.nextInt();
            }
            if ((float)code / (float)correctCode == 1) {
                System.out.print("The safe has been opened successfully!");
                return;
            }
            System.out.print("Sorry, the combination is not correct. ");
            attempt++;
        } while (attempt < 4);
        System.out.print("No more attempts are allowed.");
    }
}
