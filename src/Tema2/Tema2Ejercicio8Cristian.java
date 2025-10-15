package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8Cristian {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu cantidad de euros");
        double euros = in.nextDouble();
        double valordolar = 1.08;
        double dolar = euros * valordolar;
        System.out.println(euros + " euros son "+dolar+" dolares");
    }
}
