package Tema5;

import java.util.ArrayList;
import java.util.Scanner;


public class Banco {

    private ArrayList<UsuarioBanco> cola;
    private Scanner sc;

    public Banco() {
        cola = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    private boolean dniExiste(String dni) {
        for (UsuarioBanco u : cola) {
            if (u.getDNI().equalsIgnoreCase(dni)) {
                return true;
            }
        }
        return false;
    }

    public void añadirUsuario() {
        System.out.print("Introduce nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // limpia buffer

        System.out.print("Introduce DNI: ");
        String dni = sc.nextLine();

        if (dniExiste(dni)) {
            System.out.println("Ya existe un usuario con ese DNI.");
            return;
        }

        UsuarioBanco usuario = new UsuarioBanco(nombre, edad, dni);
        cola.add(usuario);

        System.out.println("Usuario añadido correctamente a la cola.");
    }


    public void atenderUsuario() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }

        UsuarioBanco atendido = cola.remove(0);
        System.out.println("Usuario atendido: " + atendido.mostrarDatos());
    }

    // Quitar usuario por posición
    public void quitarUsuarioPorPosicion() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }

        mostrarCola();
        System.out.print("Introduce la posición del usuario a eliminar: ");
        int posicion = sc.nextInt();
        sc.nextLine(); // limpia buffer

        if (posicion < 0 || posicion >= cola.size()) {
            System.out.println("Posición incorrecta.");
            return;
        }

        UsuarioBanco eliminado = cola.remove(posicion);
        System.out.println("Usuario eliminado: " + eliminado.mostrarDatos());
    }

    // Mostrar cola
    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }

        for (int i = 0; i < cola.size(); i++) {
            System.out.println(i +1 + " -> " + cola.get(i).mostrarDatos());
        }
    }

    // Menu
    public void menu() {
        int opcion;

        do {
            System.out.println("\n--- BANCO ---");
            System.out.println("1. Añadir usuario a la cola");
            System.out.println("2. Atender usuario");
            System.out.println("3. Eliminar usuario por posicion");
            System.out.println("4. Mostrar cola");
            System.out.println("0. Salir");
            System.out.print("Elige opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpia buffer

            switch (opcion) {
                case 1:
                    añadirUsuario();
                    break;
                case 2:
                    atenderUsuario();
                    break;
                case 3:
                    quitarUsuarioPorPosicion();
                    break;
                case 4:
                    mostrarCola();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);
    }

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.menu();
    }
}