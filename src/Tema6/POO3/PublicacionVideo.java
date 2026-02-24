package POO3;

public class PublicacionVideo implements IPublicacionReaccion,IAbrirPublicacion{
    @Override
    public void publicar() {
        System.out.println("publicar video");
    }
    @Override
    public void compartir() {
        System.out.println("comentar video");
    }
    @Override
    public void comentar() {
        System.out.println("compartir video");
    }
    @Override
    public void abrir(){
        System.out.println("abrir video");
    }
}
