package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3Cristian {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Introduce la base del triangulo");
        double base = in.nextDouble();
        System.out.println("Introduce la altura");
        double altura= in.nextDouble();
        double superficie= (base * altura) / 2;
        System.out.println("La superficie del cuadrado es " + superficie);
    }
}

