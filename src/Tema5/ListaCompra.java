package Tema5;

import java.util.*;

public class ListaCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> listaCompra = new HashSet<>();
        String producto;

        System.out.println("Introduce productos para la lista de la compra.");
        System.out.println("Escribe 'salir' para terminar.");

        do {
            System.out.print("Producto: ");
            producto = scanner.nextLine().trim();

            if (!producto.equalsIgnoreCase("salir")) {
                if (listaCompra.contains(producto)) {
                    System.out.println("El producto ya existe en la lista.");
                } else {
                    listaCompra.add(producto);
                    System.out.println("Producto añadido.");
                    for(String anadido : listaCompra){
                        System.out.print(" "+anadido+" ");
                    }
                }
            }

        } while (!producto.equalsIgnoreCase("salir"));

        System.out.println("Lista de la compra:");
        for (String lista : listaCompra) {
            System.out.print(" "+lista+" ");
        }
    }
}