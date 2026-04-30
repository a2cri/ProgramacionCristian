package Tema8;

import java.util.*;

import static Tema8.Operaciones.*;

public class MainOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de Operaciones " +
                    "\n 1. Listado de Asignaturas " +
                    "\n 2. Consultar los estudiantes de una casa " +
                    "\n 3. Obtener mascota de estudiante " +
                    "\n 4. Numero de estudiantes por casa " +
                    "\n 5. Insertar nueva asignatura" +
                    "\n 6. Modificar el aula de una Asignatura" +
                    "\n 7. Eliminar asignatura" +
                    "\n 0. Salir");
            System.out.println("Selecciona una opción");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    List<Asignatura> listaAsignaturas = Operaciones.listarAsignaturas();

                    System.out.println("--- LISTADO DE TODAS LAS ASIGNATURAS ---");
                    for (Asignatura a : listaAsignaturas) {
                        System.out.println(a);
                    }
                    System.out.println("Pulsa ENTER para salir");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 2:

                    System.out.println("Introduce la casa que desea saber que alumnos tiene: ");
                    String casaBusqueda = sc.nextLine();
                    consultarEstudiante(casaBusqueda);
                    System.out.println("Pulsa ENTER para salir");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Introduce el nombre del alumno que quieres buscar(Despues se te preguntara por el apellido de este)");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce el apellido del alumno introducido anteriormente");
                    String apellido = sc.next();

                    mascotaEstudiante(nombre, apellido);
                    System.out.println("Pulsa ENTER para salir");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 4:
                    Operaciones.numeroEstudiantes();
                    System.out.println("Pulsa ENTER para salir");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("Introduce el nombre de la asignatura: ");
                    String nombreasignatura = sc.next();
                    System.out.println("Introduce el aula en la que se enseña esta asignatura: ");
                    String aulaasignatura = sc.next();

                    boolean obligatori = false;
                    boolean entradaValida = false;
                    do {
                        System.out.println("¿Es su asignatura obligatoria? Si o No");
                        String respuesta = sc.nextLine().toLowerCase();
                        if (respuesta.equals("si")) {
                            obligatori = true;
                            entradaValida = true;
                        } else if (respuesta.equals("no")) {
                            obligatori = false;
                            entradaValida = true;
                        } else {
                            System.out.println("Respuesta no válida.");
                        }
                    } while (!entradaValida);
                    Operaciones.insertarAsignatura(nombreasignatura, aulaasignatura, obligatori);
                    System.out.println("--- TABLA ACTUALIZADA TRAS INSERCIÓN ---");
                    List<Asignatura> listaPostInsert = Operaciones.listarAsignaturas();
                    for (Asignatura a : listaPostInsert) {
                        System.out.println(a);
                    }
                    System.out.println("Pulsa ENTER para salir");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 6:
                    System.out.println("Introduce el id de la asignatura que quieres modificar: ");
                    int idasignatura = sc.nextInt();
                    System.out.println("Introduce el nombre de la nueva aula (ej: Aula de Alquimia): ");
                    String nuevaaula = sc.next();
                    Operaciones.modificarAulaAsignatura(nuevaaula, idasignatura);
                    System.out.println("--- TABLA ACTUALIZADA TRAS MODIFICACIÓN ---");
                    for (Asignatura a : Operaciones.listarAsignaturas()) {
                        System.out.println(a);
                    }
                    System.out.println("Pulsa ENTER para salir");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 7:
                    System.out.println("Introduce el id de la asignatura que desea eliminar: ");
                    int idasignaturaa = sc.nextInt();
                    Operaciones.eliminarAsignatura(idasignaturaa);
                    System.out.println("Pulsa ENTER para salir");
                    sc.nextLine();
                    sc.nextLine();
                    break;
            }

        } while (opcion != 0);
    }
}
