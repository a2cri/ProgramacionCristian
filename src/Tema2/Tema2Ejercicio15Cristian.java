package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio15Cristian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero del mes (1-12)");
        int mes = in.nextInt();
        System.out.println("Introduce el numero del año");
        int anyo = in.nextInt();
        int dias;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
                    dias = 29;
                } else
                    dias = 28;
                break;
            default:
                dias = 0;
        }
        if (dias == 0) {
            System.out.println("Numero del mes no valido");
        } else {
            System.out.println("El mes " + mes + " del año " + anyo + " tiene " + dias + " dias");
        }
    }
}
