package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio26Cristian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero entero:");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println("EL numero no es primo");
        } else {
            boolean primo = num > 1;
            for (int i = 2; i < num && primo; i++) {
                primo = num % i != 0;
            }
            if (primo) {
                System.out.println(num + " es primo");
            } else {
                System.out.println(num + " no es primo");
            }
        }
    }
}