package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {
     public static void mostrarTriangulo(char caracter, int lineas) {

        for (int i = 1; i <= lineas; i++) {
            int cantidad= 2* i-1;
            int espacios=lineas - i;
            for (int e= 1; e<=espacios; e++){
                System.out.print(" ");
            }
            for (int j = 1; j <= cantidad; j++) {
                System.out.print(caracter);
            }
            System.out.println();
            cantidad += 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter;
        int lineas;

        System.out.print("Introduce el carácter: ");
        caracter = sc.next().charAt(0);

        System.out.print("Introduce el número de líneas: ");
        lineas = sc.nextInt();

        mostrarTriangulo(caracter, lineas);
    }
}
