package Tema3;
import java.util.Scanner;
public class Tema3Ejercicio8 {

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public static boolean esFechaValida(int dia, int mes, int año) {
        int diasMes = 0;

        if (mes < 1 || mes > 12) {
            return false;
        }

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;
            case 2:
                if (esBisiesto(año)) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
        }

        return dia >= 1 && dia <= diasMes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;

        System.out.println("Introduce día:");
        dia = sc.nextInt();
        System.out.println("Introduce mes:");
        mes = sc.nextInt();
        System.out.println("Introduce año:");
        año = sc.nextInt();

        if (esFechaValida(dia, mes, año)) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha no es válida.");
        }
    }
}