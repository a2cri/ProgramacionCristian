package POO3;

public class AtaqueFisico implements IAtaque {

    @Override
    public void lanzar(){
        System.out.println("Lanza un puñetazo");
    }

    @Override
    public int coste(){
        return 70;
    }

    @Override
    public int danioinfl(){
        return 150;
    }
}
