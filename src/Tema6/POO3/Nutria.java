package POO3;

public class Nutria extends Animal {

    @Override
    void comer() {
        System.out.println("Come animales pececitos");
    }

    @Override
    void hacerRuido() {
        System.out.println("*Sonido de nutria*");
    }

    public Nutria(String nombre, int edad){
        super(nombre, edad);
    }

    public void nadar(){
        System.out.println("La nutria se pone a nadar");
    }
}

