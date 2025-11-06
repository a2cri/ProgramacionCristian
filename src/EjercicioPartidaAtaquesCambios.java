package EjercicioPartidaAtaquesTurnos;

import java.util.Random;
import java.util.Scanner;

public class EjercicioPartidaAtaquesCambios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("|~~~~Bienvenido al combate, jugadores~~~~|");

        System.out.println("╔════════════════════════════════╗");
        System.out.println("║    BIENVENIDO AL COMBATE!      ║");
        System.out.println("╚════════════════════════════════╝");
        System.out.println("Introduce el nombre del jugador 1:");
        String jugador1 = sc.next();

        System.out.println("Bienvenido/a al combate " + jugador1);
        //Entidades para jugador1
        int velocidad1, ataque1, defensa1, vida1;
        int suma1;
        //Entidades para jugador2
        int velocidad2, ataque2, vida2, defensa2;
        int suma2;
        //Entidades combate
        int ronda = 1;
        boolean turnojugador1;
        //Bucle por si pone numeros <0 && >200
        do {

            System.out.println("Introduce tus atributos, cada atributo debe estar entre 1 a 200 y entre ellas no pueden sumar mas de 500 (hay un total de 4 atributos asi que no te vayas a pasar!)");
            System.out.println("Velocidad de " + jugador1);
            velocidad1 = sc.nextInt();

            System.out.println("Ataque de " + jugador1);
            ataque1 = sc.nextInt();

            System.out.println("Defensa de " + jugador1);
            defensa1 = sc.nextInt();

            System.out.println("Vida de " + jugador1);
            vida1 = sc.nextInt();

            suma1 = velocidad1 + ataque1 + defensa1 + vida1;

            if (velocidad1 < 1 || velocidad1 > 200 || ataque1 < 1 || ataque1 > 200 || defensa1 < 1 || defensa1 > 200 || vida1 < 1 || vida1 > 200) {
                System.out.println("Los datos introducidos deben ser entre 1 y 200");
            } else if (suma1 > 500) {
                System.out.println("Los atributos no deben sumar mas de 500");
            }
        } while (velocidad1 < 1 || velocidad1 > 200 || ataque1 < 1 || ataque1 > 200 || defensa1 < 1 || defensa1 > 200 || vida1 < 1 || vida1 > 200 || suma1 > 500);

        System.out.println("Introduce el nombre del jugador 2");
        String jugador2 = sc.next();

        System.out.println("Bienvenido/a al combate " + jugador2);

        //Bucle por si pone numeros <0 && >200
        do {
            System.out.println("Introduce tus atributos, cada atributo debe estar entre 1 a 200 y entre ellas no pueden sumar mas de 500 (hay un total de 4 atributos asi que no te vayas a pasar!)");

            System.out.println("Velocidad de " + jugador2);
            velocidad2 = sc.nextInt();

            System.out.println("Ataque de " + jugador2);
            ataque2 = sc.nextInt();

            System.out.println("Defensa de " + jugador2);
            defensa2 = sc.nextInt();

            System.out.println("Vida de " + jugador2);
            vida2 = sc.nextInt();

            suma2 = velocidad2 + ataque2 + defensa2 + vida2;

            if (velocidad2 < 1 || velocidad2 > 200 || ataque2 < 1 || ataque2 > 200 || defensa2 < 1 || defensa2 > 200 || vida2 < 1 || vida2 > 200) {
                System.out.println("Los datos introducidos deben ser entre 1 y 200");
            } else if (suma2 > 500) {
                System.out.println("Los atributos no deben sumar mas de 500");
            }
        } while (velocidad2 < 1 || velocidad2 > 200 || ataque2 < 1 || ataque2 > 200 || defensa2 < 1 || defensa2 > 200 || vida2 < 1 || vida2 > 200 || suma2 > 500);
        //Estadisticas de jugadores
        //jugador 1
        System.out.println("╔══════════ Estadísticas de " + jugador1 + " ══════════╗");
        System.out.println("║Velocidad: " + velocidad1);
        System.out.println("║Ataque: " + ataque1);
        System.out.println("║Defensa: " + defensa1);
        System.out.println("║Vida: " + vida1);
        System.out.println("║  O ");
        System.out.println("║ /|\\");
        System.out.println("║ / \\");
        System.out.println("╚════════════════════════════════════════");
        //la vida max se guarda cuando el jugador agrega su vida
        int vidaMax1 = vida1;

        //pociones
        int pocionespeq1 = 5, pocionesgran1 = 2;
        int pocionespeq2 = 5, pocionesgran2 = 2;

        System.out.println("-----------");
        //jugador2
        System.out.println("╔══════════ Estadísticas de " + jugador2 + " ══════════╗");
        System.out.println("║Velocidad: " + velocidad2);
        System.out.println("║Ataque: " + ataque2);
        System.out.println("║Defensa: " + defensa2);
        System.out.println("║Vida: " + vida2);
        System.out.println("║  @ ");
        System.out.println("║ /|\\");
        System.out.println("║ / \\");
        System.out.println("╚════════════════════════════════════════");
        System.out.println("Vida " + vida2);
        //la vida max se guarda cuando el jugador agrega su vida
        int vidaMax2 = vida2;
        //combate
        System.out.println("|~~~~Empieza el combate~~~~|");

        if (velocidad1 > velocidad2) {
            turnojugador1 = true;
            System.out.println(jugador1 + (" empieza primero ya que tiene mayor velocidad"));
        } else if (velocidad1 < velocidad2) {
            turnojugador1 = false;
            System.out.println(jugador2 + (" empieza primero ya que tiene mayor velocidad"));
        } else {
            turnojugador1 = random.nextBoolean();
            if (turnojugador1) {
                System.out.println("Habeis elegido la misma velocidad, se ha lanzado un dado y se ha decidido que " + jugador1 + " empieza primero");
            } else {
                System.out.println("Habeis elegido la misma velocidad, se ha lanzado un dado y se ha decidido que " + jugador2 + " empieza primero");
            }
        }
        while (vida1 > 0 && vida2 > 0) {
            System.out.println("Ronda " + ronda);
            String decision1;
            if (turnojugador1) {
                //decision de que quiere hacer jugador 1
                System.out.println(jugador1 + " elige que desea hacer. No introduzcas un numero distinto o habran consecuencias");
                System.out.println("1 - Atacar");
                System.out.println("2 - Curarse");
                decision1 = sc.next();
                //DECISION ATACAR
                if (decision1.equalsIgnoreCase("1") || (decision1.equalsIgnoreCase("atacar"))) {

                    int danio = (ataque1 - defensa2 / 2) + random.nextInt(11) - 5;
                    if (danio < 5){
                        danio=5+ random.nextInt(3);
                    }
                    if (danio > 25){
                        danio= 20+ random.nextInt(6);
                    }
                    vida2 -= danio;
                    if (vida2 < 0) vida2 = 0;

                    System.out.println(jugador1 + " ataca y hace " + danio + " puntos de daño a " + jugador2);
                    System.out.println("La vida restante de " + jugador2 + " es " + vida2);
                    //Contrataca solo si vida2>0
                    if (vida2 > 0) {
                        int danioContra = (ataque2 - defensa1 / 2) + random.nextInt(11) - 5;
                        if (danioContra < 5) danioContra = 5;
                        if (danioContra > 20) {
                            danioContra = 20 + random.nextInt(6);
                        }
                        vida1 -= danioContra;
                        if (vida1 < 0) vida1 = 0;

                        System.out.println(jugador2 + " contraataca y hace " + danioContra + " puntos de daño a " + jugador1);
                        System.out.println("La vida restante de " + jugador1 + " es  " + vida1);
                    }
                    //DECISION CURARSE (Arreglar pociones ya que no se restan)
                } else if (decision1.equalsIgnoreCase("2") || decision1.equalsIgnoreCase("Curarse")) {
                    if (vida1 == vidaMax1) {
                        System.out.println("No puedes curarte ya que tienes la vida completa");
                    } else {
                        System.out.println("Elige la pocion que deseas consumir");
                        System.out.println("1- Pocion pequeña (15 de vida)");
                        System.out.println("2- Pocion grande (50 de vida)");
                        String tipo = sc.next();
                        if ((tipo.equalsIgnoreCase("1")) || (tipo.equalsIgnoreCase("Pocion pequeña")) && (pocionespeq1 > 0)) {
                            vida1 += 15;
                            pocionespeq1 -= 1;
                            if (vida1 > vidaMax1) vida1 = vidaMax1;
                            System.out.println("Te has curado 15 de vida, tu vida actual es de " + vida1);
                            System.out.println("Te quedan " + pocionespeq1 + " restantes");
                        } else if (tipo.equalsIgnoreCase("2") || tipo.equalsIgnoreCase("Pocion grande") && pocionesgran1 > 0) {
                            vida1 += 50;
                            pocionesgran1--;
                            if (vida1 > vidaMax1) vida1 = vidaMax1;
                            System.out.println("Te has curado 50 de vida, ahora tienes " + vida1 + " puntos de vida");
                            System.out.println("Te quedan " + pocionesgran1 + " restantes");
                        } else {
                            System.out.println("No tienes mas pociones de ese tipo");
                        }
                    }
                    //castigo por si eligen otro numero
                }else {
                    System.out.println("Te dije que no apretaras un numero distinto");
                    System.out.println("De repente " + jugador1 + " se empieza a sentir mal");
                    System.out.println("La vida de " + jugador1 + " se restó a 0");
                    vida1 = 0;
                }
                //Decisiones jugador 2
            } else {
                System.out.println(jugador2 + " elige que desea hacer");
                System.out.println("1 - Atacar");
                System.out.println("2 - Curarse");
                decision1 = sc.next();
                //DECISION ATACAR
                if (decision1.equalsIgnoreCase("1") || (decision1.equalsIgnoreCase("atacar"))) {

                    int danio = (ataque2 - defensa1 / 2) + random.nextInt(11) - 5;
                    if (danio < 5) danio = 5;
                    if (danio > 25) danio = 25;
                    vida1 -= danio;
                    if (vida1 < 0) vida1 = 0;

                    System.out.println(jugador2 + " ataca y hace " + danio + " puntos de daño a " + jugador1);
                    System.out.println("La vida restante de " + jugador1 + " es " + vida1);
                    //Contrataca solo si vida2>0

                    if (vida1 > 0) {
                        int danioContra = (ataque1 - defensa2 / 2) + random.nextInt(11) - 5;
                        if (danioContra < 5) danioContra = 5;
                        if (danioContra > 20) {
                            danioContra = 20 + random.nextInt(6);
                        }
                        vida2 -= danioContra;
                        if (vida2 < 0) vida2 = 0;

                        System.out.println(jugador1 + " contraataca y hace " + danioContra + " puntos de daño a " + jugador2);
                        System.out.println("La vida restante de " + jugador2 + " es  " + vida2);
                    }
                    //DECISION CURARSE
                } else if (decision1.equalsIgnoreCase("2") || decision1.equalsIgnoreCase("Curarse")) {
                    if (vida2 == vidaMax2) {
                        System.out.println("No puedes curarte ya que tienes la vida completa");
                    } else {
                        System.out.println("Elige la pocion que deseas consumir");
                        System.out.println("1- Pocion pequeña (15 de vida)");
                        System.out.println("2- Pocion grande (50 de vida)");
                        String tipo = sc.next();
                        if ((tipo.equalsIgnoreCase("1")) || (tipo.equalsIgnoreCase("Pocion pequeña")) && (pocionespeq2 > 0)) {
                            vida2 += 15;
                            pocionespeq2 -= 1;
                            if (vida2 > vidaMax2) vida2 = vidaMax2;
                            System.out.println("Te has curado 15 de vida, tu vida actual es de " + vida2);
                            System.out.println("Te quedan " + pocionespeq2 + " restantes");
                        } else if ((tipo.equalsIgnoreCase("2")) || (tipo.equalsIgnoreCase("Pocion grande")) && (pocionesgran2 > 0)) {
                            vida2 += 50;
                            pocionesgran2--;
                            if (vida2 > vidaMax2) vida2 = vidaMax2;
                            System.out.println("Te has curado 50 de vida, ahora tienes " + vida2 + " puntos de vida");
                            System.out.println("Te quedan " + pocionesgran2 + " restantes");
                        } else {
                            System.out.println("No tienes mas pociones de ese tipo");
                        }
                    }
                    //castigo por si eligen otro numero (2)
                }else {
                    System.out.println("Te dije que no apretaras un numero distinto");
                    System.out.println("De repente "+jugador2+" se empieza a sentir mal");
                    System.out.println("La vida de "+jugador2+" se restó a 0");
                    vida2=0;
                }
            }
            //Cambiar de turno y ronda
            turnojugador1 =! turnojugador1;
            ronda++;
        }
        if (vida1 <= 0 && vida2 <= 0) {
            System.out.println("Ambos jugadores quedan empate");
        } else if (vida1 <= 0) {
            System.out.println(jugador2 + " gana");
        } else {
            System.out.println(jugador1 + " gana");
        }
    }
}