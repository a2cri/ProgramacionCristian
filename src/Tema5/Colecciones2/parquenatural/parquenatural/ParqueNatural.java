package Tema5.parquenatural;

import java.util.*;

public class ParqueNatural {

    public void anadirAvistamiento(List<Avistamiento> lista, Avistamiento animal){
        if (animal != null){
            lista.add(animal);
            System.out.println("Avistamiento añadido correctamente");
        }
    }

    public void avistamiendosDesdeLasOcho(List<Avistamiento> lista){
        System.out.println("Avistamientos desde las 8:00");
        for (Avistamiento a : lista){
            if ( a.getHora() >= 8){
                System.out.println(a.toString());
            }
        }
    }

    public void mostrarAvistamientosNocturnos(List<Avistamiento> lista){
        System.out.println("Avistamientos nocturnos (8:00-20:00)");
        for (Avistamiento a : lista){
            if (a.getHora() <= 8 || a.getHora() >= 20){
                System.out.println(a.toString());
            }
        }
    }

    public void mostrarPajaros(List<Avistamiento> lista){
        System.out.println("Listado de Pajaros: ");
        for (Avistamiento a : lista){
            if (a instanceof Pajaro){
                System.out.println("Pajaros avistados: " + a);
            }
        }
    }

    public void mostrarSerpientes(List<Avistamiento> lista){
        System.out.println("Listado de Serpientes: ");
        for (Avistamiento a : lista){
            if (a instanceof Serpiente){
                System.out.println("Serpientes avistadas: " + a);
            }
        }
    }

    public void mostrarManadaLobos(List<Avistamiento> lista){
        System.out.println("Listado de Manadas: ");
        for (Avistamiento a : lista){
            if (a instanceof ManadaLobos){
                System.out.println("Manadas avistadas: " + a);
            }
        }
    }
}