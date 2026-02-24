package Tema5.parquenatural;

public class Avistamiento {
    int hora;

    public Avistamiento(int hora){
        this.hora = hora;
    }

    public int getHora(){
        return hora;
    }

    public void setHora(int hora){
        this.hora = hora;
    }
    @Override
    public String toString() {
        return "Avistamiento{" +
                "hora=" + hora +
                '}';
    }
}

