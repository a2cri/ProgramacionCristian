package POO3;

public class Circulos  extends Figura2D{
    double raido;
    double pi= Math.PI;

    public Circulos(double raido, double pi) {
        this.raido = raido;
        this.pi = pi;
    }

    @Override
    void area(){
        double area= pi*(raido*raido);
        System.out.println("Area de Circulos= "+area);
    }
    @Override
    void perimetro(){
        double perimetro= 2*pi*raido;
        System.out.println("Perimetro de Circulos= "+perimetro);
    }
    public String toString(){
        return "Radio del circulo es: "+raido;
    }

}
