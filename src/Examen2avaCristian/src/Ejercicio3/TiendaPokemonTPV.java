package Ejercicio3;

import java.util.*;

public class TiendaPokemonTPV {

    public static void showMenu(){
        System.out.println("|--MENU TIENDA POKEMON TPV--|");
        System.out.println("1- Añadir poción al ticket");
        System.out.println("2- Añadir pokébola al ticket");
        System.out.println("3- Añadir accesorio al ticket");
        System.out.println("4- Borrar el artículo por posición del ticket");
        System.out.println("5- Mostrar todos los artículos del ticket");
        System.out.println("6- Mostrar precio total");
        System.out.println("7- Salir");
        System.out.println("Introduce una opción: ");
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int opcion;


        do{
            showMenu();
            opcion=sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Añadir pocion al ticket");
                    break;
                case 2:
                    System.out.println("Añadir pokebola al ticket");
                    break;
                case 3:
                    System.out.println("Añadir accesorio al ticket");
                    break;
                case 4:
                    System.out.println("Borrar el artículo por posición del ticket");
                    break;
                case 5:
                    System.out.println("Mostrar todos los artículos del ticket");
                    break;
                case 6:
                    System.out.println("Mostrar precio total");
                    break;
                case 7:
                    System.out.println("Saliendo....");
                    break;
            }
        }while(opcion!=7);

    }
}
