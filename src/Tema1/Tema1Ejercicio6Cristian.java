package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio6Cristian {
    public static void main(String[] arg){
        Scanner Radio = new Scanner(System.in);
        System.out.println("Introduce el Radio del Circulo para calcular su Area");
        double R=Radio.nextDouble();
        double a = 3.14 * R * R;
        System.out.println("El Area del circulo es "+a);
    }
}
