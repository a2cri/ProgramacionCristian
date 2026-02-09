package Tema5;

import java.util.*;

public class ListaCompraAmpliado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> listaCompra = new HashSet<>();
        Set<String> carroCompra = new HashSet<>();

        int opcion;
        String producto;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir producto a la lista de la compra");
            System.out.println("2. Añadir producto al carro");
            System.out.println("3. Mostrar productos en el carro");
            System.out.println("4. Mostrar productos que faltan por comprar");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Introduce producto: ");
                    producto = scanner.nextLine().trim();
                    if (listaCompra.add(producto)) {
                        System.out.println("Producto añadido a la lista.");
                    } else {
                        System.out.println("El producto ya estaba en la lista.");
                    }
                    break;

                case 2:
                    System.out.print("Introduce producto para el carro: ");
                    producto = scanner.nextLine().trim();
                    if (listaCompra.contains(producto)) {
                        carroCompra.add(producto);
                        System.out.println("Producto añadido al carro.");
                    } else {
                        System.out.println("Ese producto no está en la lista de la compra.");
                    }
                    break;

                case 3:
                    System.out.println("Productos en el carro:");
                    for (String p : carroCompra) {
                        System.out.println("- " + p);
                    }
                    break;

                case 4:
                    Set<String> faltan = new HashSet<>(listaCompra);
                    faltan.removeAll(carroCompra); // diferencia de conjuntos

                    System.out.println("Productos que faltan por comprar:");
                    for (String p : faltan) {
                        System.out.println("- " + p);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
