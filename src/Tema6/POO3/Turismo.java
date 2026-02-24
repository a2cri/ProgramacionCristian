package POO3;

public class Turismo extends Vehiculo{
    private int numPlazas;
    private String tipoDeUso;

    public Turismo(String matricula, String marca, String modelo,int anoMatriculacion, int numPlazas, String tipoDeUso) {
        super(matricula, marca, modelo, anoMatriculacion);
        this.numPlazas = numPlazas;
        this.tipoDeUso = tipoDeUso;
    }

}