package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17Cristian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 0 para cuadrado, 1 para rectángulo, 2 para triángulo:");
        int opcion = sc.nextInt();

        if (opcion == 0) {
            System.out.println("Introduce el lado del cuadrado:");
            double lado = sc.nextDouble();
            double area = lado * lado;
            double perimetro = 4 * lado;
            System.out.println("Superficie: " + area);
            System.out.println("Perímetro: " + perimetro);
        } else if (opcion == 1) {
            System.out.println("Introduce la base del rectángulo:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura del rectángulo:");
            double altura = sc.nextDouble();
            double area = base * altura;
            double perimetro = 2 * (base + altura);
            System.out.println("Superficie: " + area);
            System.out.println("Perímetro: " + perimetro);
        } else if (opcion == 2) {
            System.out.println("Introduce la base del triángulo:");
            double base = sc.nextDouble();
            System.out.println("Introduce la altura del triángulo:");
            double altura = sc.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("Superficie: " + area);
        } else {
            System.out.println("Error: opción no válida.");
        }
    }
}