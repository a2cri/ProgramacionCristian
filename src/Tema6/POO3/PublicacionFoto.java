package POO3;

public class PublicacionFoto implements IPublicacionReaccion, IAbrirPublicacion{
    @Override
    public void publicar() {
        System.out.println("publicar foto");
    }
    @Override
    public void compartir() {
        System.out.println("comentar foto");
    }
    @Override
    public void comentar() {
        System.out.println("compartir fot");
    }
    @Override
    public void abrir(){
        System.out.println("abrir foto");
    }

}
