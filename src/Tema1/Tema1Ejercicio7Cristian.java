package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7Cristian {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int cara;
        do {
            System.out.println("Ingrese un lado de un dado de 6 caras");
            cara = sc.nextInt();
            if (cara < 1 || cara > 6)
                System.out.println("Numero no valido, ingrese un numero del 1 al 6");
        } while (cara < 1 || cara > 6);
        int opuesta = 7 - cara;
        System.out.println("La cara opuesta al dado del numero que me has dado es " + opuesta);
    }
}
