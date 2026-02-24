package Tema5.parquenatural;

public class Serpiente extends Avistamiento{
    private double longitud;
    private String especie;

    public Serpiente(int hora, double longitud, String especie){
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Serpiente{" +
                "longitud=" + longitud +
                ", especie='" + especie + '\'' +
                '}';
    }
}
