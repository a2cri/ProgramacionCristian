package Tema8;

import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args) {
        //Saco la consulta fuera, para poderla usar en el PreparedStatement del try
        String sentenciaSQL = "SELECT nombre, apellido " +
                "FROM Profesor";

        String sentenciaSQL2 = "SELECT nombre, apellido " +
                "FROM Estudiante " +
                "WHERE fecha_nacimiento > '01-01-1980'";

        String sentenciaSQL3 = "SELECT nombre, apellido " +
                "FROM Estudiante " +
                "ORDER BY fecha_nacimiento ASC";

        String sentenciaSQL4 = "SELECT nombre_casa, COUNT(*) AS num_estudiantes " +
                "FROM Casa " +
                "JOIN Estudiante ON Casa.id_casa = Estudiante.id_casa " +
                "GROUP BY nombre_casa";

        String sentenciaSQL5 = "SELECT AVG(calificacion) AS media, MAX(calificacion) AS maxima " +
                "FROM Estudiante_Asignatura " +
                "JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura " +
                "WHERE nombre_asignatura = 'Pociones'";

        String sentenciaSQL6 = "SELECT DISTINCT anyo_curso " +
                "FROM Estudiante";

        String sentenciaSQL7 = "SELECT nombre " +
                "FROM Estudiante " +
                "WHERE apellido LIKE 'P%'";

        String sentenciaSQL8 = "SELECT nombre, apellido " +
                "FROM Estudiante " +
                "WHERE anyo_curso IN (4, 5)";

        String sentenciaSQL9 = "SELECT nombre, apellido " +
                "FROM Estudiante " +
                "JOIN Casa ON Estudiante.id_casa = Casa.id_casa " +
                "WHERE anyo_curso = 5 " +
                "AND (nombre_casa = 'Gryffindor' OR nombre_casa = 'Slytherin')";

        String sentenciaSQL10 = "SELECT * " +
                "FROM Estudiante " +
                "ORDER BY fecha_nacimiento LIMIT 5";

        String sentenciaSQL11 = "SELECT nombre " +
                "FROM Estudiante " +
                "JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante " +
                "JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura " +
                "WHERE nombre_asignatura='Vuelo' AND calificacion>=8";

        String sentenciaSQL12 = "INSERT INTO Estudiante (nombre, apellido, id_casa, anyo_curso, fecha_nacimiento) VALUES ('Nymphadora', 'Tonks', 4, 7, '1973-11-25')";

        String sentenciaSQL13 = "UPDATE Casa " +
                "SET id_jefe = (" +
                "SELECT id_profesor " +
                "FROM Profesor " +
                "WHERE nombre = 'Pomona' AND apellido = 'Sprout'" +
                ")" +
                "WHERE nombre_casa = 'Hufflepuff'";

        String sentenciaSQL14 = "DELETE  FROM Estudiante WHERE nombre='Tom' AND apellido='Riddle'";

        String sentenciaSQL15 = "SELECT Estudiante.nombre, Estudiante.apellido, Casa.nombre_casa " +
                "FROM Estudiante " +
                "JOIN Casa ON Estudiante.id_casa= Casa.id_casa";

        String sentenciaSQL16 = "SELECT Estudiante.nombre, Estudiante.apellido, Mascota.nombre_mascota, Asignatura.nombre_asignatura " +
                "FROM Estudiante " +
                "LEFT JOIN Mascota ON Estudiante.id_estudiante=Mascota.id_estudiante " +
                "JOIN Estudiante_Asignatura ON Estudiante.id_estudiante= Estudiante_Asignatura.id_estudiante " +
                "JOIN Asignatura ON Estudiante_Asignatura.id_asignatura= Asignatura.id_asignatura ";

        String sentenciaSQL17 = "SELECT Estudiante.nombre, Estudiante.apellido " +
                "FROM Estudiante " +
                "JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante " +
                "JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura " +
                "WHERE Asignatura.nombre_asignatura = 'Encantamientos' " +
                "AND Estudiante_Asignatura.calificacion > ( " +
                "    SELECT AVG(Estudiante_Asignatura.calificacion) " +
                "    FROM Estudiante_Asignatura " +
                "    JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura " +
                "    WHERE Asignatura.nombre_asignatura = 'Encantamientos' " +
                ")";

        String sentenciaSQL18 = "SELECT Casa.nombre_casa, AVG(Estudiante_Asignatura.calificacion) AS Promedio " +
                "FROM Casa " +
                "JOIN Estudiante ON Casa.id_casa= Estudiante.id_casa " +
                "JOIN Estudiante_Asignatura ON Estudiante.id_estudiante = Estudiante_Asignatura.id_estudiante " +
                "GROUP BY Casa.nombre_casa " +
                "HAVING AVG(Estudiante_Asignatura.calificacion) > 7";

        try (Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
             //SQL1

             PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL)) {

            ResultSet resultadoSELECT = sentencia.executeQuery();

            while (resultadoSELECT.next()) {
                String nombre = resultadoSELECT.getString("nombre");
                String apellido = resultadoSELECT.getString("apellido");
                System.out.println("personas: " + nombre + ", " + apellido);
            }

            //SQL2
            PreparedStatement sentencia2 = con2.prepareStatement(sentenciaSQL2);
            ResultSet resultadoWHERE = sentencia2.executeQuery();

            while (resultadoWHERE.next()) {
                String nombre = resultadoWHERE.getString("nombre");
                String apellido = resultadoWHERE.getString("apellido");
                System.out.println("personas: " + nombre + ", " + apellido);
            }

            //SQL3
            PreparedStatement sentencia3 = con2.prepareStatement(sentenciaSQL3);
            ResultSet resultadoORDERBY = sentencia3.executeQuery();

            while (resultadoORDERBY.next()) {
                String nombre = resultadoORDERBY.getString("nombre");
                String apellido = resultadoORDERBY.getString("apellido");
                System.out.println("personas: " + nombre + ", " + apellido);
            }

            //SQL4
            PreparedStatement sentencia4 = con2.prepareStatement(sentenciaSQL4);
            ResultSet resultadoGROUPBY = sentencia4.executeQuery();

            while (resultadoGROUPBY.next()) {
                String nombre_casa = resultadoGROUPBY.getString("nombre_casa");
                int numero_estudiantes = resultadoGROUPBY.getInt("num_estudiantes");
                System.out.println("En " + nombre_casa + "hay :" + numero_estudiantes + " numero de estudiantes");
            }

            //SQL5
            PreparedStatement sentencia5 = con2.prepareStatement(sentenciaSQL5);
            ResultSet resultadoAVG = sentencia5.executeQuery();

            while (resultadoAVG.next()) {
                int media = resultadoAVG.getInt("media");
                int maxima = resultadoAVG.getInt("maxima");
                System.out.println("Nota media: " + media + ". Nota maxima: " + maxima);
            }

            //SQL6
            PreparedStatement sentencia6 = con2.prepareStatement(sentenciaSQL6);
            ResultSet resultadoDISTINCT = sentencia6.executeQuery();

            while (resultadoDISTINCT.next()) {
                int anyo_curso = resultadoDISTINCT.getInt("anyo_curso");
                System.out.println(anyo_curso);
            }

            //SQL7
            PreparedStatement sentencia7 = con2.prepareStatement(sentenciaSQL7);
            ResultSet resultadoLIKE = sentencia7.executeQuery();

            while (resultadoLIKE.next()) {
                String nombre = resultadoLIKE.getString("nombre");
                System.out.println(nombre);
            }

            //SQL8
            PreparedStatement sentencia8 = con2.prepareStatement(sentenciaSQL8);
            ResultSet resultadoIN = sentencia8.executeQuery();

            while (resultadoIN.next()) {
                String nombre = resultadoIN.getString("nombre");
                String apellido = resultadoIN.getString("apellido");
                System.out.println(nombre + " " + apellido);
            }

            //SQL9
            PreparedStatement sentencia9 = con2.prepareStatement(sentenciaSQL9);
            ResultSet resultadoANDOR = sentencia9.executeQuery();

            while (resultadoANDOR.next()) {
                String nombre = resultadoANDOR.getString("nombre");
                String apellido = resultadoANDOR.getString("apellido");
                System.out.println(nombre + " " + apellido);
            }

            //SQL10
            PreparedStatement sentencia10 = con2.prepareStatement(sentenciaSQL10);
            ResultSet resultadoLIMIT = sentencia10.executeQuery();

            while (resultadoLIMIT.next()) {
                String nombre = resultadoLIMIT.getString("nombre");
                String apellido = resultadoLIMIT.getString("apellido");
                System.out.println(nombre + " " + apellido);
            }

            //SQL11
            PreparedStatement sentencia11 = con2.prepareStatement(sentenciaSQL11);
            ResultSet resultadoCOMPARACION = sentencia11.executeQuery();

            while (resultadoCOMPARACION.next()) {
                String nombre = resultadoCOMPARACION.getString("nombre");
                System.out.println(nombre);
            }

            //SQL12
            PreparedStatement sentencia12 = con2.prepareStatement(sentenciaSQL12);
            int resultadoINSERT = sentencia12.executeUpdate();

            if (resultadoINSERT > 0) {
                System.out.println("Se ha registrado exitosamente");
            }

            //SQL13
            PreparedStatement sentencia13 = con2.prepareStatement(sentenciaSQL13);
            int resultadoUPDATE = sentencia13.executeUpdate();
            if (resultadoUPDATE > 0) {
                System.out.println("Casa Hufflepuff actualizada correctamente");
            }

            //SQL14
            PreparedStatement sentencia14 = con2.prepareStatement(sentenciaSQL14);
            int resultadoDELETE = sentencia14.executeUpdate();
            if (resultadoDELETE > 0) {
                System.out.println("Estudiante eliminado correctamente");
            }

            //SQL15
            PreparedStatement sentencia15 = con2.prepareStatement(sentenciaSQL15);
            ResultSet resultadoJOIN = sentencia15.executeQuery();
            while (resultadoJOIN.next()) {
                String nombre = resultadoJOIN.getString("nombre");
                String apellido = resultadoJOIN.getString("apellido");
                String casa = resultadoJOIN.getString("nombre_casa");
                System.out.println(nombre + " " + apellido + " - " + casa);
            }

            //SQL16
            PreparedStatement sentencia16 = con2.prepareStatement(sentenciaSQL16);
            ResultSet resultadoLEFTJOIN = sentencia16.executeQuery();
            while (resultadoLEFTJOIN.next()) {
                String nombre = resultadoLEFTJOIN.getString("nombre");
                String apellido = resultadoLEFTJOIN.getString("apellido");
                String mascota = resultadoLEFTJOIN.getString("nombre_mascota");
                String asignatura = resultadoLEFTJOIN.getString("nombre_asignatura");
                System.out.println(nombre + " " + apellido + " - " + mascota + " - " + asignatura);
            }

            //SQL17
            PreparedStatement sentencia17 = con2.prepareStatement(sentenciaSQL17);
            ResultSet resultadoSUBCONSULTA = sentencia17.executeQuery();
            while (resultadoSUBCONSULTA.next()) {
                String nombre = resultadoSUBCONSULTA.getString("nombre");
                String apellido = resultadoSUBCONSULTA.getString("apellido");
                System.out.println(nombre + " " + apellido);
            }

            //SQL18
            PreparedStatement sentencia18 = con2.prepareStatement(sentenciaSQL18);
            ResultSet resultadoHAVING = sentencia18.executeQuery();
            while (resultadoHAVING.next()) {
                String casa = resultadoHAVING.getString("nombre_casa");
                double promedio = resultadoHAVING.getDouble("Promedio");
                System.out.println(casa + " - Promedio: " + promedio);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

