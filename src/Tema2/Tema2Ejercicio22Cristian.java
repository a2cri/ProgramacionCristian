package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22Cristian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        long num = sc.nextLong();

        if (num < 0) {
            num = -num;
        }

        int contador = 0;

        do {
            num = num / 10;
            contador++;
        } while(num > 0);

        System.out.println("El número tiene " + contador + " cifras.");
    }
}

