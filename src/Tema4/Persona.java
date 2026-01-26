package Tema4;

import java.util.Scanner;

public class Persona {
    private static final int adultAge=18;
    private static final int  retired=65;
    //atributos
    private String nombre, apellido1, apellido2;
    private final String DNI;
    private int edad;
    //constructor
    public Persona(String nombre, String apellido1, String apellido2, String DNI, int edad){
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.DNI=DNI;
        this.edad=edad;
    }
    //getters setters
    //nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    //edad
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }
    //apellidos
    public String getApellido1(){
        return apellido1;
    }
    public void setApellido1(String apellido1){
        this.apellido1=apellido1;
    }
    public String getApellido2(){
        return apellido2;
    }
    public void setApellido2(String apellido2){
        this.apellido2=apellido2;
    }
    //DNI
    public String getDNI(){
        return DNI;
    }
    public boolean isAdult(){
        return edad>= adultAge;
    }
    public boolean isRetired(){
        return edad> retired;
    }
    public int ageDifference(Persona otra){
        return Math.abs(this.edad-otra.edad);
    }
    //Validador DNI
    public static boolean checkDNI(String dni) {

        if (dni == null || dni.length() != 9) return false;

        // comprobar los 8 números
        for (int i = 0; i < 8; i++) {
            char c = dni.charAt(i);
            if (c < '0' || c > '9') return false; // no es dígito
        }

        // comprobar la letra
        char letra = dni.charAt(8);
        if (letra < 'A' || letra > 'Z') return false;

        return true;
    }
    public void edaddi() {
        if (isAdult()) {
            System.out.println("El/La señorit@ " + nombre + " es mayor de edad");
        }
        if (isRetired()) {
            System.out.println("El/La señorit@ " + nombre + " es jubilad@");
        }
    }

    //mostrar info
    public void print(){
        System.out.println("DNI: "+DNI);
        System.out.println("Nombre: "+nombre);
        System.out.println("Primer apellido: "+apellido1);
        System.out.println("Segundo apellido: " + apellido2);
        System.out.println("Edad: "+edad);
    }
}