package Tema3;

import java.util.Scanner;

public class Ejercicio10MyMath {
    public static void showMenu () {
        System.out.println("\n--MENÚ DE EJERCICIOS--");
        System.out.println("1. Perimetro y area del cuadrado.");
        System.out.println("2. Perimetro y area del rectangulo.");
        System.out.println("3. Perimetro y area del circulo.");
        System.out.println("4. Numero primo o no primo.");
        System.out.println("5. Numero de digitos.");
        System.out.println("6. Numero de digitos pares e impares.");
        System.out.println("7. Factorial de un numero.");
        System.out.println("7. Factorial recursivo de un numero.");
        System.out.println("9. Operacion segundo grado.");
        System.out.println("10. Suma digitos de numero entero.");
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
                    System.out.println("Introduce un numero y te dire los digitos pares e impares que tiene dicho numero");
                    int digitos= sc.nextInt();
                System.out.println("Dígitos pares: " + MyMath.digitosPares(digitos));
                System.out.println("Dígitos impares: " + MyMath.digitosImpares(digitos));
                break;

                case 7:
                    System.out.println("Introduce un numero y te sacare su factorial");
                    int fact= sc.nextInt();
                System.out.println("Factorial de 5: " + MyMath.factorial(fact));
                break;

                case 8:
                    System.out.println("Introduce un numero y te sacare su factorial recursivo");
                    int fac=sc.nextInt();
                System.out.println("Factorial recursivo de 5: " + MyMath.factorialRecursivo(fac));
                break;

                case 9:
                    System.out.println("Este programa sirve para hacer una ecuacion de segundo grado, a continuacion...");
                    System.out.println("Introduce el primero numero");
                    int prim =sc.nextInt();
                    System.out.println("Introduce el segundo numero");
                    int seg =sc.nextInt();
                    System.out.println("Introduce el tercer numero");
                    int ter =sc.nextInt();
                    int soluciones = MyMath.solucionesEcuacion2(prim, seg, ter);
                System.out.println("Solucion posibles " + soluciones);
                break;

                case 10:
                    System.out.println("Introduce un numero y sumare sus digitos (130=1+3+0)");
                    int digi=sc.nextInt();
                System.out.println("Suma de dígitos: " + MyMath.sumaDigitos(digi));
                    break;
                case 0:
                default:
                    System.out.println("Cerrando el programa...");
            }
        }while (opcion !=0);
    }
}