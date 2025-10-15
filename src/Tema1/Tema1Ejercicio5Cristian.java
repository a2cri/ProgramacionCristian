package Tema1;

public class Tema1Ejercicio5Cristian {
    public static void main(String[] args) {
        double a =24 % 5;
        System.out.println("El resultado de 24%5 es " + a );
        a = 7/2+2.5;
        System.out.println("El resultado de 7/2+2.5 es "+a);
        a=10.8/2+2;
        System.out.println("EL resultado de 10.8/2+2 es "+a);
        a= (4+6)*3+2*(5-1);
        System.out.println("El resultado de (4+6)*3+2*(5-1) es " + a);
        boolean b =  7 >= 5 || 27 != 8;
        System.out.println("El resultado de 7>=5 OR 27<>8 es "+b);
        b= (45<=7) ||! (5>=7);
        System.out.println("El resultado de (45<=7) OR NOT (5>=7) es "+b);
        a=27%4+15/4;
        System.out.println("El resultado de 27%4+15/4 es "+a );
        a=37/4*4-2;
        System.out.println("El resultado de 37/4*4-2 es "+a);
        b=(25>=7) &&! (7<=2);
        System.out.println("El resultado de (25>=7) ANDNOT (7<=2) es "+b);
        b= ('H'<'J') && ('9'!='7');
        System.out.println("El resultado de ('H'<'J') AND ('9'<>'7') es "+b);
        b= 25 > 20 && 13 > 5;
        System.out.println("El resultado de 25 > 20 AND 13 > 5 es "+b);
        b= 10+4<15-3 || 2*5+1>14-2 * 2;
        System.out.println("El resultado de 10 + 4 < 15 - 3 OR 2 * 5 + 1 > 14 – 2 * 2 es "+b);
        b=4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1;
        System.out.println("El resultado de 4 * 2 <= 8 OR 2 * 2 < 5 AND 4 > 3 + 1 es "+b);
        b= 10 <= 2 * 5 && 3 < 4 ||! (8>7) && 3 * 2 <= 4 * 2 - 1;
        System.out.println("El resultado de 10 <= 2 * 5 AND 3 < 4 OR NOT (8>7) AND 3 * 2 <= 4 * 2 - 1 es "+b);
    }
}