package Tema5;

import java.util.*;

public class ValorEntero {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int entero;
            try {
                System.out.println("Introduce un numero entero");
                entero = sc.nextInt();
                System.out.println("Valor introducido: " + entero);
            } catch (InputMismatchException ex) {
                System.err.println("Valor introducido incorrecto: " +ex);
            }
        }
    }
