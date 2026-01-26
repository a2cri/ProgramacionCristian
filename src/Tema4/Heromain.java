package Tema4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Heromain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();

        // Listado enemigos
        String[] nombresMonstruos = {"Hombre Lobo", "Orco", "Dragon"};

        // Datos personaje
        System.out.println("=== CONFIGURACION DEL HEROE ===");
        System.out.print("Nombre de tu personaje: ");
        String nombreUser = teclado.nextLine();

        System.out.print("Puntos de Ataque iniciales: ");
        int ataqueUser = teclado.nextInt();

        System.out.print("Puntos de Defensa iniciales: ");
        int defensaUser = teclado.nextInt();
        teclado.nextLine();

        Hero protagonista = new Hero(nombreUser, 1, 100, ataqueUser, defensaUser);
        int hordasVencidas = 0;

        // Bucle hordas
        while (protagonista.isAlive()) {
            hordasVencidas = hordasVencidas + 1;
            System.out.println("*************************************");
            System.out.println("HORDA " + hordasVencidas + " EN CAMINO...");
            System.out.println("*************************************");

            // Generacion aleatoria de la horda de enemigos
            ArrayList<Hero> enemigos = new ArrayList<>();
            int numEnemigos = generador.nextInt(3) + 1;

            for (int i = 0; i < numEnemigos; i++) {
                String nombreEnemigo = nombresMonstruos[generador.nextInt(nombresMonstruos.length)];
                enemigos.add(new Hero(nombreEnemigo, 1, 25, 12, 4));
            }

            // Bucle turnos
            while (protagonista.isAlive() && !enemigos.isEmpty()) {

                System.out.println("[Presiona ENTER para continuar]");
                teclado.nextLine();

                // Huida de enemigos
                Iterator<Hero> it = enemigos.iterator();
                while (it.hasNext()) {
                    Hero e = it.next();
                    if (generador.nextDouble() < 0.10) {
                        System.out.println("¡El " + e.getName() + " huyó del combate!");
                        it.remove();
                    }
                }

                if (enemigos.isEmpty()) break;

                // Turno de ataque del protagonista
                Hero objetivo = enemigos.get(0);
                protagonista.attack(objetivo);
                System.out.println(protagonista.getName() + " lanza un ataque contra el " + objetivo.getName());

                if (!objetivo.isAlive()) {
                    System.out.println("¡El " + objetivo.getName() + " cayó derrotado!");
                    enemigos.remove(0);
                }

                // Contraataque de todos los enemigos vivos
                for (Hero e : enemigos) {
                    if (protagonista.isAlive()) {
                        e.attack(protagonista);

                        if (e.getName().equals("Hombre Lobo")) {
                            System.out.println("El Hombre Lobo te desgarra con sus garras.");
                        } else if (e.getName().equals("Orco")) {
                            System.out.println("El Orco te pega con su mazo de madera.");
                        } else if (e.getName().equals("Dragon")) {
                            System.out.println("El Dragon lanza una llamarada y te quema.");
                        }
                    }
                }

                System.out.println("ESTADO: " + protagonista.toString());
            }

            // Eventos aleatorios al finalizar la horda
            if (protagonista.isAlive()) {
                if (generador.nextDouble() < 0.001) {
                    protagonista.rest();
                    System.out.println(">>> Encontraste un claro en el bosque y lograste descansar.");
                }
                if (generador.nextDouble() < 0.10) {
                    protagonista.drinkPotion();
                    System.out.println(">>> ¡Bebiste una pocion que encontraste en el suelo!");
                }
            }
        }

        // Final de la partida
        System.out.println("=====================================");
        System.out.println("TU HEROE CAYÓ EN COMBATE");
        System.out.println("Lograste sobrevivir a " + (hordasVencidas - 1) + " hordas.");
        System.out.println("=====================================");
        teclado.close();
    }
}