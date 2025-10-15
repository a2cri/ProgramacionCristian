package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6Cristian {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce un numero");
        double num1 = in.nextDouble();
        if (num1>0){
            System.out.println("El numero " + num1 +" es positivo");
        }else if (num1<0){
            System.out.println("El numero "+ num1 +" es negativo");
        }else {
            System.out.println("El numero es 0");
        }
    }
}
