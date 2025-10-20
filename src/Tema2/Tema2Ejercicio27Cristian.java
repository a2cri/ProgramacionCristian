package Tema2;

public class Tema2Ejercicio27Cristian {
    public static void main(String[] args) {
        int cont=0;
        int num=2;
        while (cont<20){
            boolean primo=true;
            for (int i=2; i<num; i++){
                if (num % i ==0){
                    primo=false;
                    break;
                }
            }if (primo){
                System.out.println(num);
                cont++;
            }
            num++;
        }
    }
}