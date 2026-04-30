package Tema8;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Operaciones {
//Actividad 0
    public static List<Asignatura> listarAsignaturas() {
        List<Asignatura> lista = new ArrayList<>();
        String sql = "SELECT * FROM Asignatura";


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
    //Actividad 1
    public static void consultarEstudiante(String nombreCasa) {

        String sql = "SELECT nombre, apellido FROM Estudiante JOIN Casa ON Estudiante.id_casa=Casa.id_casa WHERE  nombre_casa= ?";

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
                    System.out.println("No hay alumnos en la casa: " + nombreCasa);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Actividad 2
    public static void mascotaEstudiante(String nombre, String apellido) {
        String sql = "SELECT m.nombre_mascota FROM Mascota m JOIN Estudiante e ON m.id_estudiante=e.id_estudiante WHERE e.nombre= ? AND e.apellido=?";

        try (Connection con = DriverManager.getConnection("jdbc:postgresql://ad-postgres.c7dcxanpavyz.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678");
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String nombreMascota = rs.getString("nombre_mascota");
                    System.out.println("La mascota de " + nombre + " " + apellido + " es: " + nombreMascota);
                } else {
                    System.out.println(nombre + " " + apellido + " no tiene mascotas");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Actividad 3
    public static void numeroEstudiantes() {
        String sql = "SELECT Casa.nombre_casa, COUNT(Estudiante.id_estudiante) AS total " +
                "FROM Casa " +
                "LEFT JOIN Estudiante ON Casa.id_casa = Estudiante.id_casa " +
                "GROUP BY Casa.nombre_casa";
        try (Connection con = DriverManager.getConnection("jdbc:postgresql://ad-postgres.c7dcxanpavyz.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678");
             PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String casa = rs.getString("nombre_casa");
                int total = rs.getInt("total");
                System.out.println(casa + " :" + total);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //Actividad 4
    public static void insertarAsignatura(String nombre, String aula, boolean obligatoria) {

        String sql="INSERT INTO Asignatura(nombre_asignatura, aula, obligatoria) VALUES ( ?, ?, ?)";
       try(Connection con= DriverManager.getConnection("jdbc:postgresql://ad-postgres.c7dcxanpavyz.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678");
        PreparedStatement ps= con.prepareStatement(sql)){
           ps.setString(1, nombre);
           ps.setString(2, aula);
           ps.setBoolean(3, obligatoria);

           int filasAfectadas= ps.executeUpdate();
           if (filasAfectadas>0) {
               System.out.println("Asignatura "+nombre+" insertada correctamente");
           }
       } catch (SQLException ex){
           System.out.println(ex.getMessage());
       }
    }

    public static void modificarAulaAsignatura(String aulaNueva, int idAsignatura){

        String sql= "UPDATE Asignatura SET aula=? WHERE id_asignatura=?";
        try(Connection con2= DriverManager.getConnection("jdbc:postgresql://ad-postgres.c7dcxanpavyz.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678");
            PreparedStatement ps= con2.prepareStatement(sql)) {
            ps.setString(1, aulaNueva);
            ps.setInt(2, idAsignatura);
            int filasAfectadas= ps.executeUpdate();
            if (filasAfectadas>0) {
                System.out.println("El aula de la asignatura con ID " + idAsignatura + " ha sido cambiada a: " + aulaNueva);
            }else {
                System.out.println("No se encontro ninguna asignatura con el id: "+idAsignatura);
            }
        }catch (SQLException ex){
            System.out.println("Error al modificar asignatura "+ex.getMessage());
        }
    }

    public static void eliminarAsignatura(int idAsignatura){
        String sql= "DELETE FROM Asignatura WHERE id_asignatura=?";
        try(Connection con2= DriverManager.getConnection("jdbc:postgresql://ad-postgres.c7dcxanpavyz.us-east-1.rds.amazonaws.com:5432/hogwarts", "postgres", "12345678");
        PreparedStatement ps= con2.prepareStatement(sql)){
            ps.setInt(1,idAsignatura);

            int filasAfectadas= ps.executeUpdate();
            if (filasAfectadas>0) {
                System.out.println("Asignatura eliminada correctamente");
            }else {
                System.out.println("No se encontro ninguna asignatura identificada por el id "+idAsignatura);
            }
        }catch (SQLException ex){
            System.out.println("Error al eliminar asignatura "+ex.getMessage());
        }
    }

}