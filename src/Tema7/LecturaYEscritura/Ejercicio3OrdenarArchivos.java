package Tema7.LecturaYEscritura;

import java.io.*;
import java.util.*;

public class Ejercicio3OrdenarArchivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el archivo para usar como lectura: ");
        String archivoentrada = sc.nextLine();
        archivoentrada = "/home/cridejgui/IdeaProjects/ProgramacionCristian/src/Documentos/"+archivoentrada;
        System.out.print("Ingrese el texto para usar como escritura: ");
        String archivosalida = sc.nextLine();
        archivosalida = "/home/cridejgui/IdeaProjects/ProgramacionCristian/src/Documentos/"+archivosalida;

        List<String> lineas= new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoentrada))) {
       String linea;
        while ((linea = br.readLine()) != null) {
            lineas.add(linea);
        }
        } catch (IOException ioe) {
            System.err.println("Error al leer el archivo: "+ ioe.getMessage());
            return;
        }

        Collections.sort(lineas);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivosalida))){
            for(String linea : lineas){
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Archivo guardado correctamente en: "+archivosalida);
        }catch(IOException ioe){
            System.err.println("Error al escribir el archivo: "+ ioe.getMessage());
            return;
        }

    }
}