package Tema7.LecturaYEscritura;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4NombreApellidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta="/home/cridejgui/IdeaProjects/ProgramacionCristian/src/Documentos/";

        System.out.print("Introduce cuantas personas quieres generar con nombre aleatorio: ");
        int numero= sc.nextInt();

        System.out.print("En que archivo quieres introducir a las personas: ");
        String archivosalida= ruta+sc.next()+".txt";

        List<String> nombres= new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(ruta + "usa_nombres.txt"))){
                String linea;
                while((linea= br.readLine())!=null){
                    if(!linea.isBlank())nombres.add(linea);
            }
        }catch (IOException ioe){
            System.out.println("Error al leer nombres: "+ioe.getMessage());
        }

        List<String> apellidos= new ArrayList<>();
        try(BufferedReader br= new BufferedReader(new FileReader(ruta+"usa_apellidos.txt"))){
            String linea;
            while((linea= br.readLine())!=null){
                if(!linea.isBlank())apellidos.add(linea);
            }
        }catch (IOException ioe){
            System.out.println("Error al leer apellidos: "+ioe.getMessage());
        }

        Random rm= new Random();
        try(BufferedWriter bw= new BufferedWriter(new FileWriter(archivosalida, true))){
            for(int i=0;i<numero;i++){
                String nombre= nombres.get(rm.nextInt(nombres.size()));
                String apellido=apellidos.get(rm.nextInt(apellidos.size()));
                String persona= nombre + " " +apellido;
                bw.write(persona);
                bw.newLine();
                System.out.println(persona);
            }
            System.out.println(numero+" personas añadidas en "+archivosalida);
        }catch(IOException ioe){
            System.out.println("Error al escribir: "+ioe.getMessage());
        }
    }
}
