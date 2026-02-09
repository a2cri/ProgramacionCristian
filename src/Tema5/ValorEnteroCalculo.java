package Tema5;

import java.util.*;


public class ValorEnteroCalculo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try {
            System.out.println("Introduce el primer valor: ");
            int pv= sc.nextInt();
            System.out.println("Introduce el segundo valor: ");
            int sv= sc.nextInt();
            int division = pv / sv;
            int suma = pv + sv;
            int resta = pv - sv;
            int multiplicar = pv * sv;
            System.out.println("Division: " + division);
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicacion: " + multiplicar);

        } catch (InputMismatchException Mismatch) {
            System.err.println("Error: Debes introducir numeros enteros. " +Mismatch);
        }catch (ArithmeticException Ari) {
            System.err.println("Error: No se puede dividir entre cero. "+Ari);
        }
    }
}
