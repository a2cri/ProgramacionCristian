package Tema3;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Tema3Ejercicio2 {
    public static boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tema3Ejercicio1.numberSign(3);
        Tema3Ejercicio1.main(args);
        int age;
        boolean adulto=false;
        do {
            System.out.println("Introduce tu edad y te dire si eres mayor o menor de edad");
            age = sc.nextInt();
            adulto= isAdult(age);
        }while(age<=0);
        if (adulto){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        sc.close();
    }
}