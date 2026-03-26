package Tema7.LecturaYEscritura;

import java.io.*;
import java.util.*;

public class Ejercicio7Estadisticas {
    public static void main(String[] args) {
        int numeroLineas=0;
        int numeroPalabras=0;
        int numeroCaracteres=0;

        HashMap<String,Integer> palabrasComunes = new HashMap<String,Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. coplas_manrique\n2. fuenteovejuna_lopevega\n3. lazarillo\n4. quijote_cervantes\n5. vida_unamuno");
        System.out.println("Introduce el libro que quieres analizar: ");
        String nombre= sc.next();
        String ruta= "src/Documentos/Libros/"+nombre+".txt";
        try(BufferedReader br= new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea = br.readLine())!=null){
                numeroLineas++;
                numeroCaracteres += linea.length();

                String[] palabras = linea.toLowerCase().split("[^a-záéíóúüñ]+");
                for(String palabra : palabras){
                    if(!palabra.isEmpty()){
                        numeroPalabras++;
                        palabrasComunes.put(palabra, palabrasComunes.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
        }catch(IOException ioe){
            System.out.println("Error al abrir el archivo: "+ioe);
        }

        System.out.println("===== ESTADÍSTICAS DE: " + nombre + " =====");
        System.out.println("Número de líneas:     " + numeroLineas);
        System.out.println("Número de palabras:   " + numeroPalabras);
        System.out.println("Número de caracteres: " + numeroCaracteres);

        System.out.println("\n--- TOP 10 PALABRAS MÁS COMUNES ---");
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(palabrasComunes.entrySet());
        lista.sort((a, b) -> b.getValue() - a.getValue());
        for(int i = 0; i < 10; i++){
            System.out.println(lista.get(i).getKey() + " -> " + lista.get(i).getValue() + " veces");
        }
    }
}
