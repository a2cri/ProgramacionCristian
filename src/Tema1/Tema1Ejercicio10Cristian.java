package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio10Cristian {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un numero entero");
        double num1 = sc.nextDouble();
        System.out.println("Indica el segundo numero entero");
        double num2 = sc.nextDouble();
        double suma = num1 + num2;
        System.out.println("El resultado de la suma de los numeros que me has introducido es " + suma);
        double resta =num1 - num2;
        System.out.println("El resultado de la resta de los numeros que me has introducido es " +resta);
        double mult = num1 * num2;
        System.out.println("El resultado de la multiplicacion de los numeros que me has introducido es " +mult);
        if (num2!=0){
            double div = num1/num2;
            double resto= num1 % num2;
            System.out.println("El resultado de la division de los numeros que has introducido es "+ div);
            System.out.println("El resultado del resto de los numeros que has introducido es "+ resto);
        }else {
            System.out.println("No se puede dividir entre 0");
        }
    }
}