package Tema5;

public class UsuarioBanco {
    //atributos defaults
    private static final String NOMBRE_DEF="Nombre";
    private static final int EDAD_DEF=000;
    private static final String DNI_DEF="11111111A";
    //------
    //atributos
    private String nombre;
    private int edad;
    private String DNI;

    public UsuarioBanco(){
        nombre=NOMBRE_DEF;
        edad=EDAD_DEF;
        DNI=DNI_DEF;
    }
    public UsuarioBanco(String nombre, int edad, String DNI){
        this.nombre=nombre;
        this.edad=edad;
        this.DNI=DNI;
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
    public String getDNI(){
        return DNI;
    }
    public void setDNI(String DNI){
        this.DNI=DNI;
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + ", Edad: " + edad+", DNI: "+DNI;
    }

    }