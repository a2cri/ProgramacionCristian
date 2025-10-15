package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7Cristian {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double num1= in.nextDouble();
        System.out.println("Introduce otro numero");
        double num2=in.nextDouble();
        if (num1>num2){
            double resta1=num1-num2;
            System.out.println("El resultado de la resta es "+resta1);
        }else {
            double resta2 =num2-num1;
            System.out.println("El resultado de la resta es "+ resta2);
        }
    }
}
