package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio24Cristian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int contadorsuspenso = 0;
        int contadorapruebo = 0;
        System.out.println("Introduce las notas de tus alumnos, cuando introduzcas un numero negativo este programa terminara y te calculara los que suspendieron");
        while (true) {
            num = sc.nextInt();
            if (num < 0) {
                break;
            }
            if (num < 5) {
                contadorsuspenso += 1;

            } else {
                contadorapruebo +=1;
            }
        }System.out.println("Han aprobado "+contadorapruebo+" personas y han suspendido "+contadorsuspenso+" personas");
    }
}