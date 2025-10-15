package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio18Cristian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        double numero = sc.nextDouble();

        if (numero < 0) {
            System.out.println("No se puede calcular un número negativo.");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es " + raiz);
        }
    }
}