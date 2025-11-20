package Tema3;

public class MyMath {
    //Ejercicio 1
    public static double squarePerimeter(double lado){
        return 4 * lado;
    }
    public static double squareArea(double lado){
        return lado * lado;
    }
    public static double rectanglePerimeter(double base, double altura){
        return 2 * (base + altura);
    }
    public static double rectangleArea(double base, double altura){
        return base * altura;
    }
    public static double circlePerimeter(double radio){
        return 2 * Math.PI * radio;
    }
    public static double circleArea(double radio){
        return Math.PI * radio * radio;
    }
    //Ejercicio 2
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean noEsPrimo(int n){
        return !esPrimo(n);
    }
    //Ejercicio3
    public static int numeroDigitos(int n){
        n= Math.abs(n);
        if(n==0)return 1;
        return(int) Math.log10(n)+1;
    }
    //Ejercicio4
    public static int digitosPares(int n){
        int count=0;
        n= Math.abs(n);
        while(n>0){
            int dig = n % 10;
            if (dig % 2 == 0) count++;
            n /= 10;
        }
        return count;
    }
    //Ejercicio5
    public static int digitosImpares(int n) {
        int count = 0;
        n = Math.abs(n);
        while (n > 0) {
            int dig = n % 10;
            if (dig % 2 != 0) count++;
            n /= 10;
        }
        return count;
    }
    //Ejercicio6
    public static long factorial(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
    //Ejercicio7
    public static long factorialRecursivo(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursivo(n - 1);
    }
    //Ejercicio8
    public static int solucionesEcuacion2(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) return 2;
        else if (D == 0) return 1;
        else return 0;
    }

    // Ejercicio9
    public static int sumaDigitos(int n) {
        n = Math.abs(n);
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }
}