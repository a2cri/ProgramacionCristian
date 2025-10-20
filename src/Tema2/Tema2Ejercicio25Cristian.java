package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio25Cristian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Introduce un número entero para hacer su factorial:");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                break;
            } else {
                System.out.println("Debes introducir un número entero.");
                sc.next();
            }
        }

        if (num <= 0) {
            System.out.println("No se puede hacer factorial de números negativos o de 0.");
        } else {
            long factorial = 1;
            for (int num2 = 1; num2 <= num; num2++) {
                factorial *= num2;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }
    }
}
