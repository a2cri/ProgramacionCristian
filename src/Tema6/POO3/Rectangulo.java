package POO3;

public class Rectangulo  extends Figura2D{
     double base;
     double altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }




    @Override
    void area(){
        double area = base*altura;
        System.out.println("Area de rectangulo = "+area);

    }

    @Override
    void perimetro(){
        double perimetro = 2 * (base+altura);

        System.out.println("Perimetro de rectangulo= "+perimetro);
    }

    @Override
    public String toString(){
        return "Rectangulo: " + "base= " + base + ", altura= " + altura ;
    }

}
