
/**
 * Este programa calcula las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 *
 * @author: Marina Ruiz Artacho
 **/

import java.util.Scanner;

public class Ejercicio30 {

    public static String dayOfWeek(int day) {
        String strDay = "";
        switch (day) {
            case 1:
                strDay = "lunes";
                break;
            case 2:
                strDay = "martes";
                break;
            case 3:
                strDay = "miércoles";
                break;
            case 4:
                strDay = "jueves";
                break;
            case 5:
                strDay = "viernes";
                break;
            case 6:
                strDay = "sábado";
                break;
            case 7:
                strDay = "domingo";
                break;
        }
        return strDay;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int day1;
        int day2;
        int hour1;
        int hour2;
        do {
            System.out.println("Por favor, introduzca la primera hora.");
            System.out.print("Día (1 - 7): ");
            day1 = s.nextInt();
            System.out.print("Hora (0 - 23): ");
            hour1 = s.nextInt();
            System.out.println("Por favor, introduzca la segunda hora.");
            System.out.print("Día (1 - 7): ");
            day2 = s.nextInt();
            System.out.print("Hora (0 - 23): ");
            hour2 = s.nextInt();
            if (day1 > day2 || day1 < 0 || day1 > 7 || day2 < 0 || day2 > 7
                    || hour1 < 0 || hour1 > 23 || hour2 < 0 || hour2 > 23)
                System.out.println("Datos introducidos incorrectos. ");
        } while (day1 > day2 || day1 < 0 || day1 > 7 || day2 < 0 || day2 > 7
                || hour1 < 0 || hour1 > 23 || hour2 < 0 || hour2 > 23);
        s.close();

        int hoursDay1 = 24 - hour1;
        int hoursDay2 = hour2;
        int hoursInBetween = (day2 - day1 - 1) * 24;
        int hours = hoursDay1 + hoursInBetween + hoursDay2;

        System.out.printf("Entre las %d:00h del %s y las %d:00h del %s hay %d hora/s", hour1, dayOfWeek(day1), hour2,
                dayOfWeek(day2), hours);
    }
}