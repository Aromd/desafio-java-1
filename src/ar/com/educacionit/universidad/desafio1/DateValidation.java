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


    }
}
