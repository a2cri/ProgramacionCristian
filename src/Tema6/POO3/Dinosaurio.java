package POO3;

public class Dinosaurio extends Animal{

    @Override
    void comer() {
        System.out.println("Come otros dinosaurios");
    }

    @Override
    void hacerRuido() {
        System.out.println("Rawr");
    }

    public Dinosaurio(String nombre, int edad){
        super(nombre, edad);
    }

    public void bailar(){
        System.out.println("El dinosario se pone a bailar");
    }
}
