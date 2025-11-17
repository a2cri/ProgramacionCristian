package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static int pedirNumero(Scanner sc) {
            int numero;
            do{
                System.out.println("Introduce un numero del 1 al 10, de aqui te mostraremos su tabla de multiplicar");
                numero=sc.nextInt();
                if (numero<1 || numero>10){
                    System.out.println("Error, tiene que ser un numero del 1 al 10, que no lees o que?");
                }
            }while(numero <1 || numero >10);
            return numero;
        }
        public static void tablaMult(int numero){
        System.out.println("\n La tabla de multiplicar del "+numero+":");
        for(int i=1; i<=10; i++){
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
        }
        public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num= pedirNumero(sc);
        tablaMult(num);
        }
    }

