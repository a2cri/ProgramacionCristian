package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static void showMenu(){
        System.out.println("--CONVERSION DE MONEDA--");
        System.out.println("Elige la opción que desea hacer");
        System.out.println("1. Convertir Euros a Dolares");
        System.out.println("2. Convertir de Dolares a Euros");
        System.out.println("0. Salir del programa");
    }
    public static double euro2dolar(double euros){
        double tasaCambio= 1.08;
        return euros * tasaCambio;
    }
    public static double dolar2euro(double dolares){
        double tasaCambio=0.93;
        return dolares * tasaCambio;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int opcionej;
        double cantidad;

        do {
            showMenu();
            opcionej=sc.nextInt();
            switch(opcionej){
                case (1):
                    System.out.println("Introduce la cantidad en euros");
                    cantidad= sc.nextDouble();
                    System.out.printf("%.2f euros son %.2f dolares.%n", cantidad, euro2dolar(cantidad));
                    break;
                case (2):
                    System.out.println("Introduce la cantidad en dolares");
                    cantidad=sc.nextDouble();
                    System.out.printf("%.2f dolares son %.2f euros.%n", cantidad, dolar2euro(cantidad));
                    break;
                case (0):
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(opcionej !=0);
    }

}
