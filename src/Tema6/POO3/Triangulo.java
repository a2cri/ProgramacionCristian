package POO3;

public class Triangulo extends Figura2D{
     double base;
     double altura;
     double lado1, lado2, lado3;

    public Triangulo(int base, int altura)
    {
        this.base = base;
        this.altura = altura;
    }

    @Override
    void area(){
        double area= (base*altura)/2;
        System.out.println("Area: "+area);
    }
    @Override
    void perimetro(){
    double perimetro= lado1+lado2+lado3;
    System.out.println("Perimetro: "+perimetro);
    }

    public String toString(){
        return "Triangulo base: " + base + " altura: " + altura;
    }
}
