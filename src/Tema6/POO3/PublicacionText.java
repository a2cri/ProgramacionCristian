package POO3;

public class PublicacionText implements IPublicacionReaccion {
    @Override
    public void publicar(){
        System.out.println("Publicar texto.");
    }

    @Override
    public void compartir() {
        System.out.println("Publicar comentario.");
    }

    @Override
    public void comentar(){
        System.out.println("Compartir texto.");
    }
}
