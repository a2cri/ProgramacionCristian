package Tema4;



public class PersonaMain {
    public static void main(String[] args) {
        String nombre, apellido1, apellido2, DNI;
        int edad;

        Persona p1 = new Persona("Cristian", "elprocrack", "77yt","12345678A", 19);
        Persona p2= new Persona("E","F","N","67676767B",67);

        p1.print();
        p1.edaddi();

        p2.print();
        p2.edaddi();

        int dif=p1.ageDifference(p2);
        System.out.println("La diferencia de edad entre "+p1.getNombre()+" y "+p2.getNombre()+" es de "+dif);

    }
}