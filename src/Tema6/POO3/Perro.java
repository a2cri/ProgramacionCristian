package POO3;

public class Perro extends Animal{

    @Override
    void comer() {
        System.out.println("Come Pienso.");
    }

    @Override
    void hacerRuido() {
        System.out.println("Woof Woof");
    }

    public Perro(String nombre, int edad){
        super(nombre, edad);
    }

    public void jugarPelota(){
        System.out.println("El perro va detras de la pelota");
    }
}