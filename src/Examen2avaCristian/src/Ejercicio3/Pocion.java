package Ejercicio3;

abstract class Pocion extends Articulo{

    private int nivel;
    private String[] effectos=new String[3];
    private int precioPocion=5;
    private int preciototal;

    public Pocion(){
        nivel=1;
    }

    public Pocion(int nivel, String[] effectos, int precioPocion, int preciototal) {
        this.nivel = nivel;
        this.effectos = effectos;
        this.precioPocion = precioPocion;
        this.preciototal = preciototal;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String[] getEffectos() {
        return effectos;
    }

    public void setEffectos(String[] effectos) {
        this.effectos = effectos;
    }

    public int getPrecioPocion() {
        return precioPocion;
    }


    public int getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(int preciototal) {
        this.preciototal = preciototal;
    }

    @Override
    public void tipoArticulo() {
        super.tipoArticulo();
    }

    @Override
    public void precioArticulo() {
        preciototal=nivel+precioPocion;
    }
}
