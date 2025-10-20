package Tema2;

import javax.management.relation.RelationNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28Cristian {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random loteria = new Random();
        //para probar que funciona, cambiar arriba la linea de "numero loteria generado"
        int numeroganador= loteria.nextInt(100_000);
        System.out.println("Dime tu numero de loteria (5 caracteres)");
        int num = sc.nextInt();
        System.out.printf("Numero de loteria generado es %05d%n", numeroganador);
        if (num == numeroganador){
            System.out.print("Has ganado la loteria");
        }else{
            System.out.print("No has ganado");
        }
    }
}
