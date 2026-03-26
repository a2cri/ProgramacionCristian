package Tema7;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OperacionesPath {

    public static void main(String[] args) throws IOException {


        String miRuta = "/home/cridejgui/Escriptori/";

        // Para obtener un objeto Path utilizamos el método Path.of() o Paths.get()
        Path unPath = Path.of(miRuta);
        Path otroPath = Paths.get(miRuta);

        // Obtener el nombre de un fichero y unirlo a la ruta de otro directorio
        Path unFile = Path.of("/usr/local/file.txt");
        Path unDir = Path.of(miRuta);
        System.out.println(unDir.resolve(unFile.getFileName())+"\n");

        // Relativizar una ruta respecto a otra
        Path otroFile = Path.of(miRuta + "test/archivo.txt");
        Path otroDir = Path.of(miRuta);
        System.out.println(otroDir.relativize(otroFile));

        // --- OPERACIONES CON FILES ---

        // Crear un directorio y sus ascendentes (Cambiado a tu escritorio para que no dé AccessDenied)
        Files.createDirectories(Path.of(miRuta + "nueva_carpeta/sub/nor/mal/"));

        // Imprimir el contenido de un directorio
        Files.list(Path.of(miRuta)).forEach(System.out::println);

        // Obtener la lista de los contenidos anidados (Cambiado .toList() por .collect)
        List<Path> list = Files.walk(Paths.get(miRuta)).collect(Collectors.toList());

        // Imprimir los ficheros regulares ordenados por tamaño
        Files.list(Path.of(miRuta))
                .filter(Files::isRegularFile)
                .sorted(Comparator.comparingLong(path -> {
                    try {
                        return Files.size(path);
                    } catch (IOException e) {
                        return 0L; // Evitamos el RuntimeException para que no se corte el programa
                    }
                }))
                .forEach(System.out::println);

        // --- EL RESTO DEL CÓDIGO SIGUE IGUAL PERO USANDO TU RUTA ---

        // Obtener la fecha de la última modificación (Asegúrate de tener un archivo llamado "prueba.iml")
        Path file = Path.of(miRuta + "prueba.iml");
        if (Files.exists(file)) {
            LocalDate time = LocalDate.parse(Files.getLastModifiedTime(file).toString().substring(0,10));
            System.out.println("Año: " + time.getYear());
        }

        // Navegación entre rutas
        Path relative = Path.of(".");
        Path absolute = relative.toAbsolutePath().normalize();
        System.out.printf("Relative: %s%n", relative);
        System.out.printf("Absolute: %s%n", absolute);

        // Operaciones con ficheros (Copiado/Movido/Borrado en tu escritorio)
        Path original = Path.of(miRuta + "prueba.iml");
        Path backup = Path.of(miRuta + "prueba.iml.backup");
        Path rename = Path.of(miRuta + "prueba.iml.backup.1");

        if (Files.exists(original)) {
            Files.copy(original, backup, StandardCopyOption.REPLACE_EXISTING);
            Files.move(backup, rename, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(rename);
        }
    }
}