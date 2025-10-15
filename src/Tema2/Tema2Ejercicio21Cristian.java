package Tema2;

public class Tema2Ejercicio21Cristian {
    public static void main(String[] args){
        int suma = 0;
        for (int num= 2; num<=1000; num+=2){
            suma+=num;
        }
        System.out.println("La suma de todos los numeros pares de 1 al 1000 es "+suma);
    }
}
