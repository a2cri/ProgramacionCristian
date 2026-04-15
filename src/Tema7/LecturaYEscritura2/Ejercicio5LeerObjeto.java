package Tema7.LecturaYEscritura2;
import Tema7.LecturaYEscritura2.Ejercicio4SerializarObjetoPersona;
import Tema7.LecturaYEscritura2.Persona;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ejercicio5LeerObjeto {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Documentos/persona.dat"))){
            Persona p= (Persona) ois.readObject();
            System.out.println("Objeto leido "+p);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: "+e);
        }
    }
}
