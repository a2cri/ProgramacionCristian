package Tema7.LecturaYEscritura2;

import java.io.*;
import java.util.Scanner;

public class Ejercicio4SerializarObjetoPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce el edad");
        int edad = sc.nextInt();
        Persona p= new Persona(nombre, edad);
        try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("src/Documentos/persona.dat"))){

            oos.writeObject(p);

        }catch(IOException e){
            System.out.println("Error al escribir la persona "+e.getMessage());
        }
    }
}
