package POO3;

public class Gato extends Animal{

    @Override
    void comer() {
        System.out.println("Come pescadito");
    }

    @Override
    void hacerRuido() {
        System.out.println("Meow");
    }

    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    public void romperAlgo(){
        System.out.println("El gato rompió tu objeto mas querido, que pena eh...");
    }
}