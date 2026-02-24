package POO3;

public class DVD extends Ficha{

    String director;
    String tipo;
    int anio;

    public DVD(int numero, String titulo, String director, String tipo, int anio) {
        super(numero, titulo);
        this.director = director;
        this.tipo = tipo;
        this.anio = anio;
    }

    public String toString(){
        return "Director: " + director + ", Tipo: " + tipo + ", Anio: " + anio;
    }
}
