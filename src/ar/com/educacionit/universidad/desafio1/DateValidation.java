package ar.com.educacionit.universidad.desafio1;

import java.util.Scanner;

public class DateValidation {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una fecha válida en formato dd/mm/yyyy");
        System.out.println("Ingrese el día en formato dd:");
        int day = teclado.nextInt();
        System.out.println("Ingrese el mes en formato mm:");
        int month = teclado.nextInt();
        System.out.println("Ingrese el día en formato yyyy:");
        int year = teclado.nextInt();

        teclado.close();

        boolean isValidYear = year >= 1900 && year <= 2099;
        boolean isValidMonth = month >= 1 && month <= 12;
        boolean isValidDay = isValidDay(day, month, year);

        String mensaje = isValidYear && isValidMonth && isValidDay ? "La fecha indicada es correcta" : "La fecha indicada es incorrecta";
        System.out.println(mensaje);
    }

    public static boolean isValidDay(int day, int month, int year) {
        boolean isEnteredYearLeap = ((year - 1904) % 4 == 0) && year != 1900;
        System.out.println(isEnteredYearLeap);
        boolean isMonthPair = month % 2 == 0;
        boolean isFirstHalfOfTheYear = month <= 7;
        boolean isLongMonth = (!isMonthPair && isFirstHalfOfTheYear) || (isMonthPair && !isFirstHalfOfTheYear);
        int daysOfFebruary = isEnteredYearLeap ? 29 : 28;
        int maxDaysAllowedInEnteredMonth = month == 2 ? daysOfFebruary : isLongMonth ? 31 : 30;

        return day >= 1 && day <= maxDaysAllowedInEnteredMonth;
    }
}
