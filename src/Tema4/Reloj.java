package Tema4;

public class Reloj {
    //Defaults
    public static final int hora_default = 00;
    public static final int minuto_default = 00;
    public static final int segundo_default = 00;
    //atributos
    int hora, minuto, segundo;
    boolean formato24horas;

    //constructor
    public Reloj() {
        hora = hora_default;
        minuto = minuto_default;
        segundo = segundo_default;
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //getters setters
    //hora
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    //minuto
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    //segundo
    public int segundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    //formato
    public boolean getFormato24horas() {
        return formato24horas;
    }

    public void setFormato24horas(boolean formato24horas) {
        this.formato24horas = formato24horas;
    }

    //
    public void mostrarHora() {
        int horaMostrar = hora;

        if (formato24horas) {
            System.out.println("Son las " + horaMostrar + "h : " + minuto + "m : " + segundo + "s");
        } else {
            String ampm = "AM";

            if (horaMostrar == 0) {
                horaMostrar = 12;
            } else if (horaMostrar == 12) {
                ampm = "PM";
            } else if (horaMostrar > 12) {
                horaMostrar -= 12;
                ampm = "PM";
            }

            System.out.println("Son las " + horaMostrar + "h : " + minuto + "m : " + segundo + "s " + ampm);
        }
    }
}