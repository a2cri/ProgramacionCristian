package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio10 {
    public static void showMenu() {
        System.out.println("\n--MENÚ DE EJERCICIOS--");
        System.out.println("1. Muestra el signo de un número introducido por el usuario.");
        System.out.println("2. Indica si el usuario es mayor de edad o no.");
        System.out.println("3. Calcula el área y perímetro de un círculo.");
        System.out.println("4. Conversor de euros a dólares y de dólares a euros.");
        System.out.println("5. Mostrar tabla de multiplicar de un número");
        System.out.println("6. Mostrar tablas de multiplicar del 1 al 10");
        System.out.println("7. Comprobador de números primos.");
        System.out.println("8. Comprobador de fechas.");
        System.out.println("9. Dibujar triángulos.");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            showMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce un numero y te dire si es positivo, negativo o cero");
                    int num = sc.nextInt();
                    int resultado = Tema3Ejercicio1.numberSign(num);
                    if (resultado == 1) {
                        System.out.println("El numero es positivo");
                    } else if (resultado == -1) {
                        System.out.println("El numero es negativo");
                    } else {
                        System.out.println("El numero es cero");
                    }
                    break;
                case 2:
                    Tema3Ejercicio1.numberSign(3);
                    Tema3Ejercicio1.main(args);
                    int age;
                    boolean adulto = false;
                    do {
                        System.out.println("Introduce tu edad y te dire si eres mayor o menor de edad");
                        age = sc.nextInt();
                        adulto = Tema3Ejercicio2.isAdult(age);
                    } while (age <= 0);
                    if (adulto) {
                        System.out.println("Eres mayor de edad");
                    } else {
                        System.out.println("Eres menor de edad");
                    }
                    break;
                case 3:
                    double radius;
                    do {
                        System.out.println("Introduce el radio");
                        radius = sc.nextDouble();
                        if (!Tema3Ejercicio3.validRadius(radius)) {
                            System.out.println("El radio debe ser superior a 0");
                        }
                    } while (!Tema3Ejercicio3.validRadius(radius));
                    double perimetro = Tema3Ejercicio3.calculateCirclePerimeter(radius);
                    double area = Tema3Ejercicio3.calculateCircleArea(radius);
                    System.out.println("El radio que has introdicudo es " + radius);
                    System.out.println("El perimetro del radio que has introducido es " + perimetro);
                    System.out.println("El area del radio que has introducido es " + area);

                    break;
                case 4:
                    int opcionej;
                    double cantidad;
                    do {
                        Tema3Ejercicio4.showMenu();
                        opcionej = sc.nextInt();
                        switch (opcionej) {
                            case (1):
                                System.out.println("Introduce la cantidad en euros");
                                cantidad = sc.nextDouble();
                                System.out.printf("%.2f euros son %.2f dolares.%n", cantidad, Tema3Ejercicio4.euro2dolar(cantidad));
                                break;
                            case (2):
                                System.out.println("Introduce la cantidad en dolares");
                                cantidad = sc.nextDouble();
                                System.out.printf("%.2f dolares son %.2f euros.%n", cantidad, Tema3Ejercicio4.dolar2euro(cantidad));
                                break;
                            case (0):
                                System.out.println("Saliendo del programa");
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }

                    } while (opcionej != 0);
                    break;
                case 5:
                    int nume = Tema3Ejercicio5.pedirNumero(sc);
                    Tema3Ejercicio5.tablaMult(nume);
                    break;
                case 6:
                    for (int n = 1; n <= 10; n++) {
                        Tema3Ejercicio5.tablaMult(n);
                    }
                    break;
                case 7:
                    int numero;
                    System.out.println("Introduce numeros positivos(0 para terminar)");
                    do {
                        do {
                            numero = sc.nextInt();
                            if (numero < 0) {
                                System.out.println("No puedes introducir numeros negativos, introduce un numero negativo (0 para terminar)");
                            }
                        } while (numero < 0);
                        if (numero > 0) {
                            if (Tema3Ejercicio7.esPrimo(numero)) {
                                System.out.println(numero + " es primo");
                            } else {
                                System.out.println(numero + " no es primo");
                            }
                        }
                    } while (numero != 0);
                    break;
                case 8:
                    int dia, mes, año;

                    System.out.println("Introduce día:");
                    dia = sc.nextInt();
                    System.out.println("Introduce mes:");
                    mes = sc.nextInt();
                    System.out.println("Introduce año:");
                    año = sc.nextInt();

                    if (Tema3Ejercicio8.esFechaValida(dia, mes, año)) {
                        System.out.println("La fecha es correcta.");
                    } else {
                        System.out.println("La fecha no es válida.");
                    }
                    break;
                case 9:
                    char caracter;
                    int lineas;

                    System.out.print("Introduce el carácter: ");
                    caracter = sc.next().charAt(0);

                    System.out.print("Introduce el número de líneas: ");
                    lineas = sc.nextInt();

                    Tema3Ejercicio9.mostrarTriangulo(caracter, lineas);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

    }
}