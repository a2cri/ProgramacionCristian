package Ejercicio2;

public class Tarjeta implements IDinero{
    String numero;
    double saldo;
    double credito;

    public Tarjeta(){
        numero="0000 0000 0000 0000";
        saldo=0;
        credito=0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public void valor(){
        System.out.println("El saldo disponible en la tarjeta es de "+saldo+" y el credito disponible en la tarjeta es de "+credito);
    }
}
