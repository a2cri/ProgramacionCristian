package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio23Cristian {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int suma =0;
        int media=0;
        int num;
        System.out.println("Introduce numeros, cuando introduzcas un numero negativo, el programa te sacara una media de los numeros sin contar el negativo");
        while(true){
            num= sc.nextInt();
        if (num<0){
            break;
        }
        suma+=num;
        }
    }
}
