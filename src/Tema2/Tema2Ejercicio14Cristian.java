package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio14Cristian {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Introduce el numero de personas");
        int personas = in.nextInt();
        System.out.println("Introduce el numero de dias");
        int dias = in.nextInt();
        int noche = dias - 1;
        int precionoche = noche * personas * 15;
        if (personas > 5 && noche >= 7){
            int preciodescuento = (int) (precionoche * 0.75);
            System.out.println("EL precio sera de " + preciodescuento + "€");
        }else{
            System.out.println("El precio sera de "+precionoche+ "€");
        }
    }
}
