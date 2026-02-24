package Tema5.parquenatural;

public class Pajaro extends Avistamiento {
    private double peso;
    private String especie;

    public Pajaro(int hora, double peso, String especie) {
        super(hora);
        this.peso = peso;
        this.especie=especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pajaro{" +
                "peso=" + peso +
                ", especie='" + especie + '\'' +
                '}';
    }
}
