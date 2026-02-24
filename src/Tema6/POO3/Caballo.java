package POO3;

public class Caballo extends Animal {

    @Override
    void comer() {
        System.out.println("Come heno");
    }

    @Override
    void hacerRuido() {
        System.out.println("Hiiiiibbbrrrfff!!!!");
    }

    public Caballo(String nombre, int edad){
        super(nombre, edad);
    }

    public void trotar(){
        System.out.println("El caballo se pone a trotar");
    }
}

