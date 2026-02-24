package POO3;

public class AtaqueMagicoYFisico implements IAtaque{
    @Override
    public void lanzar(){
        System.out.println("Empiezas a pegar con la varita");
    }

    @Override
    public int coste(){
        return 65;
    }

    @Override
    public int danioinfl(){
        return 80;
    }
}
