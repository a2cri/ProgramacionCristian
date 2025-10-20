package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29Cristian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        int secreto = rc.nextInt(100) + 1;
        int num;
        System.out.println("Vamos a jugar a adivinar el numero, vas a introducir un numero del 1 al 100 ");
        do {
            num = sc.nextInt();
            while (num < 1 || num > 100) {
                System.out.println("Numero invalido, introduce uno del 1 al 100");
                num = sc.nextInt();
            }
            if (num < secreto) {
                System.out.println("Demasiado bajo, intenta otra vez.");
            } else if (num > secreto) {
                System.out.println("Demasiado alto, intenta otra vez.");
            } else {
                System.out.println("Adivinaste el número");
            }

        } while (num != secreto);
            }
        }