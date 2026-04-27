package Tema8;

import java.util.*;

import static Tema8.Operaciones.consultarEstudiante;

public class MainOperaciones {
    public static void main(String[] args) {

        List<Asignatura> listaAsignaturas = Operaciones.listarAsignaturas();

        System.out.println("--- LISTADO DE TODAS LAS ASIGNATURAS ---");
        for (Asignatura a : listaAsignaturas) {
            System.out.println(a);
        }

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce la casa que desea saber que alumnos tiene: ");
        String casaBusqueda=sc.nextLine();
        consultarEstudiante(casaBusqueda);

    }
}
