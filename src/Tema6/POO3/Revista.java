package POO3;

public class Revista extends Ficha {
    int numeropublicacion;
    int anio;

    public Revista(int numero, String titulo, int numeropublicacion, int anio) {
        super(numero, titulo);
        this.numeropublicacion = numeropublicacion;
        this.anio = anio;
    }

    public String toString() {
        return "Revista: " +titulo+ "Año publicacion: "+anio+" Numero de publicacion: "+numeropublicacion;
    }
}
