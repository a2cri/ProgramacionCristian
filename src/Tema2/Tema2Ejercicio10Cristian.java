package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10Cristian {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num1 = in.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = in.nextDouble();
        System.out.println("Introduce el tercer numero");
        double num3 = in.nextDouble();
        if (num1<=num2 && num2<=num3){
            System.out.println("Los numeros estan ordenados de menor a mayor");
        }else {
            System.out.println("Los numeros no estan ordenados de menor a mayor");
        }
    }
}
