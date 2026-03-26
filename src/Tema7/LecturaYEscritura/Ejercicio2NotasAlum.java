package Tema7.LecturaYEscritura;

import java.io.*;
import java.util.*;

public class Ejercicio2NotasAlum {

    static class Alumno {
        String nombre;
        double media;

        public Alumno(String nombre, double media) {
            this.nombre = nombre;
            this.media = media;
        }


        @Override
        public String toString() {
            return "La media del alumno " + nombre + " es de " + media;
        }

    }
    public static void main(String[] args) {
        String fileName = "src/Documentos/alumnos_notas.txt";
        List<Alumno> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                if(linea.isBlank()) continue;
                String[]partes= linea.trim().split(" ");
                String nombreCompleto= partes[0] + " " + partes[1];

                double suma=0;
                int totalNotas =0;

                for(int i=2; i<partes.length; i++){
                    suma+= Double.parseDouble(partes[i]);
                    totalNotas++;
                }
                double media = (totalNotas>0) ? suma/totalNotas : 0;
                lista.add(new Alumno(nombreCompleto, media));
            }
            //ESTA PARTE NO SABIA BIEN COMO HACERLA, NO LA LLEGO A ENTENDER
            Collections.sort(lista, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno a1, Alumno a2) {
                    return Double.compare(a2.media, a1.media);
                }
            });
            //------------------------------------------------------------------------------------------------------------
            System.out.println("Lista de alumnos");
            for(Alumno a : lista){
                System.out.println(a.toString());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}