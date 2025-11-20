package Tema3;

import java.util.Scanner;

public class Ejercicio10MyMath {
    public static void showMenu () {
        System.out.println("\n--MENÚ DE EJERCICIOS--");
        System.out.println("1. Perimetro y area del cuadrado.");
        System.out.println("2. Perimetro y area del rectangulo.");
        System.out.println("3. Perimetro y area del circulo.");
        System.out.println("4. Conversor de euros a dólares y de dólares a euros.");
        System.out.println("5. Mostrar tabla de multiplicar de un número");
        System.out.println("6. Mostrar tablas de multiplicar del 1 al 10");
        System.out.println("7. Comprobador de números primos.");
        System.out.println("8. Comprobador de fechas.");
        System.out.println("9. Dibujar triángulos.");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            showMenu();
            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Introduce el lado del cuadrado para calcular su perimetro y area");
                    int ladocuadrado=sc.nextInt();

                    System.out.println("Perímetro cuadrado: " + MyMath.squarePerimeter(ladocuadrado));
                    System.out.println("Área cuadrado: " + MyMath.squareArea(ladocuadrado));
                break;

                case 2:
                    System.out.println("Introduce la base del rectangulo");
                    int baserectangulo=sc.nextInt();
                    System.out.println("Introduce la altura del rectangulo");
                    int alturarectangulo=sc.nextInt();
                System.out.println("Perímetro rectángulo: " + MyMath.rectanglePerimeter(baserectangulo, alturarectangulo));
                System.out.println("Área rectángulo: " + MyMath.rectangleArea(baserectangulo, alturarectangulo));
                break;

                case 3:
                    System.out.println("Introduce el radio del circulo para calcular su perimetro y area");
                    int radio=sc.nextInt();
                System.out.println("Perímetro círculo: " + MyMath.circlePerimeter(radio));
                System.out.println("Área círculo: " + MyMath.circleArea(radio));
                break;

                case 4:
                    System.out.println("Di un numero para saber si es primo o no");
                    int n = sc.nextInt();
                    System.out.println("Es primo? " + MyMath.esPrimo(n));
                    break;

                case 5:
                    System.out.println("Introduce un numero y te dire cuantos digitos tiene");
                    int dig= sc.nextInt();
                System.out.println("Tu numero tiene: " + MyMath.numeroDigitos(dig));
                break;

                case 6:
                System.out.println("Dígitos pares en 48291: " + MyMath.digitosPares(48291));
                System.out.println("Dígitos impares en 48291: " + MyMath.digitosImpares(48291));

                System.out.println("Factorial de 5: " + MyMath.factorial(5));
                System.out.println("Factorial recursivo de 5: " + MyMath.factorialRecursivo(5));

                System.out.println("Soluciones de x^2 + 2x - 3 = 0: " +
                        MyMath.solucionesEcuacion2(1, 2, -3));

                System.out.println("Suma de dígitos de 987: " + MyMath.sumaDigitos(987));
            }
        }while (opcion !=0);
    }
}