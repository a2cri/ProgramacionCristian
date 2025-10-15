package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio9Cristian {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un numero entero");
        int num1 = sc.nextInt();
        System.out.println("Indica el segundo numero entero");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("El resultado de la suma de los numeros que me has introducido es " + suma);
        int resta =num1 - num2;
        System.out.println("El resultado de la resta de los numeros que me has introducido es " +resta);
        int mult = num1 * num2;
        System.out.println("El resultado de la multiplicacion de los numeros que me has introducido es " +mult);
        if (num2!=0){
            double div = num1/num2;
            int resto= num1 % num2;
            System.out.println("El resultado de la division de los numeros que has introducido es "+ div);
            System.out.println("El resultado del resto de los numeros que has introducido es "+ resto);
        }else {
            System.out.println("No se puede dividir entre 0");
        }
    }
}