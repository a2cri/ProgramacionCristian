package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio20Cristian {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer numero (este tiene que ser menor al segundo)");
        int numA= sc.nextInt();
        System.out.println("Introduce el segundo numero(este tiene que ser mayor al primero");
        int numB=sc.nextInt();
        int num = numA+1;
        while (num<numB) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
