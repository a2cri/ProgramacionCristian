package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2Cristian {
        public static void main(String[] args){
            Scanner in= new Scanner(System.in);
            System.out.println("Introduce la base del rectangulo");
            double base = in.nextDouble();
            System.out.println("Introduce la altura");
            double altura= in.nextDouble();
            double superficie= base * altura;
            double perimetro= 4 * (altura+base);
            System.out.println("La superficie del cuadrado es " + superficie);
            System.out.println("El perimetro del cuadrado es "+perimetro);
        }
}
