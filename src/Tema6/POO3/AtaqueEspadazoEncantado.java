package POO3;

public class AtaqueEspadazoEncantado implements IAtaqueAvanzado{
    @Override
    public void lanzar(){
        System.out.println("Ataque lanzado con exito!");
    }

    @Override
    public int[] coste(){
        int[] c = {20,30};
        return c;
    }

    public int[] danoInflingido(){
        int[] d = {45,56};
        return d;
    }
}
