package Tema4;

import java.util.Scanner;

public class RelojMain {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int hora, minuto, segundo;
        Reloj r1=new Reloj();
        do {
            System.out.println("Introduce la hora, minuto y segundo de r2:");
            System.out.print("Hora (0-23): ");
            hora = sc.nextInt();
            System.out.print("Minuto (0-59): ");
            minuto = sc.nextInt();
            System.out.print("Segundo (0-59): ");
            segundo = sc.nextInt();
            if (hora<0 || hora>23 || minuto<0 || minuto>59 || segundo<0 || segundo>59){
                System.out.println("Error, introduce los numeros que corresponden");
            }
        }while(hora<0 || hora>23 || minuto<0 || minuto>59 || segundo<0 || segundo>59);

        Reloj r2 = new Reloj(hora, minuto, segundo);
        int formato;
        do {
            System.out.println("Que formato de hora quieres, 12h o 24h");
            formato = sc.nextInt();
        }while (formato !=12 && formato !=24);
        if (formato==12){
            r1.setFormato24horas(false);
            r2.setFormato24horas(false);
        }
        else{
            r1.setFormato24horas(true);
            r2.setFormato24horas(true);
        }
        r1.mostrarHora();
        r2.mostrarHora();
    }
}