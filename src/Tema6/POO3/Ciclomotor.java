package POO3;

public class Ciclomotor extends Vehiculo{
    int cilindrada;

    public Ciclomotor(int cilindrada,String marca,String modelo, int anoMatriculacion,String matricula){
        super(matricula,marca,modelo,anoMatriculacion);
        this.cilindrada = cilindrada;
    }

    public boolean necesitaCarnet(){
        boolean necesita;
        if (cilindrada >= 125){
            necesita = true;
        }else {
            necesita = false;
        }
        return necesita;
    }

}