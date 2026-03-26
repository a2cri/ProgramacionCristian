package Tema7.LecturaYEscritura;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio1ArchivoNum {
    public static void main(String[] args) {
        String fileName = "src/Documentos/numeros.txt";

        try (BufferedReader br= new BufferedReader(new FileReader(fileName))){
            String linea= br.readLine();
            if(linea == null){
                System.out.println("El archivo está vacio");
                return;
            }
            int primernumero= Integer.parseInt(linea);
            int max=primernumero;
            int min=primernumero;

            while((linea=br.readLine()) !=null){
                int numeroahora= Integer.parseInt(linea);

                if(numeroahora>max) max=numeroahora;
                if(numeroahora<min)min=numeroahora;
            }
            System.out.println("El numero minimo es: "+min);
            System.out.println("El numero maximo es: "+max);

        }catch(IOException e){
            System.err.println("Error al leer el archivo, "+e.getMessage());
        }catch(NumberFormatException e){
            System.err.println("Error, se encontro un dato que no es un numero");
        }
        }
    }

