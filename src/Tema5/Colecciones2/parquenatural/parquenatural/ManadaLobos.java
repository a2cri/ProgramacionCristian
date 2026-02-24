package Tema5.parquenatural;

public class ManadaLobos extends Avistamiento{
    private int numerolobos;
    private String observaciones;

    public ManadaLobos(int hora, int numerolobos, String observaciones) {
        super(hora);
        this.numerolobos = numerolobos;
        this.observaciones = observaciones;
    }

    public int getNumerolobos() {
        return numerolobos;
    }

    public void setNumerolobos(int numerolobos) {
        this.numerolobos = numerolobos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "ManadaLobos{" +
                "numerolobos=" + numerolobos +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }

}
