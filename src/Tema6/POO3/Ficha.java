package POO3;

public class Ficha {
    int numero;
    String titulo;
    boolean tomado;

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }
    public void tomar(){
        if(this.tomado){
            System.out.println("El libro ya fue tomado");
        }else{
            tomado = true;
            System.out.println("El libro se ha entregado");
        }

    }

    public void mostrarFicha() {
        System.out.println("Numero de Libro: " + numero + ", Titulo: " + titulo);
    }

    public String disponibilidad() {
        if (this.tomado) {
            return "Estado: NO DISPONIBLE";
        } else {
            return "Estado: DISPONIBLE";
        }
    }
}
