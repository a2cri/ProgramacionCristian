package Tema2;

import java.util.Scanner;
public class Tema2Ejercicio12Cristian {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num1 = in.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = in.nextDouble();
        System.out.println("Introduce el tercer numero");
        double num3 = in.nextDouble();

        if (num1>=num2 && num1>=num3) {
            if (num2 > num3) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        } else if (num2>=num1 && num2>=num3) {
            if (num1>num3) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        } else if (num3>=num1 && num3>=num2) {  // Muevo este bloque fuera del bloque de num2
            if (num1>num2) {
                System.out.println(num3 + "," + num1 + "," + num2);
            } else {
                System.out.println(num3 + "," + num2 + "," + num1);
            }
        }
    }
}
