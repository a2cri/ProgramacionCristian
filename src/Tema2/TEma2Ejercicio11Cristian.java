package Tema2;

import java.util.Scanner;

public class TEma2Ejercicio11Cristian {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = in.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = in.nextInt();
        System.out.println("Introduce el ultimo numero");
        int num3 = in.nextInt();
        if ((num2==num1+1 && num3==num2+1)||(num2==num1-1&& num3==num2-1)){
            System.out.println("Los numeros son consecutivos");
        }else{
            System.out.println("Los numeros no son consecutivos");
        }
    }
}
