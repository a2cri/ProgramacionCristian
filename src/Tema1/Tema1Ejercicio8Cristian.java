package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio8Cristian {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un numero entero");
        int num1 = sc.nextInt();
        System.out.println("Indica el segundo numero entero");
        int num2 = sc.nextInt();
        if (num1>num2) {
            System.out.println("El mayor es " + num1);
        }else if (num2>num1){
            System.out.println("El mayor es "+num2);
        }else {
            System.out.println("Los dos son iguales");
        }
    }
}