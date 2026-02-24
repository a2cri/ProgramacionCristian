package POO3;

public class AtaqueBolaFuego implements IAtaqueAvanzado{
    @Override
    public void lanzar(){
        System.out.println("Tu personaje se cree dragon y lanza una bola de fuego");
    }

    @Override
    public int[] coste(){
        int[] c = {30,50};
        return c;
    }

    public int[] danoInflingido(){
        int[] d = {35,60};
        return d;
    }
}
