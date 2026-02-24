package POO3;

public class Camion extends Vehiculo{
    int pesoMax;
    boolean mercanciaPeligrosa;

    public Camion(String matricula, String marca, String modelo,int anoMatriculacion,int pesoMax, boolean mercanciaEsPeligrosa){
        super(matricula,marca,modelo,anoMatriculacion);
        this.pesoMax = pesoMax;
        this.mercanciaPeligrosa = mercanciaEsPeligrosa;
    }
}