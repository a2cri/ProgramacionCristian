package Tema7.LecturaYEscritura2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ejercicio3LeerLineaLineaContarPalabras {
    public static void main(String[] args) {
String path="src/Documentos/texto.txt";
        System.out.println(contarpalabras(path));
    }
    public static int contarpalabras(String path){
        int contador=0;
        try(BufferedReader br= new BufferedReader(new FileReader(path))){
            String linea;
            while((linea=br.readLine())!=null){
                if(!linea.isEmpty()){
                    String[] palabra= linea.trim().split(" ");
                    contador+=palabra.length;
                }
            }
        } catch (IOException e) {
            System.err.println("Error "+e.getMessage());
        }
        return contador;
    }
}
