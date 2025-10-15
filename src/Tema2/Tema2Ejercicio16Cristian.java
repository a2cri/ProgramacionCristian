package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio16Cristian {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad que quieres convertir");
        double dinero = sc.nextDouble();
        System.out.println("Introduce 'D' si quieres pasar a dolares o 'E' si quieres pasar a euros");
        char opcion = sc.next().toUpperCase().charAt(0);

        while (opcion != 'D' && opcion != 'E') {
            System.out.println("Conversion no valida, vuelve a introducir 'E' o 'D'");
            opcion = sc.next().toUpperCase().charAt(0);
        }

        if (opcion == 'E') {
            double euro = dinero / 1.1;
            System.out.println("La conversion de " + dinero + " dolares a euros es de " + euro + "€");
        } else {
            double dolar = dinero * 1.1;
            System.out.println("La conversion de " + dinero + " euros a dolares es de " + dolar + "$");
        }
    }
}
