package Tema7.LecturaYEscritura2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2LeerYMostrar {
    public static void main(String[] args) {
        String path="src/Documentos/usuario.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            String linea;
            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
        }catch(IOException e){
            System.err.println("Error "+e.getMessage());
        }
    }
}
