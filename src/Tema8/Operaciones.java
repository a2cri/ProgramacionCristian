package Tema8;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operaciones {
    public static List<Asignatura> listarAsignaturas() {
        List<Asignatura> lista = new ArrayList<>();
        String sql = "SELECT id_asignatura, nombre_asignatura, aula, obligatoria FROM Asignatura";


        try (Connection con = DriverManager.getConnection("jdbc:postgresql://ad-postgres.c7dcxanpavyz.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678");
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Asignatura asig = new Asignatura();
                asig.setIdAsignatura(rs.getInt("id_asignatura"));
                asig.setNombreAsignatura(rs.getString("nombre_asignatura"));
                asig.setAula(rs.getString("aula"));
                asig.setObligatoria(rs.getBoolean("obligatoria"));


                lista.add(asig);
            }

        } catch (SQLException e) {
            System.err.println("Error al listar asignaturas: " + e.getMessage());
        }

        return lista;
    }

    public static void consultarEstudiante(String nombreCasa) {

        String sql="SELECT nombre, apellido FROM Estudiante JOIN Casa ON Estudiante.id_casa=Casa.id_casa WHERE  nombre_casa= ?";

        try (Connection con = DriverManager.getConnection("jdbc:postgresql://ad-postgres.c7dcxanpavyz.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678");
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombreCasa);
            try (ResultSet rs = ps.executeQuery()) {
                boolean encontrado = false;
                while (rs.next()) {
                    encontrado = true;
                    System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
                }
                if (!encontrado) {
                    System.out.println("No hay alumnos en la casa: "+nombreCasa);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}