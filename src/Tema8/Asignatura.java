package Tema8;

public class Asignatura {
    private int idAsignatura;
    private String nombreAsignatura;
    private String aula;
    private boolean obligatoria;


    public Asignatura() {}

        public Asignatura(int idAsignatura, String nombreAsignatura, String aula, boolean obligatoria) {
        this.idAsignatura = idAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.aula = aula;
        this.obligatoria = obligatoria;
    }


    public int getIdAsignatura() { return idAsignatura; }
    public void setIdAsignatura(int idAsignatura) { this.idAsignatura = idAsignatura; }

    public String getNombreAsignatura() { return nombreAsignatura; }
    public void setNombreAsignatura(String nombreAsignatura) { this.nombreAsignatura = nombreAsignatura; }

    public String getAula() { return aula; }
    public void setAula(String aula) { this.aula = aula; }

    public boolean isObligatoria() { return obligatoria; }
    public void setObligatoria(boolean obligatoria) { this.obligatoria = obligatoria; }

    @Override
    public String toString() {
        return "Asignatura [ID=" + idAsignatura + ", Nombre=" + nombreAsignatura +
                ", Aula=" + aula + ", Obligatoria=" + obligatoria + "]";
    }
}