package Tema7.LecturaYEscritura2;

import java.io.*;
import java.util.*;

public class Ejercicio1CrearYEscribir {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Introduzca su nombre: ");
        nombre=sc.nextLine();
        System.out.println("Introduzca su edad: ");
        edad= sc.nextInt();
        guardarEnArchivo(nombre,edad);
    }

    public static void guardarEnArchivo(String palabra, int numero) {
        Scanner sc= new Scanner(System.in);
        try(BufferedWriter bw= new BufferedWriter(new FileWriter("src/Documentos/usuario.txt",true))){

            String persona= "Nombre: "+palabra+", Edad: "+numero;
            bw.write(persona);
            bw.newLine();
            System.out.println(persona);
        }catch(IOException e){
            System.err.println("Error al introducir a la persona: "+e.getMessage());
        }
    }
}
