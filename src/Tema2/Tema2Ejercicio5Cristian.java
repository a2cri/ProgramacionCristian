package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5Cristian {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num1 = in.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = in.nextDouble();
        System.out.println("Introduce el ultimo numero");
        double num3 = in.nextDouble();
        double condecimal= (num1+num2+num3)/3;
        int sindecimal= (int) Math.round(condecimal);
        System.out.println("La media de los 3 numeros con decimales es " + condecimal);
        System.out.println("La media de los 3 numeros sin decimales es "+sindecimal);
    }
}
