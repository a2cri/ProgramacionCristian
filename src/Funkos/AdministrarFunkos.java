package Funkos;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdministrarFunkos {

    public static void main(String[] args) {
        String path = "C:\\Users\\Usuario\\IdeaProjects\\programacionclase\\funkos.csv";
        ArrayList<Funko> listaFunkos = cargaFunkos(path);

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- MENÚ FUNKOS ---");
            System.out.println("1. Añadir funko");
            System.out.println("2. Borrar funko");
            System.out.println("3. Mostrar todos");
            System.out.println("4. Funko más caro");
            System.out.println("5. Media de precios");
            System.out.println("6. Agrupar por modelo");
            System.out.println("7. Funkos de 2023");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    añadirFunko(listaFunkos, path, sc);
                    break;
                case 2:
                    borrarFunko(listaFunkos, path, sc);
                    break;
                case 3:
                    mostrarTodos(listaFunkos);
                    break;
                case 4:
                    mostrarMasCaro(listaFunkos);
                    break;
                case 5:
                    mostrarMedia(listaFunkos);
                    break;
                case 6:
                    agruparPorModelo(listaFunkos);
                    break;
                case 7:
                    funkos2023(listaFunkos);
                    break;
                case 0:
                    System.out.println("Cerrando el programa");
                    break;
            }
        } while (opcion != 0);
    }

    public static ArrayList<Funko> cargaFunkos(String path) {
        ArrayList<Funko> funkos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] values = linea.split(",");
                double precio = Double.parseDouble(values[3]);
                LocalDate fecha = LocalDate.parse(values[4]);
                Funko f = new Funko(values[0], values[1], values[2], precio, fecha);
                funkos.add(f);
            }
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
        return funkos;
    }

    public static void guardaFunkos(ArrayList<Funko> funkos, String path) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {


            bw.write("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");
            bw.newLine();

            for (Funko f : funkos) {
                bw.write(f.getCod() + "," + f.getNombre() + "," + f.getModelo() + "," + f.getPrecio() + "," + f.getFecha());
                bw.newLine();
            }

        } catch (IOException ioe) {
            System.err.println(ioe);
        }

    }
    public static void añadirFunko(ArrayList<Funko> funkos, String path, Scanner sc) {
        System.out.println("Introduce el COD: ");
        String cod = sc.next();
        System.out.println("Introduce el nombre: ");
        String nombre = sc.next();
        System.out.println("Introduce el modelo: ");
        String modelo = sc.next();
        System.out.println("Introduce el precio: ");
        double precio = sc.nextDouble();
        System.out.println("Introduce la fecha (yyyy-mm-dd): ");
        LocalDate fecha = LocalDate.parse(sc.next());

        Funko f= new Funko(cod, nombre, modelo, precio, fecha);
        funkos.add(f);
        guardaFunkos(funkos, path);
    }

    public static void borrarFunko(ArrayList<Funko> funkos, String path, Scanner sc) {
        System.out.println("Introduce el nombre del funko a borrar: ");
        String nombre = sc.next();

        for (Funko f : funkos) {
            if (f.getNombre().equals(nombre)) {
                funkos.remove(f);
                guardaFunkos(funkos, path);
                System.out.println("Funko borrado correctamente");
                return;
            }
        }
        System.out.println("Funko no encontrado");
    }

    public static void mostrarTodos(ArrayList<Funko> funkos) {
        for (Funko f : funkos) {
            System.out.println(f);
        }
    }

    public static void mostrarMasCaro(ArrayList<Funko> funkos) {
        Funko masCaro = funkos.get(0);
        for (Funko f : funkos) {
            if (f.getPrecio() > masCaro.getPrecio()) {
                masCaro = f;
            }
        }
        System.out.println(masCaro);
    }

    public static void mostrarMedia(ArrayList<Funko> funkos) {
        double suma = 0;
        for (Funko f : funkos) {
            suma += f.getPrecio();
        }
        System.out.printf("Media= " + suma / funkos.size());
    }
    public static void agruparPorModelo(ArrayList<Funko> funkos) {
        Map<String, ArrayList<Funko>> mapa = new HashMap<>();

        for (Funko f : funkos) {
            // Si el modelo no existe en el mapa, añádelo con una lista vacía
            if (!mapa.containsKey(f.getModelo())) {
                mapa.put(f.getModelo(), new ArrayList<>());
            }
            // Añade el funko a la lista de su modelo
            mapa.get(f.getModelo()).add(f);
        }

        // Recorre el mapa e imprime cada grupo
        for (String modelo : mapa.keySet()) {
            System.out.println(modelo);
            for (Funko f : mapa.get(modelo)) {
                System.out.println(f);
            }
        }
    }
    public static void funkos2023(ArrayList<Funko> funkos) {
        for (Funko f : funkos) {
            if (f.getFecha().getYear()==2023){
                System.out.println(f);
            }
        }
    }
}