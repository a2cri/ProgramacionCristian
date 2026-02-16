package Tema4;

public class Cuenta {

    private final String numeroCuenta;
    private double saldo;


    public Cuenta() {
        this.numeroCuenta = "11111111A";
        this.saldo = 0.0;
    }


    public Cuenta(final String numeroCuenta, final double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }


    public String toString() {
        return "IBAN: " + numeroCuenta + " | Saldo: " + saldo + "€";
    }

    public final String getNumeroCuenta() {
        return numeroCuenta;
    }

    public final double getSaldo() {
        return saldo;
    }

    public void abonar(final double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        } else {
            System.out.println("La cantidad a abonar debe ser positiva.");
        }
    }

    public boolean pagarRecibo(final double cantidad) {
        boolean pagado = false;

        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            pagado = true;
        } else {
            System.out.println("Error: Saldo insuficiente para pagar " + cantidad);
        }
        return pagado;
    }
}