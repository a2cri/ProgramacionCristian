package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio3 {
    public static boolean validRadius(double radius){
        if (radius>0){
            return true;
        }else {
            return false;
        }
    }
    public static double calculateCirclePerimeter(double radius){
        return 2 * Math.PI * radius;
    }
    public static double calculateCircleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double radius;
        do {
            System.out.println("Introduce el radio");
            radius = sc.nextDouble();
            if (!validRadius(radius)){
                System.out.println("El radio debe ser superior a 0");
            }
        }while(!validRadius(radius));
        double perimetro = calculateCirclePerimeter(radius);
        double area = calculateCircleArea(radius);
        System.out.println("El radio que has introdicudo es "+radius);
        System.out.println("El perimetro del radio que has introducido es "+perimetro);
        System.out.println("El area del radio que has introducido es "+area);
        sc.close();
    }
}
