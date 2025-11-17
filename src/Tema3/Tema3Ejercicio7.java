package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {
        public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int numero;
            System.out.println("Introduce numeros positivos(0 para terminar)");
            do{
                do{
            numero= sc.nextInt();
                if (numero<0){
                    System.out.println("No puedes introducir numeros negativos, introduce un numero negativo (0 para terminar)");
                }
                }while (numero<0);
            if (numero>0) {
                if (esPrimo(numero)) {
                    System.out.println(numero + " es primo");
                } else {
                    System.out.println(numero + " no es primo");
                }
            }
            }while(numero !=0);
    }
}
