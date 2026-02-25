package Ejercicio3;

public class Accesorio extends Articulo{
    private String nombre;
    private final int precioAccesorio=7;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioAccesorio() {
        return precioAccesorio;
    }


    @Override
    public void precioArticulo() {
        super.precioArticulo();
    }

    @Override
    public void tipoArticulo() {
        super.tipoArticulo();
    }
}
