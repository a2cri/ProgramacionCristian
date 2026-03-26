package Tema7.LecturaYEscritura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6BusquedaPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "src/Documentos/";
        String rutaDic = ruta + "pi-million.txt";
        String pi= "";

        System.out.println("Ingrese el numero que quieres buscar: ");
        String numero = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(rutaDic))){
            String linea;
            while((linea = br.readLine()) != null){
                pi += linea;
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: "+e);
        }
        if(numeroveces(pi, numero)){
            System.out.println("El numero introducido si aparece");
        }else{
            System.out.println("El numero introducido no aparece");
        }
    }

    public static boolean numeroveces(String parametro1, String parametro2){
        boolean resultado = false;
        for (int i = 0; i <parametro1.length()-parametro2.length() ; i++) {
            for (int j = 0; j<parametro2.length(); j++) {
            if (parametro1.charAt(i+j) !=parametro2.charAt(j)){
                break;
            }
            if(j==parametro2.length()-1){
                resultado = true;
            }
            }

        }
        return resultado;
    }
}
