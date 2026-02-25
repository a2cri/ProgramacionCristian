package Ejercicio1;

import java.util.*;

public class GestorLibros {

    public static void showMenu(){
        System.out.println("|--MENU DE GESTOR DE LIBROS--|");
        System.out.println("1- Introducir libro");
        System.out.println("2- Mostrar informacion de un libro usando su ISBN");
        System.out.println("3- Modificar el género de un libro usando su ISBN");
        System.out.println("4- Buscar todos los libros de un autor");
        System.out.println("5- Salir");
        System.out.println("Introduce una opcion: ");

    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int opcion;
        String isbn;
        String nombre;
        String autor;
        int numeroPaginas;
        String genero;
        String formato;

        do{
            showMenu();
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Elegiste la opción de introducir libro");
                    System.out.println("Introduce el ISBN del libro");
                    isbn=sc.next();
                    System.out.println("Introduce el nombre del libro");
                    nombre=sc.next();
                    System.out.println("Introduce el autor del libro");
                    autor=sc.next();
                    System.out.println("Introduce el número de páginas del libro");
                    numeroPaginas=sc.nextInt();
                    System.out.println("Introduce el genero del libro");
                    genero=sc.next();

                    do {

                        System.out.println("Introduce el formato del libro. Dura, Blanda o Bolsillo");
                        formato = sc.next();
                        if (!formato.equals("Dura") && !formato.equals("Blanda") && !formato.equals("Bolsillo")){
                            System.out.println("Formato incorrecto, pon uno de los formatos que se te indica.");
                        }


                    } while (!formato.equals("Dura") && !formato.equals("Blanda") && !formato.equals("Bolsillo"));
                    new Libro( nombre,  autor,  isbn,  numeroPaginas,  genero, formato );
                    break;

                case 2:
                    System.out.println("Eligiste la opción de mostrar informacion usando ISBN");
                    System.out.println("Introduce el ISBN que deseas consultar");
                    isbn= sc.next();

                    break;
                case 3:
                    System.out.println("Elegiste la opción de modificar genero usando ISB");
                    System.out.println("Introduce el ISBN del libro al que quieres cambiar de genero");
                    isbn=sc.next();

                    break;
                case 4:
                    System.out.println("Elegiste la opción de buscar los libros de un autor");
                    System.out.println("Introduce el autor para encontrar los libros hechos por dicho autor");
                    autor=sc.next();

                    break;
                case 5:
                    System.out.println("Saliendo...");
            }
        }while(opcion !=5);
    }
}
