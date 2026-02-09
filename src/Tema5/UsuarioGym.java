package Tema5;

public class UsuarioGym {
    //atributos defaults
    private static final String NOMBRE_DEF="Nombre";
    private static final int EDAD_DEF=000;
    //------
    //atributos
    private String nombre;
    private int edad;
    //-----
    public UsuarioGym(){
        nombre=NOMBRE_DEF;
        edad=EDAD_DEF;
    }
    public UsuarioGym(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
