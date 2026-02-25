package Ejercicio2;

public class Billete implements IDinero {
    private int valor;
    private int importeBillete;

    public Billete(){
        valor=0;
        importeBillete=0;
    }

    public Billete(int valor, int importeBillete){
        this.valor=valor;
        this.importeBillete=importeBillete;
    }

    public int getValor() {
        return valor;
    }


    public int getImporteBillete() {
        return importeBillete;
    }

    public void setImporteBillete(int importeBillete) {
        this.importeBillete = importeBillete;
    }

    @Override
    public void valor(){
        System.out.println("El valor del billete es de "+importeBillete);
    }

}
