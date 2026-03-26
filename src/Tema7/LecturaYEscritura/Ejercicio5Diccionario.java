package Tema7.LecturaYEscritura;
import java.io.*;
import java.util.*;
public class Ejercicio5Diccionario {
    public static void main(String[] args) {
        String ruta = "src/Documentos/";
        String rutaDic = ruta + "diccionario.txt";
        String rutacarpeta = ruta + "Diccionario/";



        File carpeta = new File(rutacarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdir();
            System.out.println("Ruta carpeta: " + carpeta.getAbsolutePath());
            System.out.println("Carpeta creada");
        }
        List<String> palabras = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(rutaDic))) {
            String linea;
            while((linea= br.readLine())!=null){
                if(!linea.isBlank())palabras.add(linea);
            }
        }catch(IOException e){
            System.out.println("Error al leer Diccionario: " + e.getMessage());
        }
        for(String palabra : palabras){
        char letra= Character.toUpperCase(palabra.charAt(0));
            String archivosalida= rutacarpeta + letra + ".txt";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivosalida, true))){
                bw.write(palabra);
                bw.newLine();
            }catch(IOException e){
                System.out.println("Error al escribir Diccionario: " + e.getMessage());
            }
        }

    }
}
