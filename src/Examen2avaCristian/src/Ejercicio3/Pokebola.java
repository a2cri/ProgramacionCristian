package Ejercicio3;

public class Pokebola extends Articulo{
    private String tipo;
    private int precioPokeball=2;
    private int precioGreatball=5;
    private int precioUltraball=10;

    public Pokebola(String tipo, int precioPokeball, int precioGreatball, int precioUltraball) {
        this.tipo = tipo;
        this.precioPokeball = precioPokeball;
        this.precioGreatball = precioGreatball;
        this.precioUltraball = precioUltraball;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecioPokeball() {
        return precioPokeball;
    }



    public int getPrecioGreatball() {
        return precioGreatball;
    }


    public int getPrecioUltraball() {
        return precioUltraball;
    }


    @Override
    public void tipoArticulo() {
        super.tipoArticulo();
    }


    @Override
    public void precioArticulo() {
        super.precioArticulo();
    }
}

