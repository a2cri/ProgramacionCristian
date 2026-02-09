package Tema5;

import java.util.*;


public class Gimnasio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, UsuarioGym> Usuarios = new HashMap<>();
        int opcion;
        String decision;
        do {
            System.out.println("|--Menu del gimnasio--|");
            System.out.println("1. Dar de alta a usuario");
            System.out.println("2. Dar de baja a usuario");
            System.out.println("3. Mostrar datos de un usuario");
            System.out.println("4. Modificar datos de un usuario");
            System.out.println("5. Salir");
            System.out.println("Introduce la opcion que quieres hacer:");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                //dar alta
                case 1:
                    System.out.println("Introduce el DNI de la persona que quieres dar de alta:");
                    String dniAlta = sc.nextLine();

                    if (Usuarios.containsKey(dniAlta)) {
                        System.out.println("Ya existe un usuario registrado con este DNI");
                    } else {
                        //nombre
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        // edad
                        int edad;
                        do {
                            System.out.print("Introduce tu edad: ");
                            edad = sc.nextInt();
                            sc.nextLine(); // limpiar buffer
                            if (edad < 0) {
                                System.out.println("La edad no puede ser negativa");
                            }
                        } while (edad < 0);

                        // Añadir usuario
                        Usuarios.put(dniAlta, new UsuarioGym(nombre, edad));
                        System.out.println("Usuario dado de alta");
                    }
                    break;
                    //dar baja
                case 2:
                    System.out.println("Introduce el DNI de la persona que quieres dar de baja");
                    String dniBaja=sc.nextLine();
                    do {
                        System.out.println("Seguro quieres dar de baja a este usuario? DNI: " + dniBaja);
                        System.out.println("Porfavor introduzca si o no");
                        decision = sc.nextLine();
                    }while(!decision.equalsIgnoreCase("si") && !decision.equalsIgnoreCase("no"));
                    if (decision.equalsIgnoreCase("si")) {
                        if (Usuarios.containsKey(dniBaja)) {
                            Usuarios.remove(dniBaja);
                            System.out.println("Usuario eliminado correctamente");
                        }else{
                            System.out.println("Usuario no encontrado");
                        }
                    }else {
                        System.out.println("No hemos dado de baja al usuario");
                    }
                    break;
                    //mostrar datos
                case 3:
                    System.out.println("Introduce el DNI del usuario que quieres mostrar:");
                    String dniMostrar = sc.nextLine();

                    if (Usuarios.containsKey(dniMostrar)) {
                        UsuarioGym usuarioMostrar = Usuarios.get(dniMostrar);
                        System.out.println("Datos del usuario:");
                        System.out.println("Nombre: " + usuarioMostrar.getNombre());
                        System.out.println("Edad: " + usuarioMostrar.getEdad());
                    } else {
                        System.out.println("Usuario no encontrado");
                    }
                    break;
                    //modificar
                case 4:
                    System.out.println("Introduce el usuario que quieres modificar");
                    String dniModif=sc.nextLine();
                    if(Usuarios.containsKey(dniModif)){
                        UsuarioGym usuarioCambiado= Usuarios.get(dniModif);

                        System.out.print("Introduce el nuevo nombre: ");
                        String nuevoNombre = sc.nextLine();
                        usuarioCambiado.setNombre(nuevoNombre);
                        int nuevaEdad;
                        do {
                            System.out.print("Introduce la nueva edad: ");
                            nuevaEdad = sc.nextInt();
                            sc.nextLine(); // limpiar buffer

                            if (nuevaEdad < 0) {
                                System.out.println("La edad no puede ser negativa");
                            }
                        } while (nuevaEdad < 0);

                        usuarioCambiado.setEdad(nuevaEdad);

                        System.out.println("Usuario modificado correctamente");
                    }else{
                        System.out.println("Usuario no encontrado");
                    }
                    break;
            }
        } while (opcion != 5);
    }
}