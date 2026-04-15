package Tema7.LecturaYEscritura2;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio6ArrayPersonas {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 18));
        personas.add(new Persona("Jaun", 20));
        personas.add(new Persona("Nauj", 21));
        personas.add(new Persona("Nuaj", 22));
       guardarPersonas(personas);
       leerPersonas(personas);

    }
    public static void guardarPersonas(ArrayList<Persona> personas) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Documentos/personas.dat"))) {
            oos.writeObject(personas);
            System.out.println("Se guardo correctamente");
        }catch(IOException ioe){
            System.err.println("Error al guardar datos "+ioe.getMessage());
        }
    }
    public static void leerPersonas(ArrayList<Persona> personas) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Documentos/personas.dat"))) {
         ArrayList<Persona> persona= (ArrayList<Persona>) ois.readObject();
         for(Persona p: persona){
             System.out.println(p);
         }
           /* for (int i = 0; i < personas.size(); i++) {
                System.out.println(personas.get(i).toString());
            */
        }catch(IOException | ClassNotFoundException e){
            System.err.println("Error al leer datos "+e.getMessage());
        }
    }
}
