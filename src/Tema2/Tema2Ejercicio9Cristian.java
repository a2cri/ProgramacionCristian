package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9Cristian {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu cantidad de dolares");
        double dolar = in.nextDouble();
        double valordolar = 1.08;
        double euros = dolar / valordolar;
        System.out.println(dolar + " dolares son "+euros+" dolares");
    }
}

