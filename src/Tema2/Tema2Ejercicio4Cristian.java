package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4Cristian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = in.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = in.nextInt();
        System.out.println("Introduce el ultimo numero");
        int num3 = in.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("El numero mayor es " + num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("El numero mayor es "+num2);
        }else {
            System.out.println("El numero mayor es "+num3);
        }
    }
}