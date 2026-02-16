package Tema4;

import java.util.Scanner;

public class PruebaCuentas {

    private static final PersonaCuenta[] personas = new PersonaCuenta[5];
    private static int numPersonas = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            // Llamada al procedimiento menu
            imprimirMenu();

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearPersona(sc); break;
                case 2:
                    crearCuenta(sc); break;
                case 3:
                    mostrarPersona(sc); break;
                case 4:
                    recibirNomina(sc); break;
                case 5:
                    pagarRecibo(sc); break;
                case 6:
                    transferencia(sc); break;
                case 7:
                    mostrarMorosos(); break;
                case 0: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }

    private static void imprimirMenu() {
        System.out.println("MENU");
        System.out.println("1. Crear persona");
        System.out.println("2. Crear cuenta y asociar");
        System.out.println("3. Mostrar datos de persona");
        System.out.println("4. Recibir nómina");
        System.out.println("5. Pagar recibo");
        System.out.println("6. Transferencia");
        System.out.println("7. Mostrar morosos");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }


    private static void crearPersona(Scanner sc) {
        if (numPersonas < 5) {
            System.out.print("Introduce DNI: ");
            String dni = sc.nextLine();
            personas[numPersonas] = new PersonaCuenta(dni);
            numPersonas++;
            System.out.println("Persona registrada con éxito.");
        } else {
            System.out.println("Error: Límite de personas alcanzado.");
        }
    }

    private static void crearCuenta(Scanner sc) {
        PersonaCuenta p = buscarPersona(sc);
        if (p != null) {
            System.out.print("Número de cuenta: ");
            String num = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();
            sc.nextLine();

            if (p.addCuenta(new Cuenta(num, saldo))) {
                System.out.println("Cuenta añadida a " + p.getDni());
            } else {
                System.out.println("Error: Esta persona ya tiene 3 cuentas.");
            }
        }
    }

    private static void mostrarPersona(Scanner sc) {
        PersonaCuenta p = buscarPersona(sc);
        if (p != null) {
            System.out.println(p.toString());
            for (int i = 0; i < 3; i++) {
                Cuenta c = p.getCuenta(i);
                if (c != null) System.out.println("  -> " + c.toString());
            }
        }
    }

    private static void recibirNomina(Scanner sc) {
        Cuenta c = buscarCuenta(sc);
        if (c != null) {
            System.out.print("Importe de la nómina: ");
            double cant = sc.nextDouble(); sc.nextLine();
            c.abonar(cant);
            System.out.println("Abono realizado.");
        }
    }

    private static void pagarRecibo(Scanner sc) {
        Cuenta c = buscarCuenta(sc);
        if (c != null) {
            System.out.print("Importe del recibo: ");
            double cant = sc.nextDouble(); sc.nextLine();
            if (c.pagarRecibo(cant)) {
                System.out.println("Pago aceptado.");
            }
        }
    }

    private static void transferencia(Scanner sc) {
        System.out.println("[ORIGEN]");
        Cuenta origen = buscarCuenta(sc);
        if (origen != null) {
            System.out.println("[DESTINO]");
            Cuenta destino = buscarCuenta(sc);
            if (destino != null) {
                System.out.print("Cantidad a transferir: ");
                double cant = sc.nextDouble(); sc.nextLine();
                if (origen.pagarRecibo(cant)) {
                    destino.abonar(cant);
                    System.out.println("Transferencia completada.");
                }
            }
        }
    }

    private static void mostrarMorosos() {
        boolean existen = false;
        for (int i = 0; i < numPersonas; i++) {
            if (personas[i].esMorosa()) {
                System.out.println("ALERTA MOROSO: " + personas[i].getDni());
                existen = true;
            }
        }
        if (!existen) System.out.println("No hay clientes con deudas.");
    }

    private static PersonaCuenta buscarPersona(Scanner sc) {
        System.out.print("Escriba DNI: ");
        String dni = sc.nextLine();
        PersonaCuenta temp = null;
        for (int i = 0; i < numPersonas; i++) {
            if (personas[i].getDni().equals(dni)) {
                temp = personas[i];
            }
        }
        if (temp == null) System.out.println("Error: Persona no encontrada.");
        return temp;
    }

    private static Cuenta buscarCuenta(Scanner sc) {
        PersonaCuenta p = buscarPersona(sc);
        Cuenta temp = null;
        if (p != null) {
            System.out.print("Escriba número de cuenta: ");
            String n = sc.nextLine();
            for (int i = 0; i < 3; i++) {
                Cuenta c = p.getCuenta(i);
                if (c != null && c.getNumeroCuenta().equals(n)) {
                    temp = c;
                }
            }
        }
        if (p != null && temp == null) System.out.println("Error: Cuenta no encontrada.");
        return temp;
    }
}