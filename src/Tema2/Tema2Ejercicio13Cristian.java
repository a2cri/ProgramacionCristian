package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio13Cristian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1;
        do {
            System.out.println("Introduce las horas (0-23):");
            num1 = in.nextInt();
        } while (num1 < 0 || num1 > 23);

        int num2;
        do {
            System.out.println("Introduce los minutos (0-59):");
            num2 = in.nextInt();
        } while (num2 < 0 || num2 > 59);

        int num3;
        do {
            System.out.println("Introduce los segundos (0-59):");
            num3 = in.nextInt();
        } while (num3 < 0 || num3 > 59);
        num3++;
        if (num3 == 60) {
            num3 = 0;
            num2++;
        }
        if (num2 == 60) {
            num2 = 0;
            num1++;
        }
        if (num1 == 24) {
            num1 = 0;
        }
        System.out.println("Horas: " + num1 + " Minutos: " + num2 + " Segundos: " + num3);
    }
}
