package Ejercicio1;

public class Libro {
    //Atributos
    private final int pesoTapaDura=50;
    private final int pesoTapaBlanda=20;
    private final int pesoTapaBolsillo=10;
    private final int pesoHojaNormal=2;
    private final int pesoHojaBolsillo=1;
    private int pesoTotal;

    private String  nombre;
    private final String autor;
    private String isbn;
    private int numeroPaginas;
    private String genero;
    private String formato;

    //Constructores
    public Libro(String nombre, String autor, String isbn, int numeroPaginas, String genero, String formato) {
        this.nombre = nombre;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.formato = formato;
    }
    //getters y setters
    //Nombre que se puede consultar pero no modificar
    public String getNombre() {
        return nombre;
    }

    //Autor que se puede consultar pero no modificar
    public String getAutor() {
        return autor;
    }

    //ISBN que se puede consultar pero no modificar
    public String getIsbn() {
        return isbn;
    }

    //Num Paginas que se puede consultar y modificar
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    //Genero que se puede consultar y modificar
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Formato que se puede consultar y modificar
    public String getFormato(){
        return formato;
    }

    public void setFormato(String formato){
        this.formato=formato;
    }

    //metodo
    public void pesolibro(){
        if(formato.equalsIgnoreCase("Tapa dura")){
             pesoTotal= pesoTapaDura+(numeroPaginas*pesoHojaNormal);
        }else if(formato.equalsIgnoreCase("Tapa blanda")){
             pesoTotal= pesoTapaBlanda+(numeroPaginas*pesoHojaNormal);
        }else if(formato.equalsIgnoreCase("Bolsillo")){
            pesoTotal=pesoTapaBolsillo+(numeroPaginas+pesoHojaBolsillo);
        }
    }

    //toString
    @Override
    public String toString() {
        return "nombre='" + nombre + ", autor='" + autor + ", pesoTotal=" + pesoTotal ;
    }
}
