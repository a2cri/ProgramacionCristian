package POO3;

public class AtaqueEspadazo implements IAtaqueAvanzado{

    @Override
    public void lanzar(){
        System.out.println("Ataque lanzado con exito!");
    }

    @Override
    public int[] coste(){
        int[] c = {10,5};
        return c;
    }

    public int[] danoInflingido(){
        int[] d = {25,46};
        return d;
    }
}
