package Tema7.LecturaYEscritura2;

import java.io.Serializable;

public class Persona implements Serializable {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n Nombre='" + nombre + "'\n Edad=" + edad + "";
    }
}
