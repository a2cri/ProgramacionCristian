package POO3;

public class AtaqueMagico implements IAtaque {

    @Override
    public void lanzar(){
        System.out.println("Lanzar hechizo");
    }

    @Override
    public int coste() {
        return 25;
    }

    @Override
    public int danioinfl() {
        return 40;
    }

}
